import android.content.Context;
import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Optional;

public final class asfl extends asaj implements cjug {
    public static final int a;
    private static final baun b;
    private final String c;
    private final String d;
    private final Context e;
    private final cjts f;
    private final asgc g;

    static {
        asfl.b = aqql.a("BackUpNowApiStub");
    }

    public asfl(Context context0, cjts cjts0, asgc asgc0, String s, String s1) {
        this.c = s;
        this.d = s1;
        this.e = context0;
        this.f = cjts0;
        this.g = asgc0;
    }

    @Override  // asak
    public final void a(asah asah0, BackUpNowConfig backUpNowConfig0, ApiMetadata apiMetadata0) {
        asgc asgc0 = this.g;
        if(asgc0.a() == 0) {
            asfu asfu0 = new asfu(this.e, ((gful_cronetEngineProvider)new asfk()), ((gful_cronetEngineProvider)new asfk()), backUpNowConfig0.k);
            asfj asfj0 = new asfj();
            boolean z = hqgx.a.c().o();
            azuf azuf0 = azug.b(apiMetadata0);
            azuf0.f(azud.a);
            azuf0.e(bbdp.ah);
            azuf0.g(bbdq.l);
            azuf0.d(this.c);
            azuf0.c(this.d);
            azug azug0 = azuf0.a();
            Optional optional0 = new aqld(this.e).b() ? Optional.of(aqlg.d(this.e)) : Optional.empty();
            Optional optional1 = !new aqld(this.e).b() || !aqyy.a() || !backUpNowConfig0.f ? Optional.empty() : Optional.of(new ashd(this.e));
            bblp bblp0 = new bblp(1, 9);
            hfuo hfuo0 = backUpNowConfig0.d || !hqil.a.j().W() ? hqil.g().b : hqil.h().b;
            aqnb aqnb0 = aqnb.f(this.e, bblp0, true);
            this.f.b(new asfx(asah0, backUpNowConfig0, asgc0, asfu0, optional0, optional1, new asgy(this.e, backUpNowConfig0.a, backUpNowConfig0.d, asfu0, aqnb0, asfj0, hfuo0), (z ? new ashb(backUpNowConfig0, asfu0, this.e) : null), azug0));
            return;
        }
        asfl.b.j("BackUpNow operation is already running, not starting a new one.", new Object[0]);
    }

    @Override  // asak
    public final void b(String s, aqgk aqgk0, ApiMetadata apiMetadata0) {
        this.g.b(s, aqgk0);
    }

    @Override  // asak
    public final void c(String s, ApiMetadata apiMetadata0) {
        this.g.h(s);
    }

    @Override  // asak
    public final boolean d(ApiMetadata apiMetadata0) {
        return this.g.a() > 0;
    }
}

