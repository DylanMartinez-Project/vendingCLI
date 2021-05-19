<template>
  <div class="book-container">
    <book-card v-for="books in $store.state.books" v-bind:books="books" v-bind:key="books.id"/>


  </div>
</template>

<script>
import  BookCard  from './BookCard.vue';

export default {
    name: 'reading-list',
    components:{
      BookCard

    }
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>