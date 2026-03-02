import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.multidevice.sync.QuickAccessDevice;
import com.google.android.gms.multidevice.sync.access.QuickAccessApiService;
import java.util.ArrayList;
import java.util.List;

public final class ctgm extends ibsl implements ibtw {
    int a;
    final QuickAccessApiService b;
    final QuickAccessDevice c;
    final String d;
    final cubq e;
    final ctvb f;

    public ctgm(QuickAccessApiService quickAccessApiService0, QuickAccessDevice quickAccessDevice0, String s, cubq cubq0, ctvb ctvb0, ibrl ibrl0) {
        this.b = quickAccessApiService0;
        this.c = quickAccessDevice0;
        this.d = s;
        this.e = cubq0;
        this.f = ctvb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctgm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctgm(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            String s = this.d;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ctys.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            ibuq.f(s, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ctys ctys0 = (ctys)hftp0.b_message;
            s.getClass();
            ctys0.b |= 1;
            ctys0.c = s;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((ctys)hftv0), "request");
            byte[] arr_b = ((ctys)hftv0).toBytesArray();
            cubk cubk0 = new cubk(this.e.a.h("QuickAccessService", "GetChildDocuments", arr_b));
            this.a = 1;
            object0 = iciu.a(cubk0, new ArrayList(), this);
            if(object0 == object1) {
                return object1;
            }
        }
        ArrayList arrayList0 = new ArrayList(ibpo.q(((List)object0), 10));
        for(Object object2: ((List)object0)) {
            arrayList0.add(ctgx.a(((ctyq)object2)));
        }
        ApiMetadata apiMetadata0 = cckf.d(bbdp.dr);
        this.f.a(arrayList0, apiMetadata0);
        return ibom.a;
    }
}

