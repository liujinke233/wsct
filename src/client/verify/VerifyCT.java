package client.verify;

import java.io.FileOutputStream;

import verify.ValidateCodeWebService;
import verify.ValidateCodeWebServiceSoap;

public class VerifyCT {

	
	@SuppressWarnings("resource")
	public static void main(String[] args)throws Exception {
		ValidateCodeWebServiceSoap validate = new ValidateCodeWebService().getValidateCodeWebServiceSoap();
		byte[] byte1 = validate.cnValidateByte("刘金科");
		String string1 = new String(byte1);
		byte[] byte2 = validate.enValidateByte("刘金科");
		String string2 = new String(byte2);
		byte[] byte3 = validate.smallValidateByte("刘金科");
		String string3 = new String(byte3);
		validate.enValidateImage("lkj");
		FileOutputStream fcn = new FileOutputStream("E:\\file\\cn.png");
		FileOutputStream fen = new FileOutputStream("E:\\file\\en.png");
		FileOutputStream fsmall = new FileOutputStream("E:\\file\\small.png");
		fcn.write(byte1);
		fen.write(byte2);
		fsmall.write(byte3);
		
		fcn.close();
		fen.close();
		fsmall.close();
		System.out.println("");
	}
}
