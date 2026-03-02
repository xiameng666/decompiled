import android.telephony.TelephonyManager.CellInfoCallback;
import j..util.Objects;
import java.util.List;

final class fwwi extends TelephonyManager.CellInfoCallback {
    final fwwl a;
    private final long b;
    private final fwve c;

    public fwwi(fwwl fwwl0, fwve fwve0, long v) {
        Objects.requireNonNull(fwwl0);
        this.a = fwwl0;
        super();
        this.c = fwve0;
        this.b = v;
    }

    @Override  // android.telephony.TelephonyManager$CellInfoCallback
    public final void onCellInfo(List list0) {
        fvtm fvtm0 = this.a.f(list0, this.b, fvtm.b);
        if(fvtm0 == null) {
            this.c.a(null, -1);
            return;
        }
        this.c.a(new fvtm[]{fvtm0}, 0);
    }

    @Override  // android.telephony.TelephonyManager$CellInfoCallback
    public final void onError(int v, Throwable throwable0) {
        this.c.a(new fvtm[0], v);
    }
}

