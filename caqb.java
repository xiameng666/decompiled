import android.app.role.RoleManager;
import android.content.ComponentName;
import android.content.Context;
import java.util.List;

public final class caqb implements capw {
    public static final bboh a;
    public final Context b;
    public final cbfd c;
    public final cbdy d;
    private final ibrt e;

    static {
        caqb.a = capv.a("SupervisionManagerImpl");
    }

    public caqb(Context context0, ibrt ibrt0, cbfd cbfd0, cbdy cbdy0) {
        ibuq.f(context0, "context");
        ibuq.f(ibrt0, "blockingContext");
        super();
        this.b = context0;
        this.e = ibrt0;
        this.c = cbfd0;
        this.d = cbdy0;
    }

    @Override  // capw
    public final Object a(ibrl ibrl0) {
        capx capx0;
        if((ibrl0 instanceof capx)) {
            capx0 = (capx)ibrl0;
            int v = capx0.c;
            if((v & 0x80000000) == 0) {
                capx0 = new capx(this, ibrl0);
            }
            else {
                capx0.c = v - 0x80000000;
            }
        }
        else {
            capx0 = new capx(this, ibrl0);
        }
        Object object0 = capx0.a;
        Object object1 = ibrx.a;
        switch(capx0.c) {
            case 0: {
                ibnx.b(object0);
                capx0.c = 1;
                object0 = this.c(capx0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_19;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                if(ibuq.m(object0, "com.google.android.gms.supervision")) {
                    return Boolean.valueOf(true);
                }
                capx0.c = 2;
                object0 = this.c.c(capx0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_26;
            }
            case 2: {
                ibnx.b(object0);
            label_26:
                if(object0 != cbfn.b) {
                    ((ggtj)caqb.a.j()).x("Role-based supervision is expected, but ROLE_SYSTEM_SUPERVISION not held by Supervision Core APK.");
                    return Boolean.valueOf(false);
                }
                cbfc.a(gvka.az);
                capx0.c = 3;
                caqa caqa0 = new caqa(this, null);
                object0 = icbd.a(this.e, caqa0, capx0);
                if(object0 == object1) {
                    return object1;
                }
                cbfc.a((((Boolean)object0).booleanValue() ? gvka.aA : gvka.aB));
                return object0;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
        cbfc.a((((Boolean)object0).booleanValue() ? gvka.aA : gvka.aB));
        return object0;
    }

    @Override  // capw
    public final Object b(ibrl ibrl0) {
        capz capz0;
        if((ibrl0 instanceof capz)) {
            capz0 = (capz)ibrl0;
            int v = capz0.c;
            if((v & 0x80000000) == 0) {
                capz0 = new capz(this, ibrl0);
            }
            else {
                capz0.c = v - 0x80000000;
            }
        }
        else {
            capz0 = new capz(this, ibrl0);
        }
        Object object0 = capz0.a;
        Object object1 = ibrx.a;
        switch(capz0.c) {
            case 0: {
                ibnx.b(object0);
                capz0.c = 1;
                object0 = this.c.c(capz0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_19;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                if(object0 != cbfn.a) {
                    ((ggtj)caqb.a.h()).x("Supervision enabled through Profile Owner.");
                    return Boolean.valueOf(true);
                }
                capz0.c = 2;
                object0 = this.d();
                if(object0 == object1) {
                    return object1;
                }
                goto label_27;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
    label_27:
        if(((Boolean)object0).booleanValue()) {
            ((ggtj)caqb.a.h()).x("Supervision enabled in Supervision Core APK through ROLE_SYSTEM_SUPERVISION.");
            return Boolean.valueOf(true);
        }
        ((ggtj)caqb.a.h()).x("Supervision is not enabled for this application.");
        return Boolean.valueOf(false);
    }

    public final Object c(ibrl ibrl0) {
        capy capy0;
        if((ibrl0 instanceof capy)) {
            capy0 = (capy)ibrl0;
            int v = capy0.c;
            if((v & 0x80000000) == 0) {
                capy0 = new capy(this, ibrl0);
            }
            else {
                capy0.c = v - 0x80000000;
            }
        }
        else {
            capy0 = new capy(this, ibrl0);
        }
        Object object0 = capy0.a;
        Object object1 = ibrx.a;
        switch(capy0.c) {
            case 0: {
                ibnx.b(object0);
                capy0.c = 1;
                object0 = this.c.c(capy0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_19;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                if(object0 != cbfn.a) {
                    capy0.c = 2;
                    object0 = this.c.d(capy0);
                    if(object0 == object1) {
                        return object1;
                    }
                    return ((ComponentName)object0) != null ? ((ComponentName)object0).getPackageName() : null;
                }
                capy0.c = 3;
                object0 = this.d();
                if(object0 == object1) {
                    return object1;
                }
                return ((Boolean)object0).booleanValue() ? "com.google.android.gms.supervision" : null;
            }
            case 2: {
                ibnx.b(object0);
                return ((ComponentName)object0) != null ? ((ComponentName)object0).getPackageName() : null;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
        return ((Boolean)object0).booleanValue() ? "com.google.android.gms.supervision" : null;
    }

    private final Object d() {
        if(hujb.c()) {
            if(cbgq.a()) {
                Object object0 = this.b.getSystemService("role");
                RoleManager roleManager0 = (object0 instanceof RoleManager) ? ((RoleManager)object0) : null;
                if(roleManager0 == null) {
                    ((ggtj)caqb.a.j()).x("RoleManager service not available.");
                    return Boolean.valueOf(false);
                }
                try {
                    List list0 = roleManager0.getRoleHolders("android.app.role.SYSTEM_SUPERVISION");
                    ibuq.e(list0, "getRoleHolders(...)");
                    boolean z = list0.contains("com.google.android.gms.supervision");
                    ((ggtj)caqb.a.h()).S("Package %s role holder status for ROLE_SYSTEM_SUPERVISION: %s", "com.google.android.gms.supervision", z);
                    return Boolean.valueOf(z);
                }
                catch(SecurityException securityException0) {
                    a.ae(caqb.a.i(), "Failed to get role holders due to SecurityException.", securityException0);
                }
            }
            return Boolean.valueOf(false);
        }
        ((ggtj)caqb.a.j()).x("SupervisionManager not available for PO-less usage. The required flag is disabled.");
        return Boolean.valueOf(false);
    }
}

