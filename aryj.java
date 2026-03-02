import java.util.concurrent.ExecutionException;

public final class aryj {
    public static final baun a;
    public final aqjk b;
    public final aqnj c;
    public final aqso d;
    public final aqpj e;
    public final aqpn f;

    static {
        aryj.a = new aqql(new String[]{"NotificationConditionChecker"});
    }

    public aryj(aqjk aqjk0, aqnj aqnj0, aqso aqso0, aqpj aqpj0, aqpn aqpn0) {
        this.b = aqjk0;
        this.c = aqnj0;
        this.d = aqso0;
        this.e = aqpj0;
        this.f = aqpn0;
    }

    public static boolean a(aqpn aqpn0) {
        try {
            return ((Boolean)((glyq)glzd.f(aqpn0.a.a(), new aqpl(), gmap.a)).u()).booleanValue();
        }
        catch(ExecutionException | InterruptedException exception0) {
            aryj.a.g("Error looking up MSA displayed state", exception0, new Object[0]);
            return false;
        }
    }

    public static boolean b(aqjk aqjk0) {
        return aqjk0.i();
    }

    public static boolean c(aqpj aqpj0) {
        return aqpj0.a();
    }

    public static boolean d(aqnj aqnj0) {
        return aqnj0.a() == null || !aqnj0.a().c;
    }
}

