import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.FileInputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

public final class qpj {
    public static final int a;
    private static final iccd b;

    static {
        qpj.b = icsd.a;
    }

    public static final qop a(gra gra0) {
        return (qop)gra0.a();
    }

    public static final Object b(Context context0, qow qow0, String s, String s1, String s2, String s3, ibrl ibrl0) {
        String s10;
        Object object3;
        Context context3;
        Object object2;
        String s6;
        Context context1;
        String s5;
        String s4;
        qpg qpg0;
        if((ibrl0 instanceof qpg)) {
            qpg0 = (qpg)ibrl0;
            int v = qpg0.d;
            if((v & 0x80000000) == 0) {
                qpg0 = new qpg(ibrl0);
            }
            else {
                qpg0.d = v - 0x80000000;
            }
        }
        else {
            qpg0 = new qpg(ibrl0);
        }
        Object object0 = qpg0.c;
        Object object1 = ibrx.a;
        switch(qpg0.d) {
            case 0: {
                ibnx.b(object0);
                qli qli0 = qpj.e(context0, qow0, s3, false);
                if(qli0 == null) {
                    throw new IllegalArgumentException(a.i(qow0, "Unable to create parsing task for ", "."));
                }
                qpg0.a = context0;
                qpg0.e = s;
                s4 = s1;
                qpg0.f = s4;
                s5 = s2;
                qpg0.b = s5;
                qpg0.d = 1;
                icbk icbk0 = new icbk(ibsc.c(qpg0), 1);
                icbk0.z();
                qli0.d(new qpc(icbk0));
                qli0.c(new qpd(icbk0));
                object0 = icbk0.k();
                if(object0 == object1) {
                    ibsi.b(qpg0);
                }
                if(object0 != object1) {
                    context1 = context0;
                    s6 = s;
                    goto label_44;
                }
                return object1;
            }
            case 1: {
                String s7 = (String)qpg0.b;
                String s8 = qpg0.f;
                String s9 = qpg0.e;
                Context context2 = (Context)qpg0.a;
                ibnx.b(object0);
                s4 = s8;
                s6 = s9;
                s5 = s7;
                context1 = context2;
            label_44:
                qpg0.a = context1;
                qpg0.e = s4;
                qpg0.f = s5;
                qpg0.b = (qkb)object0;
                qpg0.d = 2;
                if(((qkb)object0).c.isEmpty()) {
                    object2 = ibom.a;
                }
                else {
                    qpf qpf0 = new qpf(((qkb)object0), context1, s6, null);
                    object2 = icbd.a(qpj.b, qpf0, qpg0);
                    if(object2 != object1) {
                        object2 = ibom.a;
                    }
                }
                if(object2 != object1) {
                    context3 = context1;
                    object3 = (qkb)object0;
                    s10 = s5;
                    goto label_67;
                }
                return object1;
            }
            case 2: {
                object3 = (qkb)qpg0.b;
                s10 = qpg0.f;
                s4 = qpg0.e;
                context3 = (Context)qpg0.a;
                ibnx.b(object0);
            label_67:
                qpg0.a = object3;
                qpg0.e = null;
                qpg0.f = null;
                qpg0.b = null;
                qpg0.d = 3;
                if(object3.e.isEmpty()) {
                    return ibom.a == object1 ? object1 : object3;
                }
                qpe qpe0 = new qpe(((qkb)object3), context3, s4, s10, null);
                Object object4 = icbd.a(qpj.b, qpe0, qpg0);
                if(object4 != object1) {
                    object4 = ibom.a;
                }
                return object4 == object1 ? object1 : object3;
            }
            case 3: {
                Object object5 = (qkb)qpg0.a;
                ibnx.b(object0);
                return object5;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final String c(String s) {
        if(s != null) {
            if(ibzk.D(s)) {
                return null;
            }
            return ibzk.H(s, '/') ? s : s + "/";
        }
        return null;
    }

    public static final qok d(qow qow0, goz goz0, int v) {
        gra gra0;
        qow qow1;
        goz0.M(0xB595CDFE);
        goz0.M(0x6E3C21FE);
        Object object0 = goz0.k();
        Object object1 = gop.a;
        if(object0 == object1) {
            object0 = new qph(null);
            goz0.R(object0);
        }
        goz0.A();
        Context context0 = (Context)goz0.h(AndroidCompositionLocals_androidKt.b);
        goz0.M(5004770);
        int v1 = v & 14 ^ 6;
        int v2 = 0;
        boolean z = v1 > 4 && goz0.X(qow0) || (v & 6) == 4;
        Object object2 = goz0.k();
        if(z || object2 == object1) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(new qop(), gul.a);
            goz0.R(parcelableSnapshotMutableState0);
            object2 = parcelableSnapshotMutableState0;
        }
        goz0.A();
        goz0.M(-1633490746);
        int v3 = ((v1 <= 4 || !goz0.X(qow0)) && (v & 6) != 4 ? 0 : 1) | goz0.X("__LottieInternalDefaultCacheKey__");
        Object object3 = goz0.k();
        if(v3 != 0 || object3 == object1) {
            object3 = qpj.e(context0, qow0, "__LottieInternalDefaultCacheKey__", true);
            goz0.R(object3);
        }
        qli qli0 = (qli)object3;
        goz0.A();
        goz0.M(-1224400529);
        int v4 = goz0.X(((gra)object2)) | goz0.Z(((ibtx)object0)) | goz0.Z(context0);
        if(v1 > 4 && goz0.Z(qow0) || (v & 6) == 4) {
            v2 = 1;
        }
        int v5 = v4 | v2 | goz0.X(null) | goz0.X("fonts/") | goz0.X(".ttf") | goz0.X("__LottieInternalDefaultCacheKey__");
        Object object4 = goz0.k();
        if(v5 == 0 && object4 != object1) {
            qow1 = qow0;
            gra0 = (gra)object2;
        }
        else {
            qow1 = qow0;
            gra0 = (gra)object2;
            qpi qpi0 = new qpi(((ibtx)object0), context0, qow1, gra0, null);
            goz0.R(qpi0);
            object4 = qpi0;
        }
        goz0.A();
        gqe.e(qow1, "__LottieInternalDefaultCacheKey__", ((ibtw)object4), goz0);
        qok qok0 = qpj.a(gra0);
        goz0.A();
        return qok0;
    }

    private static final qli e(Context context0, qow qow0, String s, boolean z) {
        if((qow0 instanceof qou)) {
            return ibuq.m(s, "__LottieInternalDefaultCacheKey__") ? qkm.j(context0, ((qou)qow0).a) : qkm.k(context0, ((qou)qow0).a, s);
        }
        if((qow0 instanceof qov)) {
            return ibuq.m(s, "__LottieInternalDefaultCacheKey__") ? qkm.l(context0, ((qov)qow0).a) : qkm.m(context0, ((qov)qow0).a, s);
        }
        if((qow0 instanceof qos)) {
            if(z) {
                return null;
            }
            String s1 = ((qos)qow0).a;
            FileInputStream fileInputStream0 = new FileInputStream(s1);
            if(ibuq.m(s, "__LottieInternalDefaultCacheKey__")) {
                s = s1;
            }
            if(ibzk.J(s1, "zip")) {
                return qkm.n(new ZipInputStream(fileInputStream0), s);
            }
            return ibzk.J(s1, "tgs") ? qkm.i(new GZIPInputStream(fileInputStream0), s) : qkm.i(fileInputStream0, s);
        }
        if((qow0 instanceof qoq)) {
            if(ibuq.m(s, "__LottieInternalDefaultCacheKey__")) {
                qoq qoq0 = (qoq)qow0;
                throw null;
            }
            qoq qoq1 = (qoq)qow0;
            throw null;
        }
        if((qow0 instanceof qot)) {
            if(ibuq.m(s, "__LottieInternalDefaultCacheKey__")) {
                s = String.valueOf(((qot)qow0).a.hashCode());
            }
            return qkm.f(s, new qkl(((qot)qow0).a, s), null);
        }
        if(!(qow0 instanceof qor)) {
            throw new ibnq();
        }
        context0.getContentResolver();
        qor qor0 = (qor)qow0;
        throw null;
    }
}

