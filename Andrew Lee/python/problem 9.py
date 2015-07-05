def sumTriples(s):
	for a in range(1, s):
		for b in range(a + 1, s - a):
			c = s - a - b

			if a ** 2 + b ** 2 == c ** 2:
				return [a, b, c]

t = sumTriples(1000)

print t
print reduce(lambda x, y: x * y, t)