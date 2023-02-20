<html>
    <body>
        Dog name is: ${person.dog.name}
        <%= ((foo.Person) request.getAttribute(“person”)).getDog().getName() %>
    </body>
</html>