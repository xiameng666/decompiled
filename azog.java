import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import j..util.Optional;

public final class azog {
    private final Context a;

    public azog(Context context0) {
        this.a = context0;
    }

    public final Optional a(String s) {
        Optional optional0;
        try {
            optional0 = Optional.of(this.a.getPackageManager().getPackageInfo(s, 0));
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            optional0 = Optional.empty();
        }
        if(optional0.isEmpty()) {
            return Optional.empty();
        }
        return gfta.c(((PackageInfo)optional0.get()).versionName) ? Optional.of(String.valueOf(((PackageInfo)optional0.get()).getLongVersionCode())) : Optional.of(((PackageInfo)optional0.get()).versionName);
    }
}

