package stackqueues;

public class DynamicCustomStack extends CustomStack{

    public DynamicCustomStack() {
        super();
    }

    public DynamicCustomStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
            // double array size
            int[] temp = new int[data.length*2];

            // copy all previous items
            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }

        // at this point we know that array is full
        return super.push(item);
    }
}
