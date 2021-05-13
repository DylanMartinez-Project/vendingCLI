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
    }
  },
  computed: {
    numberOfReviews() {

        // Extract data from the store and summarize the number of reviews
        return 0;
    }
  }
};
</script>

