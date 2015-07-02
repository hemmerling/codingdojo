describe('mocha+assert API description', function() {
  var zelle = {
    istLebendig :  true,
    anzahlNachbarn:function(nachbarn) {
    },
    lebtNoch: function() {
      return this.istLebendig;
    }
  }
  var zelle2 = {
    anzahlDerNachbarn: 0,
    istLebendig :  true,
    anzahlNachbarn:function(nachbarn) {
    },
    lebtNoch: function() {
      if (this.anzahlDerNachbarn === 2) {
        this.istLebendig = true;
      } 
      else {
        this.istLebendig = false;
      }
      return this.istLebendig;
    },
    hatNachbar:function(zelle){
      this.anzahlDerNachbarn +=1;
    }
  }
  var zelle3 = {
    istLebendig :  true,
    anzahlNachbarn:function(nachbarn) {
    },
    lebtNoch: function() {
      return this.istLebendig;
    }
  }
    
  it('Zelle hat 2 Nachbarn und lebt', function() {
    zelle.anzahlNachbarn(2),
    assert.equal(zelle.lebtNoch(), true);
  });
  
  it('Zelle hat 2 Nachbarn und ist tot', function() {
    zelle.anzahlNachbarn(2),
    zelle.istLebendig = false
    assert.equal(zelle.lebtNoch(), false);
  });
  
  it('Zelle2 lernt 1 nachbarn kennen und stirbt', function() {
    //zelle2.hatNachbar(zelle),
    zelle2.anzahlDerNachbarn +=1,
   assert.equal(zelle2.lebtNoch(), false);
  });
  
  it('Zelle2 lernt 2 nachbarn kennen und lebt', function() {
    //zelle2.hatNachbar(zelle),
    //zelle2.hatNachbar(zelle3),
    zelle2.anzahlDerNachbarn +=1,
    zelle2.anzahlDerNachbarn +=1
    assert.equal(zelle2.lebtNoch(), true);
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