ef remove_odd_index(string):
	new_string = ""
	i = 0
	while i < len(string):
		if(i % 2 == 1):
			i += 1

			continue

		new_string += string[i]
		i += 1
	return new_string
	
	print(newstring