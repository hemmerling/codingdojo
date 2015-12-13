class Cell {

  constructor(){
    var localVar = 0; // local for closure only
    this.lives = true; // public
  }
  
  setMortalStatus(alive){
    this.lives = alive;
  }
}

class Game {
  
   applyRules(aCell,numberOfNeighbours){
    //  if(numberOfNeighbours === 1){
    //    aCell.lives = false;
    //  }else {
    //    aCell.lives = true;
    //  }
       
    //  aCell.lives = !(numberOfNeighbours <= 1 || 
    //                  numberOfNeighbours >= 4);
      
    aCell.lives = (aCell.lives && 
                   numberOfNeighbours === 2) || 
                   numberOfNeighbours === 3;                
   }
}

describe('Cell is alive next cycle', 
         function() {
  
    beforeEach(function(){
        // given
      this.myCell = new Cell();
      this.myGame = new Game();
    })      
    
    // then
    it('Dead cell with three \
        neighbours is reborn', function() {
    
      //when
      var numberOfNeighbours = 3;
      //this.myCell.lives = false;
      this.myCell.setMortalStatus(false);
      this.myGame.applyRules(this.myCell, numberOfNeighbours);

      assert.equal(this.myCell.lives,true);
     });

    it('Living cell with two \
        neighbours stays alive', function() {
    
      //when
      var numberOfNeighbours = 2;
      //this.myCell.lives = true;
      this.myCell.setMortalStatus(true);
      this.myGame.applyRules(this.myCell, numberOfNeighbours);

      assert.equal(this.myCell.lives,true);
     });

           
});


describe('Cell is dead next cycle', 
         function() {
  
    beforeEach(function(){
        // given
      this.myCell = new Cell();
      this.myGame = new Game();
    })      
    
    it('Living cell with one \
        neighbours dies', function() {
    
      //when
      var numberOfNeighbours = 1;
      //this.myCell.lives = true;
      this.myCell.setMortalStatus(true);
      this.myGame.applyRules(this.myCell, numberOfNeighbours);

      assert.equal(this.myCell.lives,false);
     });
     
    it('Living cell with four \
        neighbours dies', function() {
    
      //when
      var numberOfNeighbours = 4;
      //this.myCell.lives = true;
      this.myCell.setMortalStatus(true);
      this.myGame.applyRules(this.myCell, numberOfNeighbours);

      assert.equal(this.myCell.lives,false);
     })

     it('Dead cell with two \
        neighbours stays dead', function() {
    
      //when
      var numberOfNeighbours = 2;
      //this.myCell.lives = false;
      this.myCell.setMortalStatus(false);
      this.myGame.applyRules(this.myCell, numberOfNeighbours);

      assert.equal(this.myCell.lives,false);
     });
         
});