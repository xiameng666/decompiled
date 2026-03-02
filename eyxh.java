import android.os.Bundle;

public final class eyxh implements ibts {
    public final Bundle a;

    public eyxh(Bundle bundle0) {
        this.a = bundle0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((eyxs)object0), "it");
        ((ggtj)((eyxs)object0).c.h()).x("AccountsSelector (ExpressSignIn) saveState");
        fnzx fnzx0 = ((eyxs)object0).d.b;
        Object object1 = fnzx0.b.a();
        Bundle bundle0 = this.a;
        if(object1 != null) {
            String s = fnzx0.f.a.c(object1);
            bundle0.putString(foab.a, s);
            return ibom.a;
        }
        bundle0.remove(foab.a);
        return ibom.a;
    }
}

