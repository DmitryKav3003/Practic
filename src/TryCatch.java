import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class TryCatch {
    void go(){
        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("11111");     //либо без try/catch, а с помощь. throws после объявления метода
        }
        catch (MidiUnavailableException ex){
            System.out.println(123);
            ex.printStackTrace();          //какая-то трассировка
            //Если не получается справиться с исключением, то...
            //Трассировка помогает програмисту понять в каком методе была совершена ошибка
            //указывает в консоли вывода номер строки, положение ошибки


        }
        finally {
            System.out.println("в любом случае выполняется");   //выплняется независимо от try/catch
        }
    }
    public static void main(String[] args) {
        TryCatch tr = new TryCatch();
        tr.go();
    }
}
//////////////////////////// Если не хотите обрабатывать исключение, то просто пробросить его
//                           с помощью throws, кому то все равно потом придется его обрабатывать
class Test2{
    void foo()throws Exception{
        System.out.println("без try/catch");
    }
    public static void main(String[] args) throws Exception{
        Test2 t2 = new Test2();
        t2.foo();
    }
}
/////////////////////////////
class Laundary{
    void huk() throws Exception, RuntimeException{ //может быть несколько исключений
        System.out.println("Начало");
        try {
            System.out.println("без исключения");
        }
        catch (Exception a1){
            System.out.println("исключение");
        }
    }

    public static void main(String[] args) throws Exception{
        Laundary la = new Laundary();
        la.huk();
    }
}

// ReeShirtException
// LingerieException
// ClothingException
// Exception           //Родительский класс для всех исключений
                       //чем нижк, тем исключение шире, иначе не скомпилируется
