#!/usr/bin/env bash

mvn clean package

echo 'Copy files...'
scp target/Wessenger-1.0-SNAPSHOT.jar privetdruk@172.20.10.3:/home/privetdruk

echo 'Restart server...'
ssh privetdruk@172.20.10.3 << EOF
  pgrep java | xargs kill -9
  nohup java -jar Wessenger-1.0-SNAPSHOT.jar > log.txt &
EOF

echo 'End'