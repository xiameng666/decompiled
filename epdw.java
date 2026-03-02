import android.content.Context;
import android.provider.Settings.Secure;

public final class epdw extends epeg {
    public final epfc a;
    public final boolean b;

    public epdw(Context context0, epfc epfc0, boolean z) {
        super(context0);
        this.a = epfc0;
        this.b = z;
    }

    @Override  // epeg
    protected final void a(boolean z) {
        Settings.Secure.putInt(this.d.getContentResolver(), "automatic_storage_manager_enabled", ((int)z));
    }
}

