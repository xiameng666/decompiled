import android.os.SystemClock;
import android.telephony.TelephonyManager.CellInfoCallback;
import j..util.Objects;
import java.util.List;

final class fvlc extends TelephonyManager.CellInfoCallback {
    final fvld a;

    public fvlc(fvld fvld0) {
        Objects.requireNonNull(fvld0);
        this.a = fvld0;
        super();
    }

    @Override  // android.telephony.TelephonyManager$CellInfoCallback
    public final void onCellInfo(List list0) {
        long v = SystemClock.elapsedRealtime();
        fvlr fvlr0 = new fvlr(this.a.m, list0, v);
        this.a.m.post(fvlr0);
        this.a.i(fvns.b, v, null);
    }

    @Override  // android.telephony.TelephonyManager$CellInfoCallback
    public final void onError(int v, Throwable throwable0) {
    }
}

