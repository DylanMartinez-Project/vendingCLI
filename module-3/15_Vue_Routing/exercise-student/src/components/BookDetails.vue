<template>
<div>
    <h2 class="book-title">{{ currentBook.title }}</h2>
    <img v-if="currentBook.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + currentBook.isbn + '-M.jpg'" />
    <h3 class="book-author">{{ currentBook.author }}

        <p> I READ THIS</p>
    </h3>
    
</div>
</template>

<script>
export default {

name: "book-details",
   data(){
return {
currentBook: {},

}

   },
    created () {
        const isbn = this.$route.params.isbn;
        for(let i = 0; i < this.$store.state.books.length ; i++){
            if(this.$store.state.books[i].isbn == isbn){
                this.currentBook = this.$store.state.books[i];
            }
            

        }
}
}
</script>

<style>

</style>