import test from 'ava';
var index = require('./index');

test('gof exists', t => {
    t.pass(index.gof());
});

test('Eine tote Zelle mit genau drei lebenden Nachbarn wird in der Folgegeneration neu geboren', t => {
    let numNeighbours = 3;

    let gof = index.gof();
    let result = gof.isAlive(numNeighbours);

    t.is(result, true);
});

test('Eine tote Zelle mit genau zwei lebenden Nachbarn bleibt in der Folgegeneration tot', t => {
    let numNeighbours = 2;
    let state = false;

    let gof = index.gof();
    let result = gof.isAlive(numNeighbours, state);

    t.is(result, false);
});

test('Eine lebende Zelle mit genau vier lebenden Nachbarn stirbt in der Folgegeneration', t => {
    let numNeighbours = 4;
    let state = true;

    let gof = index.gof();
    let result = gof.isAlive(numNeighbours, state);

    t.is(result, false);
});

test('Eine lebende Zelle mit genau drei lebenden Nachbarn bleibt in der Folgegeneration am leben', t => {
    let numNeighbours = 3;

    let gof = index.gof();
    let result = gof.isAlive(numNeighbours);

    t.is(result, true);
});

test('Eine lebende Zelle mit genau zwei lebenden Nachbarn bleibt in der Folgegeneration am leben', t => {
    let numNeighbours = 2;
    let state = true;

    let gof = index.gof();
    let result = gof.isAlive(numNeighbours, state);

    t.is(result, true);
});

test('Lebende Zellen mit genau einem lebenden Nachbarn stirbt in der Folgegeneration an Einsamkeit', t => {
    let numNeighbours = 1;
    let state = true;

    let gof = index.gof();
    let result = gof.isAlive(numNeighbours, state);

    t.is(result, false);
});

test('Lebende Zellen mit keinem lebenden Nachbarn stirbt in der Folgegeneration an Einsamkeit', t => {
    let numNeighbours = 0;
    let state = true;

    let gof = index.gof();
    let result = gof.isAlive(numNeighbours, state);

    t.is(result, false);
});
