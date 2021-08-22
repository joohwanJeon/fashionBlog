import { ApiList, Pagenation } from '../../common/constant/CommonCode'
import * as apiService from '../../common/api/ApiService'

async function getBoards(params = {}) {
    params.count = Pagenation.count;
    return await apiService.toGet(ApiList.getPosts, params);
}


export {getBoards}