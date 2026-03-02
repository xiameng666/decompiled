import android.util.Base64;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.Callable;
import javax.crypto.Mac;

public final class bwwh {
    public static GlobalSearchApplicationInfo a(bwod bwod0) {
        String s = bwod0.c.isEmpty() ? null : bwod0.c;
        String s1 = bwod0.d.isEmpty() ? null : bwod0.d;
        int v = bwod0.e;
        int v1 = bwod0.f;
        int v2 = bwod0.g;
        String s2 = bwod0.h.isEmpty() ? null : bwod0.h;
        String s3 = bwod0.i.isEmpty() ? null : bwod0.i;
        return bwod0.j.isEmpty() ? new GlobalSearchApplicationInfo(s, s1, v, v1, v2, s2, s3, null) : new GlobalSearchApplicationInfo(s, s1, v, v1, v2, s2, s3, bwod0.j);
    }

    public static GlobalSearchApplicationInfo b(bwod bwod0) {
        return bwod0 == null ? null : bwwh.a(bwod0);
    }

    public static bwod c(GlobalSearchApplicationInfo globalSearchApplicationInfo0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwod.a).v_newBuilder();
        String s = gfta.b(globalSearchApplicationInfo0.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((bwod)hftv0).b |= 1;
        ((bwod)hftv0).c = s;
        String s1 = gfta.b(globalSearchApplicationInfo0.b);
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((bwod)hftv1).b |= 2;
        ((bwod)hftv1).d = s1;
        int v = globalSearchApplicationInfo0.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((bwod)hftv2).b |= 4;
        ((bwod)hftv2).e = v;
        int v1 = globalSearchApplicationInfo0.d;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((bwod)hftv3).b |= 8;
        ((bwod)hftv3).f = v1;
        int v2 = globalSearchApplicationInfo0.e;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((bwod)hftv4).b |= 16;
        ((bwod)hftv4).g = v2;
        String s2 = gfta.b(globalSearchApplicationInfo0.f);
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((bwod)hftv5).b |= 0x20;
        ((bwod)hftv5).h = s2;
        String s3 = gfta.b(globalSearchApplicationInfo0.g);
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp0.b_message;
        ((bwod)hftv6).b |= 0x40;
        ((bwod)hftv6).i = s3;
        String s4 = gfta.b(globalSearchApplicationInfo0.h);
        if(!hftv6.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwod bwod0 = (bwod)hftp0.b_message;
        bwod0.b |= 0x80;
        bwod0.j = s4;
        return (bwod)hftp0.N_build();
    }

    public static bwpa d() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwpa.a).v_newBuilder();
        huar huar0 = huar.a;
        int v = (int)huar0.d().o();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwpa bwpa0 = (bwpa)hftp0.b_message;
        bwpa0.b |= 1;
        bwpa0.c = v;
        int v1 = (int)huar0.d().v();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwpa bwpa1 = (bwpa)hftp0.b_message;
        bwpa1.b |= 2;
        bwpa1.d = v1;
        boolean z = huao.c();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwpa bwpa2 = (bwpa)hftp0.b_message;
        bwpa2.b |= 4;
        bwpa2.e = z;
        boolean z1 = ((Boolean)bwvu.m.b()).booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwpa bwpa3 = (bwpa)hftp0.b_message;
        bwpa3.b |= 8;
        bwpa3.f = z1;
        return (bwpa)hftp0.N_build();
    }

    public static MessageLite e(String s, Parser hfvs0) {
        if(s != null) {
            byte[] arr_b = Base64.decode(s, 0);
            try {
                return hfvs0.parseFrom(arr_b);
            }
            catch(hfur hfur0) {
                bwne.j(hfur0, "Corrupted message", new Object[0]);
            }
        }
        try {
            return hfvs0.j(ByteString.b);
        }
        catch(hfur unused_ex) {
            throw new AssertionError();
        }
    }

    public static String f(long v) {
        if(v > 0x40000000L) {
            return String.format(Locale.US, "%.2fGB", ((double)(((double)v) / 1073741824.0)));
        }
        if(v > 0x100000L) {
            return String.format(Locale.US, "%.2fMB", ((double)(((double)v) / 1048576.0)));
        }
        return v <= 0x400L ? String.format(Locale.US, "%d Bytes", v) : String.format(Locale.US, "%.2fKB", ((double)(((double)v) / 1024.0)));
    }

    public static String g(MessageLite hfvm0) {
        return Base64.encodeToString(hfvm0.toBytesArray(), 0);
    }

    public static Mac h() {
        try {
            return (Mac)bwwh.l(new bwwg());
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            bwne.j(noSuchAlgorithmException0, "Mac algorithm %s not available", new Object[]{"HmacSHA1"});
            return null;
        }
        catch(Exception exception0) {
            throw new RuntimeException("Unexpected exception from Mac.getInstance", exception0);
        }
    }

    public static int i(int v, int v1) {
        switch(v) {
            case 0: {
                return v1 == 3 ? 2 : 1;
            }
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 3;
            }
            default: {
                throw new IllegalArgumentException("unknown queryTokenizer");
            }
        }
    }

    public static int j(int v) {
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                return 2;
            }
            default: {
                if(v != 2 && v != 3) {
                    if(v == 5) {
                        return 4;
                    }
                    throw new IllegalArgumentException("unknown rankingStrategy");
                }
                return 3;
            }
        }
    }

    // String Decryptor: 1 succeeded, 0 failed
    public static int k(int v) {
        switch(v) {
            case 0: {
                return 2;
            }
            case 1: {
                return 3;
            }
            case 2: {
                return 4;
            }
            case 3: {
                return 6;
            }
            case 4: {
                return 7;
            }
            default: {
                return v == 5 ? 8 : 5;
            }
        }
    }

    private static Object l(Callable callable0) {
        for(int v = 0; true; ++v) {
            try {
                return ((bwwg)callable0).a();
            }
            catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            }
            if(v > 0) {
                break;
            }
        }
        throw noSuchAlgorithmException0;
    }
}

