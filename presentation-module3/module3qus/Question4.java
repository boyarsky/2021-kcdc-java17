package module3qus;

public class Question4 {

    public final record BBQ(String type) {
     //   { type = ""; }
        public BBQ/*(String type) */{
            type = type.toUpperCase();
        }
   //     public void type() { return ""; }
        public String toString() { return ""; }
    }

}
