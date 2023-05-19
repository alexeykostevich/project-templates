import type { Config } from "jest";

const config: Config = {
  preset: "ts-jest",
  testEnvironment: "node",
  testMatch: ["**/src/**/*.spec.ts"],
  verbose: true,
};

export default config;
