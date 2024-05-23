def find_maximum(numbers):
	maximum = numbers[0]
	for num in numbers:	
		if num > minimum:
            		minimum = num
	return minimum

numbers = [8, 4, 9, 2, 5, 7, 3]

print(find_minimum(numbers))