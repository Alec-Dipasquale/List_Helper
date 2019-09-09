package com.example.listhelper;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.listhelper.models.Note;

public class NotesListActivity extends AppCompatActivity {

    private static final String TAG = "NotesListActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_notes_list);

        Note note = new Note("some title", "some content", "timestamp");

        Note note2 = new Note();
        note2.setTitle("some other title");
        note2.setContent("some other content");
        note2.setTimestamp("");

        Log.d(TAG, "onCreate: my note: " + note.toString());
    }
}
