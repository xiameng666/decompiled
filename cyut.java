import android.content.Context;
import android.media.AudioManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

public final class cyut {
    public final cyfr a;
    private final AudioManager b;
    private final bayn c;
    private final WifiManager d;

    public cyut(Context context0) {
        WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
        super();
        AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
        gfuy.e(audioManager0);
        this.b = audioManager0;
        bayn bayn0 = bayn.f(context0);
        gfuy.e(bayn0);
        this.c = bayn0;
        this.a = cyfo.a(context0);
        this.d = wifiManager0;
    }

    public final int a() {
        WifiManager wifiManager0 = this.d;
        if(wifiManager0 != null) {
            WifiInfo wifiInfo0 = wifiManager0.getConnectionInfo();
            return wifiInfo0 == null ? 0 : wifiInfo0.getFrequency();
        }
        return 0;
    }

    public final int b() {
        switch(this.b.getRingerMode()) {
            case 0: {
                return 4;
            }
            case 1: {
                return 3;
            }
            case 2: {
                return 2;
            }
            default: {
                return 1;
            }
        }
    }

    public final int c() {
        switch(this.c.a()) {
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            default: {
                return 1;
            }
        }
    }
}

