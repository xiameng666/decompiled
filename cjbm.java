import android.text.TextUtils;

public final class cjbm implements lqj {
    public final cjbn a;

    public cjbm(cjbn cjbn0) {
        this.a = cjbn0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            cjbn cjbn0 = this.a;
            String s = cjbn.B("biometric_error_canceled");
            if(TextUtils.isEmpty(s)) {
                s = cjbn0.getString(0x7F150532);  // string:biometric_canceled "Authentication canceled"
            }
            cjbn0.D(5, s);
            cjbn0.ag.b(Boolean.valueOf(false));
        }
    }
}

