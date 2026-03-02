import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.InAppTrainerOptions;

public final class ccgs extends cjtm {
    public static final fnaa a;
    public final azxs b;
    final byte[] c;

    static {
        ccgs.a = fmzv.a("CancelOperation");
    }

    public ccgs(byte[] arr_b, azxs azxs0, azug azug0) {
        super(0x8B, "Cancel", azug0);
        ccfl.a();
        this.c = arr_b;
        this.b = azxs0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        try(fmzu fmzu0 = fmzu.b(context0)) {
            String s = ((InAppTrainerOptions)bauc.a(this.c, InAppTrainerOptions.CREATOR)).a;
            ((cbzh)fmzu0.c(cbzh.class)).c(200);
            ccgo ccgo0 = (ccgo)fmzu0.c(ccgo.class);
            fmzu0.d();
            gmbu.t(ccgo0.i(s), new ccgr(this, fmzu0), gmap.a);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

