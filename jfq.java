import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Objects;

public final class jfq implements jde {
    public static final jfq a;

    static {
        jfq.a = new jfq();
    }

    @Override  // jde
    public final Typeface a(Context context0, jdf jdf0) {
        Objects.toString(jdf0);
        throw new IllegalStateException("GoogleFont only support async loading: " + jdf0);
    }

    @Override  // jde
    public final Object b(Context context0, jdf jdf0, ibrl ibrl0) {
        int v;
        if(!(jdf0 instanceof jfn)) {
            throw new IllegalArgumentException("Only GoogleFontImpl supported (actual " + jdf0 + ')');
        }
        jzp jzp0 = new jzp("name=" + ((jfn)jdf0).c + "&weight=" + ((jfn)jdf0).e.l + "&italic=" + ((int)jem.b(((jfn)jdf0).f, 1)) + "&besteffort=true");
        boolean z = jem.b(((jfn)jdf0).f, 1);
        boolean z1 = ((jfn)jdf0).e.a(jeu.k) >= 0;
        if(!z) {
        label_9:
            if(z) {
                v = 2;
            }
            else {
                v = z1 ? 1 : 0;
            }
        }
        else if(z1) {
            v = 3;
        }
        else {
            z1 = false;
            goto label_9;
        }
        icbk icbk0 = new icbk(ibsc.c(ibrl0), 1);
        icbk0.z();
        jfp jfp0 = new jfp(icbk0, jdf0);
        Looper looper0 = Looper.myLooper();
        if(looper0 == null) {
            looper0 = Looper.getMainLooper();
        }
        Handler handler0 = Handler.createAsync(looper0);
        ArrayList arrayList0 = new ArrayList(1);
        arrayList0.add(j..util.Objects.requireNonNull(jzp0));
        kaa.a(context0, DesugarCollections.unmodifiableList(arrayList0), v, false, 0, handler0, jfp0);
        Object object0 = icbk0.k();
        if(object0 == ibrx.a) {
            ibsi.b(ibrl0);
        }
        return object0;
    }
}

