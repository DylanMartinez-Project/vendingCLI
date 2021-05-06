// add pageTitle
const name = 'My Shopping List';

// add groceries
const groceries = ['bread', 'butter', 'banana', 'beer', 'bacon', 'broccoli', 'berries', 'brownies', 'batter', 'boots' ];
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('title');
  pageTitle.innerText = name;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
 function displayGroceries() {
  const main = document.getElementById('groceries');
  groceries.forEach((grocery) => {
    const container = document.createElement('li');
    container.innerText = grocery;
    main.appendChild(container);
  });
  // shoppingList.appendChild(main);  error
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const list = document.querySelectorAll('li');
  list.forEach((task) => {
    task.classList.add('completed');
  })
  
}


setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
