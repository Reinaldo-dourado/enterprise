window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.DesabilitaPercentualComissaoParceiro = window.blockly.js.blockly.DesabilitaPercentualComissaoParceiro || {};

/**
 * @function Executar
 *
 *
 *
 * @param valorComissao
 *
 * @author Reinaldo Dourado Santos
 * @since 05/06/2025, 14:21:23
 *
 */
window.blockly.js.blockly.DesabilitaPercentualComissaoParceiro.ExecutarArgs = [{ description: 'valorComissao', id: 'c4a16b9b' }];
window.blockly.js.blockly.DesabilitaPercentualComissaoParceiro.Executar = async function(valorComissao) {
 var clienteId;
  //
  if (!this.cronapi.logic.isNullOrEmpty(valorComissao)) {
    //
    this.cronapi.screen.hideComponent("textinput-modal-perc_ComissaoParceiro");
  }
  //
  if (this.cronapi.logic.isNullOrEmpty(valorComissao)) {
    //
    this.cronapi.screen.showComponent("textinput-modal-perc_ComissaoParceiro");
  }
}
