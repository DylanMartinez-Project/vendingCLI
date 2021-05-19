<template>
  <div class="products">
    <h1>Products</h1>
    <ProductsList/>

  </div>
</template>

<script>
// include the ProductsList component

import ProductsList from '../components/ProductsList.vue'

export default {
  components: {
ProductsList
  }
};
</script>
