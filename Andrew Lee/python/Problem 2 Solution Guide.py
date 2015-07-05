def fib(l):
	x, y = 1, 1

	while x < l:
		yield x
		x, y = x + y, x

print sum(x for x in fib(4000000) if not x % 2)

'''
2, 8, 34, 144
2, 5,  8,  11

If we print out the first 15 Fibonacci numbers we can see
that every even number is in increments of 3 starting from 2.

Every even number is at f(3n + 2) so f(2), f(5), f(8).

We can create a new function to represent only the even numbers.

The Fibonacci sequence is defined as:

f(n) = f(n - 2) + f(n - 1); f(1) = 1

If we expand the function over several cases:

f(n - 1) = f(n - 2) + f(n - 3)
f(n - 2) = f(n - 3) + f(n - 4)
f(n - 3) = f(n - 4) + f(n - 5)
f(n - 4) = f(n - 5) + f(n - 6)
f(n - 5) = f(n - 6) + f(n - 7)
f(n - 6) = f(n - 7) + f(n - 8)

We want to create a new function where each value only relies on even numbers.
Therefore every n must be offset by a multiple of 3 eg: f(n), f(n - 3), f(n - 6)...

f(n) = f(n - 2) + f(n - 1)
f(n) = f(n - 3) + f(n - 4) + f(n - 2) + f(n - 3)
f(n) = 2f(n - 3) + f(n - 4) + f(n - 2)
f(n) = 2f(n - 3) + f(n - 3) + f(n - 4) + f(n - 4)
f(n) = 3f(n - 3) + f(n - 4) + f(n - 4)
f(n) = 3f(n - 3) + f(n - 4) + f(n - 5) + f(n - 6)
f(n) = 4f(n - 3) + f(n - 6)

Using f(n) = 4f(n - 3) + f(n - 6) as our new sequence we arrive at:

2, 8, 34, 144...

We can then transform our sequence into f(n) = 4f(n - 1) + f(n - 2).

In pseudocode:

Let x = 2 # the current number
Let y = 0 # the previous number
Let total = 0

while x < limit:
	total += x

	# Move to the next number.
	# x is now f(n - 1)
	# y is now f(n - 2)
	y = x
	x = 4 * x + y

output total
'''

def fibEven(l):
	x, y = 2, 0

	while x < l:
		yield x
		x, y = 4 * x + y, x

print sum(x for x in fibEven(4000000))