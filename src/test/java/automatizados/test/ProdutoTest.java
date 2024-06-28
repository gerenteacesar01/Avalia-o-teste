package automatizados.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

import automatizados.pageObject.LoginPO;
import automatizados.pageObject.ProdutoPO;

public class ProdutoTest extends BaseTest{
	
	private static ProdutoPO ProdutoPage;
	
	@BeforeClass
	public static void prepararestes() {
		ProdutoPage = new ProdutoPO(driver);
	}

	
	@Test
	public void TC001_naoDeveSerPossivelCriarUmProdutoComCodigoVazio() {
	//	LoginPage.inputEmail.sendKeys("");
	//  LoginPage.inputSenha.sendKeys("");
		ProdutoPage.executarAcaoDeCriar("", "Alexandre", "2", "10", "05/10/2003");
		
		ProdutoPage.buttonSalvar.click();
		ProdutoPage.buttonSair.click();
		
		//String mensagem = LoginPage.spanMensagem.getText();
		String mensagem = ProdutoPage.obterMensagem();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	
	@Test
	public void TC002_naoDeveSerPossivelCriarUmProdutoComNomeVazio() {
	//	LoginPage.inputEmail.sendKeys("");
	//  LoginPage.inputSenha.sendKeys("");
		ProdutoPage.executarAcaoDeCriar("1", "", "2", "10", "05/10/2003");
		
		ProdutoPage.buttonSalvar.click();
		ProdutoPage.buttonSair.click();
		
		//String mensagem = LoginPage.spanMensagem.getText();
		String mensagem = ProdutoPage.obterMensagem();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	
	@Test
	public void TC003_DeveSerPossivelExcluirUmProduto() {
	//	LoginPage.inputEmail.sendKeys("");
	//  LoginPage.inputSenha.sendKeys("");
		ProdutoPage.executarAcaoDeDeletar("1", "Alexandre", "2", "10", "05/10/2003");
		
		ProdutoPage.buttonSalvar.click();
		ProdutoPage.buttonSair.click();
		
		//String mensagem = LoginPage.spanMensagem.getText();
		String mensagem = ProdutoPage.obterMensagem();
		
		assertEquals(mensagem, "");
	}
	
	
	@Test
	public void TC004_DeveSerPossivelEditarUmProduto() {
	//	LoginPage.inputEmail.sendKeys("");
	//  LoginPage.inputSenha.sendKeys("");
		ProdutoPage.executarAcaoDeEditar("1", "Alexandre", "2", "10", "05/10/2003");
		
		ProdutoPage.buttonSalvar.click();
		ProdutoPage.buttonSair.click();
		
		//String mensagem = LoginPage.spanMensagem.getText();
		String mensagem = ProdutoPage.obterMensagem();
		
		assertEquals(mensagem, "");
	}
	
	
	@Test
	public void TC005_DeveSerPossivelCadastrarUmProdutoQuandoClicarNoBoatoDeSalvarComTodasAsInformacoesPreenchidas() {
	//	LoginPage.inputEmail.sendKeys("");
	//  LoginPage.inputSenha.sendKeys("");
		ProdutoPage.executarAcaoDeCriar("1", "Alexandre", "2", "10", "05/10/2003");
		
		ProdutoPage.buttonSalvar.click();
		ProdutoPage.buttonSair.click();
		
		//String mensagem = LoginPage.spanMensagem.getText();
		String mensagem = ProdutoPage.obterMensagem();
		
		assertEquals(mensagem, "");
	}
	
	
	
	

}
