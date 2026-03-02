import android.os.CountDownTimer;
import j..util.Objects;

final class fvvx extends CountDownTimer {
    final fvvy a;

    public fvvx(fvvy fvvy0, long v) {
        Objects.requireNonNull(fvvy0);
        this.a = fvvy0;
        super(v, 1000L);
    }

    @Override  // android.os.CountDownTimer
    public final void onFinish() {
        this.a.c.t.setText(0x7F150820);  // string:common_done "Done"
        this.a.c.t.setTextColor(0xFF888888);
        this.a.c.t.setClickable(false);
    }

    @Override  // android.os.CountDownTimer
    public final void onTick(long v) {
    }
}

