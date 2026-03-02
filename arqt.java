import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import j..util.DesugarCollections;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

public final class arqt {
    final Map a;
    public static final int b;
    private static final baun c;

    static {
        arqt.c = aqql.a("DataFlavorRepository");
    }

    private arqt() {
        this.a = new EnumMap(aqfx.class);
    }

    public final arqo a(asbk asbk0) {
        aqfx aqfx0 = aqhj.a(asbk0);
        return (arqo)this.a.get(aqfx0);
    }

    public static arqt b(Context context0, arfk arfk0, arem arem0, aqrx aqrx0, arkn arkn0, arjs arjs0, gmcg gmcg0) {
        Context context1;
        arqt arqt0 = new arqt();
        gmcd gmcd0 = new bblp(1, 9).e(new arqs(context0));
        if(Build.VERSION.SDK_INT < 33 || !hqhq.t()) {
            if(arqt.g(context0)) {
            label_6:
                if(cjmf.b(context0, "android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    arqx arqx0 = new arqx(new arqp(gmcd0));
                    if(hqhq.a.j().ay()) {
                        arqt0.e(aqfx.c, arqx0);
                    }
                }
            }
        }
        else if(cjmf.b(context0, "android.permission.READ_MEDIA_IMAGES") == 0 && cjmf.b(context0, "android.permission.READ_MEDIA_VIDEO") == 0) {
            goto label_6;
        }
        if(Build.VERSION.SDK_INT < 33 || !hqhq.t()) {
            if(arqt.g(context0)) {
            label_14:
                arqx arqx1 = new arqx(new arqq(gmcd0));
                if(hqhq.a.j().au()) {
                    arqt0.e(aqfx.f, arqx1);
                }
            }
        }
        else if(cjmf.b(context0, "android.permission.READ_MEDIA_AUDIO") == 0) {
            goto label_14;
        }
        if(hqhq.n()) {
            arql arql0 = new arql(Environment.DIRECTORY_DOCUMENTS, new arjm(new arji(context0, aqql.a("ExternalStorageCustomD2DApiClient"))));
            arqt0.e(aqfx.e, arql0);
            arqt.c.h("Documents flavor enabled on the source side.", new Object[0]);
        }
        if(hqhq.a.j().ao()) {
            arqn arqn0 = new arqn(aqrx0);
            arqt0.e(aqfx.b, arqn0);
        }
        if(hqhq.m()) {
            context1 = context0;
            arqb arqb0 = new arqb(context1, arfk0, arem0, new arfi(context0), new argz(context0), new arqd(arfk0, gmcg0));
            arqt0.e(aqfx.g, arqb0);
        }
        else {
            context1 = context0;
        }
        arqy arqy0 = new arqy(context1.getContentResolver());
        arqt0.e(aqfx.i, arqy0);
        if(hqhq.x()) {
            arpz arpz0 = new arpz(arkn0);
            arqt0.e(aqfx.h, arpz0);
        }
        arrd arrd0 = new arrd(context1, new azts(context1, null), new etgl(context1));
        arqt0.e(aqfx.j, arrd0);
        arps arps0 = new arps(arjs0);
        arqt0.e(aqfx.k, arps0);
        return arqt0;
    }

    public final Collection c() {
        return DesugarCollections.unmodifiableSet(this.a.keySet());
    }

    public final void d(boolean z) {
        if(z) {
            this.f(aqfx.i);
            arqb arqb0 = (arqb)this.a.get(aqfx.g);
            if(arqb0 == null) {
                return;
            }
            arqb.a.h("Rolling back prepared Telephony package updates for Android Messages transfer.", new Object[0]);
            arqb0.h = false;
            arqb0.g.remove("com.android.providers.telephony");
            arqb0.d.i("com.android.providers.telephony", 11);
            return;
        }
        this.f(aqfx.k);
    }

    private final void e(aqfx aqfx0, arqo arqo0) {
        this.a.put(aqfx0, arqo0);
    }

    private final void f(aqfx aqfx0) {
        this.a.remove(aqfx0);
    }

    private static boolean g(Context context0) {
        return cjmf.b(context0, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }
}

