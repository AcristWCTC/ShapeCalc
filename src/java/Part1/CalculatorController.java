package Part1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Adam
 */
@WebServlet(name = "CalculatorController", urlPatterns = {"/CalculatorController"})
public class CalculatorController extends HttpServlet {

//    private static final String DEST_PAGE = "/calcResponse.jsp";
    String responseMsg = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            String width = request.getParameter("width");
            String length = request.getParameter("length");
            String radius = request.getParameter("radius");
            String side1 = request.getParameter("side1");
            String side2 = request.getParameter("side2");
            String calcType = request.getParameter("calcType");
            String destPage = request.getParameter("destPage");

            if (calcType.equals("rectangle")) {
                double doubleWidth = Double.parseDouble(width);
                double doubleLength = Double.parseDouble(length);

                RectCalcService calcSrv = new RectCalcService();
                responseMsg = calcSrv.calcRectangle(doubleWidth, doubleLength);
            }

            if (calcType.equals("circle")) {
                double doubleRadius = Double.parseDouble(radius);

                CircleCalcService calcSrv = new CircleCalcService();
                responseMsg = calcSrv.calcCircle(doubleRadius);
            }

            if (calcType.equals("triangle")) {
                double doubleSide1 = Double.parseDouble(side1);
                double doubleSide2 = Double.parseDouble(side2);

                TriangleCalcService calcSrv = new TriangleCalcService();
                responseMsg = calcSrv.calcTriangle(doubleSide1, doubleSide2);
            }

            request.setAttribute("myMsg", responseMsg);

            RequestDispatcher view
                    = request.getRequestDispatcher(destPage);
            view.forward(request, response);

        } catch (Exception e) {
            request.setAttribute("errorMsg", e.getMessage());
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            String age = request.getParameter("age");
            String responseMsg = "You are " + age + " years old";
            request.setAttribute("myMsg", responseMsg);

            RequestDispatcher view
                    = request.getRequestDispatcher("/helloResponse.jsp");
            view.forward(request, response);
        } catch (Exception e) {
            request.setAttribute("errorMsg", e.getMessage());
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
