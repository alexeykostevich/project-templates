import dotenv from "dotenv";
import { app } from "./api";

export async function bootstrap() {
  dotenv.config();

  console.log("Starting the app...");

  app.listen(process.env.PORT, () => {
    console.log(`Server started at http://localhost:${process.env.PORT}.`);
  });
}
