var male_name = prompt("What's male name?");
var female_name = prompt("What's female name?");

var loveScore = Math.random() * 100;
loveScore = Math.floor(loveScore) + 1;

if (loveScore > 70){
	alert("Your love score is " + loveScore + "%. You really do love each other.");
}
if (loveScore >30 && loveScore <70){
	alert("Your love score is " + loveScore + "%");
}
else {
	alert("Your love score is " + loveScore + "%. Seems love is less. ")
}