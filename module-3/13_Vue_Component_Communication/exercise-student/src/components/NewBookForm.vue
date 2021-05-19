<template>


<div>
<form v-on:submit.prevent="addNewBook" class= "new-book-form">    
<div class="title-input">
        <label for="Title">Title</label>
        <input type="text" name="Title" v-model="newBook.title" />
      </div>

      <div class="author-input">
        <label for="Author">Author</label>
        <input type="text" name="Author" v-model="newBook.author" />
      </div>

        <div class="isbn-input">
        <label for="ISBN">ISBN</label>
        <input type="text" name="ISBN" v-model="newBook.isbn" />
      </div>
<button type="submit" value="Save">Save Book</button>




</form>

</div>
  
</template>

<script>
export default {
data() {
    return {
      newBook: {},
    };
  },
  methods: {
    addNewBook() {
      this.$store.commit("ADD", this.newBook);
    //   this.resetForm();
    },




}}
</script>

<style>
.new-book-form{}
.title-input{}
.author-input{}
.isbn-input{}
</style>