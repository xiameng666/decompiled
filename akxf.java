import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import java.util.Arrays;
import java.util.Map;

public final class akxf implements Runnable {
    public final String a;
    public final cuvf b;

    public akxf(String s, cuvf cuvf0) {
        this.a = s;
        this.b = cuvf0;
    }

    @Override
    public final void run() {
        akye akye0;
        akyf akyf0 = akyf.c(AppContextProvider.a());
        Map map0 = akyf0.c;
        byte[] arr_b = this.b.f;
        if(arr_b == null) {
            akye0 = akyf0.b();
            ((ggtj)akyf.a.h()).B("Endpoint info is null. Using current profile %s...", akye0);
        }
        else if(arr_b.length == 3) {
            boolean z = false;
            int v = arr_b[0];
            if(v == 1) {
                byte[] arr_b1 = Arrays.copyOfRange(arr_b, 1, 3);
                if(akyf0.f != null && Arrays.equals(arr_b1, akyf0.f.toByteArray())) {
                    z = true;
                }
                ((ggtj)akyf.a.h()).Y("Initiated connection EID is %s; current Work EID is %s; current Personal EID is %s; is a work profile: %s", ByteString.copyFrom(arr_b1), akyf0.f, akyf0.e, Boolean.valueOf(z));
                akye0 = z ? akye.b : akye.a;
            }
            else {
                akye0 = akyf0.b();
                ((ggtj)akyf.a.h()).ah(((byte)v), akye0);
            }
        }
        else {
            akye0 = akyf0.b();
            ((ggtj)akyf.a.h()).H("Endpoint info has incorrect length %s. Using current profile %s...", arr_b.length, akye0);
        }
        map0.put(this.a, akye0);
        try {
            akyf0.e();
            akyf0.a(this.a).c(this.a);
        }
        catch(ywm ywm0) {
            a.ae(akyf.a.j(), "onConnectionInitiated error", ywm0);
        }
    }
}

