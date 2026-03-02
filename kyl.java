import android.os.CancellationSignal;

public final class kyl implements Runnable {
    public final kwv a;
    public final byck b;
    public final bycm c;

    public kyl(bycm bycm0, kwv kwv0, byck byck0) {
        this.c = bycm0;
        this.a = kwv0;
        this.b = byck0;
    }

    @Override
    public final void run() {
        bycm bycm0 = this.c;
        kyq kyq0 = (kyq)bycm0.b.get();
        if(kyq0 == null) {
            return;
        }
        new CancellationSignal();
        kyn kyn0 = new kyn(bycm0, this.b);
        kyq0.b(this.a, kyn0);
    }
}

