package net.krasivoe.solenoid.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long noteid;
    private String notenote;
    private Boolean notedone;
    private Date notedate;


    public Note() {
    }

    public Note(NoteForm noteForm) {
        this.noteid = noteForm.getNoteid();
        this.notenote = noteForm.getNotenote();
        this.notedone = noteForm.getNotedone();
        this.notedate = noteForm.getNotedate();
    }

    public Note(Long noteid, String notenote, Boolean notedone, Date notedate) {
        this.noteid = noteid;
        this.notenote = notenote;
        this.notedone = notedone;
        this.notedate = notedate;
    }


    public Long getNoteid() {
        return noteid;
    }

    public void setNoteid(Long noteid) {
        this.noteid = noteid;
    }

    public String getNotenote() {
        return notenote;
    }

    public void setNotenote(String notenote) {
        this.notenote = notenote;
    }

    public Boolean getNotedone() {
        return notedone;
    }

    public void setNotedone(Boolean notedone) {
        this.notedone = notedone;
    }

    public Date getNotedate() {
        return notedate;
    }

    public void setNotedate(Date notedate) {
        this.notedate = notedate;
    }

}
