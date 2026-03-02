import android.content.Intent;

public final class fcmn implements gfsi {
    public final fcnm a;
    public final boolean b;

    public fcmn(fcnm fcnm0, boolean z) {
        this.a = fcnm0;
        this.b = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        fcnm fcnm0 = this.a;
        if(this.b) {
            fcnm.a.d("Backup enabled in setup, sending broadcast for gms backup scheduler", new Object[0]);
            Intent intent0 = new Intent("com.google.android.gms.backup.ACTION_BACKUP_ENABLED_ON_WEARABLE").setPackage("com.google.android.gms").putExtra("wearableBackupEnabledInSetup", true);
            fcnm0.b.sendBroadcast(intent0);
            return null;
        }
        fcnm.a.d("Sending broadcast for gms backup scheduler.", new Object[0]);
        Intent intent1 = new Intent("com.google.android.gms.backup.ACTION_BACKUP_ENABLED_ON_WEARABLE").setPackage("com.google.android.gms");
        fcnm0.b.sendBroadcast(intent1);
        return null;
    }
}

