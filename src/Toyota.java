public class Toyota{
    int x = 1;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void go(){
        System.out.println("poehali");
    }

    void stop(){
        System.out.println("tormozi");
    }



    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.go();
        toyota.stop();
    }


}