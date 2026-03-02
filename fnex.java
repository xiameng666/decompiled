import android.os.Bundle;
import com.google.android.libraries.onboarding.stableenvironment.autoremoval.GmsStableEnvironmentAutoRemovalService;

public final class fnex extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final cllr d;
    final GmsStableEnvironmentAutoRemovalService e;
    final babh f;

    public fnex(cllr cllr0, GmsStableEnvironmentAutoRemovalService gmsStableEnvironmentAutoRemovalService0, babh babh0, ibrl ibrl0) {
        this.d = cllr0;
        this.e = gmsStableEnvironmentAutoRemovalService0;
        this.f = babh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((fnex)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new fnex(this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object5;
        Object object4;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                Bundle bundle0 = this.d.b;
                String s = bundle0 == null ? null : bundle0.getString("reason");
                if(s == null || s.length() == 0) {
                    sct.e("GmsStableEnvironmentAutoRemovalService", "No reason provided for stable environment auto-removal");
                    return new Integer(2);
                }
                ibuq.c(this.f);
                ibuq.f(this.f, "context");
                object2 = rsk.a.a(this.f);
                this.a = s;
                this.b = object2;
                this.c = 1;
                Object object3 = icll.a(new rsh(object2.b.b(), s), this);
                if(object3 != object1) {
                    object4 = s;
                    object0 = object3;
                    goto label_24;
                }
                break;
            }
            case 1: {
                object2 = this.b;
                object4 = this.a;
                ibnx.b(object0);
            label_24:
                if(!((Boolean)object0).booleanValue()) {
                    sct.d("GmsStableEnvironmentAutoRemovalService", a.a(((String)object4), "No need to remove stable environment for reason:", " as stable environment is not set"));
                    return new Integer(0);
                }
                ibuq.c(this.f);
                ibuq.f(this.f, "context");
                fnes fnes0 = new fnes(this.f);
                this.a = object4;
                this.b = object2;
                this.c = 2;
                object0 = fnes0.a(((String)object4), this);
                if(object0 != object1) {
                    object5 = object4;
                    goto label_40;
                }
                break;
            }
            case 2: {
                object2 = this.b;
                object5 = this.a;
                ibnx.b(object0);
            label_40:
                if(((rsc)object0) != rsc.a) {
                    sct.e("GmsStableEnvironmentAutoRemovalService", a.L(((rsc)object0), ((String)object5), "Failed to unset stable environment for reason: ", " with result: "));
                    return new Integer(2);
                }
                this.a = null;
                this.b = null;
                this.c = 3;
                rsi rsi0 = new rsi(((String)object5), null);
                Object object6 = ((rsj)object2).b.a(rsi0, this);
                if(object6 != object1) {
                    object6 = ibom.a;
                }
                if(object6 != object1) {
                    return new Integer(0);
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return new Integer(0);
            }
        }
        return object1;
    }
}

