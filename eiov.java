import android.content.Context;
import android.os.Build;

public final class eiov {
    public static eiox a(Context context0) {
        if(!context0.isDeviceProtectedStorage()) {
            context0 = context0.createDeviceProtectedStorageContext();
        }
        return eiov.d(context0);
    }

    public static eiox b(Context context0) {
        if(fhcd.g(context0)) {
            context0 = context0.createDeviceProtectedStorageContext();
        }
        return eiov.d(context0);
    }

    public static eiox c(Context context0, eipl eipl0, eipm eipm0) {
        int v;
        new bbll(1, 10);
        if(!((Boolean)((gful_cronetEngineProvider)new eiou()).mr()).booleanValue()) {
            v = 0;
        }
        else if(hxki.a.c().d()) {
            v = 1003;
        }
        else {
            v = 1002;
        }
        eiox eiox0 = new eiox(context0, v + 0x20, eipl0, eipm0);
        gfsx gfsx0 = bboo.k(eiox0.g);
        if(gfsx0.i()) {
            long v1 = (long)(((Long)gfsx0.d()));
            if(!"robolectric".equals(Build.FINGERPRINT)) {
                synchronized(eiox0) {
                    if(eiox0.j != null && eiox0.j.isOpen()) {
                        throw new IllegalStateException("Connection timeout setting cannot be changed after opening the database");
                    }
                    eiox0.h.setIdleConnectionTimeout(v1);
                }
                return eiox0;
            }
        }
        return eiox0;
    }

    private static eiox d(Context context0) {
        eiox eiox1;
        boolean z = context0.isDeviceProtectedStorage();
        synchronized(eiox.b) {
            if(z) {
                eiox eiox0 = eiox.c;
                if(eiox0 == null) {
                    eiox0 = eiov.c(context0, new eipk(), new eipm());
                    eiox.c = eiox0;
                }
                ++eiox0.k;
                return eiox0;
            }
            eiox1 = eiox.d;
            if(eiox1 == null) {
                eiox1 = eiov.c(context0, new eipk(), new eipm());
                eiox.d = eiox1;
            }
            ++eiox1.k;
        }
        return eiox1;
    }
}

