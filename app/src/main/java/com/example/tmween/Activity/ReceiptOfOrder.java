package com.example.tmween.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tmween.Adabter.ReceiptRecyclerAdapter;
import com.example.tmween.Model.ReceiptItemsModel;
import com.example.tmween.R;

import java.util.ArrayList;

public class ReceiptOfOrder extends AppCompatActivity {
    //define widgets and tools
    RecyclerView receiptRecycler;
    ReceiptRecyclerAdapter receiptAdapter;
    ArrayList<ReceiptItemsModel>receiptItemsModels=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt_of_order);
        initializeWidgets();
        fakeData();
        receiptRecycler.setLayoutManager(new LinearLayoutManager(this));
        receiptAdapter=new ReceiptRecyclerAdapter(this,receiptItemsModels);
        receiptRecycler.setAdapter(receiptAdapter);

    }

    //this function to initialize widgets
    public void initializeWidgets()
    {
        receiptRecycler=findViewById(R.id.receipt_recycler);

    }
    public void fakeData()
    {
        for (int i =0;i<5;i++)
            receiptItemsModels.add(new ReceiptItemsModel("كجم سكر","35","100ج.م","1000ج.م"));
    }
}
