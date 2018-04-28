package musicLang;

import javax.sound.midi.MidiUnavailableException;

public class Sample2 {
	
	
	public static void main(String args[]) throws MidiUnavailableException {
		Note a = new Note(Pitch.A, Duration.w);
		Note b = new Note(Pitch.C, Duration.q);
		
		MusicTrack track1 = new MusicTrack();
		track1.addNote(a);
		track1.addNote(b);
		
		track1.setInstrument(MusicInstrument.PIANO);
		
		track1.play();
		
		track1.setInstrument(MusicInstrument.FLUTE);
		
		track1.play();
	}
}
