import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;

public final class almo implements glzn {
    public final almp a;

    public almo(almp almp0) {
        this.a = almp0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)altc.a).v_newBuilder();
        boolean z = ((Boolean)object0).booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((altc)hftp0.b_message).b = z;
        boolean z1 = almv.a(AppContextProvider.a());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((altc)hftp0.b_message).c = z1;
        altc altc0 = (altc)hftp0.N_build();
        return !altc0.b || altc0.c ? gmbu.i(altc0) : glzd.f(this.a.c(false), new alml(altc0), gmap.a);
    }
}

