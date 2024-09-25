<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Inventario de Productos</title>
</head>
<body>
<h1>Agregar Productos</h1>
<form action="agregarProducto" method="post">
    <label for="nombrePro">Nombre de Producto:</label><br>
    <input type="text" name="nombre" id="nombrePro" required><br>
    <label for="Cantidad">Cantidad Stock:</label>
    <input type="number" name="Cantidad" id="Cantidad" required><br>
    <input type="submit" value="Crear">
</form>

<c:if test="${not empty Productos}">
    <h2>¡Producto registrado y creado exitosamente!</h2>
    <p>ID: ${usuario.id}</p>
    <p>Nombre: ${usuario.nombre}</p>
    <p>Email: ${usuario.Cantidad}</p>

</c:if>

</body>
</html>

