var container = [];
var count = 1;


function fizzbuzz(){
		while (count <= 100){
			if (count%5 === 0 && count%3 === 0){
				container.push("fizzbuzz");
			}
			else if (count%3 === 0){
				container.push("fizz");
			}

			else if (count%5 === 0){
				container.push("buzz");
			}
			else {
				container.push(count);
			}
			count++;
			console.log(container);
		}
}