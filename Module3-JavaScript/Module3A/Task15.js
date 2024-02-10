const books = [
    {
        title: 'True Betrayal',
        description: 'fiction',
        numberOfPages: 436,
        author: 'Nora Roberts',
        reading: true,
    },
    {
        title: 'The Notebook',
        description: 'fiction',
        numberOfPages: 214,
        author: 'Nicholas Sparks',
        reading: false,
    },
    {
        title: 'The Wedding Planner',
        description: 'fiction',
        numberOfPages: 368,
        author: 'Danielle Steel',
        reading: false,
    },
    {
        title: 'The Firm',
        description: 'fiction',
        numberOfPages: 432,
        author: 'John Grisham',
        reading: true,
    },
    {
        title: 'Divine Evil',
        description: 'fiction',
        numberOfPages: 448,
        author: 'Nora Roberts',
        reading: true,
    }
]

for (let i = 0; i < books.length; i++) {
    if (books[i].reading) {
        console.log(books[i]);
    }
}