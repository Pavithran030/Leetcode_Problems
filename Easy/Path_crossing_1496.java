class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> point=new HashSet<>();
        point.add("0,0");
        int x=0;
        int y=0;
        for(char c:path.toCharArray()){
            if(c=='N') x++;
            else if(c=='S') x--;
            else if (c=='E') y++;
            else y--;
            if(point.contains(x+","+y)) return true;
            point.add(x+","+y);
        }
        return false;
        
    }
}
