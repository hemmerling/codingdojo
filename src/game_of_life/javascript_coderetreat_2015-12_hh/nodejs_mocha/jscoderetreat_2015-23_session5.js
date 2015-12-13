
function getNeighboursCount(field, x, y, z) {
  return field.filter((cell) => `${x},${y},${z}` !== cell).length;
  
  let count = 0;
  for (let nx = x-1; nx <= x+1, nx++) {
    for (let ny = y-1; ny <= y+1, ny++) {
      for (let nz = z-1; nz <= z+1, nz++) {
        if (typeof field[`${nx},${ny},${nz}`] )
      }
    }
  }
}

describe('getNeighboursCount', function () {
  
  var field2Dim = ["1,1"];
  var myFieldPosition= ["1,1,1"];
  var field3Dim0 = ["1,1,1"];
  var field3Dim1 = ["1,1,1", "0,0,0"];
  var field3Dim2 = ["1,1,1", "0,0,0", "0,1,0"];
  var field3Dim3 = ["1,1,1", "0,0,0", "0,1,0", "0,2,0"];
  
  it('returns 1 neighbour', function () {
    const myfield = field3Dim1;
    //const count = getNeighboursCount(myfield, myFieldPosition);
    const count = getNeighboursCount(myfield, 1,1,1);
    assert.equal(count, 1);
  });
  
  it('returns 2 neighbours', () => {
    assert.equal(2, getNeighboursCount(field3Dim2, 1, 1, 1));
  });
  
  it('returns 1 neighbour if there is one neighbour', () => {
    const result = getNeighboursCount(field3Dim1, 2, 2, 2);
    assert.equal(1, result);
  });
});