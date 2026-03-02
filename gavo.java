import android.os.CountDownTimer;

public final class gavo extends CountDownTimer {
    final gavp a;

    public gavo(gavp gavp0, long v) {
        this.a = gavp0;
        super(v, 1000L);
    }

    @Override  // android.os.CountDownTimer
    public final void onFinish() {
        gbtb gbtb0 = this.a.c;
        if(gbtb0 != null) {
            ((gbtc)gbtb0.t).v(0L);
            gbtb0.M(gkwv.f);
            gbtb0.nS();
        }
    }

    @Override  // android.os.CountDownTimer
    public final void onTick(long v) {
        gbtb gbtb0 = this.a.c;
        if(gbtb0 != null) {
            ((gbtc)gbtb0.t).v(v);
            gbtb0.M(gkwv.f);
            gbtb0.V(hcxy.c, 1);
        }
    }
}

