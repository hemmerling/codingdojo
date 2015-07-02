module.exports = {
  "Demo test ING-DiBa" : function (browser) {
    browser
      .url("http://www.ing-diba.de")
      //.waitForElementVisible('body', 1000)
      .assert.visible('.header__logo')
      .assert.elementPresent('.header-actions__item:nth-child(1)') // checks Start Element
      .saveScreenshot('report/nightwatch/ingdiba_logo_nicht_gefunden.png')
      .end()
  }
};
