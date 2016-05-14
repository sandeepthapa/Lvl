package com.example.user.lvl;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Login1 extends Fragment {


public Login1(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login1, container, false);
    }
    public void browser1(View View) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gmail.com"));
        startActivity(browserIntent);
    }
    public void browser2(View View) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        startActivity(browserIntent);

    }
    public void browser3(View View) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com"));
        startActivity(browserIntent);
    }


}