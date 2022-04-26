var container = [];
var count = 1;

function fizzbuzz(){
	if (count%5 === 0 && count%3 === 0){
		container.push("fizzbuzz");
		count++;
	}
	else if (count%3 === 0){
		container.push("fizz");
		count++;
	}

	else if (count%5 === 0){
		container.push("buzz");
		count++;
	}
	else {
		container.push(count);
		count++;
	}
	
	console.log(container);
}