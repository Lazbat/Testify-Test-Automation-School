function sumOfMyArray(array) {
    let total = 0;
    for (let i = 0; i < array.length; i++) {
        total += array[i];
    }
    return total;
}
const array = [10, 20, 30, 40, 50, 60, 70, 80, 90];
console.log(sumOfMyArray(array))

/*This is a long process. Imagine I have an array of over 20 elements
const myArray = [10,20,30,40,50]
const sumOfmyArray = myArray[0]+myArray[1]+myArray[2]+myArray[3]+myArray[4]
    
console.log(sumOfmyArray)*/ 



