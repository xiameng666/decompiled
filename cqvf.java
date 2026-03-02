import android.net.nsd.NsdServiceInfo;
import j..util.Objects;

final class cqvf extends cqvu {
    final NsdServiceInfo a;
    final cqvg b;

    public cqvf(cqvg cqvg0, NsdServiceInfo nsdServiceInfo0) {
        this.a = nsdServiceInfo0;
        Objects.requireNonNull(cqvg0);
        this.b = cqvg0;
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        cqvy.W(this.a, this.b.a);
        ((cqsk)object0).n();
    }
}

