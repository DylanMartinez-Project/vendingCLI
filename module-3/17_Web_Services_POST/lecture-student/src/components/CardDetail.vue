<template>
  <div>
    <div class="loading" v-if="isLoading">
      <img src="../assets/ping_pong_loader.gif" />
    </div>
    <div v-else>
      <h1>{{ card.title }}</h1>
      <p>{{ card.description }}</p>
      <router-link
        tag="button"
        :to="{ name: 'EditCard', params: {cardID: $route.params.cardID} }"
        class="btn editCard"
      >Edit Card</router-link>
      <button class="btn deleteCard" v-on:click="deleteCard">Delete Card</button>
      <div class="status-message error" v-show="errorMsg !== ''">{{errorMsg}}</div>
      <comments-list :comments="card.comments" />
    </div>

    <div class="board-actions" v-if="!isLoading">
      <router-link :to="{ name: 'Board', params: { id: $route.params.boardID } }">Back to Board</router-link>
    </div>
  </div>
</template>

<script>
import boardsService from "../services/BoardService";
import CommentsList from "@/components/CommentsList";

export default {
  name: "card-detail",
  components: {
    CommentsList
  },
  data() {
    return {
      isLoading: true,
      errorMsg: "",
    };
  },
  methods: {
    retrieveCard() {
      boardsService
        .getCard(this.$route.params.cardID)
        .then(response => {
          this.$store.commit("SET_CURRENT_CARD", response.data);
          this.isLoading = false;
        })
        .catch(error => {
          if (error.response && error.response.status === 404) {
            alert(
              "Card not available. This card may have been deleted or you have entered an invalid card ID."
            );
            this.$router.push("/");
          }
        });
    },
    deleteCard() {
        // 3. Call Service to delete card.
    },
  },
  created() {
    this.retrieveCard();
  },
  computed: {
    card() {
      return this.$store.state.card;
    }
  }
};
</script>

<style>
.btn.editCard {
  color: #fff;
  background-color: #508ca8;
  border-color: #508ca8;
  margin-bottom: 10px;
}
.btn.deleteCard {
  color: #fff;
  background-color: #ef031a;
  border-color: #ef031a;
  margin-bottom: 10px;
}
</style>
