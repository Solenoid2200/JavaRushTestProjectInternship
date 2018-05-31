package net.krasivoe.solenoid.model;

import java.util.Date;

public class NoteForm {

    private Long noteid;
    private String notenote;
    private Boolean notedone;
    private Date notedate;


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