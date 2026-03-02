import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Global;
import android.view.View;
import java.util.Map;

final class irm extends ibsl implements ibtw {
    int a;
    final ibvd b;
    final gsu c;
    final lps d;
    final irn e;
    final View f;
    private Object g;

    public irm(ibvd ibvd0, gsu gsu0, lps lps0, irn irn0, View view0, ibrl ibrl0) {
        this.b = ibvd0;
        this.c = gsu0;
        this.d = lps0;
        this.e = irn0;
        this.f = view0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((irm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new irm(this.b, this.c, this.d, this.e, this.f, ibrl0);
        ibrl1.g = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object2;
        Object object4;
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            icck icck0 = (icck)this.g;
            object2 = null;
            try {
                iqa iqa0 = (iqa)this.b.a;
                if(iqa0 == null) {
                    object4 = null;
                }
                else {
                    Context context0 = this.f.getContext().getApplicationContext();
                    Map map0 = irq.a;
                    synchronized(map0) {
                        object3 = map0.get(context0);
                        if(object3 == null) {
                            ContentResolver contentResolver0 = context0.getContentResolver();
                            Uri uri0 = Settings.Global.getUriFor("animator_duration_scale");
                            icgv icgv0 = icgx.a(-1, 0, null, 6);
                            object3 = iclp.b(new icht(new iro(contentResolver0, uri0, new irp(icgv0, Handler.createAsync(Looper.getMainLooper())), icgv0, context0, null)), iccl.c(), icmy.a(0L, 3), Float.valueOf(Settings.Global.getFloat(context0.getContentResolver(), "animator_duration_scale", 1.0f)));
                            map0.put(context0, object3);
                        }
                    }
                    iqa0.b(((Number)((icnj)object3).b()).floatValue());
                    object4 = icbb.b(icck0, null, null, new irl(((icnj)object3), iqa0, null), 3);
                }
            }
            catch(Throwable throwable0) {
                goto label_45;
            }
            try {
                this.g = object4;
                this.a = 1;
                gst gst0 = new gst(this.c, null);
                gqt gqt0 = gqv.a(this.u());
                gsr gsr0 = new gsr(this.c, gst0, gqt0, null);
                Object object5 = icbd.a(this.c.b, gsr0, this);
                ibrx ibrx0 = ibrx.a;
                if(object5 != ibrx0) {
                    object5 = ibom.a;
                }
                if(object5 != ibrx0) {
                    object5 = ibom.a;
                }
                goto label_49;
            }
            catch(Throwable throwable0) {
                object2 = object4;
            }
        label_45:
            if(object2 != null) {
                iceb.a(((iced)object2));
            }
            this.d.getLifecycle().d(this.e);
            throw throwable0;
        label_49:
            if(object5 == object1) {
                return object1;
            }
            object2 = object4;
        }
        else {
            object2 = (iced)this.g;
            try {
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                goto label_45;
            }
        }
        if(object2 != null) {
            iceb.a(((iced)object2));
        }
        this.d.getLifecycle().d(this.e);
        return ibom.a;
    }
}

