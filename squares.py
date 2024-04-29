def sum_of_squares(lst):
    total = 0
    for num in lst:
        total += num ** 2
    return total

sample_data = [2, 3, 4, 5, 7]
result = sum_of_squares(sample_data)
print(result)  # Output: 103