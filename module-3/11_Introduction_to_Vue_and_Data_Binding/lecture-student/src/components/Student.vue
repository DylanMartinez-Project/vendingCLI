<template>
<<<<<<< HEAD
  <div>
      <p>My name is:{{name}} </p>
      <ul>
          <li v-for='skill in stack' v-bind:key='skill' class='li-items'>{{skill}}</li>

      </ul>
  </div>
=======
    <div>
        <p>My name is: {{name}}. </p>
        <ul>
            <li v-for='skill in stack' v-bind:key='skill' class='li-items'>{{skill}}</li>
        </ul>
    </div>
>>>>>>> d40a47c30bb3bf19a79b34349bb9f4299e4673a1
</template>

<script>
export default {
    name: 'Student',
<<<<<<< HEAD
    data(){
        return{
            name: 'DYLAN',
            stack: ['pzza','piizaaa', 'piizzzaaa' , 'pizzzaaaa']
=======
    data() {
        return {
            name: 'Andy',
            stack: ['Java', 'SQL', 'CSS', 'HTML', 'JS', 'VUE']
>>>>>>> d40a47c30bb3bf19a79b34349bb9f4299e4673a1
        }
    }

}
</script>

<<<<<<< HEAD
<style>
.li-items{
    text-align: left;
}
=======
<style scoped>
    .li-items {
        text-align: left;
    }
>>>>>>> d40a47c30bb3bf19a79b34349bb9f4299e4673a1
</style>