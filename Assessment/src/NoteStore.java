import java.util.ArrayList;

public class NoteStore {

	ArrayList<TextNote> TextNoteStore = new ArrayList<TextNote>();
	ArrayList<TextAndImageNote> TextAndImageNoteStore = new ArrayList<TextAndImageNote>();
	
	public void storeNote(String text) {
		TextNote newTextNote = new TextNote();
		newTextNote.setText(text);
		TextNoteStore.add(newTextNote);
	}
	
	public void storeNote(String text, String url) {
		TextAndImageNote newTextAndImageNote = new TextAndImageNote();
		newTextAndImageNote.setText(text);
		newTextAndImageNote.setImageURL(url);
		TextAndImageNoteStore.add(newTextAndImageNote);
	}
	
	public ArrayList<TextNote> getAllTextNotes() {
		return TextNoteStore;
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return TextAndImageNoteStore;
	}
	
}
