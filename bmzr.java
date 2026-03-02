import android.content.Context;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class bmzr {
    public final RequestOptions a;
    private static final ggfp b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    static {
        bmzr.b = ggog.c(Transport.c, new Transport[]{Transport.d, Transport.g});
    }

    public bmzr(Context context0, RequestOptions requestOptions0) {
        this.a = requestOptions0;
        this.c = context0.getPackageManager().hasSystemFeature("android.hardware.usb.host");
        boolean z = true;
        this.e = blyw.c(context0) != null;
        if(bahu.a(context0) == null) {
            z = false;
        }
        this.d = z;
    }

    public final Set a() {
        ggfp ggfp0 = bmzr.b;
        HashSet hashSet0 = new HashSet();
        if(this.c) {
            hashSet0.add(Transport.d);
        }
        if(this.e) {
            hashSet0.add(Transport.c);
        }
        if(this.d) {
            hashSet0.add(Transport.g);
        }
        ggoe ggoe0 = ggog.e(ggfp0, hashSet0);
        HashSet hashSet1 = new HashSet();
        hashSet1.add(Transport.a);
        hashSet1.add(Transport.b);
        hashSet1.add(Transport.f);
        if(blwt.p(this.a) || blwt.q(this.a) || blwt.n(this.a) && blwt.h(this.a) == null) {
            hashSet1.add(Transport.c);
        }
        return ggog.d(ggoe0, hashSet1);
    }

    public final Set b() {
        RequestOptions requestOptions0 = this.a;
        if(blwt.m(requestOptions0)) {
            return this.a();
        }
        if(blwt.n(requestOptions0)) {
            List list0 = blwt.h(requestOptions0);
            if(list0 != null && !list0.isEmpty()) {
                if(blwt.k(list0)) {
                    return this.a();
                }
                Set set0 = ggog.e(this.a(), blwt.i(list0));
                return set0.isEmpty() ? this.a() : set0;
            }
            return this.a();
        }
        return this.a();
    }
}

