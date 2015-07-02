


// The tests.
it('Middle cell should be dead, cell has one neighbor', function() {
  // given
  var world = [[false, false, false], [false, true, false], [false, false, true]];
  // world = [false, false, false, false, true, false, false, false, true];

  // when
  world = next(world);
  // than
  expect(cellIsAlive(world)).toEqual(false);
  
});


it('Middle cell should be dead, cell has zero neighbors', function() {
  // given
  var world = [false, false, false, false, true, false, false, false, true];
  

  // when
  world = next(world);
  // than
  expect(cellIsAlive(world)).toEqual(false);
  
});

it('Middle cell should be alive, cell has two neighbors', function() {
  // given
  var world = [false, false, false, false, true, false, false, true, true];

  // when
  world = next(world);
  // than
  expect(cellIsAlive(world)).toEqual(true);
  
});


function cellIsAlive(grid) {
  return grid[4];
}


// The production source code.
function next(grid) {
  var aliveNeighbors = 0;
  for (var i=0; i<grid.length; i++) {
    if (grid[i] === true)
      aliveNeighbors++;
  }
  if (grid[4] === true)
    aliveNeighbors--;
    
  grid[4] = (aliveNeighbors > 1)
  return grid;
}
