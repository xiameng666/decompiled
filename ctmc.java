import com.google.android.gms.multidevice.sync.appcast.service.aidl.AppMetadata;
import java.util.ArrayList;

public final class ctmc extends ibsl implements ibtw {
    Object a;
    int b;
    final ctmn c;

    public ctmc(ctmn ctmn0, ibrl ibrl0) {
        this.c = ctmn0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctmc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctmc(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            goto label_17;
        }
        ibnx.b(object0);
        ctmn ctmn0 = this.c;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ctzb.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        this.a = ctmn0;
        this.b = 1;
        Object object3 = ctmn0.a.a(((ctzb)hftv0), this);
        if(object3 != object1) {
            object2 = ctmn0;
            object0 = object3;
        label_17:
            hfuo hfuo0 = ((ctyz)object0).b;
            ibuq.e(hfuo0, "getAppsList(...)");
            ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
            for(Object object4: hfuo0) {
                String s = ((ctza)object4).c;
                ibuq.e(s, "getPackageName(...)");
                String s1 = ((ctza)object4).d;
                ibuq.e(s1, "getVisibleName(...)");
                arrayList0.add(new AppMetadata(s, s1));
            }
            ((ctmn)object2).b = arrayList0;
            ctmb ctmb0 = new ctmb(this.c);
            ctnf.a(this.c.c, ctmb0);
            return ibom.a;
        }
        return object1;
    }
}

