lim = 1000000
table = [x + 1 for x in range(lim)]
total = 0

for n in range(1, lim):
    if table[n] == n + 1:
        for k in range(n, lim, n + 1):
            table[k] *= 1 - float(1) / (n + 1)

    total += table[n]

print str(int(total)) + ' fractions'