import java.util.concurrent.ExecutionException;

public final class arse {
    public static final aqql a;
    public final arsj b;

    static {
        arse.a = new aqql(new String[]{"CustomBackupRunTimestamp"});
    }

    public arse(arsj arsj0) {
        this.b = arsj0;
    }

    public final gfsx a() {
        try {
            frli frli0 = this.b.a;
            gmcd gmcd0 = frli0.a();
            arsi arsi0 = new arsi();
            gmap gmap0 = gmap.a;
            if(!((Boolean)((glyq)glzd.f(gmcd0, arsi0, gmap0)).u()).booleanValue()) {
                arse.a.m("Custom backup schedule timestamp not found.", new Object[0]);
                return gfqx.a;
            }
            return gfsx.m(((Long)((glyq)glzd.f(frli0.a(), new arsg(), gmap0)).u()));
        }
        catch(ExecutionException | InterruptedException exception0) {
            arse.a.g("Unable to get timestamp from proto", exception0, new Object[0]);
            return gfqx.a;
        }
    }
}

