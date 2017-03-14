package com.example.xwalid.reservationfood.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xwalid.reservationfood.R;
import com.example.xwalid.reservationfood.adapter.ProductAdapter;
import com.example.xwalid.reservationfood.model.Product;
import com.example.xwalid.reservationfood.model.Request;
import com.example.xwalid.reservationfood.test.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xwalid on 11/03/2017.
 */

public class Demands extends Fragment {

    private RecyclerView recyclerViewAdapter;
    private List<Request> requestList = new ArrayList<>();
    private ProductAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.demands_activity, container, false);
        recyclerViewAdapter = (RecyclerView) viewRoot.findViewById(R.id.recycl_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        prepareRequest();
        adapter = new ProductAdapter(requestList, getContext());

        recyclerViewAdapter.setLayoutManager(mLayoutManager);
        recyclerViewAdapter.setItemAnimator(new DefaultItemAnimator());
        recyclerViewAdapter.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return viewRoot;
    }

    private void prepareRequest() {
        Request request = new Request();
        request.setWorklfowId(10);
        request.setChefName("أحمد");

        Product product1 = new Product();
        product1.setProductName("سندويتشات");
        product1.setMainIngredient("دجاج مع توابل");
        product1.setRating(10);
        product1.setPrice(20);
        product1.setImageUrl("https://previews.123rf.com/images/jahoo/jahoo0805/jahoo080500008/3024413-Foot-sous-marin-long-sandwich-au-jambon-fromage-suisse-laitue-tomates-et-concombres-Vue-d-en-haut-is-Banque-d%27images.jpg");

        request.setProduct(product1);
        request.setTimeOut(10);
        request.setCustomerName("ali");

        Request request1 = new Request();
        request.setWorklfowId(10);
        request.setChefName("أحمد");

        Product product2 = new Product();
        product1.setProductName("سندويتشات");
        product1.setMainIngredient("دجاج مع توابل");
        product1.setRating(10);
        product1.setPrice(20);
        product1.setImageUrl("https://previews.123rf.com/images/jahoo/jahoo0805/jahoo080500008/3024413-Foot-sous-marin-long-sandwich-au-jambon-fromage-suisse-laitue-tomates-et-concombres-Vue-d-en-haut-is-Banque-d%27images.jpg");

        request.setProduct(product2);
        request.setTimeOut(10);
        request.setCustomerName("ali");

        Request request3 = new Request();
        request.setWorklfowId(10);
        request.setChefName("أحمد");

        Product product3 = new Product();
        product1.setProductName("سندويتشات");
        product1.setMainIngredient("دجاج مع توابل");
        product1.setRating(10);
        product1.setPrice(20);
        product1.setImageUrl("https://previews.123rf.com/images/jahoo/jahoo0805/jahoo080500008/3024413-Foot-sous-marin-long-sandwich-au-jambon-fromage-suisse-laitue-tomates-et-concombres-Vue-d-en-haut-is-Banque-d%27images.jpg");

        request.setProduct(product3);
        request.setTimeOut(10);
        request.setCustomerName("ali");

        Request request2 = new Request();
        request.setWorklfowId(10);
        request.setChefName("أحمد");

        Product product4 = new Product();
        product1.setProductName("سندويتشات");
        product1.setMainIngredient("دجاج مع توابل");
        product1.setRating(10);
        product1.setPrice(20);
        product1.setImageUrl("https://previews.123rf.com/images/jahoo/jahoo0805/jahoo080500008/3024413-Foot-sous-marin-long-sandwich-au-jambon-fromage-suisse-laitue-tomates-et-concombres-Vue-d-en-haut-is-Banque-d%27images.jpg");

        request.setProduct(product4);
        request.setTimeOut(10);
        request.setCustomerName("ali");
        requestList.add(request);
        requestList.add(request1);
        requestList.add(request2);
        requestList.add(request3);
    }


}
