import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Map.Entry;

public final class aizm implements gfsi {
    public final boolean a;

    public aizm(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ajbz ajbz0 = (ajbz)object0;
        if(ajbz0 == null) {
            ((ggtj)aizo.a.i()).x("No block data on device!");
            return aizr.j(5);
        }
        if(this.a) {
            ((ggtj)aizo.a.h()).x("stripping cloud backup disabled packages\' block data.");
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbz0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ajbz0));
            for(Object object1: DesugarCollections.unmodifiableMap(ajbz0.f).entrySet()) {
                String s = (String)((Map.Entry)object1).getKey();
                if(ajbz0.h(s)) {
                    s.getClass();
                    ajbp ajbp0 = (ajbp)ajbz0.g.get(s);
                    if(ajbp0 == null) {
                        throw new IllegalArgumentException();
                    }
                    if(!aizr.i(ajbp0)) {
                        continue;
                    }
                }
                hftp0.bQ(s);
                hftp0.bS(s);
            }
            for(Object object2: DesugarCollections.unmodifiableMap(ajbz0.e).entrySet()) {
                String s1 = (String)((Map.Entry)object2).getKey();
                ArrayList arrayList0 = new ArrayList();
                for(Object object3: DesugarCollections.unmodifiableMap(((ajbw)((Map.Entry)object2).getValue()).c).entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object3;
                    ajbp ajbp1 = ((ajbr)map$Entry0.getValue()).d;
                    if(ajbp1 == null) {
                        ajbp1 = ajbp.a;
                    }
                    if(aizr.i(ajbp1)) {
                        arrayList0.add(((String)map$Entry0.getKey()));
                    }
                }
                aizr.s(hftp0, s1, arrayList0);
            }
            ajbz0 = (ajbz)hftp0.N_build();
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbz0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)ajbz0));
        for(Object object4: DesugarCollections.unmodifiableMap(ajbz0.g).entrySet()) {
            hftp1.bO(((String)((Map.Entry)object4).getKey()), aizr.b(((ajbp)((Map.Entry)object4).getValue())));
        }
        for(Object object5: DesugarCollections.unmodifiableMap(ajbz0.e).entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object5;
            for(Object object6: DesugarCollections.unmodifiableMap(((ajbw)map$Entry1.getValue()).c).entrySet()) {
                ajbp ajbp2 = ((ajbr)((Map.Entry)object6).getValue()).d;
                if(ajbp2 == null) {
                    ajbp2 = ajbp.a;
                }
                ajbp ajbp3 = aizr.b(ajbp2);
                aizr.t(hftp1, ((String)map$Entry1.getKey()), ((String)((Map.Entry)object6).getKey()), ajbp3);
            }
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ajbz)hftp1.b_message).h = null;
        ((ajbz)hftp1.b_message).b &= -9;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ajbz ajbz1 = (ajbz)hftp1.b_message;
        ajbz1.b &= -17;
        ajbz1.i = 0;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ajbz)hftp1.b_message).j = null;
        ((ajbz)hftp1.b_message).b &= -33;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ajbz)hftp1.b_message).e().clear();
        ajbz ajbz2 = (ajbz)hftp1.N_build();
        try {
            ajbz ajbz3 = aizr.m(ajbz2, 1);
            int v = aizr.a(ajbz3);
            byte[] arr_b = ajbz3.toBytesArray();
            ((ggtj)aizo.a.h()).z("Returning %d bytes of block data", ajbz2.toBytesArray().length);
            ajad ajad0 = ajae.a();
            ajad0.a = ByteString.copyFrom(arr_b);
            ajad0.b = 2;
            ajad0.b(v);
            return ajad0.a();
        }
        catch(aizu | NullPointerException exception0) {
            a.ae(aizo.a.i(), "Unable to read Blockstore data!", exception0);
            return aizr.j(3);
        }
    }
}

