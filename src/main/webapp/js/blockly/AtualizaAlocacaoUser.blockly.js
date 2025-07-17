window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AtualizaAlocacaoUser = window.blockly.js.blockly.AtualizaAlocacaoUser || {};

/**
 * @function Executar
 *
 *
 *
 * @param OrdemServicoAlocacao
 *
 * @author Reinaldo Dourado Santos
 * @since 17/07/2025, 11:39:47
 *
 */
window.blockly.js.blockly.AtualizaAlocacaoUser.ExecutarArgs = [{ description: 'OrdemServicoAlocacao', id: 'cb47723c' }];
window.blockly.js.blockly.AtualizaAlocacaoUser.Executar = async function(OrdemServicoAlocacao) {

  //
  console.log(OrdemServicoAlocacao);
  //
  this.cronapi.screen.changeValueOfField("TimeSheetOS.active.alocacaoOrdemServico", OrdemServicoAlocacao);
}
