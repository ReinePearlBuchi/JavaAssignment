
student_score = int(input("Enter Student score: "))


for student_score in range(student_score, 15):
	if student_score % 15 == 0:
		print(type(student_score))
		print(student_score % 5)