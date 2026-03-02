import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class ehjf {
    public static final IntentFilter a;

    static {
        ehjf.a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public static final ehje a(Context context0) {
        ehje ehje0;
        try {
            ehje0 = ehje.a;
            Intent intent0 = jwe.b(context0, null, ehjf.a, 2);
            if(intent0 != null) {
                int v = -1;
                boolean z = true;
                switch(intent0.getIntExtra("status", -1)) {
                    case 2: 
                    case 5: {
                        break;
                    }
                    default: {
                        z = false;
                    }
                }
                int v1 = intent0.getIntExtra("level", -1);
                int v2 = intent0.getIntExtra("scale", 0);
                if(v1 >= 0 && v2 > 0) {
                    v = v1 * 100 / v2;
                }
                return new ehje(z, v);
            }
        }
        catch(Exception exception0) {
            egig.l("PeopleBU", "Unable to get battery status", exception0);
        }
        return ehje0;
    }
}

