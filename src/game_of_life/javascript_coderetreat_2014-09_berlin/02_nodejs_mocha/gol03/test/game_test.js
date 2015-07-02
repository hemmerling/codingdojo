var assert = require('assert');
var Game = require('../src/game.js');

describe('Cell dies beeing too single', function() {
    // given
    var isAlive = true;
    var game = new Game();
    game.setNumberOfNeighbours(1);
    game.isAlive(true);
    // when
    game.next();
    // then
    it('should pass', function() {  
        assert.equal(game.isAlive(), false);   
    });
});

describe('Cell lives, was never red :-(', function() {
    // given
    var isAlive = true;
    var game = new Game();
    game.setNumberOfNeighbours(2);
    game.isAlive(true);
    // when
    game.next();
    // then
    it('should pass', function() {  
        assert.equal(game.isAlive(), true);   
    });
});

describe('Cell dies by overpopulation', function() {
    // given
    var isAlive = true;
    var game = new Game();
    game.setNumberOfNeighbours(4);
    game.isAlive(true);
    // when
    game.next();
    // then
    it('should pass', function() {  
        assert.equal(game.isAlive(), false);   
    });
});

describe('Cell cannot have 9 neighbours or more', function() {
    // given
    var isAlive = true;
    var game = new Game();
    game.setNumberOfNeighbours(9);
    game.isAlive(true);
    // when
    // then
    it('should pass', function() {  
        assert.equal(game.next(), false);   
    });
});

describe('Dead cell with exactly 3 live neighbours comes alive', function() {
    // given
    var game = new Game();
    game.setNumberOfNeighbours(3);
    game.isAlive(false);
    // then
    it('should pass', function() {  
        assert.equal(game.isAlive(), true);   
    });
});