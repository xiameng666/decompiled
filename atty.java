import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cast.activity.CastConnectionDialogControl.ConnectionDialogReceiver;

public final class atty {
    public final avjh a;
    public final Context b;
    public int c;
    public final audi d;
    private final CastConnectionDialogControl.ConnectionDialogReceiver e;

    public atty(Context context0, audi audi0, String s) {
        this.b = context0;
        this.d = audi0;
        this.a = new avjh("CastConnDialogControl", s);
        this.c = 1;
        this.e = new CastConnectionDialogControl.ConnectionDialogReceiver(this);
    }

    public final void a() {
        if(this.c == 1) {
            return;
        }
        this.e.b();
        this.c = 2;
        this.c(0, null, -1);
    }

    public final void b(int v, String s, int v1) {
        this.e.b();
        this.c = 3;
        this.c(v, s, v1);
    }

    private final void c(int v, String s, int v1) {
        synchronized(this) {
            this.a.c("Sending intent with cast connection dialog operation %d for %s", new Object[]{v, s});
            Intent intent0 = new Intent("com.google.android.gms.cast.activity.CAST_CONNECTION_NOTIFY");
            intent0.addFlags(0x34050000);
            Context context0 = this.b;
            intent0.setClassName("com.google.android.gms", "com.google.android.gms.cast.activity.CastPopupActivity");
            intent0.putExtra("com.google.android.gms.cast.activity.DIALOG_KEY_OPERATION", v);
            if(s != null) {
                intent0.putExtra("com.google.android.gms.cast.session.DIALOG_KEY_REMOTE_DEVICE_NAME", s);
            }
            if(v1 != -1) {
                intent0.putExtra("com.google.android.gms.cast.session.DIALOG_KEY_STATUS_CODE", v1);
            }
            intent0.setPackage("com.google.android.gms");
            context0.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            context0.startActivity(intent0);
        }
    }
}

