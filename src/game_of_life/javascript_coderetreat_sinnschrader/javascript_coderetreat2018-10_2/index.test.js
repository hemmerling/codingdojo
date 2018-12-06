import { echo } from "./index";
import { gol } from "./index";

test("Game of life exports a test function which echos its input", () => {
    expect(echo("input")).toBe("input");
});

test("gol, 1 nbr, cell is alive ", () => {
    var isAlive = true;
    expect(gol(1, isAlive)).toBe(false);
});

test("gol, 3 nbr, cell is dead, will live", () => {
    var isAlive = false;
    var nbr = 3;
    expect(gol(nbr, isAlive)).toBe(true);
});

test("gol, > 3 nbr, will die", () => {
    var isAlive = true; // or false
    var nbr = 4;
    expect(gol(nbr, isAlive)).toBe(false);
});

test("gol, 0 nbr, will die", () => {
    var isAlive = true;
    var nbr = 0;
    expect(gol(nbr, isAlive)).toBe(false);
});

test("gol, 2 nbr, is alive, will live", () => {
    var isAlive = true;
    var nbr = 2;
    expect(gol(nbr, isAlive)).toBe(true);
});