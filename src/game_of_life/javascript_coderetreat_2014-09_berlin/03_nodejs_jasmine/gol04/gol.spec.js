
describe('Game of Life', function(){

  it('Cell with 1 neighbour dies', function() {
    var game = new Game();
    game.setNumberOfNeighbours(1);
    // game.setLifeStatus(true);
    game.next();
    expect(game.isAlive()).toBe(false);
  });

  it('Cell with 3 neighbours lives', function() {
    var game = new Game();
    game.setNumberOfNeighbours(3);
    // game.setLifeStatus(true);
    game.next();
    expect(game.isAlive()).toBe(true);
  });

  it('Living Cell with 2 neighbours lives', function() {
    var game = new Game();
    game.setNumberOfNeighbours(2);
    game.setLifeStatus(true);
    game.next();
    expect(game.isAlive()).toBe(true);
  });

  it('Dead Cell with 2 neighbours stays dead.', function() {
    var game = new Game();
    game.setNumberOfNeighbours(2);
    game.setLifeStatus(false);
    game.next();
    expect(game.isAlive()).toBe(false);
  });

});

Game = function() {
  this.lifeStatus = true;
  this.neighbours = null;
}

Game.prototype.next = function() {

  var nextStatus1 = [false, false, true, true, false, false, false, false, false];
  var nextStatus2 = [false, false, false, true, false, false, false, false, false];
  //
  // if (this.lifeStatus && this.neighbours == 2) {
  //   this.lifeStatus = true;
  // }
  //
  // if (this.neighbours == 3) {
  //   this.lifeStatus = true;
  // }
  //
  // if (this.neighbours == 1) {
  //   this.lifeStatus = false;
  // }

  if (this.lifestatus) {
    this.lifeStatus = nextStatus1[this.neighbours];
  } else {
    this.lifeStatus = nextStatus2[this.neighbours];
  }

  // this.lifeStatus = this.neighbours == 3;
}
//
// Game.next_v99 = function() {
//
//   if (!this.lifeStatus && this.neighbours === 3) {
//     this.lifeStatus = true;
//   }
//
//   if (this.lifeStatus) {
//     if (this.neighbours === 3 || this.neighbours === 2) {
//       this.lifeStatus = true;
//     } else {
//       this.lifeStatus = false;
//     }
//
//   }
//
// }

Game.prototype.setNumberOfNeighbours = function(neighbours) {
  this.neighbours = neighbours;
}

Game.prototype.setLifeStatus = function(status) {
  this.lifeStatus = status;
}

Game.prototype.isAlive = function() {
  return this.lifeStatus;
}

//Dont remove me
