package com.hundred.web.controller.store.company;

import com.github.pagehelper.PageInfo;
import com.hundred.service.store.CompanyService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CompanyServlet extends HttpServlet {
    private CompanyService companyService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operation = request.getParameter("operation");
        if("list".equals(operation)){
            PageInfo all = companyService.findAll(1,100);
            request.setAttribute("page",all);
            request.getRequestDispatcher("/WEB-INF/pages/store/company/list.jsp").
                    forward(request,response);
        }else if("list".equals(operation)){

        }else if("list".equals(operation)){

        }else if("list".equals(operation)){

        }else if("list".equals(operation)){

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
