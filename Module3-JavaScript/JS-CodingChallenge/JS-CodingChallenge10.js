//a filter() function is used to filter elements in JavaScript
const myArray = [-7, -6, -5, -4, 0, 1, 2, 3, 4, 5,]

function negativeNumbers(num) {
  return num < 0;
}

console.log(myArray.filter(negativeNumbers))
