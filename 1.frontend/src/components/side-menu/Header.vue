<template>
  <div id ="page">
        <div class = "container">
            <header id="head" class="site-head">
                <div class="site-branding">
                    <h1 class="site-title">
                        <a href="index.html" rel="home">
                            <img class="main-logo" src="../../assets/hizini.png">
                        </a>
                    </h1>
                </div>
                <div id="topArea" class="top-area">
                    <div id="login-area" class="site-login">
                        <a href="join.html">join </a>                      
                        <a href="login.html">login </a>                        
                        <a href="mypage.html">mypage</a> 
                    </div>
                    <div id="search-area" class="site-search">
                        <input type="text" placeholder="검색">
                        <button>Search</button>
                        <div id="post-area" class="site-post">
                            <router-link to="/createPost">post</router-link>
                        </div>
                    </div>
                </div>   
                <nav id="site-navigation" class="main-navigation">
                    <div class="menu-area">
                        <ul class="menu-category">
                            <li class="menu-list">
                                <router-link to="/menu1">menu1</router-link>
                            </li>
                            <li class="menu-list">
                                <router-link to="/menu2">menu2</router-link>
                            </li>
                            <li class="menu-list">
                                <router-link to="/menu3">menu3</router-link>
                            </li>
                            <li class="menu-list">
                                <router-link to="/menu4">menu4</router-link>
                            </li>
                        </ul>    
                    </div>
                </nav>                    
                <div id="content" class="site-content">
                        <router-view>
                        </router-view>
                </div>
            </header>
        </div>
    </div>
</template>

<script>
export default {
  name: 'Header',
  // props: {
  //   msg: String
  // }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
html {
	border:12px solid black;
}
.site-title {
	text-align: center;
}
.site-head {
	padding-top:2em;
	padding-bottom:1em;
	background-color: black;
}
.site-head a {
	color: #fff;
}
.main-navigation {
	background-color: black;
	font-size:14px;
	font-weight:700;
	letter-spacing:1px;
	padding:15px 0;
	border-top:1px solid;
	border-bottom:1px solid;
	text-transform:uppercase;
	text-align: center;
}
.menu-area{
	clear: both;
	width: 100%;
	height: 50px;
	margin: 0px 0 0;
	background: #fff;
}
.menu-category{
	position: relative;
	width: 50%;
	height: 50px;
	text-align: center;
	margin: 0 auto;
}
.main-navigation a {
	color: black;
	text-align: center;
}
.main-navigation ul {
	list-style:none;
	margin:0 auto;
	padding:3px 0;
	text-align: center;
	line-height: 40px;
}
.main-navigation li {
	display:inline-block;
	margin:0 1em;
	position:relative;
}

.top-area{
    width: 100%;
    margin: 0px auto 0;
    padding: 0px 0;
    text-align: right;
}
.site-login{
    margin-right: 21px;
}
.site-post{
    border: 2px solid #fff;
    float: left;
    text-align: center;
    width: 100px;
    text-transform:uppercase;
    font-size: 20px;
    font-weight: bolder;
    letter-spacing:2px;
    margin-bottom: auto;
    margin-left: 5px;
}
.site-search{
    padding: 10px;
}
.site-login a{
    text-decoration: none;
    color: #fff;
    text-transform:uppercase;
    letter-spacing:3px;
}
::placeholder{
    text-align: center;
}
button{
    border: 2px solid #fff;
    background-color: black;
    color: #fff;
    font-weight: 750;
}
</style>
