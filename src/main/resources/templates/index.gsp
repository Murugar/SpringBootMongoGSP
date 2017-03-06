<!DOCTYPE html>
<html>
<head>
    <title>Spring Boot GSP Mongo</title>
</head>
<body>

    <h3>Main Title</h3>
    ${name}
    
    <h3>Accessing MongoDB : No. Of Users</h3>
    Users : ${numb}

    <h3>Accessing Dictionary Service : Version</h3>
    Version : ${dversion}
    
    <h3>Accessing Dictionary Service : Name</h3>
    Version : ${dname}

   
    <h3>Users List</h3>
    <g:each in="${users}" var="num">
        <p>${num.getName()}</p>
    </g:each>


    <h3>Rendering a template</h3>
    <g:render template="subtemplate" />

    <h3>Rendering a template with a body</h3>
    <g:render template="template_body">
        My template body
    </g:render>

    <h3>Applying a layout</h3>
    <g:applyLayout name="sample">
        Text to decorate.
    </g:applyLayout>

    <h3>Automatic XSS prevention</h3>
    ${'<script>test escaping</script>'}
   

</body>
</html>