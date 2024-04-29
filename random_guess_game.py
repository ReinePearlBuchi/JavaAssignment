import random

number = random.randrange(1, 10)

number_entered = int(input("Enter a Lucky Number from 0 to 10 : "))


while number_entered != number:

	number_entered = int(input("Enter a Lucky Number from 0 to 10 : "))

	if number_entered == random.randrange:	
		print("Congratulation! you have won")

		break

	else:
		print("failed, try again")
	
