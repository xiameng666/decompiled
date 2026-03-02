import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class aiyy implements gfsi {
    public final AtomicReference a;
    public final DeleteBytesRequest b;
    public final String c;

    public aiyy(AtomicReference atomicReference0, DeleteBytesRequest deleteBytesRequest0, String s) {
        this.a = atomicReference0;
        this.b = deleteBytesRequest0;
        this.c = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        AtomicReference atomicReference0 = this.a;
        boolean z = false;
        if(((ajbz)object0) == null) {
            ((ggtj)aizo.a.i()).x("No block data on device!");
            aizs aizs0 = new aizs();
            aizs0.a = 5;
            aizs0.b(false);
            atomicReference0.set(aizs0.a());
            return null;
        }
        String s = this.c;
        DeleteBytesRequest deleteBytesRequest0 = this.b;
        aizs aizs1 = new aizs();
        aizs1.a = 2;
        aizs1.b(false);
        atomicReference0.set(aizs1.a());
        if(deleteBytesRequest0.a) {
            if(((ajbz)object0).f(s) || ((ajbz)object0).g(s)) {
                z = true;
            }
            aizs aizs2 = new aizs();
            aizs2.a = 2;
            aizs2.b(z);
            atomicReference0.set(aizs2.a());
            if(z) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajbz)object0))).jf(5, null);
                hftp0.X(((ProtoLiteMessage)(((ajbz)object0))));
                hftp0.bQ(s);
                hftp0.bS(s);
                hftp0.bR(s);
                return (ajbz)hftp0.N_build();
            }
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: deleteBytesRequest0.a()) {
                String s1 = ajca.a(((String)object1));
                if(!"com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY".equals(s1)) {
                    s1 = aizr.e(s1);
                }
                arrayList0.add(s1);
            }
            for(Object object2: arrayList0) {
                String s2 = (String)object2;
                if(!"com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY".equals(s2)) {
                    if(!((ajbz)object0).g(s)) {
                        continue;
                    }
                    ajbw ajbw0 = (ajbw)((ajbz)object0).e.get(s);
                    if(ajbw0 == null) {
                        throw new IllegalArgumentException();
                    }
                    s2.getClass();
                    if(ajbw0.c.containsKey(s2)) {
                        z = true;
                        break;
                    }
                    continue;
                }
                else if(((ajbz)object0).f(s)) {
                }
                else {
                    continue;
                }
                z = true;
                break;
            }
            aizs aizs3 = new aizs();
            aizs3.a = 2;
            aizs3.b(z);
            atomicReference0.set(aizs3.a());
            if(z) {
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajbz)object0))).jf(5, null);
                hftp1.X(((ProtoLiteMessage)(((ajbz)object0))));
                aizr.s(hftp1, s, arrayList0);
                long v = System.currentTimeMillis();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ajbz ajbz0 = (ajbz)hftp1.b_message;
                ajbz0.b |= 2;
                ajbz0.c = v;
                return (ajbz)hftp1.N_build();
            }
        }
        return (ajbz)object0;
    }
}

