// The tests.
it('living cell with less than 2 live neighbors dies', function() {
  var status = cell(true, 1).getNextState();
  expect(status).toBe(false);
}); 

it('living cell with 2 or 3 live neighbors lives', function() {
  var status = cell(true, 2).getNextState()
  expect(status).toBe(true);
});

it('living cell with more than 3 live neighbors dies', function() {
  var status = cell(true, 4).getNextState();
  expect(status).toBe(false);
});

it('dead cell with exactly three live neighbours comes alive', function() {
  var status = cell(true, 3).getNextState();
  expect(status).toBe(true);
});

it('a dead cell with 2 neighbors will remain dead', function() {
  var status = cell(false, 2).getNextState();
  expect(status).toBe(false);
});


function cell(state, numberOfNeighbors) {
  
  return {
    alive: state,
    numberOfNeighbors: numberOfNeighbors,
    getNextState: function(){
      
      var statusTableLiving = [false, false, true, true, false, false, false];
      var statusTableDead = [false, false, false, true, false, false, false];
      
      var statusTable = [statusTableDead, statusTableLiving];
      
      var state = statusTable[+ this.alive][this.numberOfNeighbors];
      return state;

    }
  }
  
}

function cell2(state, numberOfNeighbors) {
  
  return {
    alive: state,
    numberOfNeighbors: numberOfNeighbors,
    getNextState: function(){
      
      var statusTableLiving = [false, false, true, true, false, false, false];
      var statusTableDead = [false, false, false, true, false, false, false];
      
      var state = null;
      if(this.alive) {
        state = statusTableLiving[this.numberOfNeighbors];
      } else {
        state = statusTableDead[this.numberOfNeighbors];
      }
      
      return state;

    }
  }
  
}



function cell1(state, numberOfNeighbors) {
  
  return {
    alive: state,
    numberOfNeighbors: numberOfNeighbors,
    getNextState: function(){
      if(!this.alive) {
        return numberOfNeighbors == 3
      } else {
        return !(numberOfNeighbors < 2 || numberOfNeighbors > 3);
      }
    }
  }
  
}


