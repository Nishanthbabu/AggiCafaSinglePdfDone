package com.example.skilledanswers_d1.hospital;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.skilledanswers_d1.hospital.Models.CountModle;
import com.example.skilledanswers_d1.hospital.Models.Q1Model;
import com.example.skilledanswers_d1.hospital.Models.Q2Model;
import com.example.skilledanswers_d1.hospital.Models.Q3Model;
import com.example.skilledanswers_d1.hospital.Models.Q4Model;
import com.example.skilledanswers_d1.hospital.Models.Q5Model;
import com.example.skilledanswers_d1.hospital.Models.Q6Model;
import com.example.skilledanswers_d1.hospital.Models.Q7Model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SkilledAnswers-D1 on 14-05-2016.
 */
public class DBLite extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "FeedBack.db";
    private static final int DATABASE_VERSION = 1;
    ///////////////
    private static final String Q1="q1";
    //
    private static final String KEY1="key1";
    private static final String ALWAYS1="always1";
    private static final String USUALY1="usualy1";
    private static final String SOMETIMES1="sometimes1";
    private static final String NEVER1="never1";
    //
    private static final String Q2="q2";
    //
    private static final String KEY2="key2";
    private static final String ALWAYS2="always2";
    private static final String USUALY2="usualy2";
    private static final String SOMETIMES2="sometimes2";
    private static final String NEVER2="never2";
    //
    private static final String Q3="q3";
    //
    private static final String KEY3="key3";
    private static final String ALWAYS3="always3";
    private static final String USUALY3="usualy3";
    private static final String SOMETIMES3="sometimes3";
    private static final String NEVER3="never3";
    //
    private static final String Q4="q4";
    //
    private static final String KEY4="key4";
    private static final String ALWAYS4="always4";
    private static final String USUALY4="usualy4";
    private static final String SOMETIMES4="sometimes4";
    private static final String NEVER4="never4";
    //
    private static final String Q5="q5";
    //
    private static final String KEY5="key5";
    private static final String ALWAYS5="alway5";
    private static final String USUALY5="usualy5";
    private static final String SOMETIMES5="sometimes5";
    private static final String NEVER5="never5";
    //
    private static final String Q6="q6";
    //
    private static final String KEY6="key6";
    private static final String ALWAYS6="always6";
    private static final String USUALY6="usualy6";
    private static final String SOMETIMES6="sometimes6";
    private static final String NEVER6="never6";
    //
    private static final String Q7="q7";
    //
    private static final String KEY7="key7";
    private static final String EXCELLENT="excellent";
    private static final String VERYGOOD="verygood";
    private static final String GOOD="good";
    private static final String AVERAGE="average";
    private static final String POOR="poor";
    //
    private static final String COUNTTABLE="counttable";
    //
    private static final String COUNT="count";
    //
    public DBLite(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    //

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_COUNTTABLE_TABLE= "CREATE TABLE "+COUNTTABLE  +"("
                + COUNT +" INTEGER PRIMARY KEY"+");";
        db.execSQL(CREATE_COUNTTABLE_TABLE);

        String CREATE_Q1_TABLE= "CREATE TABLE "+Q1 +"("
                + KEY1 +" INTEGER PRIMARY KEY ,"+ ALWAYS1 +" INTEGER,"+
                USUALY1 +" INTEGER,"+ SOMETIMES1 +" INTEGER," + NEVER1 +" INTEGER" +");";
        db.execSQL(CREATE_Q1_TABLE);
        String CREATE_Q2_TABLE= "CREATE TABLE "+ Q2 +"("
                + KEY2 +" INTEGER PRIMARY KEY,"+ ALWAYS2 +" INTEGER,"+
                USUALY2 +" INTEGER,"+ SOMETIMES2 +" INTEGER," + NEVER2 +" INTEGER" +");";
        db.execSQL(CREATE_Q2_TABLE);
        String CREATE_Q3_TABLE= "CREATE TABLE "+ Q3 +"("
                + KEY3 +" INTEGER PRIMARY KEY ,"+ ALWAYS3 +" INTEGER,"+
                USUALY3 +" INTEGER,"+ SOMETIMES3 +" INTEGER," + NEVER3 +" INTEGER" +");";
        db.execSQL(CREATE_Q3_TABLE);
        String CREATE_Q4_TABLE= "CREATE TABLE "+ Q4 +"("
                + KEY4 +" INTEGER PRIMARY KEY ,"+ ALWAYS4 +" INTEGER,"+
                USUALY4 +" INTEGER,"+ SOMETIMES4 +" INTEGER," + NEVER4 +" INTEGER" +");";
        db.execSQL(CREATE_Q4_TABLE);
        String CREATE_Q5_TABLE= "CREATE TABLE "+ Q5 +"("
                + KEY5 +" INTEGER PRIMARY KEY ,"+ ALWAYS5 +" INTEGER,"+
                USUALY5 +" INTEGER,"+ SOMETIMES5 +" INTEGER," + NEVER5 +" INTEGER" +");";
        db.execSQL(CREATE_Q5_TABLE);
        String CREATE_Q6_TABLE= "CREATE TABLE "+ Q6 +"("
                + KEY6 +" INTEGER PRIMARY KEY ,"+ ALWAYS6 +" INTEGER,"+
                USUALY6 +" INTEGER,"+ SOMETIMES6 +" INTEGER," + NEVER6 +" INTEGER" +");";
        db.execSQL(CREATE_Q6_TABLE);
        String CREATE_Q7_TABLE= "CREATE TABLE " + Q7 +"("
                + KEY7 +" INTEGER PRIMARY KEY ,"+ EXCELLENT +" INTEGER,"+
                VERYGOOD +" INTEGER,"+ GOOD +" INTEGER," + AVERAGE +" INTEGER,"+
                POOR +" INTEGER" +");";
        db.execSQL(CREATE_Q7_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Q1);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS " + Q2);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS " + Q3);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS " + Q4);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS " + Q5);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS " + Q6);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS " + Q7);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS " + COUNTTABLE);
        onCreate(db);
    }
    /////////////////////
    public void addCountDAtabase(CountModle modle)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COUNT,modle.get_count());

       database.insert(COUNTTABLE,null,values);
        database.close();
    }
    /////////////////////////////////////////////////////////////////////
    public void addToQ1Database(Q1Model model)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY1,model.get_key());
        values.put(ALWAYS1,model.get_always());
        values.put(USUALY1,model.get_usualy());
        values.put(SOMETIMES1,model.get_sometimes());
        values.put(NEVER1,model.get_never());
        database.insert(Q1,null,values);
        database.close();
    }

    /////////////////////////////////////////////////////////////////////
    public void addToQ2Database(Q2Model model)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY2,model.get_key());
        values.put(ALWAYS2,model.get_always());
        values.put(USUALY2,model.get_usualy());
        values.put(SOMETIMES2,model.get_sometimes());
        values.put(NEVER2,model.get_never());
        database.insert(Q2,null,values);
        database.close();
    }
    /////////////////////////////////////////////////////////////////////
    public void addToQ3Database(Q3Model model)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY3,model.get_key());
        values.put(ALWAYS3,model.get_always());
        values.put(USUALY3,model.get_usualy());
        values.put(SOMETIMES3,model.get_sometimes());
        values.put(NEVER3,model.get_never());
        database.insert(Q3,null,values);
        database.close();
    }
    /////////////////////////////////////////////////////////////////////
    public void addToQ4Database(Q4Model model)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY4,model.get_key());
        values.put(ALWAYS4,model.get_always());
        values.put(USUALY4,model.get_usualy());
        values.put(SOMETIMES4,model.get_sometimes());
        values.put(NEVER4,model.get_never());
        database.insert(Q4,null,values);
        database.close();
    }
    /////////////////////////////////////////////////////////////////////
    public void addToQ5Database(Q5Model model)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY5,model.get_key());
        values.put(ALWAYS5,model.get_always());
        values.put(USUALY5,model.get_usualy());
        values.put(SOMETIMES5,model.get_sometimes());
        values.put(NEVER5,model.get_never());
        database.insert(Q5,null,values);
        database.close();
    }
    /////////////////////////////////////////////////////////////////////
    public void addToQ6Database(Q6Model model)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY6,model.get_key());
        values.put(ALWAYS6,model.get_always());
        values.put(USUALY6,model.get_usualy());
        values.put(SOMETIMES6,model.get_sometimes());
        values.put(NEVER6,model.get_never());
        database.insert(Q6,null,values);
        database.close();
    }
    /////////////////////////////////////////////////////////////////////
    public void addToQ7Database(Q7Model model)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY7,model.get_key());
        values.put(EXCELLENT,model.get_excellent());
        values.put(VERYGOOD,model.get_veryGood());
        values.put(GOOD,model.get_good());
        values.put(AVERAGE,model.get_average());
        values.put(POOR,model.get_poor());
        database.insert(Q7,null,values);
        database.close();
    }
    public List<CountModle> getCount()
    {
        List<CountModle> modles=new ArrayList<>();
        // select all qurey
        try {
            String selectQuery = "SELECT * FROM " + COUNTTABLE;
            SQLiteDatabase database = this.getWritableDatabase();
            Cursor cursor = database.rawQuery(selectQuery, null);
            if (cursor.moveToFirst()) {
                do {
                    {
                        CountModle model = new CountModle();
                        model.set_count(Integer.parseInt(cursor.getString(0)));
                        modles.add(model);
                    }
                } while (cursor.moveToNext());
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return modles;
    }

    ///////////////////////////////////
    public List<Q1Model> getQ1()
    {
        List<Q1Model> models=new ArrayList<>();
        // select all qurey
        try {
            String selectQuery = "SELECT * FROM " + Q1;
            SQLiteDatabase database = this.getWritableDatabase();
            Cursor cursor = database.rawQuery(selectQuery, null);
            if (cursor.moveToFirst()) {
                do {
                    {
                        Q1Model model = new Q1Model();
                        model.set_always(Integer.parseInt(cursor.getString(1)));
                        model.set_usualy(Integer.parseInt(cursor.getString(2)));
                        model.set_sometimes(Integer.parseInt(cursor.getString(3)));
                        model.set_never(Integer.parseInt(cursor.getString(4)));

                        models.add(model);
                    }
                } while (cursor.moveToNext());
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return models;

    }
    ///////////////////////////////////
    public List<Q2Model> getQ2()
    {
        List<Q2Model> models=new ArrayList<>();
        // select all qurey
        try {
            String selectQuery = "SELECT * FROM " + Q2;
            SQLiteDatabase database = this.getWritableDatabase();
            Cursor cursor = database.rawQuery(selectQuery, null);
            if (cursor.moveToFirst()) {
                do {
                    {
                        Q2Model model = new Q2Model();
                        model.set_always(Integer.parseInt(cursor.getString(1)));
                        model.set_usualy(Integer.parseInt(cursor.getString(2)));
                        model.set_sometimes(Integer.parseInt(cursor.getString(3)));
                        model.set_never(Integer.parseInt(cursor.getString(4)));

                        models.add(model);
                    }
                } while (cursor.moveToNext());
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return models;

    }
    ///////////////////////////////////
    public List<Q3Model> getQ3()
    {
        List<Q3Model> models=new ArrayList<>();
        // select all qurey
        try {
            String selectQuery = "SELECT * FROM " + Q3;
            SQLiteDatabase database = this.getWritableDatabase();
            Cursor cursor = database.rawQuery(selectQuery, null);
            if (cursor.moveToFirst()) {
                do {
                    {
                        Q3Model model = new Q3Model();
                        model.set_always(Integer.parseInt(cursor.getString(1)));
                        model.set_usualy(Integer.parseInt(cursor.getString(2)));
                        model.set_sometimes(Integer.parseInt(cursor.getString(3)));
                        model.set_never(Integer.parseInt(cursor.getString(4)));

                        models.add(model);
                    }
                } while (cursor.moveToNext());
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return models;

    }
    ///////////////////////////////////
    public List<Q4Model> getQ4()
    {
        List<Q4Model> models=new ArrayList<>();
        // select all qurey
        try {
            String selectQuery = "SELECT * FROM " + Q4;
            SQLiteDatabase database = this.getWritableDatabase();
            Cursor cursor = database.rawQuery(selectQuery, null);
            if (cursor.moveToFirst()) {
                do {
                    {
                        Q4Model model = new Q4Model();
                        model.set_always(Integer.parseInt(cursor.getString(1)));
                        model.set_usualy(Integer.parseInt(cursor.getString(2)));
                        model.set_sometimes(Integer.parseInt(cursor.getString(3)));
                        model.set_never(Integer.parseInt(cursor.getString(4)));

                        models.add(model);
                    }
                } while (cursor.moveToNext());
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return models;

    }
    ///////////////////////////////////
    public List<Q5Model> getQ5()
    {
        List<Q5Model> models=new ArrayList<>();
        // select all qurey
        try {
            String selectQuery = "SELECT * FROM " + Q5;
            SQLiteDatabase database = this.getWritableDatabase();
            Cursor cursor = database.rawQuery(selectQuery, null);
            if (cursor.moveToFirst()) {
                do {
                    {
                        Q5Model model = new Q5Model();
                        model.set_always(Integer.parseInt(cursor.getString(1)));
                        model.set_usualy(Integer.parseInt(cursor.getString(2)));
                        model.set_sometimes(Integer.parseInt(cursor.getString(3)));
                        model.set_never(Integer.parseInt(cursor.getString(4)));

                        models.add(model);
                    }
                } while (cursor.moveToNext());
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return models;

    }
    ///////////////////////////////////
    public List<Q6Model> getQ6()
    {
        List<Q6Model> models=new ArrayList<>();
        // select all qurey
        try {
            String selectQuery = "SELECT * FROM " + Q6;
            SQLiteDatabase database = this.getWritableDatabase();
            Cursor cursor = database.rawQuery(selectQuery, null);
            if (cursor.moveToFirst()) {
                do {
                    {
                        Q6Model model = new Q6Model();
                        model.set_always(Integer.parseInt(cursor.getString(1)));
                        model.set_usualy(Integer.parseInt(cursor.getString(2)));
                        model.set_sometimes(Integer.parseInt(cursor.getString(3)));
                        model.set_never(Integer.parseInt(cursor.getString(4)));

                        models.add(model);
                    }
                } while (cursor.moveToNext());
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return models;

    }
    ///////////////////////////////////
    public List<Q7Model> getQ7()
    {
        List<Q7Model> models=new ArrayList<>();
        // select all qurey
        try {
            String selectQuery = "SELECT * FROM " + Q7;
            SQLiteDatabase database = this.getWritableDatabase();
            Cursor cursor = database.rawQuery(selectQuery, null);
            if (cursor.moveToFirst()) {
                do {
                    {
                        Q7Model model = new Q7Model();
                        model.set_excellent(Integer.parseInt(cursor.getString(1)));
                        model.set_veryGood(Integer.parseInt(cursor.getString(2)));
                        model.set_good(Integer.parseInt(cursor.getString(3)));
                        model.set_average(Integer.parseInt(cursor.getString(4)));
                        model.set_poor(Integer.parseInt(cursor.getString(5)));

                        models.add(model);
                    }
                } while (cursor.moveToNext());
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return models;

    }

    //// update the count...
    public  int updateCount(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COUNT,newvalue);
        return database.update(COUNTTABLE, values, COUNT + " = '" + slno + "'", null);
    }
//    ///// update always
    public  int updateQ1Always(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ALWAYS1, newvalue);
        return database.update(Q1, values, KEY1 + " = '" + slno + "'", null);
    }
///
    /*
 * Updating a tag
 */
//public int updateTag(Q1Model tag) {
//    SQLiteDatabase db = this.getWritableDatabase();
//
//    ContentValues values = new ContentValues();
//    System.out.println("ddddddddddddddddddinsidedb"+tag.get_always());
//    values.put(ALWAYS1, tag.get_always());
//
//    // updating row
//    return db.update(Q1, values, KEY1 + " = ?",
//            new String[] { String.valueOf(tag.get_key()) });
//}

    public  int updateQ2Always(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ALWAYS2,newvalue);
        return database.update(Q2, values, KEY2 + " = '" + slno + "'", null);
    }
    public  int updateQ3Always(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ALWAYS3,newvalue);
        return database.update(Q3, values, KEY3 + " = '" + slno + "'", null);
    }
    public  int updateQ4Always(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ALWAYS4,newvalue);
        return database.update(Q4, values, KEY4 + " = '" + slno + "'", null);
    }
    public  int updateQ5Always(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ALWAYS5,newvalue);
        return database.update(Q5, values, KEY5 + " = '" + slno + "'", null);
    }
    public  int updateQ6Always(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ALWAYS6,newvalue);
        return database.update(Q6, values, KEY6 + " = '" + slno + "'", null);
    }
///// update usualy
public  int updateQ1Usualy(int slno , int newvalue)
{
    SQLiteDatabase database = this.getWritableDatabase();
    ContentValues values = new ContentValues();
    values.put(USUALY1,newvalue);

    return database.update(Q1, values, KEY1 + " = '" + slno + "'", null);
}
    public  int updateQ2Usualy(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(USUALY2,newvalue);
        return database.update(Q2, values, KEY2 + " = '" + slno + "'", null);
    }
    public  int updateQ3Usualy(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(USUALY3,newvalue);
        return database.update(Q3, values, KEY3 + " = '" + slno + "'", null);
    }
    public  int updateQ4Usualy(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(USUALY4,newvalue);
        return database.update(Q4, values, KEY4 + " = '" + slno + "'", null);
    }
    public  int updateQ5Usualy(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(USUALY5,newvalue);
        return database.update(Q5, values, KEY5 + " = '" + slno + "'", null);
    }
    public  int updateQ6Usualy(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(USUALY6,newvalue);
        return database.update(Q6, values, KEY6 + " = '" + slno + "'", null);
    }
    //// update sometimes

    public  int updateQ1Sometimes(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SOMETIMES1,newvalue);
        return database.update(Q1, values, KEY1 + " = '" + slno + "'", null);
    }
    public  int updateQ2Sometimes(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SOMETIMES2,newvalue);
        return database.update(Q2, values, KEY2 + " = '" + slno + "'", null);
    }

    public  int updateQ3Sometimes(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SOMETIMES3,newvalue);
        return database.update(Q3, values, KEY3 + " = '" + slno + "'", null);
    }

    public  int updateQ4Sometimes(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SOMETIMES4,newvalue);
        return database.update(Q4, values, KEY4 + " = '" + slno + "'", null);
    }

    public  int updateQ5Sometimes(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SOMETIMES5,newvalue);
        return database.update(Q5, values, KEY5 + " = '" + slno + "'", null);
    }

    public  int updateQ6Sometimes(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SOMETIMES6,newvalue);
        return database.update(Q6, values, KEY6 + " = '" + slno + "'", null);
    }
    ////// update the never...
    public  int updateQ1Never(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NEVER1,newvalue);
        return database.update(Q1, values, KEY1 + " = '" + slno + "'", null);
    }
    public  int updateQ2Never(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NEVER2,newvalue);
        return database.update(Q2, values, KEY2 + " = '" + slno + "'", null);
    }
    public  int updateQ3Never(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NEVER3,newvalue);
        return database.update(Q3, values, KEY3 + " = '" + slno + "'", null);
    }
    public  int updateQ4Never(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NEVER4,newvalue);
        return database.update(Q4, values, KEY4 + " = '" + slno + "'", null);
    }
    public  int updateQ5Never(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NEVER5,newvalue);
        return database.update(Q5, values, KEY5 + " = '" + slno + "'", null);
    }
    public  int updateQ6Never(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NEVER6,newvalue);
        return database.update(Q6, values, KEY6 + " = '" + slno + "'", null);
    }
    /////// updating the q7...

    public  int updateQ7Excellent(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(EXCELLENT,newvalue);
        return database.update(Q7, values, KEY7 + " = '" + slno + "'", null);
    }
    public  int updateQ7VeryGood(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(VERYGOOD,newvalue);
        return database.update(Q7, values, KEY7 + " = '" + slno + "'", null);
    }
    public  int updateQ7Good(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(GOOD,newvalue);
        return database.update(Q7, values, KEY7 + " = '" + slno + "'", null);
    }
    public  int updateQ7Average(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(AVERAGE,newvalue);
        return database.update(Q7, values, KEY7 + " = '" + slno + "'", null);
    }
    public  int updateQ7Poor(int slno , int newvalue)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY7,newvalue);
        return database.update(Q7, values, KEY7 + " = '" + slno + "'", null);
    }



///////////// checks the database present or not in android
    public static boolean doesDatabaseExist(Context context, String dbName) {
        File dbFile = context.getDatabasePath(dbName);
        return dbFile.exists();
    }

}
