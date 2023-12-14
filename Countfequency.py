from collections import Counter
s = "tree"
ans = "".join(k*v for k,v in Counter(s).most_common())
print(ans)