import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class FillingAndDraining {
    public static void main(String [] args){
        CharBuffer buffer = CharBuffer.allocate(10);
        ByteBuffer buffer1 = ByteBuffer.allocateDirect(10);
        System.out.println("position value before waiting = "+ buffer.position());
        System.out.println("limit value before writing = " + buffer.limit());
        System.out.println("capacity value before writing = " + buffer.capacity());

        buffer.put("H");
        buffer.put("E");
        buffer.put("L");
        buffer.put("L");
        buffer.put("O");


        System.out.println("position value before waiting = "+ buffer.position());
        System.out.println("limit value before writing = " + buffer.limit());
        System.out.println("capacity value before writing = " + buffer.capacity());


        buffer.flip();
        System.out.println("position value before flipping = "+ buffer.position());
        System.out.println("limit value before flipping = " + buffer.limit());
        System.out.println("capacity value before flipping = " + buffer.capacity());

        //Draining
        while (buffer.hasRemaining()){
            System.out.println("Draining element from buffer = " + buffer.get());
        }


        //Draining
//        System.out.println("Draining element from buffer = " + buffer.get());
//        System.out.println("Draining element from buffer = " + buffer.get());
//        System.out.println("Draining element from buffer = " + buffer.get());
//        System.out.println("Draining element from buffer = " + buffer.get());
//        System.out.println("Draining element from buffer = " + buffer.get());


        System.out.println(" \n");
        System.out.println("position value before draining = "+ buffer.position());
        System.out.println("limit value before draining = " + buffer.limit());
        System.out.println("capacity value before draining = " + buffer.capacity());


        buffer.rewind();
        System.out.println("Reread element from buffer = " + buffer.get());
        System.out.println("Reread element from buffer = " + buffer.get());
        System.out.println("Reread element from buffer = " + buffer.get());
        System.out.println("Reread element from buffer = " + buffer.get());
        System.out.println("Reread element from buffer = " + buffer.get());
    }
}
