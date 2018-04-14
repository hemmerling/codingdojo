class GameOfLife {
  getNextGen(board) {
    let numNeighbors = this.countNeighbors(board);
    if (numNeighbors < 2) {
      return 0;
    }
    
    return 1;
  }
  
  countElements(board) {
    var self = this;
    //console.log("counting board:");
    //console.log(board);
    return board.reduce(function(prevRowSum, currentRow) {
      //console.log(prevRowSum);
      return prevRowSum + self.countElementsInRow(currentRow);
    }, 0);
  }

  countElementsInRow(row) {
     return row.reduce(function(prevSum, currentCell) {
        return prevSum + currentCell;
      }, 0);
  }

  countNeighbors(board) {
    return this.countElements(board) - board[1][1];
  }
  
}




describe('rule 1', function() {
  let board1 = [
    [0, 0, 0],
    [0, 1, 0],
    [0, 0, 1],
  ];
  
  let board2 = [
    [0, 0, 0],
    [0, 1, 0],
    [0, 0, 0],
  ];
  
  it('countElements', function() {
    let game = new GameOfLife();
    assert.equal(2, game.countElements(board1))
  });
  
  it('dies with 1 neighbor', function() {
    let game = new GameOfLife();
    assert.equal(0, game.getNextGen(board1));
  });
  
  it('dies with 0 neighbors', function() {
    let game = new GameOfLife();
    assert.equal(0, game.getNextGen(board2));
  });
});

describe('rule 2', function() {
  let board1 = [
    [0, 0, 0],
    [0, 1, 1],
    [0, 0, 1],
  ];
  
  let board2 = [
    [0, 0, 1],
    [0, 1, 1],
    [0, 0, 1],
  ];
  
  it('survives with 2 neighbors', function() {
    let game = new GameOfLife();
    
    assert.equal(1, game.getNextGen(board1));
  });
  
  it('survives with 3 neighbors', function() {
    let game = new GameOfLife();
    assert.equal(1, game.getNextGen(board2));
  });
});

describe('rule 2, flat array', function() {
  let board1 = [0, 0, 0, 0, 1, 1, 0, 0, 1];
  
  it('survives with 2 neighbors', function() {
    let game = new GameOfLife();
    
    assert.equal(3, game.countElementsInRow(board1));
  });
});