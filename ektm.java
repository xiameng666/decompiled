import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.Feature;

public final class ektm extends azts implements ekre {
    public static final int a;
    private static final azta_api b;
    private static final azss c;
    private static final azsy d;

    static {
        azss azss0 = new azss();
        ektm.c = azss0;
        ektl ektl0 = new ektl();
        ektm.d = ektl0;
        ektm.b = new azta_api("Scheduler.API", ektl0, azss0);
    }

    public ektm(Context context0) {
        super(context0, ektm.b, azsx.s, aztr_settings.a);
    }

    @Override  // ekre
    public final void b(Intent intent0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{ekqi.a};
        azzc0.a = new ektj(this, intent0);
        azzc0.b = false;
        azzc0.d = 3601;
        this.iG(azzc0.a());
    }
}

