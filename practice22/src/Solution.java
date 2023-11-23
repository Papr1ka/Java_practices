import java.util.EmptyStackException;
import java.util.Stack;

public class Solution {

    public double calculate(String expression)
    {
        try {
            return this.calc(expression);
        }
        catch (NumberFormatException | EmptyStackException e)
        {
            System.out.print("Выражение некорректно ");
            return -1;
        }
        catch (Exception e)
        {
            System.out.print("Произошла ошибка ");
            return -2;
        }
    }

    private double calc(String expression)
    {
        Stack<Double> stack = new Stack<Double>();
        StringBuilder number = new StringBuilder();
        for (char token: expression.toCharArray()) {
            if (token == ' ')
            {
                if (!number.isEmpty())
                {
                    stack.push(Double.parseDouble(number.toString()));
                    number = new StringBuilder();
                }
            }
            else if (token == '*' || token == '/' || token == '+' || token == '-')
            {
                if (!number.isEmpty())
                {
                    stack.push(Double.parseDouble(number.toString()));
                    number = new StringBuilder();
                }
                double elem2 = stack.pop();
                double elem1 = stack.pop();
                double result;
                switch (token)
                {
                    case '*':
                        result = elem1 * elem2;
                        break;
                    case '/':
                        result = elem1 / elem2;
                        break;
                    case '+':
                        result = elem1 + elem2;
                        break;
                    case '-':
                        result = elem1 - elem2;
                        break;
                    default:
                        result = 1;
                        break;
                }
                stack.push(result);
            }
            else
            {
                number.append(token);
            }
        }
        return stack.pop();
    }
}
