import java.util.Hashtable;
import java.util.Stack;

public class LC20 {
    public boolean isValid(String s) {
        //CC
        if (s.length() % 2 != 0) return false;
        Stack <Character> myStack = new Stack<>();
        Hashtable myDict = new Hashtable();
        myDict.put('(', ')');
        myDict.put('[', ']');
        myDict.put('{', '}');



        for (int i = 0; i < s.length(); i++) {
            if (myDict.containsKey(s.charAt(i))){
                myStack.push((Character) myDict.get(s.charAt(i)));
            } else {
                if (myStack.isEmpty()) return false;
                char temp = myStack.pop();
                if (temp != s.charAt(i)) return false;
            }
        }
        return true;
    }
}
