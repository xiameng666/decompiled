import android.accounts.Account;
import android.content.SharedPreferences;
import j..util.Objects;
import java.util.Set;

public final class bwlz extends bwzp {
    final bwmx a;

    public bwlz(bwmx bwmx0, gltq gltq0) {
        Objects.requireNonNull(bwmx0);
        this.a = bwmx0;
        super(gltq0);
    }

    @Override  // bwzp
    public final void w() {
        bwmx bwmx0 = this.a;
        bxax bxax0 = bwmx0.f;
        if(bxax0 == null) {
            bwne.s("Null \'settings\', unable to handle GServices changes");
            return;
        }
        bwuc bwuc0 = bwmx0.l;
        if(bwuc0 == null) {
            bwne.s("Null \'clients\', unable to handle GServices changes");
            return;
        }
        SharedPreferences sharedPreferences0 = bxax0.c;
        if(bwvu.b() != sharedPreferences0.getBoolean("enabled-appdatasearch-corpora-with-whitelist", false)) {
            bwne.b("Need to reparse resources because appdataseach corpora with whitelist was %s.", (bwvu.b() ? "enabled" : "disabled"));
            Set set0 = bxax0.r();
            bwuv.c(true, bwuc0, ((Account[])set0.toArray(new Account[set0.size()])), false, bwmx0.y);
            boolean z = bwvu.b();
            sharedPreferences0.edit().putBoolean("enabled-appdatasearch-corpora-with-whitelist", z).commit();
        }
        bwuc0.p();
    }
}

