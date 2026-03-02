import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

public final class govx implements goxl {
    final goze a;
    final Context b;
    final goxa c;
    final gowy d;

    public govx(gowy gowy0, goze goze0, Context context0, goxa goxa0) {
        this.a = goze0;
        this.b = context0;
        this.c = goxa0;
        Objects.requireNonNull(gowy0);
        this.d = gowy0;
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        Status status0 = gozl.a(s);
        this.c.b(status0);
    }

    @Override  // goxl
    public final void b(Object object0) {
        this.a.g = ((GetTokenResponse)object0).b;
        govw govw0 = new govw(this, this.c, this);
        this.d.b.m(this.b, this.a, govw0);
    }
}

