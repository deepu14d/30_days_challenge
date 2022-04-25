function bmiCalculate(weight, height){
	var bmi = weight/(height*height); // weight/Math.pow(height, 2)
	return Math.round(bmi);
}

var result = bmiCalculate(65, 1.65);
console.log(result);