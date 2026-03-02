import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;

public final class aizi implements gfsi {
    public final String a;
    public final AtomicBoolean b;

    public aizi(String s, AtomicBoolean atomicBoolean0) {
        this.a = s;
        this.b = atomicBoolean0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajbz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ajbz)object0))));
        String s = this.a;
        boolean z = ((ajbz)object0).h(s);
        AtomicBoolean atomicBoolean0 = this.b;
        if(z) {
            ajbp ajbp0 = (ajbp)((ajbz)object0).g.get(s);
            if(ajbp0 == null) {
                throw new IllegalArgumentException();
            }
            if(ajbp0.d) {
                atomicBoolean0.set(true);
                aizr.s(hftp0, s, gged_interceptors.l("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY"));
            }
            else {
                ((ggtj)aizo.a.h()).x("Keyless data not found or its IsLastInstallationData = false.");
            }
        }
        else {
            ((ggtj)aizo.a.h()).x("Keyless data not found or its IsLastInstallationData = false.");
        }
        ArrayList arrayList0 = new ArrayList();
        if(((ajbz)object0).g(s)) {
            ajbw ajbw0 = (ajbw)((ajbz)object0).e.get(s);
            if(ajbw0 == null) {
                throw new IllegalArgumentException();
            }
            for(Object object1: DesugarCollections.unmodifiableMap(ajbw0.c).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                ajbp ajbp1 = ((ajbr)map$Entry0.getValue()).d;
                if(ajbp1 == null) {
                    ajbp1 = ajbp.a;
                }
                if(ajbp1.d) {
                    arrayList0.add(((String)map$Entry0.getKey()));
                }
            }
        }
        if(!arrayList0.isEmpty()) {
            atomicBoolean0.set(true);
            aizr.s(hftp0, s, arrayList0);
        }
        return (ajbz)hftp0.N_build();
    }
}

