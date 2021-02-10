package com.dicoding.submission.mybestbook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBooks;
    private ArrayList<Book> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBooks = findViewById(R.id.rv_books);
        rvBooks.setHasFixedSize(true);

        list.addAll(BooksData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvBooks.setLayoutManager(new LinearLayoutManager(this));
        ListBookAdapter listBookAdapter = new ListBookAdapter(list);
        rvBooks.setAdapter(listBookAdapter);
    }
}
