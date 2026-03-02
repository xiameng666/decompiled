import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.learning.InAppTrainerOptions;

public final class cccz extends azts implements cbzc {
    public static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        cccz.b = azss0;
        cccv cccv0 = new cccv();
        cccz.c = cccv0;
        cccz.a = new azta_api("GmsTrainer.API", cccv0, azss0);
    }

    public cccz(Context context0, InAppTrainerOptions inAppTrainerOptions0, aztr_settings aztr0) {
        super(context0, cccz.a, inAppTrainerOptions0, aztr0);
    }

    @Override  // cbzc
    public final evql a() {
        azzc azzc0 = new azzc();
        azzc0.a = new cccu(this);
        azzc0.c = new Feature[]{atqd.a};
        return this.jn(azzc0.a());
    }
}

