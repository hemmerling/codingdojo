module.exports = {
  "Demo test ING-DiBa" : function (browser) {
    browser
      .url("http://www.ing-diba.de")
      //.waitForElementVisible('body', 1000)
      .click(".header-actions__item+.u-visible-large")
     .assert.containsText('#tab-adresse','Anschrift', "Prüfe ob Anschrift-Tab da ist")
     .click("#tab-adresse")
  }
};

