class Bird {
        public void fly() {
            System.out.println("Bird fly");
        }
    }

    public class Ost extends Bird {
        public void fly(){
            super.fly();
            System.out.println("Ost fly");
        }
        public static void main(String[] args) {
            Ost o = new Ost();
            o.fly();
            Bird b = new Bird();
            b.fly();
        }
    }



