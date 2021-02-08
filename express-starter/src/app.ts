import express from "express";
import { apiRouter } from "./api";

export const app = express();

app.use("/api", apiRouter);
