package sirona.controllers;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import sirona.model.User;
import sirona.data.UserDB;

/**
 *
 * @author Geoffrey Sessums
 */
@WebServlet(urlPatterns={"/userServlet"})
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        String url = "/index.html";
        
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }
        
        if (action.equals("add")) {                
            // get parameters from the request
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            // use regular Java classes
            User user = new User(username, password);
            UserDB.insert(user);

            // store the User object in request and set URL
            request.setAttribute("user", user);
            url = "/doctor/doctor.jsp";
        }
        else if (action.equals("join")) {
            // set URL to index page
            url = "/index.html";            
        }
        
        // forward request and response objects
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }    
    
    @Override
    protected void doGet(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        doPost(request, response);
    }    
}
