import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

public final class goxn {
    public final String a;
    public final String b;

    public goxn(Context context0, String s) {
        batl.s(context0);
        byte[] arr_b;
        batl.q(s);
        this.a = s;
        try {
            arr_b = bbms.n(context0, s, "SHA1");
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.e("FBA-PackageInfo", "no pkg: " + s);
            this.b = null;
            return;
        }
        if(arr_b == null) {
            Log.e("FBA-PackageInfo", "single cert required: " + s);
            this.b = null;
            return;
        }
        this.b = bboy.e(arr_b);
    }
}

