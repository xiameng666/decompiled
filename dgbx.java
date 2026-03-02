import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dgbx implements ibts {
    public final dgcp a;
    public final dclv b;

    public dgbx(dgcp dgcp0, dclv dclv0) {
        this.a = dgcp0;
        this.b = dclv0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ShareTarget shareTarget0 = (ShareTarget)object0;
        ibuq.f(shareTarget0, "it");
        dgbn dgbn0 = new dgbn(this.b, shareTarget0);
        this.a.i.execute(dgbn0);
        return ibom.a;
    }
}

