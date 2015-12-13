console.log('Hello jscoderetreat!');
'use strict';

function gof() {
    return {
        isAlive: function(numNeighbours, state) {
            var retValue = false;

            if (state) {

            }

            if (numNeighbours == 2 || numNeighbours == 3) {
                retValue = true;
            }

            return retValue;
        },
        getNumNeighbours: function(cell) {
            return 0;
        }
    }
}

exports.gof = gof;
