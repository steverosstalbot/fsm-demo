package com.fsm.example;

import com.sun.net.httpserver.*;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

// Servlet stuff
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FSMServer extends HttpServlet {
	

	  private String primaryMsg;
	  private String secondaryMsg;

	  public void init() throws ServletException
	  {
	      // Do required initialization
		  primaryMsg = "Finite State Machine Scribble Servlet";
		  secondaryMsg = "Ready to morph";
	  }

	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	  {
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + primaryMsg + "</h1><h2>" + secondaryMsg + "/h2>");
	  }
	  
	  public void destroy()
	  {
	      // do nothing.
	  }
 
}