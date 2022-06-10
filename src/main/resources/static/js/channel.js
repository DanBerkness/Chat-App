window.onload = function() {
	"use strict";
	var messagesEl = document.querySelector("#messages")
	console.log(messagesEl)
	var userName = sessionStorage.getItem('name')
	var messageEl = null
	let input
	var message
	const queryString = window.location.href;console.log(queryString)
	
	let channelId = queryString.substring(queryString.lastIndexOf("/") + 1, queryString.length);
	console.log(channelId)
	
	
	
	document.querySelector("#chatText").addEventListener('keypress', (e) => {
		 input = e.target
		if (e.key === 'Enter') {
			sendMessage()
			appendMessage()
			
			input.value = ''
		}
	});
	async function sendMessage() {
		console.log(userName, "Is the username")
		/////////////////////////////// Send, get, append
		console.log(messagesEl.value, "Is the message")
		 message = {
			'channelId': channelId,
			'messageContent': input.value,
			'userName': userName
		}
		var userString = JSON.stringify(message)
		///////////////////////////////
		console.log(userString)
		try {
			const response = await fetch('/api/send-message/', {
				method: 'POST',
				headers: {'Content-Type': 'application/json'},
				body: JSON.stringify(user)
			})
			///////////////////////////
					console.log(JSON.stringify(response.body));
		} catch (error) {
			console.log('There was an error in the fetch Line 24.')
		}
	}


	//	First

	function appendMessage(userName) {
		console.log("XXX",message.messageContent)
		 userName = sessionStorage.getItem('name')
		
		messageEl = document.createElement('p')
		messageEl.innerHTML = `<span style="font-weight: bold">${userName}:</span> ${message.messageContent}`
		messagesEl.appendChild(messageEl)
		
		///////////////////////////////
		console.log('the userName is ', userName, 'the individual msg is: ', messageEl, 'the messages are: ', messagesEl)

	}
	setInterval(sendMessage, 5000);

}



//setInterval(returnString, 1000)
