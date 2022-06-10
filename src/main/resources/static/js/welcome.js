window.onload = function() {
	"use strict"
 
if (typeof window === "undefined") {
	console.log("Oops, `window` is not defined")
} else {
	const selectedName = window.prompt("What's your name?", "Guest")
	sessionStorage.setItem('name', selectedName)

}

}