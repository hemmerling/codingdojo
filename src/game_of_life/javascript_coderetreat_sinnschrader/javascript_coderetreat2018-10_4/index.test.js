import { echo } from "./index";
import { Board } from "./index";

test("Game of life exports a test function which echos its input", () => {
    expect(echo("input")).toBe("input");
});


test("I want a object called Board that has 10 width and 5 height", () => {
    const board = new Board(10, 5);
    expect(board.width).toBe(10);
    expect(board.height).toBe(5);

});

test("I want get a value from board", () => {
    const board = new Board(3, 3);
    expect(board.get(0, 0)).toBe(0);
});

test("I want get a population on the board", () => {
    const board = new Board(3, 3);
    expect(board.population).toEqual([
        0, 0, 0,
        0, 0, 0,
        0, 0, 0
    ]);
});

test("I want get a population on a random board", () => {
    const width = Math.floor(Math.random() * 10);
    const height = Math.floor(Math.random() * 10);
    const board = new Board(width, height);
    expect(board.population).toEqual(new Array(width * height).fill(0));
});

test("I want to toggle a cell", () => {
    const board = new Board(2, 5);
    board.toggleCell(0, 1);
    expect(board.population).toEqual([
        0, 1,
        0, 0,
        0, 0,
        0, 0,
        0, 0
    ]);
});


test("I want to toggle another cell", () => {
    const board = new Board(2, 2);
    board.toggleCell(0, 1);
    board.toggleCell(1, 1);
    expect(board.population).toEqual([
        0, 1,
        0, 1
    ]);
});

test("next will kill a single alive cell", () => {
    const board = new Board(3, 3);
    board.toggleCell(0, 0);
    board.next();

    expect(board.population).toEqual([
        0, 0, 0,
        0, 0, 0,
        0, 0, 0
    ]);
})

test("next will kill a two neighbouring alive cell", () => {
    const board = new Board(3, 3);
    board.toggleCell(0, 0);
    board.toggleCell(0, 1);
    board.next();

    expect(board.population).toEqual([
        0, 0, 0,
        0, 0, 0,
        0, 0, 0
    ]);
})