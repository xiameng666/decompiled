import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class fkqp {
    private final Context a;

    public fkqp(Context context0) {
        this.a = context0;
    }

    public final int a() {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intent0 = this.a.registerReceiver(null, intentFilter0);
        if(intent0 == null) {
            return 1;
        }
        int v = intent0.getIntExtra("status", 1);
        if(v == 1) {
            return 1;
        }
        switch(v) {
            case 3: 
            case 4: {
                return 2;
            }
            case 2: 
            case 5: {
                return 3;
            }
            default: {
                return 1;
            }
        }
    }

    public final int b() {
        ConnectivityManager connectivityManager0;
        try {
            connectivityManager0 = (ConnectivityManager)this.a.getSystemService("connectivity");
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        }
        catch(SecurityException unused_ex) {
            return 1;
        }
        if(networkInfo0 == null) {
            return 1;
        }
        if(!networkInfo0.isConnected()) {
            return 2;
        }
        return connectivityManager0.isActiveNetworkMetered() ? 3 : 4;
    }
}

