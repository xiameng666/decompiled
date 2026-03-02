import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;

final class dlzi implements dmba {
    private final Context a;

    public dlzi(Context context0) {
        this.a = context0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        int v2;
        boolean z;
        int v1;
        gftb.b(hjwe0.b == 12, "cannot evaluate: does not have package filter");
        String s = (hjwe0.b == 12 ? ((hjum)hjwe0.c) : hjum.a).c;
        int v = (hjwe0.b == 12 ? ((hjum)hjwe0.c) : hjum.a).d;
        PackageManager packageManager0 = this.a.getPackageManager();
        try {
            v1 = 0;
            z = false;
            v1 = packageManager0.getPackageInfo(s, 0).versionCode;
            z = true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        switch((hjwe0.b == 12 ? ((hjum)hjwe0.c) : hjum.a).b) {
            case 0: {
                v2 = 2;
                break;
            }
            case 1: {
                v2 = 3;
                break;
            }
            case 2: {
                v2 = 4;
                break;
            }
            case 3: {
                v2 = 5;
                break;
            }
            case 4: {
                v2 = 6;
                break;
            }
            default: {
                v2 = 0;
            }
        }
        if(v2 == 0) {
            v2 = 1;
        }
        switch(v2 - 2) {
            case 1: {
                return z;
            }
            case 2: {
                return !z;
            }
            case 3: {
                return z && v1 >= v;
            }
            case 4: {
                return z && v1 <= v;
            }
            default: {
                return false;
            }
        }
    }
}

