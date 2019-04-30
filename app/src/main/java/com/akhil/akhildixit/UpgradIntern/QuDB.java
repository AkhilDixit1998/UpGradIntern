package com.akhil.akhildixit.UpgradIntern;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.akhil.akhildixit.UpgradIntern.CustomDataTypes.Question;

@Database(entities = Question.class, version = 1, exportSchema = false)
public abstract class QuDB extends RoomDatabase {

    private static QuDB instance;

    public static synchronized QuDB getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), QuDB.class, "questions_table")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }

    public abstract QuPOJO questionsDao();
}
