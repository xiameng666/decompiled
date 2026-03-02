import com.google.android.gms.nearby.sharing.AdvertisingOptions;
import com.google.android.gms.nearby.sharing.DiscoveryOptions;

public final class dftk {
    public static final AdvertisingOptions a(dfso dfso0, String s) {
        dftl dftl0 = dfso0.a;
        if(dftl0 != null) {
            int v = 2;
            int v1 = dftl0.ordinal();
            if(v1 == 0) {
                goto label_11;
            }
            switch(v1) {
                case 2: {
                    v = 1;
                    goto label_12;
                }
                case 1: 
                case 3: {
                    goto label_12;
                }
            }
            v = 4;
            if(v1 == 4) {
                goto label_12;
            label_11:
                v = 0;
            label_12:
                if(s == null) {
                    s = "";
                }
                return new AdvertisingOptions(v, s);
            }
        }
        throw new ibnq();
    }

    public static final DiscoveryOptions b(dfsq dfsq0) {
        dftl dftl0 = dfsq0.f;
        if(dftl0 != null) {
            int v = 2;
            int v1 = dftl0.ordinal();
            if(v1 == 0) {
                v = 0;
                return new DiscoveryOptions(v);
            }
            switch(v1) {
                case 2: {
                    return new DiscoveryOptions(1);
                }
                case 1: 
                case 3: {
                    return new DiscoveryOptions(v);
                }
            }
            if(v1 == 4) {
                return new DiscoveryOptions(4);
            }
        }
        throw new ibnq();
    }
}

