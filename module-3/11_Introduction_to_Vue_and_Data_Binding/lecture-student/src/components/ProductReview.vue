<template>
<!--Beginning of HTML Section-->
  <div class="main">
    <h2>Product Reviews for {{ name }}</h2>

    <p class="description"></p>

    <div class="well-display">
      <div class="well">
        <span class="amount"> {{averageRating}}</span>
        Average Rating
      </div>

      <div class="well">
        <span class="amount">{{numberOfOneStarReviews}}</span>
        1 Star Review
      </div>

      <div class="well">
        <span class="amount">{{numberOfTwoStarReviews}}</span>
        2 Star Review
      </div>

      <div class="well">
        <span class="amount">{{numberOfThreeStarReviews}}</span>
        3 Star Review
      </div>

      <div class="well">
        <span class="amount">{{numberOfFourStarReviews}}</span>
        4 Star Review
      </div>

      <div class="well">
        <span class="amount">{{numberOfFiveStarReviews}}</span>
        5 Star Review
      </div>
    </div>

    <div
      class="review"
      v-for="review in reviews"
      v-bind:key='review.id'
      v-bind:class='{favorited: review.favorited}'
    >

    <h3>{{review.title}} </h3>
    <p>{{review.review}}</p>

    <input type='checkbox' v-model="review.favorited"/>
      <!--Loop through review data-->
    </div>
  </div>
</template>

<script>
// Beginning of JavaScript section.
export default {
  name: "product-review",
  data() {
    return {
      name: "Cigar Parties for Dummies",
      description:
        "Host and plan the perfect cigar party for all of your squirrelly friends.",
      reviews: [
        {
          reviewer: "Malcolm Gladwell",
          title: "What a book!",
          review:
            "It certainly is a book. I mean, I can see that. Pages kept together with glue and there's writing on it, in some language.",
          rating: 3,
          favorited: false
        },
        {
          reviewer: "Tim Ferriss",
          title: "Had a cigar party started in less than 4 hours.",
          review:
            "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
          rating: 4,
          favorited: false
        },
        {
          reviewer: "Ramit Sethi",
          title: "What every new entrepreneurs needs. A door stop.",
          review:
            "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
          rating: 1,
          favorited: false
        },
        {
          reviewer: "Gary Vaynerchuk",
          title: "And I thought I could write",
          review:
            "There are atechelevator1 lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
          rating: 3,
          favorited: true
        }
      ]
    };
  },
  computed: {
    averageRating() {
      let sum = 0;
      for(let i = 0; i <this.reviews.length; i++){
        sum += this.reviews[i].rating;
      }
      return sum/this.reviews.length;

    },
    numberOfOneStarReviews() {

      let count = 0;
      this.reviews.forEach(
        (review) => {
          if (review.rating === 1) {
            count++;
          }
        }
      );
      return count;
    },

    numberOfTwoStarReviews() {
let count = 0;
      this.reviews.forEach(
        (review) => {
          if (review.rating === 2) {
            count++;
          }
        }
      );
      return count;
    },
    numberOfThreeStarReviews() {

     let count = 0;
      this.reviews.forEach(
        (review) => {
          if (review.rating === 3) {
            count++;
          }
        }
      );
      return count;
    },
    numberOfFourStarReviews() {

      let count = 0;
      this.reviews.forEach(
        (review) => {
          if (review.rating === 4) {
            count++;
          }
        }
      );
      return count;
    },
    numberOfFiveStarReviews() {

      let count = 0;
      this.reviews.forEach(
        (review) => {
          if (review.rating === 5) {
            count++;
          }
        }
      );
      return count;
    }
  }
};
</script>

<style scoped>
/** Beginning of CSS Section */
div.main {
  margin: 1rem 0;
}

div.main div.well-display {
  display: flex;
  justify-content: space-around;
}

div.main div.well-display div.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
}

div.main div.well-display div.well span.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

div.main div.review {
  border: 1px black solid;
  border-radius: 6px;
  padding: 1rem;
  margin: 10px;
}

div.main div.review.favorited {
  background-color: lightyellow;
}

div.main div.review div.rating {
  height: 2rem;
  display: inline-block;
  vertical-align: top;
  margin: 0 0.5rem;
}

div.main div.review div.rating img {
  height: 100%;
}

div.main div.review p {
  margin: 20px;
}

div.main div.review h3 {
  display: inline-block;
}

div.main div.review h4 {
  font-size: 1rem;
}
</style>

