import com.google.android.gms.nearby.internal.connection.DiscoveryOptions;

public final class czec {
    public static final void a(DiscoveryOptions discoveryOptions0) {
        int[] arr_v = discoveryOptions0.o;
        boolean z = false;
        int v = 1;
        if(arr_v != null && arr_v.length > 0) {
            discoveryOptions0.d = false;
            discoveryOptions0.c = false;
            discoveryOptions0.h = false;
            discoveryOptions0.i = false;
            discoveryOptions0.g = false;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                switch(arr_v[v1]) {
                    case 2: {
                        discoveryOptions0.c = true;
                        break;
                    }
                    case 4: {
                        discoveryOptions0.d = true;
                        break;
                    }
                    case 5: {
                        discoveryOptions0.g = true;
                        break;
                    }
                    case 6: {
                        discoveryOptions0.i = true;
                        break;
                    }
                    case 7: {
                        discoveryOptions0.h = true;
                    }
                }
            }
        }
        int v2 = discoveryOptions0.t;
        if(v2 == 0) {
            if(!discoveryOptions0.e) {
                v = 3;
            }
            discoveryOptions0.t = v;
            return;
        }
        if(v2 != 3) {
            z = true;
        }
        discoveryOptions0.e = z;
    }
}

