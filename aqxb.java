import android.content.Context;

public final class aqxb extends glyq {
    public final int a;
    private final aqxc b;

    public aqxb(Context context0, int v, arem arem0) {
        aqxb aqxb0;
        this.a = v;
        if(v == 1) {
            aqxb0 = this;
            aqxb0.b = aqxd.a(aqxb0, "com.google.android.gms.backup.BackupTransportService", "com.google.android.gms/.backup.BackupTransportService", context0, new aqjk(context0), arem0);
        }
        else {
            aqxb0 = this;
            aqxb0.b = aqxd.a(aqxb0, "com.google.android.gms.backup.component.D2dTransportService", "com.google.android.gms/.backup.migrate.service.D2dTransport", context0, new aqjk(context0), arem0);
        }
        aqxb0.b.b();
    }

    @Override  // glyq
    public final boolean cancel(boolean z) {
        this.b.a();
        return super.cancel(z);
    }
}

