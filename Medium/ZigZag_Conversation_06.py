class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows==1:
            return s
        
        i=0
        d=1
        row=[[ ] for _ in range(numRows)]

        for st in s:
            row[i].append(st)
            if i==0:
                d=1
            elif i==numRows-1:
                d=-1
            i+=d
        em=''
        for i in range(numRows):
            em+=''.join(row[i])
        return em
        
