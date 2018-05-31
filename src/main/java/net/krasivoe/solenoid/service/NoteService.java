package net.krasivoe.solenoid.service;

import net.krasivoe.solenoid.model.Note;
import java.util.List;

public interface NoteService {

    List<Note> findAll();
    Note findById(Long id);
    Note save(Note note);
    void delete(Note note);

}
