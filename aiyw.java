import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;

public final class aiyw implements gfsi {
    public final gfsx a;
    public final AtomicBoolean b;

    public aiyw(gfsx gfsx0, AtomicBoolean atomicBoolean0) {
        this.a = gfsx0;
        this.b = atomicBoolean0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajbz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ajbz)object0))));
        gfsx gfsx0 = this.a;
        if(gfsx0.i()) {
            Object object1 = gfsx0.d();
            int v = ajbt.a(((ajbz)object0).d);
            if(v == 0) {
                v = 1;
            }
            bboh bboh0 = aizo.a;
            ArrayList arrayList0 = new ArrayList();
            if(!((ajbz)object0).g(((String)object1))) {
                ((ggtj)bboh0.j()).x("Does not contain gms package key space.");
                aizr.s(hftp0, ((String)gfsx0.d()), arrayList0);
                this.b.set(true);
                return (ajbz)hftp0.N_build();
            }
            ajbw ajbw0 = (ajbw)((ajbz)object0).e.get(object1);
            if(ajbw0 == null) {
                throw new IllegalArgumentException();
            }
            for(Object object2: DesugarCollections.unmodifiableMap(ajbw0.c).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object2;
                try {
                    byte[] arr_b = aizr.q(((ajbr)map$Entry0.getValue()).c.toByteArray(), v);
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ajbh.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    ajbh ajbh0 = (ajbh)hftv0;
                    ajbp ajbp0 = ((ajbr)map$Entry0.getValue()).d;
                    if(ajbp0 == null) {
                        ajbp0 = ajbp.a;
                    }
                    ajbo ajbo0 = ajbp0.e == null ? ajbo.a : ajbp0.e;
                    if(aiuo.a((ajbn.a(ajbo0.d) == 0 ? 1 : ajbn.a(ajbo0.d)) - 1)) {
                        ((ggtj)bboh0.h()).B("Found a restore credential without access for package: %s", ajbh0.g);
                        arrayList0.add(((String)map$Entry0.getKey()));
                    }
                    else {
                        ((ggtj)bboh0.h()).B("%s\'s access satisfied restore level", ajbh0.g);
                    }
                }
                catch(hfur hfur0) {
                    a.ae(bboh0.j(), "The data was not a restore credential", hfur0);
                }
                catch(aizu aizu0) {
                    a.ae(bboh0.j(), "Unable to decrypt the potential restore credential entry.", aizu0);
                }
            }
            aizr.s(hftp0, ((String)gfsx0.d()), arrayList0);
            this.b.set(true);
            return (ajbz)hftp0.N_build();
        }
        return (ajbz)hftp0.N_build();
    }
}

