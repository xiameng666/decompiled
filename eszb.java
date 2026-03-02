import android.content.ComponentName;
import android.content.Intent;

public final class eszb {
    public final xob a;

    public eszb(xob xob0) {
        this.a = xob0;
    }

    public static void a(xob xob0, int v) {
        xob0.startActivityForResult(new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT").putExtra("category", "payment").putExtra("component", new ComponentName("com.google.android.gms", "com.google.android.gms.tapandpay.hce.service.TpHceService")), v);
    }

    public final boolean b() {
        return evjg.e(this.a);
    }
}

