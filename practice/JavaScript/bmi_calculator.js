function bmiCalculate(weight, height){
	var bmi = weight/(height*height); // weight/Math.pow(height, 2)

	var result; 

	if (bmi < 18.5){
		result = "Your BMI is " + bmi + ", so you are underweight.";
	}
	else if ( bmi < 25 ){
		result = "Your BMI is " + bmi + ", so you have a normal weight.";
	}
	else{
		result = "Your BMI is " + bmi + ", so you are overweight.";
	}

	return result; 
}

bmiCalculate(65, 1.65);