package automatizados.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPO extends BasePO {

	public ProdutoPO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "codigo")
	public WebElement inputCodigo;
	
	@FindBy(id = "nome")
	public WebElement inputNome;
	
	@FindBy(id = "quantiade")
	public WebElement inputQuantidade;
	
	@FindBy(id = "valor")
	public WebElement inputValor;
	
	@FindBy(id = "cadastro")
	public WebElement inputCadastro;
	
	@FindBy(id = "btn-salvar")
	public WebElement buttonSalvar;
	
	@FindBy(id = "btn-sair")
	public WebElement buttonSair;
	
	@FindBy(css = "form.form-login>div.alert>span")
	public WebElement spanMensagem;
	
	public String obterMensagem() {
		return spanMensagem.getText();
	}
	
	public void executarAcaoDeCriar(String codigo, String nome, String quantidade, String valor, String cadastro ) {
		escrever(inputCodigo, codigo);
		escrever(inputNome, nome);
		escrever(inputQuantidade, quantidade);
		escrever(inputValor, valor);
		escrever(inputCadastro, cadastro);
		buttonSalvar.click();
		buttonSair.click();
		
	}
	
	
	public void executarAcaoDeDeletar(String codigo, String nome, String quantidade, String valor, String cadastro ) {
		escrever(inputCodigo, codigo);
		escrever(inputNome, nome);
		escrever(inputQuantidade, quantidade);
		escrever(inputValor, valor);
		escrever(inputCadastro, cadastro);
		buttonSalvar.click();
		buttonSair.click();
		
	}
	
	
	
	public void executarAcaoDeEditar(String codigo, String nome, String quantidade, String valor, String cadastro ) {
		escrever(inputCodigo, codigo);
		escrever(inputNome, nome);
		escrever(inputQuantidade, quantidade);
		escrever(inputValor, valor);
		escrever(inputCadastro, cadastro);
		buttonSalvar.click();
		buttonSair.click();
		
	}

	private void escrever(WebElement input, String texto) {
		// TODO Auto-generated method stub
		input.clear();
		input.sendKeys(texto + Keys.TAB);
		
	}
	
	
}
