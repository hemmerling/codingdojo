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

export function gol1(number_of_neighbours) {
    return false;
}

export function gol2(number_of_neighbours, isAlive) {
    return number_of_neighbours == 3 && isAlive == false ? true : false;
}

export function gol3(number_of_neighbours, isAlive) {
    if (number_of_neighbours == 3 && isAlive == false)
        return true;
    else if (isAlive == true)
        if (number_of_neighbours == 1 || number_of_neighbours > 3)
            return false;
        else
            return true;
}

export function gol4(number_of_neighbours, isAlive) {
    if (number_of_neighbours == 3 && isAlive == false)
        return true;
    else if (isAlive == true)
        if (number_of_neighbours == 1 || number_of_neighbours == 0 || number_of_neighbours > 3)
            return false;
        else
            return true;
}

export function gol(number_of_neighbours, isAlive) {
    if (number_of_neighbours == 3 && isAlive == false)
        return true;
    else if (isAlive == true)
        if (number_of_neighbours <= 1 || number_of_neighbours > 3)
            return false;
        else
            return true;
}