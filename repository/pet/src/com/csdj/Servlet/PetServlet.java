package com.csdj.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csdj.Service.PetService;
import com.csdj.Service.PetServiceImpl;
import com.csdj.entity.pet;

public class PetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String opr=request.getParameter("opr");
		PetService ps=new PetServiceImpl();
		PrintWriter out=response.getWriter();
		if("xuanze".equals(opr)){
			String name=request.getParameter("xiala");
			if("请选择".equals(name)){
				List<pet> list=ps.cha();
				request.setAttribute("list", list);
				request.getRequestDispatcher("NewFile.jsp").forward(request, response);
			}else{
				List<pet> list=ps.cha(name);
				request.setAttribute("list", list);
				request.setAttribute("zhong", name);
				request.getRequestDispatcher("NewFile.jsp").forward(request, response);
			}
		}else if("xinzeng".equals(opr)){
			String name=request.getParameter("name");
			String xiala=request.getParameter("xiala");
			String sex=request.getParameter("sex");
			String date=request.getParameter("date");
			String miaoshu=request.getParameter("miaoshu");
			int a=ps.zeng(name, xiala, sex, date, miaoshu);
			if(a>0){
				out.print("<script type='text/javascript'>alert('新增成功');location.href='chongwu';</script>");
			}else{
				out.print("<script type='text/javascript'>alert('新增失败');location.href='chongwu';</script>");
			}
		}else if("xiugai".equals(opr)){
			String name=request.getParameter("name");
			String xiala=request.getParameter("xiala");
			String sex=request.getParameter("sex");
			String date=request.getParameter("date");
			String miaoshu=request.getParameter("miaoshu");
			String pid=request.getParameter("id");
			int id=Integer.parseInt(pid);
			pet p=new pet(id, name, xiala, sex, date, miaoshu);
			int a=ps.update(p);
			if(a>0){
				out.print("<script type='text/javascript'>alert('修改成功');location.href='chongwu';</script>");
			}else{
				out.print("<script type='text/javascript'>alert('修改失败');location.href='chongwu';</script>");
			}
		}else if("shan".equals(opr)){
			String pid=request.getParameter("id");
			int id=Integer.parseInt(pid);
			int a=ps.delete(id);
			if(a>0){
				out.print("<script type='text/javascript'>alert('删除成功');location.href='chongwu';</script>");
			}else{
				out.print("<script type='text/javascript'>alert('删除失败');location.href='chongwu';</script>");
			}
		}
		
		else{
		List<pet> list=ps.cha();
		request.setAttribute("list", list);
		request.getRequestDispatcher("NewFile.jsp").forward(request, response);
		}
	}

}
