class Cell {
  constructor(){
  }
  
  isAlive(numberOfCellsAlive){
    if (numberOfCellsAlive <2){
      return false;
    } else {
      return true;
    }
    return true
  }
}

describe('Any live cell with two or three live\
          neighbours lives on to the next generation', 
        function() {
  // given
  var mycell = new Cell();
  //when
  var numberOfNeighbours = 3;
  var result = mycell.isAlive(numberOfNeighbours);
  // then
  it('Cell lives?', function() {
    assert.equal(result,true);
  });
});

describe('Any live cell with fewer than two live neighbours \
          dies, as if caused by under-population.', 
        function() {
  var mycell = new Cell();
  it('Cell lives?', function() {
    assert.equal(mycell.isAlive(1),false);
  });
});
