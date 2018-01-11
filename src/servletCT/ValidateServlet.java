package servletCT;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import verify.ValidateCodeWebService;
import verify.ValidateCodeWebServiceSoap;

@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ValidateServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/gif");
		
		String vd =new String(request.getParameter("validate").getBytes("iso-8859-1"),"utf-8");
		ValidateCodeWebServiceSoap validate = new ValidateCodeWebService().getValidateCodeWebServiceSoap();
		byte[] bytes = validate.cnValidateByte(vd);
		ServletOutputStream out = response.getOutputStream();
		out.write(bytes);
		out.close();
		System.out.println("");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
