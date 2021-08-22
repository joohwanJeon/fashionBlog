<template>
    <div class="board-list">
        <div class="item" v-for="item in boards" v-bind:key="item.id">{{item.title}}</div>
    </div>
</template>

<script>
import * as boardService from './BoardService'

export default {
  name: 'Contents',
  data() {
    return {
      boards : []
    }
  },
  async created() {
     this.boards = await boardService.getBoards();
  }
}

</script>

<style>
.board-list {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
  column-gap: 20px;
  row-gap: 10px;
}

.board-list .item {
  background-color: red;
}
</style>
