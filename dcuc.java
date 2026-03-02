import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dcuc implements ibts {
    public final dcqr a;
    public final dcus b;

    public dcuc(dcqr dcqr0, dcus dcus0) {
        this.a = dcqr0;
        this.b = dcus0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((String)object0), "it");
        dcls dcls0 = new dcls();
        dcls0.b = this.a.a.c;
        dcwa.a(dcls0, dgge.a.a());
        dcwa.b(dcls0);
        ShareTarget shareTarget0 = dcls0.a();
        dcuo dcuo0 = new dcuo(this.a.b, shareTarget0, this.b, null);
        iced iced0 = icbb.b(this.b.d, null, null, dcuo0, 3);
        return new dcuk(this.a.a, shareTarget0, iced0);
    }
}

