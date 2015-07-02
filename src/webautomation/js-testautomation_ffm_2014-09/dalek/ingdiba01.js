module.exports = {
'Demo test ING-DiBa': function (test) {
  test
    .open('http://www.ing-diba.de')
    .assert.visible('.header__logo')
    .assert.text('/','ING DiBa')
    .done();
  }
};

