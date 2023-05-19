import { add } from "./utils";

describe("add", () => {
  it("returns sum", () => {
    const result: number = add(1, 2);

    expect(result).toBe(3);
  });
});
