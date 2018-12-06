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

export class Board {
    constructor(width, height) {
        this.width = width;
        this.height = height;
        this.population = new Array(width * height).fill(0);
    }

    get(x, y) {
        // return 0;
        return this.population[x * this.width + y];
    }

    set(x, y, value) {
        this.population[x * this.width + y] = value;
    }

    toggleCell(x, y) {
        //(this.population[x, y]) ? this.population[x, y] = 0: this.population[x, y] = 1;
        (this.get(x, y)) ? this.set(x, y, 0): this.set(x, y, 1);

    }

    next() {
        //this.toggleCell(0, 0);
        this.population[0, 0] = 0;
        this.population[0, 1] = 0;
    }

}