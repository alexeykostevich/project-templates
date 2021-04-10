import { app } from "./app";

console.log("Starting the app...");

app.listen(process.env.PORT, () => {
  console.log(`Server started at http://localhost:${process.env.PORT}.`);
});
