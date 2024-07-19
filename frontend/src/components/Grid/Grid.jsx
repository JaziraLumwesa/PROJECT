// src/TwoColumnLayout.js
import React from "react";
import Hm from "../../picture/Hm.jpg";
import "./Grid.css";

const TwoColumnLayout = () => {
  return (
    <div className="containerGrid">
      <div className="column">
        <h2>The smart way to park</h2>
        <img src={Hm} alt="Logo" className="image" />
      </div>
      <div className="column">
        <h2>Places we Provide Vehicle Parking in Zanzibar</h2>

        

        <ul>
          <li>DARAJANI SOUK</li>
          <li>AMANI STADIUM</li>
          <li>MNAZI MMOJA HOSPITAL</li>
          <li>MICHENZANI MALL</li>
          <li>KARIAKOO</li>
        </ul>
      </div>
    </div>
  );
};

export default TwoColumnLayout;
