import android.accounts.Account;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;
import j..util.Objects;

public final class aljt implements gmbg {
    final SettingsChimeraActivity a;

    public aljt(SettingsChimeraActivity settingsChimeraActivity0) {
        Objects.requireNonNull(settingsChimeraActivity0);
        this.a = settingsChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(SettingsChimeraActivity.j.j(), "Could not determine initial account to display for Better Together settings.", throwable0);
        this.a.l = null;
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.a.a(((Account)object0));
        this.a.l = null;
    }
}

