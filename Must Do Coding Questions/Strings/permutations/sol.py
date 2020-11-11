from itertools import permutations

x = int(input())
for i in range(x):
    print(*[''.join(e) for e in permutations(sorted(input()))])
