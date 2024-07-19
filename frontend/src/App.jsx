// src/App.js
import React, { useState } from 'react';
import { BrowserRouter as Router, Route, Routes, Navigate } from 'react-router-dom';
import Navbar from './components/navbar/navbar';
import Home from './pages/home/Home';
import About from './pages/About/About';
import Contact from './pages/contact/Contact';
import Login from './pages/login/login';
import Registration from './pages/registration/registration';
import Admin from './pages/Admin/Admin';
import './App.css';

const App = () => {
  const [isAuthenticated, setIsAuthenticated] = useState(false);

  const handleLogin = (email, password) => {
    // Dummy authentication check
    if (email === 'lumwesa@gmail.com' && password === 'password') {
      setIsAuthenticated(true);
      return true;
    }
    return false;
  };

  return (
    <Router>
      <Navbar />
      <Routes>
        <Route path="/" element={<Login onLogin={handleLogin} />} />
        <Route path="/home" element={isAuthenticated ? <Home /> : <Navigate to="/" />} />
        <Route path="/about" element={isAuthenticated ? <About /> : <Navigate to="/" />} />
        <Route path="/contact" element={isAuthenticated ? <Contact /> : <Navigate to="/" />} />
        <Route path="/login" element={<Login onLogin={handleLogin} />} />
        <Route path="/registration" element={<Registration />} />
        <Route path="/admin" element={<Admin />} />
      </Routes>
    </Router>
  );
};

export default App;
