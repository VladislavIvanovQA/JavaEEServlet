package ru.gb.servlet;

import lombok.extern.slf4j.Slf4j;
import ru.gb.utils.ProductUtils;
import ru.gb.dto.Product;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Slf4j
@WebServlet(name = "ProductsServlet", urlPatterns = "/products")
public class ProductsServlet extends HttpServlet {
    public static final int COUNT = 10;
    private transient ServletConfig config;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("Request: {}", req.getReader());
        List<Product> products = ProductUtils.generateList(COUNT);
        req.setAttribute("products", products);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public String getServletInfo() {
        return "ProductsServlet";
    }

    @Override
    public void destroy() {
        log.info("Servlet {} destroy", getServletInfo());
    }
}
