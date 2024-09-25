package com.example.servlet;

import com.example.model.Productos;
import com.example.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/agregarProducto")
public class ProductoServlet extends HttpServlet {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadPersistencia");

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String Cantidad = req.getParameter("Cantidad");

        //Creamos el objeto de nuevo Producto - Objeto
        Productos Productos = new Productos(nombre, Cantidad );

        //Persistimos el usuario en la base de datos:
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(Productos);
        em.getTransaction().commit();
        em.close();

        //Redirigimos a la página de éxito
        req.setAttribute("Productos", Productos);
        req.getRequestDispatcher("productoJSP.jsp").forward(req, resp);

    }
}

