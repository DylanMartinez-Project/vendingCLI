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
        // Call the mutator
        this.$store.commit("UPDATE_FILTER", parseInt(this.rating));
        console.log(this.$store.state.filter)
    }
  },
  computed: {
    numberOfReviews() {


        const reviews = this.$store.state.reviews;
        let total = 0;
        reviews.forEach(
            (review) => {
              if(review.rating=== parseInt( this.rating)){
                total++;
              }
             
            }


        );


        // Extract data from the store and summarize the number of reviews
         return total;
    }
  }
};
</script>

