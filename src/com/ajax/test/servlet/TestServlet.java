package com.ajax.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(urlPatterns = "/test/*")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gson g = new Gson();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String str = "";
		if("true".equals(request.getParameter("list"))) {
		List<String> strList = new ArrayList<>();
		strList.add("하하");
		strList.add("나나");
		strList.add("허허");
		str = g.toJson(strList);
	}else {
		Map<String,String> map = new HashMap<>();
		map.put("name", "하하");
		map.put("addr", "서울");
		map.put("age", "44");
		str = g.toJson(map);
	}
		pw.print(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
