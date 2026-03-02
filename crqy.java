import android.content.Context;
import android.os.Bundle;

public final class crqy {
    private static volatile crqy a;
    private final crkt b;

    public crqy(crkt crkt0) {
        batl.s(crkt0);
        this.b = crkt0;
    }

    public static crqy a(Context context0) {
        if(crqy.a == null) {
            Class class0 = crqy.class;
            synchronized(class0) {
                if(crqy.a == null) {
                    crqy.a = new crqy(crkt.i(context0));
                }
            }
            return crqy.a;
        }
        return crqy.a;
    }

    public final void b(String s, String s1, Bundle bundle0, String s2) {
        batl.q(s2);
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        this.b.j().v(s, s1, bundle0, s2);
    }
}

