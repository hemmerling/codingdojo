console.log("Hello JS CodeRetreat");

// // Example:
import { Canvas } from './canvas';

// // Create a canvas
const canvas = new Canvas();
// // Initialize width and height of your universe
canvas.init(10, 10);
// // Paint a cell at x, y and set it as alive
canvas.paint(0, 0, true);

export function echo(input) {
    return input;
}
export function gol2(number_of_neighbours) {
    var isAlive;
    if (number_of_neighbours < 2)
        isAlive = false;
    else if (number_of_neighbours == 2 || number_of_neighbours == 3)
        isAlive = true;
    return isAlive;
}

export function gol(number_of_neighbours) {
    var isAlive = true;
    if (number_of_neighbours < 2)
        isAlive = false;
    return isAlive;
}

export function gol1(number_of_neighbours) {
    return false;
}