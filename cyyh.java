import com.google.android.gms.nearby.internal.connection.AdvertisingOptions;

public final class cyyh {
    public static final void a(AdvertisingOptions advertisingOptions0) {
        int[] arr_v = advertisingOptions0.x;
        boolean z = false;
        if(arr_v != null && arr_v.length > 0) {
            advertisingOptions0.e = false;
            advertisingOptions0.d = false;
            advertisingOptions0.j = false;
            advertisingOptions0.k = false;
            advertisingOptions0.i = false;
            advertisingOptions0.m = false;
            for(int v = 0; v < arr_v.length; ++v) {
                switch(arr_v[v]) {
                    case 2: {
                        advertisingOptions0.d = true;
                        break;
                    }
                    case 4: {
                        advertisingOptions0.e = true;
                        break;
                    }
                    case 5: {
                        advertisingOptions0.i = true;
                        break;
                    }
                    case 6: {
                        advertisingOptions0.k = true;
                        break;
                    }
                    case 7: {
                        advertisingOptions0.j = true;
                        break;
                    }
                    case 9: 
                    case 12: {
                        advertisingOptions0.m = true;
                    }
                }
            }
        }
        if(advertisingOptions0.y != null && advertisingOptions0.y.length > 0) {
            advertisingOptions0.v = false;
            int v1 = 0;
            while(true) {
                int[] arr_v1 = advertisingOptions0.y;
                if(v1 >= arr_v1.length) {
                    goto label_36;
                }
                switch(arr_v1[v1]) {
                    case 9: 
                    case 12: {
                        advertisingOptions0.v = true;
                        goto label_36;
                    }
                    default: {
                        ++v1;
                    }
                }
            }
        }
        else {
        label_36:
            int v2 = advertisingOptions0.A;
            int v3 = 3;
            if(v2 == 0) {
                if(advertisingOptions0.g) {
                    v3 = 1;
                }
                advertisingOptions0.A = v3;
            }
            else {
                advertisingOptions0.g = v2 != 3;
            }
        }
        int v4 = advertisingOptions0.D;
        if(v4 == 0) {
            if(!advertisingOptions0.u) {
                advertisingOptions0.D = 2;
            }
            return;
        }
        if(v4 == 1) {
            z = true;
        }
        advertisingOptions0.u = z;
    }
}

