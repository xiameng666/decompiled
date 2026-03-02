import android.content.Context;
import android.content.Intent;
import com.google.android.gms.personalsafety.utils.LocalBroadcastReceiver;

public final class eiet {
    public static void a(Context context0, Integer integer0, String s, String s1) {
        eiet.b(context0, integer0, s, s1, null);
    }

    public static void b(Context context0, Integer integer0, String s, String s1, Integer integer1) {
        Intent intent0 = new Intent(s1).putExtra("DeviceTypeKey", integer0);
        if(integer1 != null) {
            intent0.putExtra("StatusCodeKey", integer1);
        }
        if(s == null) {
            ((ggtj)eicd.a.i()).x("MAC Address is null");
        }
        else {
            intent0 = intent0.putExtra("MacAddressKey", s);
        }
        LocalBroadcastReceiver.c(context0, intent0);
    }
}

