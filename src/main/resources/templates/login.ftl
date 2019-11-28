<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
<div>Login page</div>
<@l.login "/login"/>
<a href="/registration">Registration</a>
</@c.page>