<template>
  <table>
    <thead>
      <tr>
        <th>Title</th>
        <th>Reviewer</th>./
        <th>Review</th>
        <th>Rating</th>
        <th>Favorited</th>
      </tr>
    </thead>
    <tbody>
      <review-table-row
        v-for="review in filteredReviews"
        v-bind:key="review.title"
        v-bind:review="review"
      />
      <tr v-show="filteredReviews.length == 0">
        <td colspan="5">There are no reviews</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
import ReviewTableRow from "./ReviewTableRow";

export default {
  name: "review-table",
  components: {
    ReviewTableRow
  },
  computed: {
    filteredReviews() {
      // retrieve and filter from state.

      if(this.$store.state.filter===0){

        return this.$store.state.reviews;
    }
      let resultsArr = this.$store.state.reviews.filter(
        (review) => {
          return review.rating === this.$store.state.filter;
        }

      );
      return resultsArr;
    }
  }
};
</script>

<style style="scoped">
th,
td {
  text-align: left;
}
td {
  padding-right: 10px;
  vertical-align: top;
}
tr:nth-child(even) {
  background-color: rgb(238, 238, 238);
}
</style>
