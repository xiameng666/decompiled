import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CancellationException;

public final class cszf implements csyv {
    public static final Intent a;
    public final Context b;
    private final bboh c;

    static {
        Intent intent0 = new Intent("com.google.ambient.streaming.action.BIND_SIGNALING").setPackage("com.google.ambient.streaming");
        ibuq.e(intent0, "setPackage(...)");
        cszf.a = intent0;
    }

    public cszf(Context context0) {
        this.b = context0;
        this.c = cume.a(new ibuk(this.getClass()));
    }

    @Override  // csyv
    public final Object a(ibrl ibrl0) {
        csyx csyx0;
        if((ibrl0 instanceof csyx)) {
            csyx0 = (csyx)ibrl0;
            int v = csyx0.c;
            if((v & 0x80000000) == 0) {
                csyx0 = new csyx(this, ibrl0);
            }
            else {
                csyx0.c = v - 0x80000000;
            }
        }
        else {
            csyx0 = new csyx(this, ibrl0);
        }
        Object object0 = csyx0.a;
        Object object1 = ibrx.a;
        Object object2 = null;
        switch(csyx0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    csyy csyy0 = new csyy(this, null);
                    csyx0.c = 1;
                    object0 = this.c(csyy0, csyx0);
                    if(object0 == object1) {
                        return object1;
                    label_20:
                        ibnx.b(object0);
                    }
                    object2 = (Boolean)object0;
                }
                catch(CancellationException unused_ex) {
                }
                break;
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(object2 == null) {
            ((ggtj)this.c.j()).x("Failed to check CDM association");
            return Boolean.valueOf(false);
        }
        return object2;
    }

    @Override  // csyv
    public final Object b(String s, ibrl ibrl0) {
        csyz csyz0;
        if((ibrl0 instanceof csyz)) {
            csyz0 = (csyz)ibrl0;
            int v = csyz0.c;
            if((v & 0x80000000) == 0) {
                csyz0 = new csyz(this, ibrl0);
            }
            else {
                csyz0.c = v - 0x80000000;
            }
        }
        else {
            csyz0 = new csyz(this, ibrl0);
        }
        Object object0 = csyz0.a;
        Object object1 = ibrx.a;
        Object object2 = null;
        switch(csyz0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    csza csza0 = new csza(this, s, null);
                    csyz0.c = 1;
                    object0 = this.c(csza0, csyz0);
                    if(object0 == object1) {
                        return object1;
                    label_20:
                        ibnx.b(object0);
                    }
                    object2 = (Boolean)object0;
                }
                catch(CancellationException unused_ex) {
                }
                break;
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(object2 == null) {
            ((ggtj)this.c.j()).x("Failed to perform CDM association");
            return Boolean.valueOf(false);
        }
        return object2;
    }

    public final Object c(ibtw ibtw0, ibrl ibrl0) {
        csze csze0 = new csze(ibtw0, this, null);
        return icbd.a(cclw.a, csze0, ibrl0);
    }
}

