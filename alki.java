import android.accounts.Account;
import android.os.Bundle;
import j..util.Objects;
import java.util.List;

final class alki implements gmbg {
    final boolean a;
    final boolean b;
    final Account c;
    final alkj d;
    final alkl e;

    public alki(alkl alkl0, boolean z, boolean z1, Account account0, alkj alkj0) {
        this.a = z;
        this.b = z1;
        this.c = account0;
        this.d = alkj0;
        Objects.requireNonNull(alkl0);
        this.e = alkl0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(alkl.a.j(), "Could not determine enabled status of Better Together.", throwable0);
        this.e.b = null;
    }

    @Override  // gmbg
    public final void b(Object object0) {
        boolean z = false;
        boolean z1 = ((Boolean)((List)object0).get(0)).booleanValue();
        String s = (String)((List)object0).get(1);
        boolean z2 = this.a && ((Boolean)((List)object0).get(2)).booleanValue();
        boolean z3 = this.a && ((Boolean)((List)object0).get(3)).booleanValue();
        boolean z4 = this.b;
        boolean z5 = z4 && ((Boolean)((List)object0).get(4)).booleanValue();
        boolean z6 = ((Boolean)((List)object0).get(5)).booleanValue();
        boolean z7 = ((Boolean)((List)object0).get(6)).booleanValue();
        boolean z8 = ((aldk)((List)object0).get(7)) == aldk.c;
        boolean z9 = ((Boolean)((List)object0).get(8)).booleanValue();
        boolean z10 = ((Boolean)((List)object0).get(9)).booleanValue();
        if(this.a && ((Boolean)((List)object0).get(10)).booleanValue()) {
            z = true;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("SELECTED_ACCOUNT", (this.c == null ? null : this.c.name));
        bundle0.putBoolean("BETTER_TOGETHER_ENABLED", z1);
        bundle0.putString("DEVICE_NAME", s);
        bundle0.putString("ORIGIN", "PHONE_HUB");
        bundle0.putBoolean("WIFI_SYNC_ENABLED", z2);
        bundle0.putBoolean("WIFI_SYNC_SUPPORTED", z3);
        bundle0.putBoolean("EXO_AVAILABLE", z4);
        if(!hpzc.c()) {
            bundle0.putBoolean("EXO_ENABLED", z5);
        }
        bundle0.putBoolean("EXO_ASSOCIATED", z8);
        bundle0.putBoolean("HAS_CAMERA_ROLL_CLIENT_SUPPORT", z6);
        bundle0.putBoolean("CAMERA_ROLL_ENABLED", z7);
        bundle0.putBoolean("NOTIFICATIONS_ENABLED", z9);
        bundle0.putBoolean("PERSONAL_PROFILE_SYNC_ENABLED", z10);
        bundle0.putBoolean("WIFI_SYNC_CONTROLLED_BY_TIDEPOOL", z);
        this.e.b = null;
        this.d.b(bundle0);
    }
}

