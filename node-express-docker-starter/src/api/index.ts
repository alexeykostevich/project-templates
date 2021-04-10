import express from "express";
import ping from "./ping";

export const apiRouter = express.Router();

apiRouter.use("/", [ping]);
