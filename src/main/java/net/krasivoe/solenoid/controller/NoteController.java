package net.krasivoe.solenoid.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.krasivoe.solenoid.model.Note;
import net.krasivoe.solenoid.service.NoteService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/noteController")
public class NoteController {

    final Logger logger = LoggerFactory.getLogger(NoteController.class);

    @Autowired
    private NoteService noteService;

    @GetMapping(path = "")
    public @ResponseBody
    List<Note> getAllNote() {
        return noteService.findAll();
    }


    @GetMapping(path = "/{id}")
    public @ResponseBody
    Note findNoteById(@PathVariable Long id) {
        return noteService.findById(id);
    }


    @PostMapping(value = "")
    public @ResponseBody
    Note create(@RequestBody Note note) {
        logger.info("Creating note: " + note);
        note.setNotedate(new Date());
        noteService.save(note);
        logger.info("Note created successfully with info: " + note);
        return note;
    }


    @PutMapping(value = "/{id}")
    public @ResponseBody
    void update(@RequestBody Note note, @PathVariable Long id) {
        logger.info("Updating note: " + note);
        noteService.save(note);
        logger.info("Note update successfully with info: " + note);
    }


    @DeleteMapping(value = "/{id}")
    public @ResponseBody
    void delete(@PathVariable Long id) {
        logger.info("Deleting note with id: " + id);
        Note note = noteService.findById(id);
        noteService.delete(note);
        logger.info("note deleted successfully");
    }

    ////////////////////////////////////////////////

    @GetMapping(path = "/{choise}")
    public @ResponseBody
    List<Note> getAllNoteChoise() {
        List<Note> temp = noteService.findAll();
        List<Note> result = new ArrayList<Note>();
        for (int i = 0; i < temp.size() ; i++) {
            if(temp.get(i).getNotedone() == true) {
                result.add(temp.get(i));
            }
        }
        return result;
    }

}
