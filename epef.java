import android.content.Context;
import android.provider.Settings.Secure;

public final class epef extends epeg {
    public final epfc a;
    public final boolean b;

    public epef(Context context0, epfc epfc0, boolean z) {
        super(context0);
        this.a = epfc0;
        this.b = z;
    }

    @Override  // epeg
    protected final void a(boolean z) {
        Context context0 = this.d;
        Settings.Secure.putInt(context0.getContentResolver(), "package_verifier_user_consent", ((int)z));
        Settings.Secure.putInt(context0.getContentResolver(), "package_verifier_enable", 1);
    }
}

