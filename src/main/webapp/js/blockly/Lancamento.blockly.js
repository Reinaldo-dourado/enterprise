window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Lancamento = window.blockly.js.blockly.Lancamento || {};

/**
 * @function NovoLancamento
 *
 *
 *
 *
 * @author Reinaldo Dourado Santos
 * @since 23/07/2025, 16:46:12
 *
 */
window.blockly.js.blockly.Lancamento.NovoLancamentoArgs = [];
window.blockly.js.blockly.Lancamento.NovoLancamento = async function() {
 var TimeSheet, item;
  //
  (await this.cronapi.client('cronapi.screen.startInsertingMode').run("GetTimeSheetByUser"));
  //
  this.cronapi.screen.showModal("Lancamento");
}

/**
 * @function SalvarLancamento
 *
 *
 *
 * @param TimeSheet
 *
 * @author Reinaldo Dourado Santos
 * @since 23/07/2025, 16:46:13
 *
 */
window.blockly.js.blockly.Lancamento.SalvarLancamentoArgs = [{ description: 'TimeSheet', id: 'c2b3f7ae' }];
window.blockly.js.blockly.Lancamento.SalvarLancamento = async function(TimeSheet) {
 var item;
  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Lancamentos:NovoLancamento', async function(sender_item) {
      item = sender_item;
    //
    this.cronapi.screen.notify('success','TimeSheet lançado com sucesso.');
    //
    (await this.cronapi.client('cronapi.screen.backNormalState').run("GetTimeSheetByUser"));
    //
    this.cronapi.screen.hideModal("Lancamento");
    //
    this.cronapi.screen.refreshDatasource("GetTimeSheetByUser", 'true');
  }.bind(this), TimeSheet);
}
