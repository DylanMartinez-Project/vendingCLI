<template>
<div>
  <ReadingList/>
<router-link v-bind:to="{ name: 'addBook' }" >Add Book to Reading List</router-link>
</div>
</template>

<script>
import ReadingList from '../components/ReadingList.vue'

export default {
    components: {ReadingList}

}
</script>

<style>

</style>