<#ftl output_format="HTML"/>
<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"]/>

<@sec.authorize access="isAuthenticated()">
    <@sec.authentication property="principal.username"/>
</@sec.authorize>
