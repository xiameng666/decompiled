import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
import java.util.List;

public final class azic {
    public static gnzx a(ExperimentTokens experimentTokens0, int[] arr_v, boolean z) {
        int[] arr_v1 = null;
        if(experimentTokens0 == null && arr_v == null) {
            return null;
        }
        gnzw gnzw0 = (gnzw)((ProtoLiteMessage)gnzx.a).v_newBuilder();
        if(experimentTokens0 != null) {
            arr_v1 = experimentTokens0.i;
        }
        if(!azic.b(arr_v1) || !azic.b(arr_v)) {
            gnzr gnzr0 = (gnzr)((ProtoLiteMessage)gnzs.a).v_newBuilder();
            if(arr_v1 != null) {
                for(int v1 = 0; v1 < arr_v1.length; ++v1) {
                    gnzr0.a(arr_v1[v1]);
                }
            }
            if(arr_v != null) {
                for(int v2 = 0; v2 < arr_v.length; ++v2) {
                    gnzr0.a(arr_v[v2]);
                }
            }
            ByteString hfsf0 = ((gnzs)((ProtoLiteBuilder)gnzr0).N_build()).getDefaultInstanceForType();
            if(!gnzw0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gnzw0).ensureMutable();
            }
            gnzx gnzx0 = (gnzx)gnzw0.b_message;
            gnzx0.b |= 1;
            gnzx0.c = hfsf0;
        }
        if(experimentTokens0 != null) {
            byte[] arr_b = experimentTokens0.d;
            if(arr_b != null && arr_b.length != 0) {
                gnzw0.a(ByteString.copyFrom(arr_b));
            }
            byte[][] arr2_b = experimentTokens0.j;
            if(arr2_b != null) {
                for(int v3 = 0; v3 < arr2_b.length; ++v3) {
                    byte[] arr_b1 = arr2_b[v3];
                    if(arr_b1 != null && arr_b1.length != 0) {
                        gnzw0.a(ByteString.copyFrom(arr_b1));
                    }
                }
            }
            byte[][] arr2_b1 = experimentTokens0.l;
            if(arr2_b1 != null) {
                for(int v4 = 0; v4 < arr2_b1.length; ++v4) {
                    byte[] arr_b2 = arr2_b1[v4];
                    if(arr_b2 != null && arr_b2.length != 0) {
                        gnzw0.a(ByteString.copyFrom(arr_b2));
                    }
                }
            }
            if(!gnzw0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gnzw0).ensureMutable();
            }
            gnzx gnzx1 = (gnzx)gnzw0.b_message;
            gnzx1.b |= 4;
            gnzx1.e = z;
            byte[][][] arr3_b = z ? new byte[][][]{experimentTokens0.e, experimentTokens0.f, experimentTokens0.g, experimentTokens0.h} : new byte[][][]{experimentTokens0.f, experimentTokens0.g, experimentTokens0.h};
            for(int v = 0; v < arr3_b.length; ++v) {
                byte[][] arr2_b2 = arr3_b[v];
                if(arr2_b2 != null) {
                    List list0 = ggia.h(Arrays.asList(arr2_b2), hfxi.a.ic());
                    if(!gnzw0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gnzw0).ensureMutable();
                    }
                    gnzx gnzx2 = (gnzx)gnzw0.b_message;
                    gnzx2.b();
                    hfrj.E(list0, gnzx2.d);
                }
            }
        }
        return (gnzx)((ProtoLiteBuilder)gnzw0).N_build();
    }

    private static boolean b(int[] arr_v) {
        return arr_v == null || arr_v.length == 0;
    }
}

