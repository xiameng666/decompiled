import android.bluetooth.le.AdvertisingSet;
import android.bluetooth.le.AdvertisingSetCallback;
import j..util.Objects;

final class bnmj extends AdvertisingSetCallback {
    public bnmj(bnmk bnmk0) {
        Objects.requireNonNull(bnmk0);
        super();
    }

    @Override  // android.bluetooth.le.AdvertisingSetCallback
    public final void onAdvertisingSetStarted(AdvertisingSet advertisingSet0, int v, int v1) {
        String s;
        bboh bboh0 = bnml.a;
        ((ggtj)bboh0.h()).F("Start advertising,  txPower=%d, status=%d", v, v1);
        if(v1 != 0) {
            ggtj ggtj0 = (ggtj)bboh0.h();
            switch(v1) {
                case 1: {
                    s = "DATA_TOO_LARGE";
                    break;
                }
                case 2: {
                    s = "TOO_MANY_ADVERTISERS";
                    break;
                }
                case 3: {
                    s = "ALREADY_STARTED";
                    break;
                }
                case 4: {
                    s = "INTERNAL_ERROR";
                    break;
                }
                case 5: {
                    s = "FEATURE_UNSUPPORTED";
                    break;
                }
                default: {
                    s = "Unknown code " + v1;
                }
            }
            ggtj0.B("Start advertising failed with %s", s);
        }
    }
}

