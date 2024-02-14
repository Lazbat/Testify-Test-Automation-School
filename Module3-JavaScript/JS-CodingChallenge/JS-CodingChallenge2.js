function lengthConverter(length) {
    const unit = {'meters': 1000}; // the conversion factor from meters to kilometers
    const calculateLengthInKilometers = length / unit['meters']; // convert length to kilometers
    console.log(calculateLengthInKilometers + ' kilometers');
}

lengthConverter(50); 
