import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class flxd {
    public static fltq a(AccountContext accountContext0, Context context0, hnsd hnsd0, flsl flsl0, long v) {
        gfsx gfsx3;
        hnve hnve0;
        int v2;
        int v1;
        fltp fltp0 = new fltp(null);
        fltp0.f(hnsd0.c);
        fltp0.b((hnsd0.d == null ? hnrz.a : hnsd0.d).d);
        fltp0.e = gfsx.m(Long.valueOf(v));
        if(!hnsd0.k.isEmpty()) {
            fltp0.a = gfsx.m(hnsd0.k);
        }
        hnrz hnrz0 = hnsd0.d == null ? hnrz.a : hnsd0.d;
        String s = "";
        if((hnrz0.b == 2 ? ((String)hnrz0.c) : "").isEmpty()) {
            hnrz hnrz2 = hnsd0.d == null ? hnrz.a : hnsd0.d;
            fltp0.g((hnrz2.b == 1 ? ((ByteString)hnrz2.c) : ByteString.b).toByteArray());
        }
        else {
            hnrz hnrz1 = hnsd0.d == null ? hnrz.a : hnsd0.d;
            if(hnrz1.b == 2) {
                s = (String)hnrz1.c;
            }
            fltp0.c(s);
        }
        if((hnsd0.b & 2) != 0) {
            fltm fltm0 = new fltm();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: (hnsd0.e == null ? hnrw.a : hnsd0.e).b) {
                arrayList0.add(flxa.a(((hnry)object0)));
            }
            fltm0.b(arrayList0);
            fltp0.b = gfsx.m(fltm0.a());
        }
        HashMap hashMap0 = new HashMap();
        Map map0 = DesugarCollections.unmodifiableMap(hnsd0.f);
        for(Object object1: map0.keySet()) {
            hashMap0.put(((String)object1), ((hfrn)map0.get(((String)object1))).toBytesArray());
        }
        fltp0.e(hashMap0);
        ggdy ggdy0 = new ggdy();
        for(Object object2: hnsd0.g) {
            hnsg hnsg0 = (hnsg)object2;
            gfsx gfsx0 = flwo.b((hnsg0.c == null ? hnrp.a : hnsg0.c), gfqx.a, gfqx.a);
            if(gfsx0.i()) {
                fmfi fmfi0 = new fmfi(null);
                fmfi0.c(hnsg0.b);
                fmfi0.a = (fmbi)gfsx0.d();
                ggdy0.i(fmfi0.a());
            }
        }
        fltp0.d(ggdy0.h());
        hnsp hnsp0 = hnsd0.j == null ? hnsp.a : hnsd0.j;
        fmfk fmfk0 = new fmfk();
        fmfk0.b(0);
        fmfk0.c(0);
        if((hnsp0.b & 1) != 0) {
            switch((hnsp0.c == null ? hnrq.a : hnsp0.c).b) {
                case 0: {
                    v1 = 2;
                    break;
                }
                case 1: {
                    v1 = 3;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
            if(v1 == 0) {
                v1 = 1;
            }
            if(v1 - 2 == 1) {
                fmfk0.b(1);
            }
            else {
                fmfk0.b(0);
            }
        }
        switch(hnsp0.d) {
            case 0: {
                v2 = 2;
                break;
            }
            case 1: {
                v2 = 3;
                break;
            }
            default: {
                v2 = 0;
            }
        }
        if(v2 == 0) {
            v2 = 1;
        }
        if(v2 - 2 == 1) {
            fmfk0.c(2);
        }
        else {
            fmfk0.c(1);
        }
        fltp0.c = gfsx.m(fmfk0.a());
        ggdy ggdy1 = new ggdy();
        for(Object object3: hnsd0.h) {
            hnsg hnsg1 = (hnsg)object3;
            gfsx gfsx1 = gfqx.a;
            fmfi fmfi1 = new fmfi(null);
            gfsx gfsx2 = flwo.b((hnsg1.c == null ? hnrp.a : hnsg1.c), gfsx1, gfsx1);
            if(gfsx2.i()) {
                fmfi1.c(hnsg1.b);
                fmfi1.a = (fmbi)gfsx2.d();
                if(!hnsg1.d.isEmpty()) {
                    fmfi1.b(hnsg1.d.toByteArray());
                }
                gfsx1 = gfsx.m(fmfi1.a());
            }
            if(gfsx1.i()) {
                ggdy1.i(gfsx1.d());
            }
        }
        fltp0.h(ggdy1.h());
        hnrs hnrs0 = hnsd0.i == null ? hnrs.a : hnsd0.i;
        int v3 = hnrs0.b;
        if((hnsz.a(v3) == 0 ? 1 : hnsz.a(v3)) - 2 == 1) {
            if(hnsz.a(v3) == 3) {
                try {
                    ByteString hfsf0 = (hnrs0.c == null ? hfrn.a : hnrs0.c).c;
                    hftc hftc0 = hftc.a();
                    hfsl hfsl0 = hfsf0.k();
                    ProtoLiteMessage hftv0 = ((ProtoLiteMessage)hnve.a).x_newMutableInstance();
                    try {
                        hfwc hfwc0 = hfvu.a.c(hftv0);
                        hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                        hfwc0.g(hftv0);
                    }
                    catch(hfur hfur0) {
                        if(hfur0.b) {
                            hfur0 = new hfur(hfur0);
                        }
                        hfur0.a = hftv0;
                        throw hfur0;
                    }
                    catch(hfwr hfwr0) {
                        hfur hfur1 = hfwr0.a();
                        hfur1.a = hftv0;
                        throw hfur1;
                    }
                    catch(IOException iOException0) {
                        if((iOException0.getCause() instanceof hfur)) {
                            throw (hfur)iOException0.getCause();
                        }
                        hfur hfur2 = new hfur(iOException0);
                        hfur2.a = hftv0;
                        throw hfur2;
                    }
                    catch(RuntimeException runtimeException0) {
                        if((runtimeException0.getCause() instanceof hfur)) {
                            throw (hfur)runtimeException0.getCause();
                        }
                        throw runtimeException0;
                    }
                    try {
                        hfsl0.z(0);
                    }
                    catch(hfur hfur3) {
                        hfur3.a = hftv0;
                        throw hfur3;
                    }
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    hnve0 = (hnve)hftv0;
                }
                catch(hfur unused_ex) {
                    flbj.c("RichTextCustomViewContentProtoConverter", "can not convert proto to RichText");
                    gfsx3 = gfqx.a;
                    goto label_141;
                }
                gfsx3 = gfsx.m(new fmhn(flxs.b(accountContext0, context0, hnve0, "RICH_TEXT_ACCESSORY_VIEW", flsl0)));
            }
            else {
                flbj.c("RichTextCustomViewContentProtoConverter", "This CustomViewContent is not type of RICH_TEXT");
                gfsx3 = gfqx.a;
            }
        label_141:
            if(gfsx3.i()) {
                fltp0.d = gfsx.m(gfsx3.d());
            }
        }
        return fltp0.a();
    }
}

