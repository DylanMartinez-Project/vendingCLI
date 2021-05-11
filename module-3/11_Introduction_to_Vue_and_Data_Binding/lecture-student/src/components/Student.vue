<template>
  <div>
      <p>My name is:{{name}} </p>
      <ul>
          <li v-for='skill in stack' v-bind:key='skill' class='li-items'>{{skill}}</li>

      </ul>
  </div>
</template>

<script>
export default {
    name: 'Student',
    data(){
        return{
            name: 'DYLAN',
            stack: ['pzza','piizaaa', 'piizzzaaa' , 'pizzzaaaa']
        }
    }

}
</script>

<style>
.li-items{
    text-align: left;
}
</style>