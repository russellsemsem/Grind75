class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0){
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        for(char curr: s.toCharArray()){
            if(curr == '('){
                stack.push(')');
            }
            else if (curr == '{'){
                stack.push('}');
            }
            else if (curr == '['){
                stack.push(']');
            }
            else if(stack.empty() || stack.pop() != curr){
                return false;
            }
        }
        return stack.empty();       
    }
}
//         if (s.length() % 2 != 0){
//             return false;
//         }
        
//         String[] strArray = s.split("");
//         Stack<String> stack = new Stack<>();
        
//         ArrayList<String> open = new ArrayList<>();
//         open.add("(");
//         open.add("[");
//         open.add("{");
        
//         HashMap<String, String> bracket = new HashMap<String, String>();
//         bracket.put("(", ")");
//         bracket.put("[", "]");
//         bracket.put("{", "}");
        
//         for (int i = 0; i < strArray.length; i++){
//             String curr = strArray[i];
            
//             if(stack.empty() && open.contains(curr)){
//                 stack.push(curr);
//             }
//             else if(!stack.empty() && bracket.get(stack.peek()).equals(curr)){
//                 stack.pop();
//             }
//             else if(open.contains(curr)){
//                 stack.push(curr);
//             }
//             else {
//                 return false;
//             }
//         }
        
//         return stack.empty();
        