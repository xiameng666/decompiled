import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import j..util.Objects;

final class aubv extends auct {
    final aucd a;

    public aubv(aucd aucd0, Context context0, String s, String s1, CastDevice castDevice0, auxc auxc0) {
        Objects.requireNonNull(aucd0);
        this.a = aucd0;
        super(context0, s, s1, castDevice0, auxc0);
    }

    @Override  // auct
    protected final void a(gehk gehk0) {
        this.n.c("Protocol version has been negotiated: %s", new Object[]{gehk0});
        this.a.P = gehk0;
        this.a.T.f(this.a.P);
    }
}

