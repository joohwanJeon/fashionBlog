import axios from 'axios'
import { ApiList } from '../constant/CommonCode'; '../constant/CommonCode'

axios.defaults.baseURL = ApiList.BaseUrl;

function toRequest(method, url, params) {
    const options = {method, url};

    if(method === 'get') {
        options.params = params;
    } else {
        options.data = params;
    }

    return axios(options)
        .then(response => successHandler(response.data))
        .catch(error => errorHandler(error));
}

function successHandler(response) {
    if(response.returnCode === 'OK') {
        return Promise.resolve(response.data);
    }
}

function errorHandler(error) {
    window.alert(error);
}

function toGet(url, params) {
    return toRequest('get', url, params);
}

function toPost(url, params) {
    return toRequest('post', url, params);
}


export {toGet, toPost}