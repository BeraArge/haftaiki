package com.example.haftaiki.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.haftaiki.models.DataModel;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private ArrayList<DataModel> mText;

    public HomeViewModel() {
        mText = new ArrayList<>();
    }

    public ArrayList<DataModel> getData() {
        return mText;
    }
}