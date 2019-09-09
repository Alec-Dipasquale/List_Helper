package com.example.listhelper.models;

public class Note {

    private String Title;
    private String content;
    private String timestamp;

    public Note(String title, String content, String timestamp) {
        Title = title;
        this.content = content;
        this.timestamp = timestamp;
    }

    public Note() {

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Note{" +
                "Title='" + Title + '\'' +
                ", content='" + content + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
