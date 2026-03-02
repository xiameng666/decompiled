import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.multidevice.sync.QuickAccessDevice;
import com.google.android.gms.multidevice.sync.access.QuickAccessApiService;

public final class ctgn extends ibsl implements ibtw {
    int a;
    final QuickAccessApiService b;
    final QuickAccessDevice c;
    final String d;
    final cubq e;
    final ctvc f;

    public ctgn(QuickAccessApiService quickAccessApiService0, QuickAccessDevice quickAccessDevice0, String s, cubq cubq0, ctvc ctvc0, ibrl ibrl0) {
        this.b = quickAccessApiService0;
        this.c = quickAccessDevice0;
        this.d = s;
        this.e = cubq0;
        this.f = ctvc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctgn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctgn(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            String s = this.d;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ctyt.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            ibuq.f(s, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ctyt ctyt0 = (ctyt)hftp0.b_message;
            s.getClass();
            ctyt0.b |= 1;
            ctyt0.c = s;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            this.a = 1;
            object0 = this.e.a(((ctyt)hftv0), this);
            if(object0 == object1) {
                return object1;
            }
        }
        int v1 = ((ctyu)object0).b;
        if(v1 != 1) {
            ctyq ctyq0 = v1 == 2 ? ((ctyq)((ctyu)object0).c) : ctyq.a;
            ibuq.e(ctyq0, "getDocument(...)");
            this.f.a(ctgx.a(ctyq0), cckf.d(bbdp.dr));
            return ibom.a;
        }
        this.f.a(null, ApiMetadata.b);
        return ibom.a;
    }
}

