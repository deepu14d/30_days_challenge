//learning about functions in JS  

function timeLeft(currentAge) {
	var ageInDays = currentAge * 365;
	var ageInWeeks = currentAge * 52;
	var ageInMonths = currentAge * 12;
	var daysLeft = (365*90)-ageInDays; 
	var weeksLeft = (52*90)-ageInWeeks;
	var monthsLeft = (12*90)-ageInMonths;

	console.log("You have " + daysLeft + " days, " + weeksLeft + " weeks, and " + monthsLeft + " months left.");
}

timeLeft(20)