package automatizados.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

import automatizados.pageObject.LoginPO;

public class LoginTest extends BaseTest{
	
	private static LoginPO LoginPage;
	
	@BeforeClass
	public static void prepararestes() {
		LoginPage = new LoginPO(driver);
	}

	
	@Test
	public void TC001_naoDeveLogarNoSistemaComEmailESenhasVazios() {
	//	LoginPage.inputEmail.sendKeys("");
	//  LoginPage.inputSenha.sendKeys("");
		LoginPage.executarAcaoDeLogar("", "");
		
		LoginPage.buttonEntrar.click();
		
		//String mensagem = LoginPage.spanMensagem.getText();
		String mensagem = LoginPage.obterMensagem();
		
		assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
	}
	
	
	
	@Test
	public void TC002_naoDeveLogarNoSistemaComEmailESenhasVazios() {
	//	LoginPage.inputEmail.sendKeys("");
	//  LoginPage.inputSenha.sendKeys("");
		LoginPage.executarAcaoDeLogar("", "");
		
		LoginPage.buttonEntrar.click();
		
		//String mensagem = LoginPage.spanMensagem.getText();
		String mensagem = LoginPage.obterMensagem();
		
		assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
	}
	

}
