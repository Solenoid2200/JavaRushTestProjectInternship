package net.krasivoe.solenoid.dao;

import net.krasivoe.solenoid.model.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {

}
