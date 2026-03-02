import android.os.Bundle;

public final class egtv implements fs {
    public final egtw a;

    public egtv(egtw egtw0) {
        this.a = egtw0;
    }

    @Override  // fs
    public final void a(String s, Bundle bundle0) {
        egtw egtw0 = this.a;
        if(bundle0.getBoolean("OPT_IN_RESPONSE")) {
            egtw0.z(46);
            egtw0.b.v(true);
            return;
        }
        egtw0.z(0x2F);
        egtw0.b.v(false);
    }
}

