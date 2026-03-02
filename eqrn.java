import android.content.Context;
import com.google.android.gms.chimera.modules.smartdevice.AppContextProvider;

public final class eqrn {
    private static volatile eqlf a;

    public static cuvm a(Context context0, String s) {
        cuvs cuvs0 = new cuvs();
        cuvs0.a = s;
        return cumi.a(context0, new cuvt(cuvs0));
    }

    public static eqlf b(Context context0) {
        if(eqrn.a == null) {
            Class class0 = eqrn.class;
            synchronized(class0) {
                if(eqrn.a == null) {
                    eqrn.a = new eqlf(context0);
                }
            }
            return eqrn.a;
        }
        return eqrn.a;
    }

    public static erqj c() {
        return erqj.a(AppContextProvider.a());
    }

    public static erql d(Context context0) {
        return new erql(context0, eqrn.c());
    }
}

