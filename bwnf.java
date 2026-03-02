import java.util.concurrent.TimeUnit;

public final class bwnf {
    static {
        TimeUnit.HOURS.toSeconds(12L);
        TimeUnit.HOURS.toSeconds(1L);
    }

    public static void a(cljp cljp0) {
        bwne.k("MaintenanceDriver: Registering all GCM Tasks.");
        cljp0.f(bwnf.b("Maintenance.BatchDownload.24h", clkz.j, true, true));
    }

    public static clla b(String s, clkz clkz0, boolean z, boolean z1) {
        clks clks0 = new clks();
        clks0.j = "com.google.android.gms.icing.service.IcingGcmTaskService";
        clks0.t(s);
        clks0.a = clkz0;
        clks0.l(z);
        clks0.p = true;
        clks0.v(2);
        if(z1) {
            clks0.k();
        }
        clks0.e();
        if(!hubu.l()) {
            clks0.j();
        }
        return clks0.a();
    }
}

