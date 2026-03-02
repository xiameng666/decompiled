import android.content.Context;
import android.content.Intent;

public final class ctlh implements ctlj {
    public static final Intent a;
    public final Context b;

    static {
        Intent intent0 = new Intent("com.google.ambient.streaming.action.BIND_SIGNALING").setPackage("com.google.ambient.streaming");
        ibuq.e(intent0, "setPackage(...)");
        ctlh.a = intent0;
    }

    public ctlh(Context context0) {
        this.b = context0;
        ctnb.a("AppCast", new ibuk(this.getClass()));
    }

    @Override  // ctlj
    public final icig a(String s, icig icig0) {
        ibuq.f(icig0, "messages");
        return new ichv(new ctlg(this, icig0, s, null));
    }
}

