import axios from 'axios';

const http = axios.create({
  baseURL: "https://www.boredapi.com/api"
});

export default {
  getActivity(numPeople){
    return http.get('activity?participants=' + numPeople)
  }



}