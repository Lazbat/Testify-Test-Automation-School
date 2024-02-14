let numbers = [10,5,25,15,20,45,55,95,78];

//to sort an array in descending order, we use the sorting funtion'((a, b) => b - a)'
//we are comparing the elements 'a' and 'b'
//if a - b returns a negative value, a comes before b
//if a - b returns a positive value, b comes before a
//using b - a sorts the array in descending order
numbers.sort((a, b) => b - a);
console.log(numbers);