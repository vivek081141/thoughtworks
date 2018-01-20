package com.thoughtworks.recruitme.expressionValidator;

import com.thoughtworks.recruitme.services.MethodNotImplementedException;

import java.util.Stack;

public class ExpressionValidatorImpl implements ExpressionValidator {
    public boolean isBalancedExpression(String expression) throws MethodNotImplementedException {
        Stack<Character> stack = new Stack<Character>();

        char[] chars = expression.toCharArray();

        for(char c:chars){
            stack.push(c);
        }

        throw new MethodNotImplementedException("isBalancedExpression");
    }

   /* public boolean check(String exp,Integer size,Stack<Character> stack)
    {
        System.out.println("Please enter your expression.");
      //  String exp = new String[newExp];
        for (int i = 0; i < size; i++)
        {


            char ch = exp.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(i);
            else if (ch == ')'|| ch == ']' || ch == '}')
            {
                //nothing to match with
                if(stack.isEmpty())
                {
                    return false;
                }
                else if(stack.pop() != ch)
                {
                    return false;
                }

            }
        }
        if (stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }*/

}
