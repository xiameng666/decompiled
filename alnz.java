import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;

public final class alnz implements glzn {
    public final alol a;

    public alnz(alol alol0) {
        this.a = alol0;
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
        return !altc0.b || almv.a(AppContextProvider.a()) ? gmbu.i(altc0) : glzd.f(this.a.i(false), new alog(altc0), gmap.a);
    }
}

