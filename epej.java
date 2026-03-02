import android.content.Context;
import android.content.Intent;

public final class epej extends epeg {
    public final boolean a;

    public epej(Context context0, boolean z) {
        super(context0);
        this.a = z;
    }

    @Override  // epeg
    protected final void a(boolean z) {
        Intent intent0 = new Intent("com.google.android.systemui.GRANT_WALLPAPER_PERMISSIONS");
        intent0.setPackage("com.android.systemui");
        intent0.putExtra("opted_in", z);
        this.d.sendBroadcast(intent0);
    }
}

