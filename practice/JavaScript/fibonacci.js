function fibonacciGenerator (n) {
	var container = [];
	var first = 0;
	var second = 1;
	if (n === 1) {
		container.push(first);
	}
	else if (n === 2) {
		container.push(first);
		container.push(second);
	}
	else if (n>2) {
		container.push(first);
		container.push(second);
		var i = 3;
		while (i <= n){
			var additional = first + second; 
			container.push(additional);
			first = second;
			second = additional; 

			i++;
		}
	}
	return container;
}

var a = fibonacciGenerator(3);
console.log(a)


// Alternative simple solution

// function fibonacciGenerator (n) {
    
//     var current = 0;
//     var next = 1;
//     var sequence = [0];
    
//     for (var i = 1; i < n; i++){
//         sequence.push(next);
//         const previous = sequence[sequence.length - 2];
//         next = previous + next;
//     }
//     return sequence;