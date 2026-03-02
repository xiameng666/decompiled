import android.text.TextUtils;

final class crbx {
    public final crly a;

    public crbx(crly crly0) {
        this.a = crly0;
    }

    static crbx a(String s) {
        return TextUtils.isEmpty(s) || s.length() > 1 ? new crbx(crly.a) : new crbx(crmb.e(s.charAt(0)));
    }
}

