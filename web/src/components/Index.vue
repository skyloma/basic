<template>
	<div class="index">
		<h1>{{ msg }}</h1>
	</div>
</template>

<script>
	export default {
	    name: 'index',
		data () {
			return {
				msg: 'Welcome to Your Vue.js App'
			}
		},
		created() {
	        var _this = this;

			_this.$http.get('/api/hello').then(function(data){
				_this.$Notice.info({
					title: data.body.message
				});
			}, function(response){
				console.error(response);
			});
		}
	}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
	h1 {
		font-weight: normal;
	}
</style>
