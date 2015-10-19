num = 2

while num <= 1000:
	is_Prime = True
	trial = 2
	while trial < num:
		if (num % trial) == 0:
			is_Prime = False
		trial += 1

	if is_Prime:
		print(num)
	num += 1	
	