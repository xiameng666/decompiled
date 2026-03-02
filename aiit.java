import android.content.Context;
import android.content.Intent;

public final class aiit {
    private static aiit a;
    private final Context b;

    private aiit(Context context0) {
        this.b = context0;
    }

    public static Intent a(Context context0, String s, int v) {
        Intent intent0 = new Intent("com.google.android.gms.auth.authzen.DEVICE_SYNC_FINISHED").setPackage("com.google.android.gms");
        intent0.putExtra("permit_id", s);
        intent0.putExtra("invocation_reason", v);
        return intent0;
    }

    public static aiit b(Context context0) {
        synchronized(aiit.class) {
            if(aiit.a == null) {
                aiit.a = new aiit(context0.getApplicationContext());
            }
        }
        return aiit.a;
    }

    public final void c(String s, int v) {
        String s1 = String.format("permit://google.com/easyunlock/v1/%s", ajcr.a(s));
        Intent intent0 = aiit.a(this.b, s1, v);
        this.b.sendBroadcast(intent0, "com.google.android.gms.auth.authzen.permission.DEVICE_SYNC_FINISHED");
    }
}

