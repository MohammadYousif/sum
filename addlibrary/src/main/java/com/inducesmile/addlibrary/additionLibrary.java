package com.inducesmile.addlibrary;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class additionLibrary extends Intent {
    public static void add(Context context, int b) {
        Toast.makeText(context, "sum ="+b, Toast.LENGTH_SHORT).show();

    }

    public static void sumTwoVal(Context context) {
        Intent intent = new Intent(context, Addition.class);
        context.startActivity(intent);
    }


}
