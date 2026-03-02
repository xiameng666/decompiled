import com.google.android.gms.trustagent.activeunlock.primary.ui.authentication.AuthenticationFragment;

public final class eyne implements ibts {
    public final AuthenticationFragment a;

    public eyne(AuthenticationFragment authenticationFragment0) {
        this.a = authenticationFragment0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((Integer)object0));
        int v = (int)(((Integer)object0));
        this.a.d = v;
        alo alo0 = new alo(this.a, this.a.ag);
        all all0 = new all();
        all0.i = 0x8000;
        all0.d = this.a.getString(0x7F15080C);  // string:common_confirm_screen_lock_title "Confirm your screen lock"
        all0.e = this.a.getString((v == 0x7F0B0ADA ? 0x7F150359 : 0x7F15035A));  // id:action_global_to_enrolledDeviceList
        alo0.c(all0.a());
        return ibom.a;
    }
}

