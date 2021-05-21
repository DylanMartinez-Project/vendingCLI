import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  get(id) {
    return http.get(`/messages/${id}`);
  },

  createMessage(message){
    return http.post('/messages', message);

  },
  deleteMessage(messageID){
    return http.delete(`/messages/${messageID}`);
  },
  updateMessage(message){
    return http.put(`/messages/${message.id}`, message);
  }
  
}
