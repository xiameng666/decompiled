import android.content.Context;

public final class arvt extends aqia implements cjug {
    private static final bboh a;
    private final Context b;
    private final String c;
    private final cjts d;
    private final arvs e;
    private final aqjk f;
    private final aqef g;

    static {
        arvt.a = bboh.b("BackupStateApiStub", bbcu.cJ);
    }

    public arvt(Context context0, String s, cjts cjts0, arvs arvs0, aqjk aqjk0, aqef aqef0) {
        ibuq.f(s, "callingPackage");
        super();
        this.b = context0;
        this.c = s;
        this.d = cjts0;
        this.e = arvs0;
        this.f = aqjk0;
        this.g = aqef0;
    }

    @Override  // aqib
    public final void a(aqic aqic0) {
        ibuq.f(aqic0, "callback");
        if(!hqgn.c()) {
            ((ggtj)arvt.a.j()).x("BackupState API is not enabled");
            this.e.a(gian.d);
            aqic0.a(arvw.b, null);
            return;
        }
        arvu arvu0 = new arvu(this.b, this.c, aqic0, this.e, this.f, this.g);
        this.d.b(arvu0);
    }

    @Override  // aqib
    public final void c(aqic aqic0) {
        ibuq.f(aqic0, "callback");
        if(!hqgn.c()) {
            ((ggtj)arvt.a.j()).x("BackupState API is not enabled");
            this.e.b(gian.d);
            aqic0.b(arvw.b, false);
            return;
        }
        ((ggtj)arvt.a.h()).B("getIsBackupEnabledForCallingPackage called for package: %s", this.c);
        arvv arvv0 = new arvv(aqic0, this.e, this.f);
        this.d.b(arvv0);
    }
}

