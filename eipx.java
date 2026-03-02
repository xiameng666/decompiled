import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class eipx {
    public static final int a;
    private static final bboh b;
    private final einq c;
    private final Context d;

    static {
        eipx.b = bboh.b("PhInternalConfigUpdater", bbcu.al);
    }

    public eipx(einq einq0, Context context0) {
        this.c = einq0;
        this.d = context0;
    }

    public final void a() {
        int v;
        try {
            v = ModuleManager.get(this.d).getCurrentModule().moduleVersion;
        }
        catch(Exception exception0) {
            a.ae(eipx.b.i(), "Problem to get module version", exception0);
            v = 1;
        }
        String[] arr_s = hxly.h() ? new String[]{"PHENOTYPE"} : new String[]{"PHENOTYPE", "PHENOTYPE_COUNTERS"};
        evql evql0 = this.c.i("com.google.android.gms.phenotype", v, arr_s, new int[0]);
        try {
            evrg.o(evql0, hxly.b(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | TimeoutException | InterruptedException exception1) {
            a.ae(eipx.b.i(), "Phenotype registration failed", exception1);
        }
    }

    public final void b(String s) {
        if(s != null && !s.equals("com.google.android.gms.phenotype")) {
            return;
        }
        this.c();
    }

    public final void c() {
        SharedPreferences sharedPreferences0 = this.d.createDeviceProtectedStorageContext().getSharedPreferences("com.google.android.gms.phenotype", 0);
        new eint(this.c, sharedPreferences0).h("");
    }
}

