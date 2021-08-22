import home from './components/home/Home.vue'
import createPost from './components/board/BoardCreate.vue'
import menu1 from './components/main-menu/Menu1.vue'
import menu2 from './components/main-menu/Menu2.vue'
import menu3 from './components/main-menu/Menu3.vue'
import menu4 from './components/main-menu/Menu4.vue'

export default [
    { path: '/', component: home},
    { path: '/createPost', component: createPost},
    { path: '/menu1', component: menu1 },
    { path: '/menu2', component: menu2 },
    { path: '/menu3', component: menu3 },
    { path: '/menu4', component: menu4 }
]