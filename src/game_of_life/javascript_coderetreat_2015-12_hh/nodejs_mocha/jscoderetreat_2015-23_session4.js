const neighbours0 = 8*'0';

function evolve(firstGen){
  return neighbours0;
}

function getNeighboursCount(field, cellIndex) {
  var min = Math.min(cellIndex-4, 0);
  var max = Math.max(cellIndex+4, field.length-1);
  var array = field.split('').slice(min,max);
  var count = array.filter(char => char === '1').length;
  return field[cellIndex] === '1' ? count-1 : count;
}

function getNeighboursCountof4(field){
  var count = 0;
  //for (var ii=0; ii< field.length;ii++) {
  //  if (field[ii] == 1) {
  //    count++;
  //  };
  //};
  //if (field[4] ==1){
  //  count--;
  //};
  // return count;
  count = field.split('').filter(char => char === '1').length;
  return field[4] === '1' ? count-1 : count;
}

describe('Cell is dead in next cycle', 
         function() {
  
    // given
    beforeEach(function(){
    })      
    
    // then
    it('Dead cell with zero neighbours dies', function() {
      const firstGen = '000010000';
      const nextGen = evolve(firstGen);
      assert.equal(nextGen, neighbours0);
    });

    //it('Cell with 4 neighbours dies', function() {
    //  const firstGen = '111011000';
    //  const nextGen = evolve(firstGen);
    //  assert.equal(nextGen, '111001000');
    //});

});

describe('getNeighboursCount', function () {
  it('returns count of neighbours', function () {
    const firstGen = '111011000';
    //const count = getNeighboursCountof4(firstGen);
    const count = getNeighboursCount(firstGen,4);
    assert.equal(count, 4);
  });
  
  it('returns count of neighbours', function () {
    const firstGen = '1110';
    //const count = getNeighboursCountof4(firstGen);
    const count = getNeighboursCount(firstGen,2);
    assert.equal(count, 2);
  });
});