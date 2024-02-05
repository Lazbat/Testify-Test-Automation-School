const books = {
    title:'True Betrayal',
    description:'Romance',
    numberOfPages:345,
    author:'Nora Roberts',
    reading:true,
    toggleReadingStatus: function(){
        if (books.reading === true) {
            books.reading = false
        } else {
            books.reading = true
        }
    }
}

books.toggleReadingStatus()
console.log(books.reading)
