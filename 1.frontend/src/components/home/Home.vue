<template>
  <div>
    <Header />
    <BoardList />
    <Footer />
  </div>
</template>

<script>
import Header from '../side-menu/Header.vue'
import Footer from '../side-menu/Footer.vue'
import BoardList from '../board/BoardList.vue'

export default{
  components: {
    Header,
    BoardList,
    Footer
  }
}
</script>