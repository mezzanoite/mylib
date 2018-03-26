package br.com.mezzanotte.mylib;


import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast {

    public void showToast(Context context, String mensagem) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View customToastRoot = inflater.inflate(R.layout.custom_toast, null);

        Toast customToast = new Toast(context);

        customToast.setView(customToastRoot);
        TextView tv = (TextView) customToastRoot.findViewById(R.id.textView1);
        tv.setText(mensagem);
        customToast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0 , 0);
        customToast.setDuration(Toast.LENGTH_LONG);
        customToast.show();
    }
}
