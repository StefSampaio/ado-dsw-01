package br.com.carstore.servlet;

import br.com.carstore.model.Carro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String carName = request.getParameter("car-name");
        String carColor = request.getParameter("car-color");
        System.out.println("Carro: " + carName + " Cor: " + carColor);

        Carro newCar = new Carro(carName, carColor);

        response.setContentType("application/json");
        String resposta = "{"
                + "\"name\": \"" + newCar.getName() + "\","
                + "\"color\": \"" + newCar.getColor() + "\""
                + "}";

        PrintWriter out = response.getWriter();
        out.print(resposta);
        out.flush();

    }
}