public class Stack {
    public int[] array = new int[3];
    public int counter = 0;

    public void push(int pushedElement){
        array[counter] = pushedElement;
        counter++;
    }
    public void pop() {
        if(counter > 0){
            counter--;
            System.out.println(arr[counter]);
        }
        else {
            System.out.println("Underflow condition");
    }
    }

}