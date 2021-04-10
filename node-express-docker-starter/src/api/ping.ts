import express from "express";

const router = express.Router();

router.get("/ping", (req, res) => {
  console.log("/ping is requested.");

  res.json({
    message: "Success",
  });
});

export default router;
