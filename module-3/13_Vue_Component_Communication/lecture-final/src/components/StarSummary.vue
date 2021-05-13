<template>
  <div class="well">
    <span class="amount" v-on:click="updateFilter()">{{ numberOfReviews }}</span>
    {{ rating }} Star Review{{ numberOfReviews === 1 ? '' : 's' }}
  </div>
</template>

<script>
export default {
  name: "star-summary",
  props: ["rating"],
  methods: {
    updateFilter() {
      this.$store.commit("UPDATE_FILTER", parseInt(this.rating));
    }
  },
  computed: {
    numberOfReviews() {
        const reviews = this.$store.state.reviews;
        console.log(reviews)
        let total = 0;

        reviews.forEach(
          (review) => {
               // explain triple equal
              if (review.rating == this.rating) {
                total++;
              }
          }
        );
        console.log("debug");
        console.log(total);
        // Extract data from the store and summarize the number of reviews
        return total;
    }
  }
};
</script>

