import com.google.android.gms.nearby.sharing.ShareTarget;

public final class ddat implements ibtw {
    public final ShareTarget a;
    public final float b;
    public final int c;

    public ddat(ShareTarget shareTarget0, float f, int v) {
        this.a = shareTarget0;
        this.b = f;
        this.c = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        ddbf.h(this.a, this.b, ((goz)object0), gsc.a(this.c | 1));
        return ibom.a;
    }
}

