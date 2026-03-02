import android.content.Context;

public final class htco implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        String s;
        Object object1 = htcp.b;
        if(object1 == null) {
            synchronized(htcp.class) {
                s = htcp.b;
                if(s == null) {
                    s = fpib.c(((Context)object0), "com.google.android.gms.gaia_experiments");
                    htcp.b = s;
                }
            }
            return s;
        }
        return object1;
    }
}

