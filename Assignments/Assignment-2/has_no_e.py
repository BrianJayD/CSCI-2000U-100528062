#Brian Jay Domingo 100528062

def has_no_e(search):
	for i in search:
		pass
		if (i == 'e'):
			print "true"
			return
	print "false"
		
def main():
	file = open('gadsby.txt', "r") 
	for line in file:
		has_no_e(line);
	file.close() 
		
main()