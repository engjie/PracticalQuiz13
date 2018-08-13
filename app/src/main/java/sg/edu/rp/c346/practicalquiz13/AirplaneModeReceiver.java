package sg.edu.rp.c346.practicalquiz13;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by 16019641 on 13/8/2018.
 */

public class AirplaneModeReceiver extends BroadcastReceiver{
    @Override
     public void onReceive(Context context, Intent intent) {
        Log.d("onReceive","test");
        Toast my_toast = Toast.makeText(context, "You have changed Air plan mode", Toast.LENGTH_LONG);
        my_toast.show();
    }
    }


