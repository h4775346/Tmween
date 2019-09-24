package com.example.tmween.Adabter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tmween.Model.ReceiptItemsModel;
import com.example.tmween.R;

import java.util.ArrayList;

public class ReceiptRecyclerAdapter extends RecyclerView.Adapter<ReceiptRecyclerAdapter.Holder> {

    Context context;
    ArrayList<ReceiptItemsModel> receiptItemsModels = new ArrayList<>();

    public ReceiptRecyclerAdapter(Context context, ArrayList<ReceiptItemsModel> receiptItemsModels) {
        this.context = context;
        this.receiptItemsModels = receiptItemsModels;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.receipt_items, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.receipt_product_total_price.setText(receiptItemsModels.get(position).getReceipt_product_total_price());
        holder.receipt_product_name.setText(receiptItemsModels.get(position).getReceipt_product_name());
        holder.receipt_product_count.setText(receiptItemsModels.get(position).getReceipt_product_count());
        holder.receipt_product_price.setText(receiptItemsModels.get(position).getReceipt_product_price());


    }

    @Override
    public int getItemCount() {
        return receiptItemsModels.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView
                receipt_product_name,
                receipt_product_count,
                receipt_product_price,
                receipt_product_total_price;


        public Holder(@NonNull View itemView) {
            super(itemView);
            receipt_product_name=itemView.findViewById(R.id.product_name);
            receipt_product_count=itemView.findViewById(R.id.product_count);
            receipt_product_price=itemView.findViewById(R.id.product_price);
            receipt_product_total_price=itemView.findViewById(R.id.product_total_price);

        }
    }
}
