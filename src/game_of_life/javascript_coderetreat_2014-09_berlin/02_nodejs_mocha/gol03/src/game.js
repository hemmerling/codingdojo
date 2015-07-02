var Game = function (state) {
    
};

Game.prototype.setNumberOfNeighbours = function(numberOfNeighbours) {
    this.numberOfNeighbours = numberOfNeighbours;
};

Game.prototype.isAlive = function(alive) {
    if(typeof alive != 'undefined') {
        this.alive = alive;
    }   

    return this.alive;
};

Game.prototype.next = function() {
    if(this.alive) {
        this.alive = this.numberOfNeighbours > 1 && this.numberOfNeighbours < 4;
     }
    else {
        this.alive = this.numberOfNeighbours == 3;
    }
    return (this.numberOfNeighbours < 9);
 
};

Game.prototype.next_v1 = function() {
    this.alive = this.numberOfNeighbours > 1 
};

Game.prototype.next_v2 = function() {
    this.alive = this.numberOfNeighbours > 1 && this.numberOfNeighbours < 4;
    return (this.numberOfNeighbours < 9);
};

Game.prototype.next_v99 = function() {
    if(this.alive) {
        this.alive = (this.numberOfNeighbours >= 2 && this.numberOfNeighbours <= 3);
        return;
    }
    else {
        this.alive = (this.numberOfNeighbours == 3);
        return;
    }
    
    this.alive = false;
};

module.exports = Game;