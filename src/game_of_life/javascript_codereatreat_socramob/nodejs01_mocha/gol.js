var number = 0;
var lifeStatus = true;

function isAlive() {
  return ((number == 2) && lifeStatus)|| (number == 3);
}

function setNumberOfNeighbours(numberOfNeighbours) {
  number = numberOfNeighbours;
}

function setLivingStatus (status) {
  lifeStatus = status;  
}

function setThisCellAsDeady()
{
  lifeStatus = false;
}

describe('LivingCellHasNoNeighboursAndDies', function () {
  it('Returns LivingStatus', () => {
    setNumberOfNeighbours(0);
    assert.equal(isAlive(), false);
  });
});

describe('LivingCellHas2NeighboursAndSurvives', function () {
  
  it('Returns LivingStatus', () => {
    setNumberOfNeighbours(2);
    assert.equal(isAlive(), true);
  });
});

describe('LivingCellHas3NeighboursAndSurvives', function () {
  
  it('Returns LivingStatus', () => {
    setNumberOfNeighbours(3);
    assert.equal(isAlive(), true);
  });
});

describe('DeadCellHas3NeighboursAndIsReborn', function () {
  
  it('Returns LivingStatus', () => {
    //setLivingStatus(false);,
    setThisCellAsDead();
    setNumberOfNeighbours(3);
    assert.equal(isAlive(), true);
  });
});