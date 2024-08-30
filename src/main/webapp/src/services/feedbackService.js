import axios from 'axios';

const API_URL = 'http://localhost:8080/api/feedback';

const fetchAllSellers = async () => {
    console.log("Response ---");
  const response = await axios.get(API_URL);
  console.log(response);
  return response.data;
};

export default {
  fetchAllSellers
};
