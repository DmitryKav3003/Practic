import javax.sound.midi.*;

public class Music {
    public static void main(String[] args) {
        Music mus = new Music();
        mus.play();
    }
    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();   //получаем синтезатор и открываем его
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ,4);     //создаем новую последовательность

            Track track = seq.createTrack();                     //получаем новый трек из последовательности

            ShortMessage a = new ShortMessage();                   //заполняем трек MIDI-событиями
            a.setMessage(144,1,44,100);//и передаем последовательность //что делать
            MidiEvent noteOn = new MidiEvent(a,1);            //в синтезатор                  //когда делать
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b,16);
            track.add(noteOff);

            player.setSequence(seq);   //передаем последовательность синтезатору, как будто вставляем CD диск

            player.start();                              //запускаем синтезатор

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}


