window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Validapercentualcomissao = window.blockly.js.blockly.Validapercentualcomissao || {};

/**
 * @function Executar
 *
 *
 *
 * @param percentual
 *
 * @author Reinaldo Dourado Santos
 * @since 05/06/2025, 13:39:24
 *
 */
window.blockly.js.blockly.Validapercentualcomissao.ExecutarArgs = [{ description: 'percentual', id: 'c6fd80e4' }];
window.blockly.js.blockly.Validapercentualcomissao.Executar = async function(percentual) {
 var Resultado;
  //
  if (!this.cronapi.logic.isNullOrEmpty(percentual)) {
    //
    Resultado = true;
  }
  return Resultado;
}
