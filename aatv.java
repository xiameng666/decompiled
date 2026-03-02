import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

public final class aatv extends cjtm {
    public final aatb a;
    public final grxw b;
    public final fhrt c;
    public final boolean d;
    public zlg e;
    private final gmcg f;
    private final gmch g;
    private final gmbg h;
    private final aavz i;

    public aatv(aatb aatb0, grxw grxw0, fhrt fhrt0, boolean z, gmcg gmcg0, gmch gmch0, gmbg gmbg0, azug azug0) {
        ibuq.f(aatb0, "account");
        ibuq.f(grxw0, "resourceKey");
        super(109, "PrewarmingAsyncOperation", azug0);
        this.a = aatb0;
        this.b = grxw0;
        this.c = fhrt0;
        this.d = z;
        this.f = gmcg0;
        this.g = gmch0;
        this.h = gmbg0;
        this.i = new aavz();
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ibuq.f(context0, "context");
        ((aatu)zgx.a(aatu.class, this.i)).f(this);
        aatr aatr0 = new aatr(this);
        gmbu.t(this.f.d(aatr0), this.h, gmap.a);
        aats aats0 = new aats(this.i);
        long v = hojn.a.g().b();
        gmbu.t(this.g.g(aats0, v, TimeUnit.MILLISECONDS), this.h, gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
    }
}

