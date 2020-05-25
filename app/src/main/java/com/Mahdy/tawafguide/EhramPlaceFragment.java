package com.Mahdy.tawafguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class EhramPlaceFragment extends Fragment {

    private int imageRes;
    private String title;

    public EhramPlaceFragment() {
    }

    public EhramPlaceFragment(int imageRes, String title) {
        this.imageRes = imageRes;
        this.title = title;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ehram_place, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView image = view.findViewById(R.id.ehram_place_item_image);
        TextView titleTextview = view.findViewById(R.id.ehram_place_item_title);

        image.setImageResource(imageRes);
        titleTextview.setText(title);
    }
}
