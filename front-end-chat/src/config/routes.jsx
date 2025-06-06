import React from "react";
import { Routes, Route } from "react-router-dom";
import App from "../App";

const AppRoutes = () => {
  return (
    <Routes>
      <Route path="/" element={<App />} />
      <Route path="/chat" element={<h1>This is a chat page</h1>} />
      <Route path="/about" element={<h1>This is a about page</h1>} />
      <Route path="*" element={<h1>This is not found</h1>} />
    </Routes>
  );
};

export default AppRoutes;
