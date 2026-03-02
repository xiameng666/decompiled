import com.google.android.gms.googlesettings.ui.GoogleSettingsChimeraActivity;

public final class bvbj implements ibtw {
    final GoogleSettingsChimeraActivity a;
    final ibtw b;

    public bvbj(GoogleSettingsChimeraActivity googleSettingsChimeraActivity0, ibtw ibtw0) {
        this.a = googleSettingsChimeraActivity0;
        this.b = ibtw0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gry[] arr_gry = new gry[2];
        GoogleSettingsChimeraActivity googleSettingsChimeraActivity0 = this.a;
        grx grx0 = cmht.a;
        cmhi cmhi0 = googleSettingsChimeraActivity0.n;
        if(cmhi0 == null) {
            ibuq.j("gmsCoreMetrics");
            cmhi0 = null;
        }
        arr_gry[0] = grx0.c(cmhi0);
        ltx ltx0 = (ltx)googleSettingsChimeraActivity0.p.a();
        arr_gry[1] = bvkp.a.c(ltx0);
        gpo.b(arr_gry, gzf.e(-357211570, new bvbi(this.b), ((goz)object0)), ((goz)object0), 56);
        return ibom.a;
    }
}

