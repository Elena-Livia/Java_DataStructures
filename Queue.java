public class Queue {
 int[] array = new int[3];
 int counter = 0;

    public void push(int pushedElement){
     array[counter] = pushedElement;
     counter++;
    }
    public void pop(){
     for (int i = 0;i < 2;i++){
      array[i] = array[i+1];
     }
     array[counter-1] = 0;
     counter--;
    }
    public void display(){
     for(int j = 0;j < counter;j++){
      System.out.println(array[j]);
     }
    }

}