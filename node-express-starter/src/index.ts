import dotenv from "dotenv";
import { app } from "./app";

console.log("Starting the app...");

process.env.NODE_ENV = "development";

dotenv.config({
  path: `./environment/${process.env.NODE_ENV}.env`,
});

app.listen(process.env.PORT, () => {
  console.log(`Server started at http://localhost:${process.env.PORT}.`);
});
