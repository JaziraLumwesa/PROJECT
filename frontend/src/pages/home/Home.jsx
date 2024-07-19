import React from "react";
import SearchBar from "../../components/searchBar/searchbar";
import Grid from "../../components/Grid/Grid";
import "./Home.css";


const Home = () => {
  return (
    <div className="home-container">
      <div className="header-section">
        <h2>Welcome to one of the best parking solutions in ZANZIBAR urban areas</h2>
        <h3 className="marquee-text">
          <marquee>"ParkSmart: Revolutionizing Urban Parking with Intelligent Solutions"</marquee>
        </h3>
       
      </div>
      <div className="content-section">
        <p>
          In today's rapidly urbanizing world, efficient parking solutions are critical to reducing congestion,
          saving time, and minimizing environmental impact. Our Smart Vehicle Parking system leverages advanced
          technologies and real-time data analytics to provide a user-friendly parking experience. This not only enhances
          convenience for drivers but also contributes to the creation of smarter, greener, and more sustainable cities.
          We are committed to transforming the way people park, making it smarter, simpler, and more sustainable for everyone.
        </p>
        <SearchBar/>
        <Grid/>
      </div>
    </div>
  );
};

export default Home;
