import com.google.android.chimera.android.Activity;
import dagger.Lazy;

public final class bgmi {
    private final Activity a;
    private final Lazy b;
    private final Lazy c;

    public bgmi(Activity activity0, Lazy lazy0, Lazy lazy1) {
        ibuq.f(lazy0, "accountName");
        ibuq.f(lazy1, "isLocalAccount");
        super();
        this.a = activity0;
        this.b = lazy0;
        this.c = lazy1;
    }

    public final void a(String s, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grwc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((grwc)hftv0).b |= 1;
        ((grwc)hftv0).c = s;
        if(s1 != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            grwc grwc0 = (grwc)hftp0.b_message;
            grwc0.b |= 2;
            grwc0.d = s1;
        }
        grwc grwc1 = (grwc)hftp0.N_build();
        String s2 = ((Boolean)this.c.get()).booleanValue() ? null : ((String)this.b.get());
        cchp.a(this.a, grwc1, s2);
    }

    public final void b() {
        this.a("PASSWORD_MANAGER_SCREEN", null);
    }
}

