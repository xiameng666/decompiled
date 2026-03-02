import android.os.UserHandle;

public final class epeo implements gful_cronetEngineProvider {
    public final epep a;

    public epeo(epep epep0) {
        this.a = epep0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        boolean z1;
        String s = hydh.a.c().l();
        boolean z = false;
        if(!"true".equals(s)) {
            epep epep0 = this.a;
            if(("false".equals(s) || !epep0.e) && epep0.b != null) {
                if(hycr.c()) {
                    UserHandle userHandle0 = UserHandle.of(UserHandle.myUserId());
                    z1 = epep0.f.isBackupServiceActive(userHandle0);
                }
                else {
                    z1 = bbmn.u(epep0.a);
                }
                if(z1) {
                    if(!epep0.c && !epep0.d) {
                        cchj cchj0 = cchj.b(epep0.a);
                        return cchj0.p("com.google").length + cchj0.p("com.google.work").length + cchj0.p("cn.google").length == 1 ? Boolean.valueOf(true) : Boolean.valueOf(false);
                    }
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}

