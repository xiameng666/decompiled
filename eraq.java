import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.quickstart.AccountTransferOptions;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartOptions;

public final class eraq extends azts implements eqzi {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        eraq.b = azss0;
        eral eral0 = new eral();
        eraq.c = eral0;
        eraq.a = new azta_api("TargetQuickStart.API", eral0, azss0);
    }

    public eraq(Context context0) {
        super(context0, eraq.a, azsx.s, aztr_settings.a);
    }

    @Override  // eqzi
    public final evql b(AccountTransferOptions accountTransferOptions0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{epvj.o};
        azzc0.b = false;
        azzc0.a = new erai(this, accountTransferOptions0);
        azzc0.d = 20765;
        return this.iG(azzc0.a());
    }

    @Override  // eqzi
    public final evql c(TargetQuickStartOptions targetQuickStartOptions0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{epvj.o};
        azzc0.b = false;
        azzc0.a = new erah(this, targetQuickStartOptions0);
        azzc0.d = 0x511F;
        return this.iG(azzc0.a());
    }
}

