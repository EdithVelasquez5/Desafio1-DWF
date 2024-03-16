<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        
        *{
            font-family: monospace;
            font-size: large;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Administrador de productos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-KyZXEAg3QhqLMpG8r+K/pR6n7P8w8f0E9Ub5xnqY4I/y4mxvkdj7duyQskQsNxh4"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
</head>
<body>
<div class="container">
    <h1 class="mt-3">Administrador de Productos</h1>

    <form method="post" action="ProductServlet" class="mt-3">
        <input type="hidden" name="action" value="add">
        <div class="form-group">
            <label for="name">Nombre:</label>
            <input type="text" name="name" id="name" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="id">Identificacion:</label>
            <input type="text" name="id" id="id" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="price">Precio:</label>
            <input type="text" name="price" id="price" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="quantity">Cantidad:</label>
            <input type="text" name="quantity" id="quantity" class="form-control" required>
        </div>
        <br>
        <center>
            <button type="submit" class="btn btn-primary">Agregar Producto</button>
        </center>
        
    </form>

    <table class="table mt-5">
        <thead>
        <tr>
            <th>Nombre</th>
            <th>ID</th>
            <th>Precio</th>
            <th>Cantidad</th>
            <th>Decisiones</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items="${products}" varStatus="loop">
            <tr>
                <form method="post" action="products">
                    <input type="hidden" name="action" value="edit">
                    <input type="hidden" name="index" value="${loop.index}">
                    <td><input type="text" name="name" value="${product.name}" class="form-control" required></td>
                    <td><input type="text" name="id" value="${product.id}" class="form-control" required></td>
                    <td><input type="text" name="price" value="${product.price}" class="form-control" required></td>
                    <td><input type="text" name="quantity" value="${product.quantity}" class="form-control" required></td>
                    <td>
                        <button type="submit" class="btn btn-primary">Edit</button>
                        <button type="button" class="btn btn-danger" onclick="deleteProduct(${loop.index})">Delete</button>
                    </td>
                </form>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script>
    function deleteProduct(index) {
        Swal.fire({
            title: 'Eliminacion de Producto',
            text: 'Estas seguro de eliminar este producto?',
            icon: 'warning',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Yes, Eliminar el producto!'
        }).then((result) => {
            if (result.isConfirmed) {
                var form = document.createElement("form");
                form.method = "post";
                form.action = "products";

                var actionInput = document.createElement("input");
                actionInput.type = "hidden";
                actionInput.name = "action";
                actionInput.value = "delete";
                form.appendChild(actionInput);

                var indexInput = document.createElement("input");
               type = "hidden";
                indexInput.name = "index";
                indexInput.value = index;
                form.appendChild(indexInput);

                document.body.appendChild(form);
                form.submit();
            }
        });
    }
</script>

</body>
</html>