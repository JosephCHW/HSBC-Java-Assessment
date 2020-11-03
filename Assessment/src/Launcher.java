import java.util.ArrayList;

public class Launcher {

	public static void main(String[] args) {
		
		NoteStore newNoteStore = new NoteStore();
		newNoteStore.storeNote("Java is a set of computer software and specifications developed by "
				+ "James Gosling at Sun Microsystems");
		newNoteStore.storeNote("Few books to read - Ikigai, How to win friends and influence people");
		newNoteStore.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset.jpg");
		newNoteStore.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset.jpg");
		
		displayTextNotes(newNoteStore);
		displayTextAndImageNotes(newNoteStore);
	}
	
	public static void displayTextNotes(NoteStore newNoteStore) {
		// create array list of only text notes
		ArrayList<TextNote> textNoteStore = newNoteStore.getAllTextNotes();
		for (int i = 0; i < textNoteStore.size(); i++) {
			System.out.println("Text Note " + (i+1) +": " + textNoteStore.get(i).getText());
		}
	}
	
	public static void displayTextAndImageNotes(NoteStore newNoteStore) {
		// create array list of only text and image notes
		ArrayList<TextAndImageNote> textAndImageNoteStore = newNoteStore.getAllTextAndImageNotes();
		for (int i = 0; i < textAndImageNoteStore.size(); i++) {
			System.out.println("Text and Image Note " + (i+1) +": " 
			+ textAndImageNoteStore.get(i).getText() + ", "
			+ textAndImageNoteStore.get(i).getImageURL());
		}
	}

}
