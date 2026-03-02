import android.os.Bundle;
import android.util.Log;
import j..util.Objects;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class fdza {
    public final fdso a;
    public final int b;
    private final fdyz c;

    public fdza(fdso fdso0) {
        this.c = new fdyz();
        this.a = fdso0;
        this.b = (int)hzuz.a.h().b();
    }

    final ffbw a(Bundle bundle0) {
        byte[] arr_b1;
        boolean z1;
        byte[][] arr2_b1;
        boolean z = bundle0.containsKey("cw_hash");
        if(z) {
            String s = bundle0.getString("cw_hash");
            batl.s(s);
            int v = Integer.parseInt(s);
            String s1 = bundle0.getString("cw_split");
            batl.s(s1);
            int v1 = Integer.parseInt(s1);
            String s2 = bundle0.getString("cw_numSplits");
            batl.s(s2);
            int v2 = Integer.parseInt(s2);
            String s3 = bundle0.getString("cw_hash");
            batl.s(s3);
            int v3 = Integer.parseInt(s3);
            String s4 = bundle0.getString("cw_maxSplitLen");
            batl.s(s4);
            int v4 = Integer.parseInt(s4);
            String s5 = bundle0.getString("cw_totalSize");
            batl.s(s5);
            int v5 = Integer.parseInt(s5);
            Integer integer0 = v3;
            byk byk0 = this.c.a;
            byte[][] arr2_b = (byte[][])byk0.d(integer0);
            if(arr2_b == null) {
                arr2_b1 = new byte[v2][];
                byk0.e(integer0, arr2_b1);
            }
            else {
                arr2_b1 = arr2_b;
            }
            arr2_b1[v1] = bundle0.getByteArray("rawData");
            int v6 = 0;
            int v7 = 0;
            while(v7 < arr2_b1.length) {
                byte[] arr_b = arr2_b1[v7];
                if(arr_b != null) {
                    v6 += arr_b.length;
                    ++v7;
                    continue;
                }
                z1 = z;
                arr_b1 = null;
                goto label_54;
            }
            if(v6 == v5) {
                arr_b1 = new byte[v6];
                int v8 = 0;
                while(v8 < arr2_b1.length) {
                    byte[] arr_b2 = arr2_b1[v8];
                    batl.s(arr_b2);
                    System.arraycopy(arr_b2, 0, arr_b1, v4 * v8, arr_b2.length);
                    ++v8;
                    z = z;
                }
                z1 = z;
            }
            else {
                z1 = z;
                arr_b1 = null;
            }
        label_54:
            if(arr_b1 == null) {
                if(Log.isLoggable("rpctransport", 2)) {
                    Log.v("rpctransport", "don\'t have all the splits for hash " + v);
                }
                return null;
            }
            byk0.f(Integer.valueOf(v3));
            bundle0.putByteArray("rawData", arr_b1);
            if(Log.isLoggable("rpctransport", 2)) {
                Log.v("rpctransport", "found all " + bundle0.getString("cw_numSplits") + " splits for hash " + v);
            }
        }
        else {
            z1 = z;
        }
        boolean z2 = Boolean.parseBoolean(bundle0.getString("encrypted", "false"));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffbw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbw.b(((ffbw)hftp0.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbw ffbw0 = (ffbw)hftp0.b_message;
        ffbw0.b |= 0x20;
        ffbw0.g = "";
        String s6 = bundle0.getString("sourceNodeId");
        batl.s(s6);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbw ffbw1 = (ffbw)hftp0.b_message;
        ffbw1.b |= 0x80;
        ffbw1.i = s6;
        String s7 = bundle0.getString("pkgName");
        batl.s(s7);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbw ffbw2 = (ffbw)hftp0.b_message;
        ffbw2.b |= 2;
        ffbw2.d = s7;
        String s8 = bundle0.getString("pkgCert");
        batl.s(s8);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbw ffbw3 = (ffbw)hftp0.b_message;
        ffbw3.b |= 4;
        ffbw3.e = s8;
        String s9 = bundle0.getString("requestId");
        batl.s(s9);
        int v9 = Integer.parseInt(s9);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbw ffbw4 = (ffbw)hftp0.b_message;
        int v10 = 1;
        ffbw4.b |= 1;
        ffbw4.c = v9;
        String s10 = bundle0.getString("targetNodeId");
        batl.s(s10);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbw ffbw5 = (ffbw)hftp0.b_message;
        ffbw5.b |= 8;
        ffbw5.f = s10;
        if(bundle0.getString("generation") != null) {
            String s11 = bundle0.getString("generation");
            batl.s(s11);
            int v11 = Integer.parseInt(s11);
            Integer.valueOf(v11).getClass();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbw ffbw6 = (ffbw)hftp0.b_message;
            ffbw6.b |= 0x200;
            ffbw6.k = v11;
        }
        byte[] arr_b3 = bundle0.getByteArray("rawData");
        if(z2 && arr_b3 != null) {
            try {
                String s12 = bundle0.getString("path");
                arr_b3 = this.a.p(arr_b3, s12);
            }
            catch(GeneralSecurityException generalSecurityException0) {
                Log.w("rpctransport", "Failed to decrypt received bundle data", generalSecurityException0);
                return null;
            }
        }
        if(Objects.equals(bundle0.getString("isChannel"), "1")) {
            if(arr_b3 == null) {
                Log.w("rpctransport", "Received invalid null channelRequest bytes.");
                return null;
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)feyj.a).v_newBuilder();
            try {
                hftp1.A(arr_b3, hftc.a());
            }
            catch(hfur hfur0) {
                Log.w("rpctransport", "Received invalid channelRequest bytes: " + hfur0.getMessage());
                return null;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbw ffbw7 = (ffbw)hftp0.b_message;
            feyj feyj0 = (feyj)hftp1.N_build();
            feyj0.getClass();
            ffbw7.j = feyj0;
            ffbw7.b |= 0x100;
        }
        else {
            String s13 = bundle0.getString("path");
            if(s13 != null) {
                if(z2) {
                    try {
                        s13 = this.a.e(s13);
                    }
                    catch(GeneralSecurityException generalSecurityException1) {
                        Log.w("rpctransport", "Failed to decrypt received bundle path", generalSecurityException1);
                        return null;
                    }
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ffbw ffbw8 = (ffbw)hftp0.b_message;
                ffbw8.b |= 0x20;
                ffbw8.g = s13;
            }
            if(arr_b3 != null) {
                ByteString hfsf0 = ByteString.copyFrom(arr_b3);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ffbw ffbw9 = (ffbw)hftp0.b_message;
                ffbw9.b |= 0x40;
                ffbw9.h = hfsf0;
            }
        }
        String s14 = bundle0.getString("requiresResponse");
        if(s14 != null) {
            boolean z3 = Boolean.parseBoolean(s14);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbw ffbw10 = (ffbw)hftp0.b_message;
            ffbw10.b |= 0x400;
            ffbw10.l = z3;
        }
        String s15 = bundle0.getString("senderRequestId");
        if(s15 != null) {
            int v12 = Integer.parseInt(s15);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbw ffbw11 = (ffbw)hftp0.b_message;
            ffbw11.b |= 0x800;
            ffbw11.m = v12;
        }
        if(hzuz.k()) {
            String s16 = bundle0.getString("priority");
            if(s16 != null) {
                int v13 = ffbv.a(Integer.parseInt(s16));
                if(v13 == 0) {
                    Log.w("rpctransport", a.a(s16, "Did not understand priority ", "; defaulting to UNSPECIFIED"));
                }
                else {
                    v10 = v13;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffbw)hftp0.b_message).n = v10 - 1;
                ((ffbw)hftp0.b_message).b |= 0x1000;
            }
        }
        ffbw ffbw12 = (ffbw)hftp0.N_build();
        if(z1) {
            String s17 = bundle0.getString("cw_hash");
            batl.s(s17);
            int v14 = Integer.parseInt(s17);
            byte[] arr_b4 = bundle0.getByteArray("rawData");
            if(arr_b4 == null) {
                Log.w("rpctransport", "rpcRequestFromGcmBundle: dataToHash is null, dropping" + ffda.a(ffbw12));
                return null;
            }
            if(v14 != fdza.c(ffbw12, bundle0.getString("path"), arr_b4)) {
                Log.w("rpctransport", "rpcRequestFromGcmBundle: hash mismatch, dropping" + ffda.a(ffbw12));
                return null;
            }
        }
        return ffbw12;
    }

    public static byte[] b(ffbw ffbw0) {
        return (ffbw0.b & 0x100) == 0 ? ffbw0.h.toByteArray() : (ffbw0.j == null ? feyj.a : ffbw0.j).toBytesArray();
    }

    public static final int c(ffbw ffbw0, String s, byte[] arr_b) {
        String s1 = ffbw0.d;
        String s2 = ffbw0.e;
        String s3 = ffbw0.i;
        String s4 = ffbw0.f;
        Integer integer0 = (int)ffbw0.k;
        Integer integer1 = (int)ffbw0.c;
        Boolean boolean0 = Boolean.valueOf((ffbw0.b & 0x100) != 0);
        if((ffbw0.b & 0x100) != 0) {
            s = "";
        }
        int v1 = Arrays.hashCode(new Object[]{s1, s2, s3, s4, integer0, integer1, boolean0, s});
        for(int v = 0; v < arr_b.length; ++v) {
            v1 = v1 * 0x1F + arr_b[v];
        }
        return v1;
    }
}

