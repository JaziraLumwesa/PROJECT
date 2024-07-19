import React, { useState } from 'react';
import './Admin.css';

const AdminForm = () => {
    const [longitude, setLongitude] = useState('');
    const [latitude, setLatitude] = useState('');
    const [locationName, setLocationName] = useState('');
    const [reservedSpaceName, setReservedSpaceName] = useState('');

    const handleSubmit = async (e) => {
        e.preventDefault();

        const formData = {
            longitude: parseFloat(longitude), 
            latitude: parseFloat(latitude), 
            locationName,
            reservedSpaceName
        };

        try {
            const response = await fetch('http://localhost:8080/api/v1/location/loc', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(formData),
            });

            if (response.ok) {
                console.log('Location added successfully');
                
                setLongitude('');
                setLatitude('');
                setLocationName('');
                setReservedSpaceName('');
            } else {
                console.error('Failed to add location');
                const errorText = await response.text(); 
                console.error('Error:', errorText);
            }
        } catch (error) {
            console.error('Error:', error);
        }
    };

    return (
        <form className="admin-form" onSubmit={handleSubmit}>
            <div className="form-group">
                <label htmlFor="longitude">Longitude:</label>
                <input
                    type="text"
                    id="longitude"
                    value={longitude}
                    onChange={(e) => setLongitude(e.target.value)}
                />
            </div>
            <div className="form-group">
                <label htmlFor="latitude">Latitude:</label>
                <input
                    type="text"
                    id="latitude"
                    value={latitude}
                    onChange={(e) => setLatitude(e.target.value)}
                />
            </div>
            <div className="form-group">
                <label htmlFor="locationName">locationName:</label>
                <input
                    type="text"
                    id="locationName"
                    value={locationName}
                    onChange={(e) => setLocationName(e.target.value)}
                />
            </div>
            <div className="form-group">
                <label htmlFor="reservedSpaceName">reservedSpace:</label>
                <input
                    type="text"
                    id="reservedSpaceName"
                    value={reservedSpaceName}
                    onChange={(e) => setReservedSpaceName(e.target.value)}
                />
            </div>
            <button type="submit">Submit</button>
        </form>
    );
};

export default AdminForm;
