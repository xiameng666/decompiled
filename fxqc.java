import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class fxqc {
    public boolean a;
    private final Context b;
    private final PendingIntent c;
    private final Account d;

    private fxqc(Context context0, PendingIntent pendingIntent0, Account account0) {
        this.b = context0;
        batl.s(pendingIntent0);
        this.c = pendingIntent0;
        this.d = account0;
    }

    public static fxqc a(Context context0, Account account0) {
        Intent intent0 = fxtk.b(context0, "com.google.android.location.reporting.ACTION_PLACE_INFERENCE", "placeInferences");
        if(account0 != null) {
            intent0.setData(Uri.fromParts("mailto:", account0.name, account0.type));
        }
        return new fxqc(context0, PendingIntent.getService(context0, 0, intent0, 0xA000000), account0);
    }

    public final void b() {
        if(this.a) {
            return;
        }
        cnnl cnnl0 = cnnx.b(this.b);
        cnnv cnnv0 = new cnnv();
        cnnv0.c = (int)hzdv.b();
        cnnl0.h(cnnv0.a(), this.c).z(new fxqa(this));
    }

    public final void c() {
        if(!this.a) {
            return;
        }
        if(hzeq.a.b().i()) {
            cnnx.b(this.b).f(this.c).z(new fxqb(this));
        }
    }
}

