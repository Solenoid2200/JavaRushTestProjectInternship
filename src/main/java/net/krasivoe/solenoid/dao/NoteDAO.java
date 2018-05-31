package net.krasivoe.solenoid.dao;


import net.krasivoe.solenoid.model.Note;
import net.krasivoe.solenoid.model.NoteForm;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class NoteDAO {

    private static final Map<Long, Note> noteMap = new HashMap<Long, Note>();


    public Long getMaxNoteId() {
        Set<Long> keys = noteMap.keySet();
        Long max = 0L;
        for (Long key : keys) {
            if (key > max) {
                max = key;
            }
        }
        return max;
    }


    public Note getNote(Long noteid) {
        return noteMap.get(noteid);
    }


    public Note addNote(NoteForm noteForm) {
        Long noteid= this.getMaxNoteId() + 1;
        noteForm.setNoteid(noteid);
        Note newNote = new Note(noteForm);

        noteMap.put(newNote.getNoteid(), newNote);
        return newNote;
    }


    public Note updateNote(NoteForm noteForm) {

        Note note = this.getNote(noteForm.getNoteid());

        if(note != null)  {
            note.setNoteid(noteForm.getNoteid());
            note.setNotenote(noteForm.getNotenote());
            note.setNotedone(noteForm.getNotedone());
            note.setNotedate(noteForm.getNotedate());
        }
        return note;
    }


    public void deleteNote(Long noteid) {
        noteMap.remove(noteid);
    }


    public List<Note> getAllNotes() {
        Collection<Note> c = noteMap.values();
        List<Note> list = new ArrayList<Note>();
        list.addAll(c);
        return list;
    }

}
