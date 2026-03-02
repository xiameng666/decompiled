import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.auth.proximity.multidevice.SettingsChimeraActivity;
import j..util.Objects;
import java.util.List;

public final class aljs implements gmbg {
    final boolean a;
    final Account b;
    final SettingsChimeraActivity c;

    public aljs(SettingsChimeraActivity settingsChimeraActivity0, boolean z, Account account0) {
        this.a = z;
        this.b = account0;
        Objects.requireNonNull(settingsChimeraActivity0);
        this.c = settingsChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(SettingsChimeraActivity.j.j(), "Could not determine enabled status of Better Together.", throwable0);
        this.c.k = null;
    }

    @Override  // gmbg
    public final void b(Object object0) {
        SettingsChimeraActivity settingsChimeraActivity0 = this.c;
        if(settingsChimeraActivity0.isDestroyed()) {
            return;
        }
        boolean z = false;
        boolean z1 = ((Boolean)((List)object0).get(0)).booleanValue();
        String s = (String)((List)object0).get(1);
        boolean z2 = this.a && ((Boolean)((List)object0).get(2)).booleanValue();
        boolean z3 = this.a && ((Boolean)((List)object0).get(3)).booleanValue();
        boolean z4 = ((Boolean)((List)object0).get(4)).booleanValue();
        boolean z5 = ((Boolean)((List)object0).get(5)).booleanValue();
        boolean z6 = ((Boolean)((List)object0).get(6)).booleanValue();
        boolean z7 = ((Boolean)((List)object0).get(7)).booleanValue();
        if(this.a && ((Boolean)((List)object0).get(8)).booleanValue()) {
            z = true;
        }
        alkt alkt0 = new alkt();
        Bundle bundle0 = new Bundle();
        Account account0 = this.b;
        bundle0.putString("SELECTED_ACCOUNT", (account0 == null ? null : account0.name));
        bundle0.putBoolean("BETTER_TOGETHER_ENABLED", z1);
        bundle0.putString("DEVICE_NAME", s);
        bundle0.putString("ORIGIN", "PHONE_HUB");
        bundle0.putBoolean("WIFI_SYNC_ENABLED", z2);
        bundle0.putBoolean("WIFI_SYNC_SUPPORTED", z3);
        bundle0.putBoolean("HAS_CAMERA_ROLL_CLIENT_SUPPORT", z4);
        bundle0.putBoolean("CAMERA_ROLL_ENABLED", z5);
        bundle0.putBoolean("NOTIFICATIONS_ENABLED", z6);
        bundle0.putBoolean("PERSONAL_PROFILE_SYNC_ENABLED", z7);
        bundle0.putBoolean("WIFI_SYNC_CONTROLLED_BY_TIDEPOOL", z);
        alkt0.setArguments(bundle0);
        ca ca0 = new ca(settingsChimeraActivity0.getSupportFragmentManager());
        ca0.G(0x7F0B14C5, alkt0);  // id:fragment_container
        ca0.b();
        if(account0 != null) {
            settingsChimeraActivity0.runOnUiThread(new aljr(this, account0));
        }
        settingsChimeraActivity0.k = null;
    }
}

