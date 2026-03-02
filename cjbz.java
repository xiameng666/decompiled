import android.content.Context;

public final class cjbz {
    public final cjca a(Context context0) {
        cjca cjca1;
        ibuq.f(context0, "context");
        caed caed0 = new caed(context0);
        cjca cjca0 = cjca.b;
        if(cjca0 == null) {
            synchronized(this) {
                cjca1 = cjca.b;
                if(cjca1 == null) {
                    ibuq.e(context0.getApplicationContext(), "getApplicationContext(...)");
                    cjca1 = new cjca(caed0);
                    cjca.b = cjca1;
                }
            }
            return cjca1;
        }
        return cjca0;
    }
}

