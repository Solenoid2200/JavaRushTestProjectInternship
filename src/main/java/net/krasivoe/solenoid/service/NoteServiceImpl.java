package net.krasivoe.solenoid.service;

import com.google.common.collect.Lists;
import net.krasivoe.solenoid.model.Note;
import net.krasivoe.solenoid.dao.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("noteService")
@Repository
@Transactional
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;


    @Override
    @Transactional(readOnly=true)
    public List<Note> findAll() {
        List<Note> result = Lists.newArrayList(noteRepository.findAll());
        return result;
    }


    @Override
    @Transactional(readOnly=true)
    public Note findById(Long id) {
        return noteRepository.findOne(id);
    }


    @Override
    public Note save(Note note) {
        return noteRepository.save(note);
    }


    @Override
    public void delete(Note note) {
        noteRepository.delete(note);
    }

}
