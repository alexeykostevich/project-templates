import { add } from "./math-utils";

describe("add", () => {
  it("returns sum", () => {
    const result: number = add(1, 2);

    expect(result).toBe(3);
  });
});
