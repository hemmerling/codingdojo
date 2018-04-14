describe('mocha+assert API description', function() {
  
  
  class Cell {
    
    constructor() {
      this.counter = 0;
    }
    
    hasNeighbour(aCell) {
      this.counter +=1;
      aCell.counter +=1;
      //aCell.hasNeighbour(aCell);
    }
    
    isalive() { 
      return this.counter == 2;
    }
  }
  
  class DeadCell extends Cell {
    
    constructor() {
      this.counter = 0;
    }
    
    hasNeighbour(aCell) {
      this.counter +=1;
      aCell.counter +=1;
      //aCell.hasNeighbour(aCell);
    }
    
    isalive() { 
      return this.counter == 3;
    }
  }
  
  it('cell1 sees 1 neighbour and dies', function() {
    var cell1 = new Cell();
    var cell2 = new Cell();
    cell1.hasNeighbour(cell2);
    assert.equal(false, cell1.isalive());
  });
  
  it('cell1 sees 2 neighbours and lives', function() {
    var cell1 = new Cell();
    var cell2 = new Cell();
    var cell3 = new Cell();
    cell1.hasNeighbour(cell2);
    cell1.hasNeighbour(cell3);
    assert.equal(true, cell1.isalive());
  });
  
   it('cell2 sees 2 neighbours and lives', function() {
    var cell1 = new Cell();
    var cell2 = new Cell();
    var cell3 = new Cell();
    cell1.hasNeighbour(cell2);
    cell3.hasNeighbour(cell2);
    assert.equal(true, cell2.isalive());
  });
  
  
  
  
  
  it('simple values equal?', function() {
    assert.equal('one', 'one');
  });
  
  it('simple values doesnt equal?', function() {
    assert.notEqual('one', 'two');
  });
  
  it('value is truthy', function() {
    assert.ok(true);
  });
  
  it('complex types equal?', function() {
    assert.deepEqual([1,2,3], [1,2,3]);
  });
  it('complex types dont equal?', function() {
    assert.notDeepEqual([1,2,3], ['one', 'two']);
  });
  
  it('value and type equal?', function() {
    assert.strictEqual('1', '1');
  });
  it('complex types dont equal?', function() {
    assert.notStrictEqual(1, '1');
  });
  
  it('throws?', function() {
    assert.throws(function(){ throw new Error(); });
  });
  it('does not throw?', function() {
    assert.doesNotThrow(function() {});
  });
});