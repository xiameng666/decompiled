import com.google.android.gms.nearby.connection.BleConnectivityInfo;
import java.net.InetAddress;
import java.util.List;

public final class dbmp {
    public static final String a(byte[] arr_b) {
        String s = dbtd.a(arr_b);
        if(s != null) {
            return s;
        }
        throw new SecurityException("Endpoint generation failed.");
    }

    public static final dbdd b(dbku dbku0) {
        if((dbku0 instanceof dbkr)) {
            return new dbdb(((dbkr)dbku0).a);
        }
        if(!(dbku0 instanceof dbkt)) {
            return null;
        }
        InetAddress inetAddress0 = ((dbkt)dbku0).a.getHost();
        ibuq.e(inetAddress0, "getHost(...)");
        return new dbdc(inetAddress0, ((dbkt)dbku0).a.getPort());
    }

    public static final List c(List list0, dbku dbku0) {
        if(!(dbku0 instanceof dbkr)) {
            return list0;
        }
        byte[] arr_b = cutq.c(((dbkr)dbku0).a.getAddress());
        ibqm ibqm0 = new ibqm(null);
        boolean z = true;
        for(Object object0: list0) {
            cuvx cuvx0 = (cuvx)object0;
            if((cuvx0 instanceof BleConnectivityInfo) && ((BleConnectivityInfo)cuvx0).d() == null) {
                cuva cuva0 = new cuva();
                byte[] arr_b1 = ((BleConnectivityInfo)cuvx0).a;
                if(arr_b1 != null) {
                    cuva0.d(arr_b1);
                }
                byte[] arr_b2 = ((BleConnectivityInfo)cuvx0).b;
                if(arr_b2 != null) {
                    cuva0.c(arr_b2);
                }
                byte[] arr_b3 = ((BleConnectivityInfo)cuvx0).c;
                if(arr_b3 != null) {
                    cuva0.b(arr_b3);
                }
                byte[] arr_b4 = ((BleConnectivityInfo)cuvx0).d;
                if(arr_b4 != null) {
                    cuva0.f(arr_b4);
                }
                byte[] arr_b5 = ((BleConnectivityInfo)cuvx0).e;
                if(arr_b5 != null) {
                    cuva0.e(arr_b5);
                }
                cuva0.d(arr_b);
                ibqm0.add(cuva0.a());
                z = false;
            }
            else {
                ibqm0.add(cuvx0);
            }
        }
        if(z) {
            cuva cuva1 = new cuva();
            cuva1.d(arr_b);
            ibqm0.add(cuva1.a());
        }
        return ibpo.a(ibqm0);
    }
}

