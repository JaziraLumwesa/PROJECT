
import React, { useState } from 'react';
import './searchBar.css';

const SearchBar = () => {
  const [query, setQuery] = useState('');

  const handleSearch = (e) => {
    e.preventDefault();
    // Handle the search logic here
    console.log('Search query:', query);
  };

  return (
    <form className="search-bar" onSubmit={handleSearch}>
      <input
        type="text"
        value={query}
        onChange={(e) => setQuery(e.target.value)}
        placeholder="Search your location..."
      />
      <button type="submit">Search</button>
    </form>
  );
};

export default SearchBar;
