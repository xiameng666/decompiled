import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings.Global;

final class iro extends ibsl implements ibtw {
    Object a;
    int b;
    final ContentResolver c;
    final Uri d;
    final irp e;
    final icgv f;
    final Context g;
    private Object h;

    public iro(ContentResolver contentResolver0, Uri uri0, irp irp0, icgv icgv0, Context context0, ibrl ibrl0) {
        this.c = contentResolver0;
        this.d = uri0;
        this.e = irp0;
        this.f = icgv0;
        this.g = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((iro)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new iro(this.c, this.d, this.e, this.f, this.g, ibrl0);
        ibrl1.h = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icih icih0;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                icih0 = (icih)this.h;
                this.c.registerContentObserver(this.d, false, this.e);
                try {
                    object2 = this.f.A();
                    goto label_22;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                object2 = this.a;
                icih0 = (icih)this.h;
                try {
                    ibnx.b(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_32;
                        }
                        ((icgh)object2).b();
                        Float float0 = new Float(Settings.Global.getFloat(this.g.getContentResolver(), "animator_duration_scale", 1.0f));
                        this.h = icih0;
                        this.a = object2;
                        this.b = 2;
                        if(icih0.a(float0, this) == object1) {
                            return object1;
                        }
                    label_22:
                        this.h = icih0;
                        this.a = object2;
                        this.b = 1;
                        object0 = ((icgh)object2).a(this);
                        if(object0 == object1) {
                            return object1;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                object2 = this.a;
                icih0 = (icih)this.h;
                try {
                    ibnx.b(object0);
                    goto label_22;
                }
                catch(Throwable throwable0) {
                }
            }
        }
        this.c.unregisterContentObserver(this.e);
        throw throwable0;
    label_32:
        this.c.unregisterContentObserver(this.e);
        return ibom.a;
    }
}

