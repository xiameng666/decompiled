import java.util.Locale;

public final class bedt {
    public static heqn a(boolean z) {
        return bedt.b(z, "credentials_enable_autosignin");
    }

    public static heqn b(boolean z, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)heqn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((heqn)hftv0).b |= 1;
        ((heqn)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        heqn heqn0 = (heqn)hftp0.b_message;
        heqn0.b |= 2;
        heqn0.d = z ? "true" : "false";
        return (heqn)hftp0.N_build();
    }

    public static heqn c(boolean z) {
        return bedt.b(z, "credentials_enable_service");
    }

    public static boolean d(gged_interceptors gged0) {
        return bedt.f(gged0, "credentials_enable_autosignin");
    }

    public static boolean e(gged_interceptors gged0) {
        return bedt.f(gged0, "credentials_enable_service");
    }

    public static boolean f(gged_interceptors gged0, String s) {
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            heqn heqn0 = (heqn)gged0.get(v1);
            if((heqn0.b & 1) != 0 && (heqn0.b & 2) != 0 && heqn0.c.equals(s)) {
                return heqn0.d.toLowerCase(Locale.US).equals("true");
            }
        }
        return true;
    }
}

