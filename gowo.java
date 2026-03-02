import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class gowo implements goxl {
    final goxa a;
    final gowy b;

    public gowo(gowy gowy0, goxa goxa0) {
        this.a = goxa0;
        Objects.requireNonNull(gowy0);
        this.b = gowy0;
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        Status status0 = gozl.a(s);
        this.a.b(status0);
    }

    @Override  // goxl
    public final void b(Object object0) {
        goxr goxr0 = new goxr(((GetTokenResponse)object0).b);
        gown gown0 = new gown(this, this.a, this);
        String s = hsyg.c();
        gdhi gdhi0 = goxr0.b();
        String s1 = this.b.b.e(s, "deleteAccount");
        byte[] arr_b = ((MessageLite)gdhi0).toBytesArray();
        ProxyRequest proxyRequest0 = this.b.b.a(s1, arr_b, null);
        goxm.d(this.b.b.c, this.b.b.a, proxyRequest0, null).e(new goto(this.b.b)).z(new gotf(this.b.b, gown0));
    }
}

