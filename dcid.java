import com.google.android.gms.nearby.sharing.NotificationChimeraBroadcastReceiver;

public final class dcid implements evqc {
    public final NotificationChimeraBroadcastReceiver a;
    public final int b;

    public dcid(NotificationChimeraBroadcastReceiver notificationChimeraBroadcastReceiver0, int v) {
        this.a = notificationChimeraBroadcastReceiver0;
        this.b = v;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        this.a.b.e("nearby_sharing", this.b);
    }
}

