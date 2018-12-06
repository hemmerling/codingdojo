import { echo } from "./index";
import { gol } from "./index";

test("gol, 1 neighbour", () => {
    //expect(echo("input")).toBe("input");
    var number_neighbours = 1;
    expect(gol(number_neighbours)).toBe(false);

});

test("gol, 0 neighbour", () => {
    //expect(echo("input")).toBe("input");
    var number_neighbours = 0;
    expect(gol(number_neighbours)).toBe(false);

});

test("gol, 2 neighbours", () => {
    //expect(echo("input")).toBe("input");
    var number_neighbours = 2;
    expect(gol(number_neighbours)).toBe(true);

});

test("gol, 3 neighbours", () => {
    //expect(echo("input")).toBe("input");
    var isalive = true;
    var number_neighbours = 3;
    expect(gol(number_neighbours)).toBe(true);

});