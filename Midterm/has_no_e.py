def has_no_e(search):
	i = 0
	while (i < len(search)):
		if (search[i] != 'e'):
			return "True"
		else:
			return "False"
		i += 1


has_no_e("Test")

reader = open('gadsby_stripped.txt', 'r')
lines = reader.readlines()
for line in lines:
	has_no_e(line)
reader.close()

