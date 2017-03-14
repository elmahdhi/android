package com.example.xwalid.reservationfood.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xwalid.reservationfood.R;
import com.example.xwalid.reservationfood.model.ProductDetails;
import com.example.xwalid.reservationfood.model.Request;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xwalid on 12/03/2017.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private List<Request> items = new ArrayList<>();
    private Context context;

    public ProductAdapter(List<Request> items, Context context) {
        this.context = context;
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_list_row, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Request request = items.get(position);
        holder.chefName.setText(request.getChefName());
        holder.workflow.setText("10");
        holder.price.setText("17");
        holder.productName.setText(request.getCustomerName());
        holder.rating.setText("20");
        Picasso.with(context).load("http://www.earlofsandwichusa.com/wp-content/uploads/2016/05/Sandwich_Veggie-min.jpg").into(holder.imageProduit);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView productName, chefName, workflow, rating, price;
        ImageView imageProduit;

        public ViewHolder(View itemView) {
            super(itemView);
            price = (TextView) itemView.findViewById(R.id.price);
            productName = (TextView) itemView.findViewById(R.id.produitName);
            chefName = (TextView) itemView.findViewById(R.id.chefName);
            workflow = (TextView) itemView.findViewById(R.id.worklfowId);
            rating = (TextView) itemView.findViewById(R.id.rating);
            imageProduit = (ImageView) itemView.findViewById(R.id.imageProduit);
        }
    }
}
