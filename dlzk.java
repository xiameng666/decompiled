import android.content.Context;
import android.content.pm.PackageManager;

public final class dlzk implements dmba {
    private final PackageManager a;

    public dlzk(Context context0) {
        ibuq.f(context0, "context");
        super();
        PackageManager packageManager0 = context0.getPackageManager();
        ibuq.e(packageManager0, "getPackageManager(...)");
        this.a = packageManager0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        int v1;
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        gftb.g(hjwe0.b == 35, "Cannot evaluate filter that is not package permission filter", new Object[0]);
        String s = (hjwe0.b == 35 ? ((hjun)hjwe0.c) : hjun.a).c;
        ibuq.e(s, "getPermission(...)");
        String s1 = (hjwe0.b == 35 ? ((hjun)hjwe0.c) : hjun.a).d;
        ibuq.e(s1, "getPackageName(...)");
        int v = this.a.checkPermission(s, s1);
        switch((hjwe0.b == 35 ? ((hjun)hjwe0.c) : hjun.a).b) {
            case 0: {
                v1 = 2;
                break;
            }
            case 1: {
                v1 = 3;
                break;
            }
            case 2: {
                v1 = 4;
                break;
            }
            default: {
                v1 = 0;
            }
        }
        if(v1 == 0) {
            v1 = 1;
        }
        switch(v1 - 2) {
            case 1: {
                return v == 0;
            }
            case 2: {
                return v == -1;
            }
            default: {
                return false;
            }
        }
    }
}

