package com.example.haftaiki.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.haftaiki.R;
import com.example.haftaiki.adapters.MyAdapter;
import com.example.haftaiki.models.DataModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    RecyclerView recyclerView;
    ArrayList<DataModel> arrayList;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = root.findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        homeViewModel = new HomeViewModel();
        arrayList = homeViewModel.getData();

        DataModel ob1 = new DataModel(R.drawable.mylogo, "Angular", "Web Application");
        arrayList.add(ob1);

        DataModel ob2 = new DataModel(R.drawable.mylogo, "C Programming", "Embed Programming");
        arrayList.add(ob2);

        DataModel ob3 = new DataModel(R.drawable.mylogo, "C++ Programming", "Embed Programming");
        arrayList.add(ob3);

        DataModel ob4 = new DataModel(R.drawable.mylogo, ".NET Programming", "Desktop and Web Programming");
        arrayList.add(ob4);

        DataModel ob5 = new DataModel(R.drawable.mylogo, "Java Programming", "Desktop and Web Programming");
        arrayList.add(ob5);

        DataModel ob6 = new DataModel(R.drawable.mylogo, "Magento", "Web Application Framework");
        arrayList.add(ob6);

        DataModel ob7 = new DataModel(R.drawable.mylogo, "NodeJS", "Web Application Framework");
        arrayList.add(ob7);

        DataModel ob8 = new DataModel(R.drawable.mylogo, "Python", "Desktop and Web Programming");
        arrayList.add(ob8);

        DataModel ob9 = new DataModel(R.drawable.mylogo, "Shopify", "E-Commerce Framework");
        arrayList.add(ob9);

        DataModel ob10 = new DataModel(R.drawable.mylogo, "Wordpress", "WebApplication Framewrok");
        arrayList.add(ob10);

        recyclerView.setAdapter(new MyAdapter(arrayList));







        return root;
    }
}