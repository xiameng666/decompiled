import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.multidevice.sync.QuickAccessDevice;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ctgu extends ibsl implements ibtw {
    Object a;
    int b;
    final ctvf c;
    final ctva d;

    public ctgu(ctvf ctvf0, ctva ctva0, ibrl ibrl0) {
        this.c = ctvf0;
        this.d = ctva0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctgu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctgu(this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            try {
                icig icig0 = this.c.a.b();
                ctgt ctgt0 = new ctgt(linkedHashMap0, this.c, this.d);
                this.a = linkedHashMap0;
                this.b = 1;
                if(icig0.oR(ctgt0, this) == object1) {
                    return object1;
                }
                goto label_29;
            }
            catch(Throwable throwable1) {
                object2 = linkedHashMap0;
                throwable0 = throwable1;
            }
        label_18:
            ctvf ctvf0 = this.c;
            ctvf0.a.a("QuickAccessService");
            for(Object object3: ((Map)object2).values()) {
                ctvf0.b.remove(((QuickAccessDevice)object3).a);
                ApiMetadata apiMetadata0 = cckf.d(bbdp.dr);
                this.d.a(((QuickAccessDevice)object3), apiMetadata0);
            }
            throw throwable0;
        label_29:
            object2 = linkedHashMap0;
        }
        else {
            try {
                object2 = this.a;
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                goto label_18;
            }
        }
        ctvf ctvf1 = this.c;
        ctvf1.a.a("QuickAccessService");
        for(Object object4: ((Map)object2).values()) {
            ctvf1.b.remove(((QuickAccessDevice)object4).a);
            ApiMetadata apiMetadata1 = cckf.d(bbdp.dr);
            this.d.a(((QuickAccessDevice)object4), apiMetadata1);
        }
        return ibom.a;
    }
}

