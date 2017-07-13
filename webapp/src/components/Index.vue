<template>
	<div>
		<div class="index">
			<img class="logo" src="../assets/logo.png">
			<h1>{{ msg }}</h1>
		</div>
		<group>
			<cell title="Vux" value="Cool" is-link></cell>
		</group>
	</div>
</template>

<script>
	import { Group, Cell } from 'vux'

	export default {
		components: {
			Group,
			Cell
		},
		data () {
			return {
				// note: changing this line won't causes changes
				// with hot-reload because the reloaded component
				// preserves its current state and we are modifying
				// its initial state.
				msg: 'Welcome to Your Vue.js App'
			}
		}
	}
</script>

<style>
	h1 {
		font-size: 17px;
		font-weight: normal
	}
	.index {
		text-align: center;
	}
	.logo {
		width: 100px;
		height: 100px
	}
</style>
