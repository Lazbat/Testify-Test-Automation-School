function getVowels(string) {
//define a string containing all vowels in both lowercase and uppercase
    let vowels = 'aAeEiIoOuU' 
//I will now initialize a counter for the vowels
    let vowelsCount = 0 
    //using for loop
    for (let i = 0; i < string.length; i++) {
        // Check if the current character is a vowel
        if (vowels.indexOf(string[i]) !== -1) {
            vowelsCount += 1
        }
    }

    return vowelsCount 
}

console.log("The Number of vowels in -" + " Welcome to the world of JavaScript, Lazbat!=== "
    + getVowels("Welcome to the world of JavaScript, Lazbat!"));
