import com.google.android.gms.phenotype.ExperimentTokens;
import j..util.Collection.-EL;
import j..util.Optional;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class azom {
    private final gfvn a;

    public azom(einq einq0, gemk gemk0, gfuv gfuv0, aznz aznz0) {
        gfvh gfvh0 = new gfvh();
        gfvh0.l(gfuv0);
        gfvh0.m(hfyg.c(hrcb.a.c().e()));
        this.a = gfvh0.c(new azok(einq0, gemk0));
    }

    public final azol a(int v, int v1, String s) {
        try {
            azoj azoj0 = new azoj(v, v1, s);
            return (azol)this.a.a(azoj0);
        }
        catch(ExecutionException unused_ex) {
            return azol.c(3);
        }
    }

    public static azol b(einq einq0, String s, String s1) {
        gged_interceptors gged0;
        ExperimentTokens experimentTokens0;
        try {
            experimentTokens0 = (ExperimentTokens)aznz.a(einq0.o(s, "", s1), TimeUnit.SECONDS);
        }
        catch(ExecutionException unused_ex) {
            return azol.a(ggna.a);
        }
        catch(InterruptedException | TimeoutException unused_ex) {
            return azol.c(4);
        }
        ggdy ggdy0 = new ggdy();
        ggdy0.i(azom.d(experimentTokens0.d));
        byte[][] arr2_b = experimentTokens0.j;
        if(arr2_b == null) {
            gged0 = ggna.a;
        }
        else {
            ggdy ggdy1 = new ggdy();
            for(int v1 = 0; v1 < arr2_b.length; ++v1) {
                ggdy1.i(azom.d(arr2_b[v1]));
            }
            gged0 = ggdy1.h();
        }
        ggdy0.k(gged0);
        gged_interceptors gged1 = ggdy0.h();
        ggdy ggdy2 = new ggdy();
        int v2 = ((ggna)gged1).c;
        for(int v = 0; v < v2; ++v) {
            Optional optional0 = (Optional)gged1.get(v);
            if(optional0.isEmpty()) {
                return azol.c(2);
            }
            ggdy2.k(azom.c(((gnzs)optional0.get()).d));
            ggdy2.k(azom.c(((gnzs)optional0.get()).b));
            ggdy2.k(azom.c(((gnzs)optional0.get()).e));
            ggdy2.k(azom.c(((gnzs)optional0.get()).c));
        }
        return azol.a(ggdy2.h());
    }

    private static gged_interceptors c(Collection collection0) {
        return (gged_interceptors)Collection.-EL.stream(collection0).map(new azoi()).collect(ggaf.a);
    }

    private static Optional d(byte[] arr_b) {
        gocp gocp0;
        String s;
        gocs gocs0;
        if(arr_b == null) {
            return Optional.of(gnzs.a);
        }
        try {
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            try {
                hfsl hfsl0 = hfsf0.k();
                ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gocs.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv0);
                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                    hfwc0.g(hftv0);
                }
                catch(hfur hfur1) {
                    if(hfur1.b) {
                        hfur1 = new hfur(hfur1);
                    }
                    hfur1.a = hftv0;
                    throw hfur1;
                }
                catch(hfwr hfwr0) {
                    hfur hfur2 = hfwr0.a();
                    hfur2.a = hftv0;
                    throw hfur2;
                }
                catch(IOException iOException0) {
                    if((iOException0.getCause() instanceof hfur)) {
                        throw (hfur)iOException0.getCause();
                    }
                    hfur hfur3 = new hfur(iOException0);
                    hfur3.a = hftv0;
                    throw hfur3;
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
                catch(hfur hfur4) {
                    hfur4.a = hftv0;
                    throw hfur4;
                }
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                gocs0 = (gocs)hftv0;
            }
            catch(hfur hfur0) {
                throw new IllegalArgumentException("Unable to parse the given token.", hfur0);
            }
            int v = gocs0.b;
            if((gocr.a(v) == 0 ? 1 : gocr.a(v)) - 1 != 3) {
                int v1 = gocr.a(v);
                if(v1 != 0 && v1 != 1) {
                    switch(v1) {
                        case 2: {
                            s = "VERSION_1";
                            break;
                        }
                        case 3: {
                            s = "VERSION_2";
                            break;
                        }
                        default: {
                            s = "VERSION_3";
                        }
                    }
                }
                else {
                    s = "UNKNOWN";
                }
                throw new IllegalArgumentException("Unsupported token format version: " + s);
            }
            byte[] arr_b1 = gocs0.c.toByteArray();
            for(int v2 = 0; v2 < arr_b1.length; ++v2) {
                arr_b1[v2] = (byte)(arr_b1[v2] ^ 7);
            }
            try {
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gocp.a), arr_b1, 0, arr_b1.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                gocp0 = (gocp)hftv1;
            }
            catch(hfur hfur5) {
                throw new IllegalArgumentException("Unable to decode the V3 device experiment token", hfur5);
            }
            gnzr gnzr0 = (gnzr)((ProtoLiteMessage)gnzs.a).v_newBuilder();
            List list0 = gnzq.a(gocp0.b);
            if(!gnzr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gnzr0).ensureMutable();
            }
            gnzs gnzs0 = (gnzs)gnzr0.b_message;
            hfuf hfuf0 = gnzs0.b;
            if(!hfuf0.c()) {
                gnzs0.b = ProtoLiteMessage.C(hfuf0);
            }
            hfrj.E(list0, gnzs0.b);
            List list1 = gnzq.a(gocp0.c);
            if(!gnzr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gnzr0).ensureMutable();
            }
            gnzs gnzs1 = (gnzs)gnzr0.b_message;
            hfuf hfuf1 = gnzs1.c;
            if(!hfuf1.c()) {
                gnzs1.c = ProtoLiteMessage.C(hfuf1);
            }
            hfrj.E(list1, gnzs1.c);
            List list2 = gnzq.a(gocp0.d);
            if(!gnzr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gnzr0).ensureMutable();
            }
            gnzs gnzs2 = (gnzs)gnzr0.b_message;
            gnzs2.b();
            hfrj.E(list2, gnzs2.d);
            List list3 = gnzq.a(gocp0.e);
            if(!gnzr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gnzr0).ensureMutable();
            }
            gnzs gnzs3 = (gnzs)gnzr0.b_message;
            hfuf hfuf2 = gnzs3.e;
            if(!hfuf2.c()) {
                gnzs3.e = ProtoLiteMessage.C(hfuf2);
            }
            hfrj.E(list3, gnzs3.e);
            return Optional.of(((gnzs)((ProtoLiteBuilder)gnzr0).N_build()));
        }
        catch(IllegalArgumentException unused_ex) {
            return Optional.empty();
        }
    }
}

