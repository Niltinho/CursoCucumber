package steps;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import pages.MenuPage;
import pages.MovimentacaoPage;
import support.BaseStep;
import support.DataUtils;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MovimentacaoSteps extends BaseStep {
	
	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movimentacaoPage = new MovimentacaoPage();
	
	@Test
	public void test1_InserirMovimentacao() {
		menuPage.acessarTelaInserirMovimentacao();
		
		movimentacaoPage.setTipoMovimentacao("Despesa");
		movimentacaoPage.setDataMovimentacao(DataUtils.obterDataFormatada(new Date()));
		movimentacaoPage.setDataPagamento(DataUtils.obterDataFormatada(new Date()));
		movimentacaoPage.setDescricao("Movimentação Teste");
		movimentacaoPage.setInteressado("Interessado Teste");
		movimentacaoPage.setValor("150");
		movimentacaoPage.setSituacaoPago();
		movimentacaoPage.clicarBotaoSalvar();
		Assert.assertEquals("Movimentação adicionada com sucesso!", movimentacaoPage.obterMensagemSucesso());
	}
	
	@Test
	public void test2_CamposObrigatorios() {
		menuPage.acessarTelaInserirMovimentacao();
		
		movimentacaoPage.clicarBotaoSalvar();
		//assertEquals("Data da Movimentação é obrigatório\nData do pagamento é obrigatório\nDescrição é obrigatório\nInteressado é obrigatório\nValor é obrigatório\nValor deve ser um número", movimentacaoPage.obterMensagemErro());
		assertTrue(movimentacaoPage.obterMensagemErro().contains("Data da Movimentação é obrigatório\nData do pagamento é obrigatório\nDescrição é obrigatório\nInteressado é obrigatório\nValor é obrigatório\nValor deve ser um número"));
	}
	
	@Test
	public void test3_InserirMovimentacaoFutura() {
		menuPage.acessarTelaInserirMovimentacao();
		
		Date dataFutura = DataUtils.obterDataComDiferencaDias(5);
		
		movimentacaoPage.setTipoMovimentacao("Despesa");
		movimentacaoPage.setDataMovimentacao(DataUtils.obterDataFormatada(dataFutura));
		movimentacaoPage.setDataPagamento(DataUtils.obterDataFormatada(dataFutura));
		movimentacaoPage.setDescricao("Movimentação Teste");
		movimentacaoPage.setInteressado("Interessado Teste");
		movimentacaoPage.setValor("150");
		movimentacaoPage.setSituacaoPago();
		movimentacaoPage.clicarBotaoSalvar();
		assertTrue(movimentacaoPage.obterMensagemErro().contains("Data da Movimentação deve ser menor ou igual à data atual"));
	}

}
