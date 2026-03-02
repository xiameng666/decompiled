import com.google.android.gms.auth.blockstore.StoreBytesData;
import j..util.DesugarCollections;
import java.util.concurrent.atomic.AtomicReference;

public final class aiyr implements gfsi {
    public final AtomicReference a;
    public final boolean b;
    public final String c;
    public final String d;
    public final byte[] e;
    public final String f;
    public final StoreBytesData g;

    public aiyr(AtomicReference atomicReference0, boolean z, String s, String s1, byte[] arr_b, String s2, StoreBytesData storeBytesData0) {
        this.a = atomicReference0;
        this.b = z;
        this.c = s;
        this.d = s1;
        this.e = arr_b;
        this.f = s2;
        this.g = storeBytesData0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        byte[] arr_b1;
        AtomicReference atomicReference0 = this.a;
        Object object1 = (ajbz)object0;
        String s = this.c;
        String s1 = this.f;
        String s2 = this.d;
        byte[] arr_b = this.e;
        StoreBytesData storeBytesData0 = this.g;
        if(object1 == null) {
            ((ggtj)aizo.a.i()).x("No block data on device!");
            atomicReference0.set(new aiyf(5));
            return null;
        }
        try {
            gfsx gfsx0 = gfsx.l(s2);
            bboh bboh0 = aizo.a;
            gfsx gfsx1 = aizr.c(((ajbz)object1), s, (this.b ? "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY" : ((String)gfsx0.d())));
            if(!gfsx1.i() || ((ajbr)gfsx1.d()).c.isEmpty()) {
                arr_b1 = ByteString.b.toByteArray();
            }
            else {
                byte[] arr_b2 = ((ajbr)gfsx1.d()).c.toByteArray();
                int v = ajbt.a(object1.d);
                if(v == 0) {
                    v = 1;
                }
                try {
                    arr_b1 = aizr.l(v).a(arr_b2);
                }
                catch(aizu aizu1) {
                    a.ae(bboh0.i(), "Problem decrypting old data, returning empty", aizu1);
                    arr_b1 = ByteString.b.toByteArray();
                }
            }
            atomicReference0.set(new aiyf(2));
            if(arr_b.length > 0 && arr_b1.length == 0 && (!hpsk.d() || !s1.equals("com.google.android.gms"))) {
                int v1 = DesugarCollections.unmodifiableMap(object1.f).containsKey(s);
                ajbw ajbw0 = (ajbw)DesugarCollections.unmodifiableMap(object1.e).get(s);
                if(ajbw0 != null) {
                    v1 += ajbw0.c.size();
                }
                if(((long)v1) >= hpsa.b()) {
                    ((ggtj)aizo.a.h()).R("Unable to store new data for package %s with key %s since the blockstore entry limit has been reached.", s1, s2);
                    atomicReference0.set(new aiyf(6));
                    return object1;
                }
            }
            int v2 = aizo.q();
            ajbz ajbz0 = aizr.m(((ajbz)object1), v2);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbz0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ajbz0));
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ajbo.a).v_newBuilder();
            boolean z = storeBytesData0.b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((ajbo)hftv0).b |= 1;
            ((ajbo)hftv0).c = z;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((ajbo)hftp1.b_message).d = 4;
            ((ajbo)hftp1.b_message).b |= 2;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ajbp.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            s1.getClass();
            ((ajbp)hftv1).b |= 1;
            ((ajbp)hftv1).c = s1;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ajbp ajbp0 = (ajbp)hftp2.b_message;
            ajbp0.b |= 2;
            ajbp0.d = false;
            ajbo ajbo0 = (ajbo)hftp1.N_build();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ajbp ajbp1 = (ajbp)hftp2.b_message;
            ajbo0.getClass();
            ajbp1.e = ajbo0;
            ajbp1.b |= 4;
            ajbp ajbp2 = (ajbp)hftp2.N_build();
            boolean z1 = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY".equals(s2);
            if(arr_b.length > 0) {
                ByteString hfsf0 = ByteString.copyFrom(aizr.l(v2).b(arr_b));
                if(z1) {
                    hftp0.bM(s, hfsf0);
                    hftp0.bO(s, ajbp2);
                }
                else {
                    String s3 = aizr.e(s2);
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ajbr.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp3.b_message;
                    ((ajbr)hftv2).b |= 1;
                    ((ajbr)hftv2).c = hfsf0;
                    if(!hftv2.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ajbr ajbr0 = (ajbr)hftp3.b_message;
                    ajbp2.getClass();
                    ajbr0.d = ajbp2;
                    ajbr0.b |= 2;
                    ajbr ajbr1 = (ajbr)hftp3.N_build();
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)ajbw.a).v_newBuilder();
                    String s4 = ajbp2.c;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ajbw ajbw1 = (ajbw)hftp4.b_message;
                    s4.getClass();
                    ajbw1.b |= 1;
                    ajbw1.d = s4;
                    ajbw ajbw2 = hftp0.bI(s, ((ajbw)hftp4.N_build()));
                    ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbw2).jf(5, null);
                    hftp5.X(((ProtoLiteMessage)ajbw2));
                    hftp5.bU(s3, ajbr1);
                    hftp0.bN(s, ((ajbw)hftp5.N_build()));
                }
            }
            else {
                aizr.s(hftp0, s, (z1 ? gged_interceptors.l("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY") : gged_interceptors.l(aizr.e(s2))));
            }
            long v3 = System.currentTimeMillis();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ajbz ajbz1 = (ajbz)hftp0.b_message;
            ajbz1.b |= 2;
            ajbz1.c = v3;
            return (ajbz)hftp0.N_build();
        }
        catch(aizu aizu0) {
            ((ggtj)((ggtj)aizo.a.i()).s(aizu0)).R("Unable to put data for package \'%s\' with key \'%s\'!", s1, s2);
            atomicReference0.set(new aiyf(3));
            return object1;
        }
    }
}

