def work(z):
	print sum(x for x in range(z) if not (x % 3 and x % 5))

for x in range(int(input())):
	work(input())