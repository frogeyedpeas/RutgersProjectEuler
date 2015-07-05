x = 20

while 1:
	if all(not x % y for y in range(10, 20)):
		print(x)
		break

	x += 20