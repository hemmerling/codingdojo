console.log("Hello JS CodeRetreat");

// // Example:
import { Canvas } from './canvas';

// // Create a canvas
const canvas = new Canvas();
// // Initialize width and height of your universe
canvas.init(10, 10);
// // Paint a cell at x, y and set it as alive
canvas.paint(0, 0, true);

export class MyGOL {

    constructor(array) {
        this.array = array;
    }

    sizeOfMap() {
        return (this.array.length);
    }

}

export function echo(input) {
    return input;
};