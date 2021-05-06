const name = 'Cigar Parties for Dummies';
let description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
let reviews = [
  {
    reviewer: 'Malcolm Gladwell',
    title: 'What a book!',
    review:
      "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
    rating: 3
  }
];

/**
 * Add our product name to the page title
 * Get our page page title by the id and the query the .name selector
 * once you have the element you can add the product name to the span.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('page-title');
  pageTitle.querySelector('.name').innerText = name;
}

/**
 * Add our product description to the page.
 */
function setPageDescription() {
  document.querySelector('.description').innerText = description;
}

/**
 * I will display all of the reviews in the reviews array
 */
function displayReviews() {
  if ('content' in document.createElement('template')) {
    reviews.forEach((review) => {
      displayReview(review);
    });
  } else {
    console.error('Your browser does not support templates');
  }
}

/**
 *
 * @param {Object} review The review to display
 */
function displayReview(review) {
  const main = document.getElementById('main');
  const tmpl = document.getElementById('review-template').content.cloneNode(true);
  tmpl.querySelector('h4').innerText = review.reviewer;
  tmpl.querySelector('h3').innerText = review.title;
  tmpl.querySelector('p').innerText = review.review;
  // there will always be 1 star because it is a part of the template
  for (let i = 1; i < review.rating; ++i) {
    const img = tmpl.querySelector('img').cloneNode();
    tmpl.querySelector('.rating').appendChild(img);
  }
  main.appendChild(tmpl);
}

// LECTURE STARTS HERE ---------------------------------------------------------------

document.addEventListener('DOMContentLoaded', 
  () => {
setPageTitle();
setPageDescription
displayReviews();
  }
);

/**
 * I will show / hide the add review form
 */

function showHideForm(){

const form = document.getElementById('form');
const btn = document.getElementById('btnToggleForm');

if(form.classList.contains('d-none')){
  form.classList.remove('d-none');
  btn.innerText= 'hide form'
} else{


}


}




/**
 * I will reset all of the values in the form.
 */

function resetFormValues(){
const form = document.querySelector('form');
const inputs = form.querySelectorAll('input');

inputs.forEach(
  (input) => {
    input.value = '';
  }
);

const ratingBox = document.getElementById('rating');
ratingBox.value = 1;

const textInput = document.getElementById('review');
textInput.value= '';


}




/**
 * I will save the review that was added using the add review from
 */

