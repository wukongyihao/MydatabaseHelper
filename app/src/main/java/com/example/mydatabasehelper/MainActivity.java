package com.example.mydatabasehelper;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.litepal.tablemanager.Connector;

public class MainActivity extends AppCompatActivity {

    private MyDatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        databaseHelper = new MyDatabaseHelper(this,"BookStore.db",null,5);
//        Button button = (Button)findViewById(R.id.create_database);
        Button addData = (Button)findViewById(R.id.add_data);
        Button updateDta = (Button)findViewById(R.id.update_data);
        Button deleteData = (Button)findViewById(R.id.delete_data);
        Button queryData = (Button)findViewById(R.id.Query_data);
        Button createDatabase = (Button)findViewById(R.id.create_database);

        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Book book = new Book();
                book.setName("the da vinci code");
                book.setAuthor("dan brown");
                book.setPages(454);
                book.setPrice(14.44);
                book.setPress("unknow");
                book.save();
            }
        });


        createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Connector.getDatabase();
            }
        });


//        queryData.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SQLiteDatabase db = databaseHelper.getWritableDatabase();
//                Cursor cursor = db.query("Book",null,null,null,null,null,null);
//                if (cursor.moveToFirst()){
//                    do {
//                        String name = cursor.getString(cursor.getColumnIndex("name"));
//                        String author = cursor.getString(cursor.getColumnIndex("author"));
//                        int pages = cursor.getInt(cursor.getColumnIndex("pages"));
//                        double price = cursor.getDouble(cursor.getColumnIndex("price"));
//                        Log.d("123123","book name is" + name);
//                        Log.d("123123","book author is" + author);
//                        Log.d("123123","book page is" + pages);
//                        Log.d("123123","book price  is" + price);
//                    }while (cursor.moveToNext());
//                }
//                cursor.close();
//            }
//        });
//
//
//        deleteData.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SQLiteDatabase db = databaseHelper.getWritableDatabase();
//                db.delete("Book","pages > ?",new String[]{"500"});
//            }
//        });
//
//        updateDta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SQLiteDatabase db = databaseHelper.getWritableDatabase();
//                ContentValues values = new ContentValues();
//                values.put("price",10.99);
//                db.update("Book",values,"name = ?",new String[]{"the da vinci code"});
//            }
//        });
//
//        addData.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SQLiteDatabase db = databaseHelper.getWritableDatabase();
//                ContentValues values = new ContentValues();
//                values.put("name","the da vinci code");
//                values.put("author","dan vrown");
//                values.put("pages",456);
//                values.put("price",16.66);
//                db.insert("Book",null,values);
//                values.clear();
//                values.put("name","liao zhai zhi yi");
//                values.put("author","unknow");
//                values.put("pages",1212);
//                values.put("price",44.66);
//                db.insert("Book",null,values);
//
//            }
//        });
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                databaseHelper.getWritableDatabase();
//
//            }
//        });
//    }
}
}
