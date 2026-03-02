import android.uwb.UwbManager.AdapterStateCallback;
import j..util.Objects;

final class kdi implements UwbManager.AdapterStateCallback {
    final kdj a;

    public kdi(kdj kdj0) {
        Objects.requireNonNull(kdj0);
        this.a = kdj0;
        super();
    }

    public final void onStateChanged(int v, int v1) {
        int v2 = 2;
        switch(v1) {
            case 2: {
                v2 = 1;
                break;
            }
            case 5: {
                break;
            }
            default: {
                v2 = 0;
            }
        }
        kdj kdj0 = this.a;
        kdj0.d = v2;
        boolean z = kdj0.a();
        kdj0.a = v;
        if(z != kdj0.a()) {
            kdh kdh0 = new kdh(this);
            kdj0.f.execute(kdh0);
        }
    }
}

