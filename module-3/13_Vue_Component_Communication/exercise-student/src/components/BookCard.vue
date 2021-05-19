<template>
  <div class="card" v-bind:class="{'mark-read': books.read}" >


     <div>
          <h3 class="book-title">{{books.title}}</h3>
      </div>
    <img
      v-if="books.isbn"
      v-bind:src="
        'http://covers.openlibrary.org/b/isbn/' + books.isbn + '-M.jpg'
      "
    />
    <div>
      <p class="book-author">{{ books.author }}</p>
      </div>






      <button class= "mark-unread" v-if="books.read === false" v-on:click="readStatus(true)">Mark Read</button>
      <button class="mark-read" v-else v-on:click="readStatus(false)">Mark Unread</button>



  </div>
</template>

<script>
export default {
    name: 'book-card',
    props: {books:Object}, //props
  methods: {
    readStatus(status){
      this.$store.commit("READ_STATUS", {findBook: this.books, findStatus: status});
    }
  }
};
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.mark-unread {

}

.card.mark-read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>