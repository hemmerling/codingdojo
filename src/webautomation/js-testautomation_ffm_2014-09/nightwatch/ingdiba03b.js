module.exports = {
  "Demo test ING-DiBa" : function (browser) {
    browser
      .url("http://www.ing-diba.de")
      //.waitForElementVisible('body', 1000)
      .click(".header-actions__item+.u-visible-large")
      .useXpath()
      .assert.elementPresent("//ul[contains(@class,'pw12-tabs')]/li[position()=3]/a[@id='tab-adresse']", '3rd tab is Anschrift')
      .useCss()
      .assert.elementPresent(".modal-wrapper ul.pw12-tabs li:nth-child(3) a[id='tab-adresse']", '3rd tab is Anschrift')
      .end()
  }
};

