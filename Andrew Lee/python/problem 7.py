p = 1
c = 3

while p != 10001:
	if all(not c % x == 0 for x in range(3, int(c ** 0.5) + 1)):
		p += 1

	if p != 10001:
		c += 2

print(c)