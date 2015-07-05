number = 600851475143
factors = []

for x in range(2, int(number ** 0.5) + 1):
	while not number % x:
		number /= x
		factors.append(x)

factors.append(number)

print max(factors)