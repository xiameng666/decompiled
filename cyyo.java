import com.google.android.gms.nearby.internal.connection.ConnectionOptions;

public final class cyyo {
    public static final void a(ConnectionOptions connectionOptions0) {
        int[] arr_v = connectionOptions0.p;
        int[] arr_v1 = connectionOptions0.o;
        boolean z = false;
        if(arr_v != null && arr_v.length > 0) {
            connectionOptions0.c = false;
            connectionOptions0.b = false;
            connectionOptions0.e = false;
            connectionOptions0.d = false;
        }
        if(arr_v1 != null) {
            connectionOptions0.g = false;
            connectionOptions0.f = false;
            connectionOptions0.h = false;
        }
        if(arr_v != null) {
            for(int v = 0; v < arr_v.length; ++v) {
                ConnectionOptions.b(arr_v[v], connectionOptions0);
            }
        }
        if(arr_v1 != null) {
            for(int v1 = 0; v1 < arr_v1.length; ++v1) {
                ConnectionOptions.b(arr_v1[v1], connectionOptions0);
            }
        }
        int v2 = connectionOptions0.s;
        if(v2 == 0) {
            if(!connectionOptions0.l) {
                connectionOptions0.s = 2;
            }
            return;
        }
        if(v2 == 1) {
            z = true;
        }
        connectionOptions0.l = z;
    }
}

