import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.multidevice.sync.QuickAccessDevice;
import com.google.android.gms.multidevice.sync.access.QuickAccessApiService;

public final class ctgo extends ibsl implements ibtw {
    int a;
    final QuickAccessApiService b;
    final QuickAccessDevice c;
    final String d;
    final cubq e;
    final int f;
    final int g;
    final ctvd h;

    public ctgo(QuickAccessApiService quickAccessApiService0, QuickAccessDevice quickAccessDevice0, String s, cubq cubq0, ctvd ctvd0, int v, int v1, ibrl ibrl0) {
        this.b = quickAccessApiService0;
        this.c = quickAccessDevice0;
        this.d = s;
        this.e = cubq0;
        this.h = ctvd0;
        this.f = v;
        this.g = v1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctgo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctgo(this.b, this.c, this.d, this.e, this.h, this.f, this.g, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            String s = this.d;
            int v1 = this.f;
            int v2 = this.g;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ctyv.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            ibuq.f(s, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((ctyv)hftv0).b |= 1;
            ((ctyv)hftv0).c = s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((ctyv)hftv1).b |= 2;
            ((ctyv)hftv1).d = v1;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ctyv ctyv0 = (ctyv)hftp0.b_message;
            ctyv0.b |= 4;
            ctyv0.e = v2;
            ProtoLiteMessage hftv2 = hftp0.N_build();
            ibuq.e(hftv2, "build(...)");
            this.a = 1;
            object0 = this.e.b(((ctyv)hftv2), this);
            if(object0 == object1) {
                return object1;
            }
        }
        byte[] arr_b = ((ctyw)object0).c.toByteArray();
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.dr);
        this.h.a(bitmap0, apiMetadata0);
        return ibom.a;
    }
}

