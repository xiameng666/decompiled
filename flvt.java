import android.content.Context;

public final class flvt {
    static final iaoa a;
    private static flvt b;

    static {
        flvt.a = new ianv("google.internal.communications.instantmessaging.v1.tachyonerror-bin", new flvs());
        flvt.b = null;
    }

    public final int a(Context context0, Throwable throwable0) {
        if(!flct.a(context0)) {
            return 6;
        }
        if((throwable0.getCause() instanceof acse)) {
            return 7;
        }
        return (throwable0 instanceof flvi) ? 8 : 9;
    }

    public static flvt b() {
        if(flvt.b == null) {
            flvt.b = new flvt();
        }
        return flvt.b;
    }

    public final int c(Throwable throwable0) {
        iaof_metadata iaof0 = iapk.a(throwable0);
        if(iaof0 == null) {
            return 2;
        }
        hnxn hnxn0 = (hnxn)iaof0.d(flvt.a);
        if(hnxn0 != null) {
            int v = hnxn0.b;
            int v1 = iddr.a(v);
            if(v1 == 0) {
                return 2;
            }
            if(v1 != 1) {
                int v2 = iddr.a(v);
                return v2 == 0 ? 1 : v2;
            }
        }
        return 2;
    }
}

