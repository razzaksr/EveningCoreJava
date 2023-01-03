package org.corejava.dynamic;

/*
Stack: Last In First Out
    push
    pop
    peek
    search
    clear
 */

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        // leagacy
        Stack stk1=new Stack();
        stk1.push("Agilan");stk1.push("JSW");
        stk1.push(4);stk1.push(4500.6);
        stk1.push(true);

        System.out.println(stk1.peek());

        System.out.println(stk1);

        System.out.println(stk1.pop());

        System.out.println(stk1.peek());

        System.out.println(stk1.search(true));
        System.out.println(stk1.search("JSW"));

        stk1.clear();

        System.out.println(stk1.size());
    }
}
