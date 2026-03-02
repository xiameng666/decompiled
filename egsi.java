import android.os.Bundle;

public final class egsi implements fs {
    public final egsq a;

    public egsi(egsq egsq0) {
        this.a = egsq0;
    }

    @Override  // fs
    public final void a(String s, Bundle bundle0) {
        egsq egsq0 = this.a;
        if(bundle0.getBoolean("OPT_IN_RESPONSE")) {
            egsq0.H(46);
            egsq0.c.v(true);
            return;
        }
        egsq0.H(0x2F);
        egsq0.c.c();
        egsq0.c.i();
    }
}

