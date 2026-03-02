import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import java.io.File;
import jeb.synthetic.FIN;

public final class fvzp {
    private static fvzk a;

    public static fvzk a() {
        Class class0 = fvzp.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        fvzk fvzk0 = fvzp.a;
        if(fvzk0 != null) {
            FIN.finallyCodeBegin$NT(v);
            return fvzk0;
        }
        File file0 = AppContextProvider.a().getDir("device_baro_bias_table", 0);
        if(file0 != null) {
            gpwg gpwg0 = new gpwg(file0, bboh.b("BarometerCalibration", bbcu.g));
            bblp bblp0 = new bblp(1, 9);
            huqn_elevationGraphOptimizerFlags huqn0 = huqm.c();
            fvzo fvzo0 = new fvzo();
            fvyg fvyg0 = huqm.d() ? new fvyg() : new fgvy();
            fvzk fvzk1 = new fvzk(gpwg0, bblp0, huqn0, fvzo0, fvyg0);
            fvyy fvyy0 = new fvyy(fvzk1);
            fvzk1.d.execute(fvyy0);
            fvzp.a = fvzk1;
            FIN.finallyExec$NT(v);
            return fvzk1;
        }
        throw new NullPointerException("Null barometerCalibrationTableDir");
    }

    public static icvk b() {
        icvk icvk0;
        synchronized(fvzp.class) {
            fvzk fvzk0 = fvzp.a;
            if(fvzk0 == null) {
                return null;
            }
            icvk0 = fvzk0.b();
        }
        return icvk0;
    }
}

