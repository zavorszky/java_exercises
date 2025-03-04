/*
 * Szabadon felhasználható
 */
package java_exercise_26;

/**
 *
 * @author dady
 */
public class EStack implements Cloneable {

    public static int MAX_NUMBER_OF_STACK = 10;

    public String stack_name;
    private Object[] items;
    private int top;

    public EStack(String p_stack_name) {
        this.stack_name = p_stack_name;
        this.items = new Object[MAX_NUMBER_OF_STACK];
        this.top = -1;
    }

    protected EStack clone(String p_stack_name) {
        try {
            EStack s = (EStack) super.clone(); // clone the stack
            s.stack_name = p_stack_name;
            s.items = items.clone(); // clone the stack array
            return s;
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }

    public int getTop() {
        return this.top;
    }

    public void push(Object o) {
        this.top++;
        this.items[this.top] = o;
    }

    public Object pop() {
        if (this.top >= 0) {
            Object o = this.items[this.top];
            this.top--;
            this.items[this.top] = null;
            return o;
        }
        return null;
    }

    public void showStack() {
        System.out.println("Stack name:\"" + this.stack_name + "\"");
        System.out.println("Stack items:");
        for (int i = 0; i <= this.top; i++) {
            System.out.println("\t" + (i + 1) + ". " + this.items[i].toString());
        }
    }

}
