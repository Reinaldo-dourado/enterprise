window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AtualizarvalorOrdemServicoId = window.blockly.js.blockly.AtualizarvalorOrdemServicoId || {};

/**
 * @function Executar
 *
 *
 *
 * @param OrdemServicoId
 *
 * @author Reinaldo Dourado Santos
 * @since 11/06/2025, 20:41:26
 *
 */
window.blockly.js.blockly.AtualizarvalorOrdemServicoId.ExecutarArgs = [{ description: 'OrdemServicoId', id: '3dde88b0' }];
window.blockly.js.blockly.AtualizarvalorOrdemServicoId.Executar = async function(OrdemServicoId) {
 var OrdemdeServicoId;
  //
  this.cronapi.screen.changeValueOfField("AlocacaoOrdemServico.active.ordemDeServicos", OrdemServicoId);
}
