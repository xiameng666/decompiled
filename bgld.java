import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;

public final class bgld implements DialogInterface.OnClickListener {
    public final bgln a;
    public final bglh b;
    public final bglk c;

    public bgld(bgln bgln0, bglh bglh0, bglk bglk0) {
        this.a = bgln0;
        this.b = bglh0;
        this.c = bglk0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        byte[] arr_b;
        bgli bgli0 = (bgli)this.b.getItem(v);
        gftb.check(bgli0);
        String s = bgli0.a;
        try {
            arr_b = bbms.n(this.a.a, s, "SHA-512");
            if(arr_b == null) {
                goto label_7;
            }
            else {
                goto label_5;
            }
            goto label_8;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            goto label_7;
        }
    label_5:
        gfsx gfsx0 = gfsx.m(String.format("android://%s@%s/", Base64.encodeToString(arr_b, 10), s));
        goto label_8;
    label_7:
        gfsx0 = gfqx.a;
    label_8:
        if(gfsx0.i()) {
            bglj bglj0 = new bglj(((String)gfsx0.d()), bgli0.b, bgli0.c);
            this.c.a(bglj0);
        }
    }
}

