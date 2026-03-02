import android.content.Context;
import android.content.Intent;

final class eijd {
    private final Context a;

    public eijd(Context context0) {
        this.a = context0;
    }

    public final void a() {
        Intent intent0 = new Intent("com.google.android.gms.personalsafety.ACTION_DATA_CHANGED");
        intent0.setPackage("com.google.android.gms");
        this.a.sendBroadcast(intent0, "com.google.android.gms.permission.INTERNAL_BROADCAST");
    }
}

