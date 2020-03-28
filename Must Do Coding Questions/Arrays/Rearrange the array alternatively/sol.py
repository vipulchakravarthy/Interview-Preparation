
for _ in range(int(input())):
    size  = int(input())
    lis = list(input().strip().split(" "))
    for i in range(size):
        lis[i] = int(lis[i])
    lis.sort()
    l = 0
    r = size-1
    st = ""
    while l < r:
        st += str(lis[r]) +" " + str(lis[l]) +" "
        l += 1
        r -= 1
    if(size%2 != 0):
        st += str(lis[l])
    print(st)