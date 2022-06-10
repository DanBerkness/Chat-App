window.onload = function() {
	"use strict"
	let userName = null

	document.querySelector('#user')
		.addEventListener('click', getUserOnButtonPress)

	function getUserOnButtonPress() {
		fetch('/api/send-message')
			.then(resp => resp.json())
			.then(json => console.log(json))
			.catch(err => console.log('Request failed', err))
		let typedName = document.querySelector('#box')
		userName = typedName.value
	
		typedUpdate()
		displayMessage()
		// ^^^^ userName is holding the value of whaetver is typed in the text box.
	}
	//VVV this is fatching chat info held in the back end.

	setInterval(typedUpdate, 10000)
	
	
	function typedUpdate() {



		let user = {
			"userName": userName,
			"message": "default", 
			"channels": null,
		}
		fetch('/api/send-message', {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json; charset=utf-8'
			},
			body: JSON.stringify(user)
		})
	}
	function displayMessage() {
		const messageDisplay = document.getElementById('#names')
		console.log(messageDisplay)
		messageDisplay.innerHTML = userName
	}

} 