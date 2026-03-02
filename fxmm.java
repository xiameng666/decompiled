import android.os.CountDownTimer;
import j..util.Objects;

final class fxmm extends CountDownTimer {
    final fxmn a;

    public fxmm(fxmn fxmn0, long v) {
        Objects.requireNonNull(fxmn0);
        this.a = fxmn0;
        super(v, 1000L);
    }

    @Override  // android.os.CountDownTimer
    public final void onFinish() {
        fxmn fxmn0 = this.a;
        if(fxmn0.ag != null) {
            fxmt.b().a(fxmn0.ag.h, fxmn0.ag.i, fxmn0.ag.k, 8);
        }
        fxmn0.aj = null;
        fxmn0.c.finish();
        fxmn0.A();
    }

    @Override  // android.os.CountDownTimer
    public final void onTick(long v) {
    }
}

