class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> mt = new Stack<>();
        for(String i : arr){
            if(i.equals("..") && !mt.empty()){
                mt.pop();
            } else if(!i.equals("") && !i.equals(".") && !i.equals("..")){
                mt.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String i : mt){
            sb.append("/");
            sb.append(i);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}