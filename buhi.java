import android.content.Context;
import com.google.android.gms.googleone.notifications.GcmIntentOperation;

public final class buhi extends ibsl implements ibtw {
    int a;
    final String b;
    final GcmIntentOperation c;

    public buhi(String s, GcmIntentOperation gcmIntentOperation0, ibrl ibrl0) {
        this.b = s;
        this.c = gcmIntentOperation0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buhi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buhi(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        hith hith0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            GcmIntentOperation gcmIntentOperation0 = this.c;
            Context context0 = gcmIntentOperation0.getApplicationContext();
            ibuq.e(context0, "getApplicationContext(...)");
            ibuq.e(GcmIntentOperation.a, "access$getLogger$cp(...)");
            String s = bube.a(this.b, context0, GcmIntentOperation.a);
            if(s != null) {
                bubm bubm0 = gcmIntentOperation0.b;
                if(bubm0 == null) {
                    ibuq.j("storageQuotaSummaryManager");
                    bubm0 = null;
                }
                this.a = 1;
                object0 = bubm0.a(s, this);
                if(object0 == object1) {
                    return object1;
                }
                hith0 = (hith)object0;
                return ibom.a;
            }
        }
        else {
            hith0 = (hith)object0;
        }
        return ibom.a;
    }
}

