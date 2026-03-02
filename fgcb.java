import android.content.Context;
import android.os.Build;

public final class fgcb implements fgcf {
    @Override  // fgcf
    public final fgcg a(Context context0) {
        return new fgcc(context0);
    }

    @Override  // fgcf
    public final boolean b(Context context0) {
        int v = context0.getApplicationInfo().uid;
        return v != -1 && !Build.FINGERPRINT.equals("robolectric") && context0.checkUriPermission(fgcc.a, 0, v, 1) == 0;
    }
}

