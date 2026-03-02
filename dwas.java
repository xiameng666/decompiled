import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;

public final class dwas implements Runnable {
    public final dwat a;
    public final Uri b;
    public final gfsx c;

    public dwas(dwat dwat0, Uri uri0, gfsx gfsx0) {
        this.a = dwat0;
        this.b = uri0;
        this.c = gfsx0;
    }

    @Override
    public final void run() {
        dwat dwat0 = this.a;
        xob xob0 = dwat0.an();
        if(xob0 == null) {
            return;
        }
        gfsx gfsx0 = this.c;
        int v = dwat0.aj;
        Intent intent0 = new Intent("com.google.android.gms.pay.pass.valuable.view.mutate.enter.VIEW_VALUABLE_ENTER_GENERIC_PASS", this.b).setClassName(xob0, "com.google.android.gms.pay.main.PayActivity").putExtra("USER_CREATED_PASS_ORIGIN", v);
        if(gfsx0.i()) {
            intent0.putExtra("BARCODE", ((Parcelable)gfsx0.d()));
        }
        dwat0.startActivity(intent0);
    }
}

