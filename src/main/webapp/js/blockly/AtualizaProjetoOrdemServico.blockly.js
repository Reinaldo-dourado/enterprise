window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AtualizaProjetoOrdemServico = window.blockly.js.blockly.AtualizaProjetoOrdemServico || {};

/**
 * @function Executar
 *
 *
 *
 * @param ProjetoId
 *
 * @author Reinaldo Dourado Santos
 * @since 06/06/2025, 17:27:24
 *
 */
window.blockly.js.blockly.AtualizaProjetoOrdemServico.ExecutarArgs = [{ description: 'ProjetoId', id: 'e08e60a3' }];
window.blockly.js.blockly.AtualizaProjetoOrdemServico.Executar = async function(ProjetoId) {

  //
  this.cronapi.screen.changeValueOfField("OrdemDeServicos.active.projetos", this.cronapi.screen.getValueOfField("params.ProjetoId"));
}
