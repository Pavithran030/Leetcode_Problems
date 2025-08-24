class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);;

        int g1=0,s1=0;
        int cookies=0;

        while((g1<g.length) && (s1<s.length)){
            if(s[s1]>=g[g1]){
                cookies++;
                g1++;
            }
            s1++;
        }
        return cookies;
    }
}
