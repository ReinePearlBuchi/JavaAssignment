const prompt = require("prompt_sync")();
let day = prompt("what day is today?")
switch(day){
	case "monday":
		console.log("Today is monday");
		break;
	case "tuesday":
		console.log("Today is tuesday");
		break;
	case "wednesday":
		console.log("Today is wednesday");
		break;
	case "thursday":
		console.log("Today is thursday");
		break;
	case "friday":
		console.log("Today is friday");
		break;
	deafult:
		console.log("Any other day")
		