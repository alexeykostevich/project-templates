import express from "express";
import ping from "./ping";

export const app = express();

app.use("/api", [ping]);
