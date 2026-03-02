import com.google.android.gms.wearable.backup.wear.KeyRecoveryChimeraActivity;
import j..util.Objects;

public final class fcpm implements fcfd {
    public final fcpu a;
    public final fcok b;
    public final fcpc c;

    public fcpm(fcpu fcpu0, fcok fcok0, fcpc fcpc0) {
        this.a = fcpu0;
        this.b = fcok0;
        this.c = fcpc0;
    }

    @Override  // fcfd
    public final evql k(String s, String s1, byte[] arr_b) {
        this.a.g = false;
        this.b.d(4);
        KeyRecoveryChimeraActivity.j.h("onKeyRecoveryAborted", new Object[0]);
        Objects.requireNonNull(this.c.b);
        fcox fcox0 = new fcox(this.c.b);
        this.c.b.runOnUiThread(fcox0);
        return evrg.d(new byte[0]);
    }
}

