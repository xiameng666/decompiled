import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.Random;

public final class ekat {
    private long a;
    private boolean b;
    private final ejze c;

    static {
        new Random();
    }

    public ekat() {
        ejze ejze0 = ejze.a();
        super();
        this.c = ejze0;
    }

    public final void a() {
        this.b = true;
        this.a = System.currentTimeMillis();
    }

    public final void b(Context context0, String s, boolean z) {
        if(this.b && this.a != 0L) {
            int v = 2;
            long v1 = System.currentTimeMillis() - this.a;
            if(v1 >= 0L) {
                if(z) {
                    NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
                    if(networkInfo0 != null) {
                        int v2 = networkInfo0.getType();
                        if(v2 == 0) {
                            switch(((TelephonyManager)context0.getSystemService("phone")).getNetworkType()) {
                                case 1: 
                                case 2: 
                                case 4: 
                                case 7: 
                                case 11: {
                                    v = 4;
                                    break;
                                }
                                case 13: {
                                    v = 6;
                                    break;
                                }
                                case 3: 
                                case 5: 
                                case 6: 
                                case 8: 
                                case 9: 
                                case 10: 
                                case 12: 
                                case 14: 
                                case 15: {
                                    v = 5;
                                }
                            }
                        }
                        else {
                            switch(v2) {
                                case 1: {
                                    v = 3;
                                    break;
                                }
                                case 6: {
                                    v = 7;
                                    break;
                                }
                                default: {
                                    if(v2 == 9) {
                                        v = 8;
                                    }
                                }
                            }
                        }
                    }
                    this.c.z(s, v1, v);
                }
                else {
                    this.c.z(s, v1, 2);
                }
            }
        }
        this.b = false;
    }
}

