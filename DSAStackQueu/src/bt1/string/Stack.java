package bt1.string;

class Stack {

    int size;
    int top;
    char[] a;

    boolean isEmpty() {
        return (top < 0);
    }

    Stack(int n) {
        top = -1;
        size = n;
        a = new char[size];
    }

    boolean push(char x) {
        if (top >= size) {
            System.out.println("stack overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    char pop() {
        if(top < 0) {
            System.out.println("stack underflow");
            return 0;
        }
        else {
            char x = a[top--];
            return x;
        }
    }

}
