import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;

public final class afqs implements bxto {
    @Override  // bxto
    public final Object a(Object object0) {
        String s = ((azui)object0) == null ? null : ((azui)object0).f();
        if(s != null) {
            return new bmcc(String.valueOf(azqk.a(AppContextProvider.a())), s.getBytes());
        }
        throw bxma.f(0xC400, "Failed to generate SafetyNet attestation statement.");
    }
}

