num1 = 1
num2 = 2
sum = 2
while True:
	temp = num1 + num2
	if temp > 4000000:
		break
	if temp%2 == 0:
		sum += temp
	num1 = num2
	num2 = temp
print sum