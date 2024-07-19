// src/AboutUs.js
import React from 'react';
import aboutus from "../../picture/aboutus.jpg";
import about from "../../picture/about.jpg";
import abt from "../../picture/abt.jpg";
import './About.css';

const AboutUs = () => {
  return (
    <div className="containerAbout">
      <header className="header">
        <h1>About Us</h1>
      </header>

      <section className="section">
        <h2>Location: Zanzibar Urban Areas</h2>
        <p>
          Our vehicle parking system is designed to serve the bustling urban areas of Zanzibar. Whether you are a resident or a visitor, our parking facilities provide convenient and secure parking solutions in strategic locations across the city.
        </p>
      </section>

      <section className="section">
        <h2>Importance of Using Our Parking System</h2>
        <p>
          Parking in urban areas can be challenging, but our system makes it easy and stress-free. Here are some benefits of using our parking system:
        </p>
        <ul>
          <li>Secure parking for your vehicles</li>
          <li>Easy access to key locations in Zanzibar</li>
          <li>Time-saving with quick and efficient parking processes</li>
          <li>Cost-effective parking rates</li>
          <li>Real-time availability information through our mobile app</li>
        </ul>
      </section>

      <section className="section">
        <h2>Our Professionals</h2>
        <div className="professionals">
          <div className="professional">
            <img src={about} alt="Rachel Michael" />
            <h3>Rachel Michael</h3>
            <p>Chief Technology Officer</p>
          </div>
          <div className="professional">
            <img src={abt} alt="Raheem Mohd" />
            <h3>Raheem Mohd</h3>
            <p>Head of Operations</p>
          </div>
          <div className="professional">
            <img src={aboutus} alt="Juma Johnson" />
            <h3>Juma Johnson</h3>
            <p>Customer Service Manager</p>
          </div>
        </div>
      </section>
    </div>
  );
};

export default AboutUs;
