import android.content.Context;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.google.android.gms.tapandpay.firstparty.PassInfo;
import java.util.Set;

public final class ebea {
    public static final long[] a;
    public final bbng b;
    public final dqrj c;
    public final dqsa d;
    public final Vibrator e;
    private final Context f;

    static {
        ebea.a = new long[]{0L, 150L, 0x87L, 150L, 0x87L, 150L};
    }

    public ebea(Context context0, bbng bbng0, dqrj dqrj0, dqsa dqsa0) {
        this.f = context0;
        this.b = bbng0;
        this.c = dqrj0;
        this.d = dqsa0;
        Object object0 = context0.getSystemService("vibrator_manager");
        ibuq.d(object0, "null cannot be cast to non-null type android.os.VibratorManager");
        Vibrator vibrator0 = ((VibratorManager)object0).getDefaultVibrator();
        ibuq.c(vibrator0);
        this.e = vibrator0;
    }

    public final Set a(fsyk fsyk0) {
        PassInfo passInfo0 = new PassInfo();
        passInfo0.c = -1;
        passInfo0.a = 1;
        passInfo0.b = String.valueOf((fsyk0.e == null ? gtkg.a : fsyk0.e).f);
        return ibqg.b(passInfo0);
    }
}

