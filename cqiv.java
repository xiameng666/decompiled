import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;

public final class cqiv {
    public final yzx a;

    public cqiv(yzx yzx0) {
        this.a = yzx0;
    }

    public final Boolean a(Context context0) {
        if(!fhcd.g(context0)) {
            SharedPreferences sharedPreferences0 = cqix.a(context0);
            yzx yzx0 = this.a;
            if(!sharedPreferences0.contains(yzx0.b)) {
                this.b(((Boolean)yzx0.c()).booleanValue(), context0);
            }
            return (Boolean)yzx0.c();
        }
        return Boolean.valueOf(cqix.a(context0).getBoolean(this.a.b, false));
    }

    public final void b(boolean z, Context context0) {
        if(((UserManager)context0.getSystemService("user")).isSystemUser()) {
            cqix.a(context0).edit().putBoolean(this.a.b, z).commit();
        }
    }
}

