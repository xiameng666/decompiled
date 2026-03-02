import android.app.Dialog;
import android.os.Bundle;

public abstract class gbbz extends de {
    public int ah;
    public fidh ai;
    public boolean aj;

    public gbbz() {
        this.aj = false;
    }

    public static Bundle F(int v, int v1, long v2) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("environment", v);
        bundle0.putInt("visualElementsId", v1);
        bundle0.putLong("uiReference", v2);
        return bundle0;
    }

    protected abstract Dialog G();

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        int v1;
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        boolean z = true;
        int v = bundle1 == null ? 1 : bundle1.getInt("environment");
        if(bundle1 == null) {
            this.ah = 0;
            v1 = 0;
        }
        else {
            v1 = bundle1.getInt("visualElementsId");
            this.ah = v1;
        }
        if(v1 == 0) {
            this.ah = 81065;
        }
        else if(v1 == 0) {
            return;
        }
        gaxo gaxo0 = gaxn.b(v);
        fhwo fhwo0 = (fhwo)gaxo0.P.get();
        gaxo0.a();
        if(this.getLifecycle().a() != lpf.b) {
            z = false;
        }
        gftb.r(z, "Must be called in onCreate");
        this.ai = new fidh(fhwo0, this);
    }

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        Dialog dialog0 = this.G();
        this.z(dialog0);
        return dialog0;
    }

    protected void y() {
        throw null;
    }

    protected void z(Dialog dialog0) {
        throw null;
    }
}

