import { echo } from "./index";
import { MyGOL } from "./index";

test("demo1", () => {
    expect(echo("hello")).toBe("hello");
});

test("create a coordinate system for the cells", () => {
    const array = new Array

        (3 * 3).fill
    const myGOL = new MyGOL(new Array(0, 0, 0, 0, 0, 0, 0, 0, 0));

    echo(myGOL.sizeOfMap());
    expect(myGOL.sizeOfMap()).toBe(8);
});