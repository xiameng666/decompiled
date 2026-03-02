import android.content.Context;

public final class cyop {
    private final cyot a;
    private final cyor b;

    public cyop(Context context0, kba kba0) {
        this.a = new cyot(context0, kba0, 1);
        this.b = new cyor(context0, kba0, 1);
    }

    public final void a() {
        cyjh.a.d().x("InProgressNotificationBleManager: Start ble advertising.");
        this.b.a();
    }

    public final void b(Runnable runnable0) {
        cyjh.a.d().x("InProgressNotificationBleManager: Start ble scanning.");
        cyoo cyoo0 = new cyoo(runnable0);
        this.a.a(cyoo0);
    }
}

