import android.content.Context;

public final class cyov {
    public final cyor a;
    public final Context b;
    private final cyot c;

    public cyov(Context context0, kba kba0) {
        this.b = context0;
        this.c = new cyot(context0, kba0, 0);
        this.a = new cyor(context0, kba0, 0);
    }

    public final void a(bbmv bbmv0) {
        cyjh.a.d().x("SendDeviceTypeBleManager: Start ble scanning.");
        cyou cyou0 = new cyou(this, bbmv0);
        this.c.a(cyou0);
    }
}

