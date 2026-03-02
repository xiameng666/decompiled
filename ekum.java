import android.os.BadParcelableException;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class ekum {
    public static bszb a(int v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bszb.a).v_newBuilder();
        String s = String.valueOf(v1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        int v2 = 2;
        ((bszb)hftv0).b |= 2;
        ((bszb)hftv0).d = s;
        switch(v) {
            case 2: {
                v2 = 3;
                break;
            }
            case 1: 
            case 4: {
                break;
            }
            case 8: {
                v2 = 5;
                break;
            }
            case 16: {
                v2 = 6;
                break;
            }
            default: {
                v2 = 1;
            }
        }
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((bszb)hftp0.b_message).c = v2 - 1;
        ((bszb)hftp0.b_message).b |= 1;
        return (bszb)hftp0.N_build();
    }

    public static bszz b(eksc eksc0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bszz.a).v_newBuilder();
        Bundle bundle0 = eksc0.o.p;
        boolean z = true;
        if(bundle0 == null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((bszz)hftv0).b |= 4;
            ((bszz)hftv0).e = true;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((bszz)hftv1).b |= 1;
            ((bszz)hftv1).c = 0L;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            bszz bszz0 = (bszz)hftp0.b_message;
            bszz0.b |= 2;
            bszz0.d = 0L;
            return (bszz)hftp0.N_build();
        }
        try {
            Bundle bundle1 = new Bundle(bundle0);
            long v = (long)cllp.d(bundle1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bszz bszz1 = (bszz)hftp0.b_message;
            bszz1.b |= 2;
            bszz1.d = v;
            long v1 = (long)bundle1.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bszz bszz2 = (bszz)hftp0.b_message;
            bszz2.b |= 1;
            bszz2.c = v1;
            try {
                cllp.f(bundle1);
            }
            catch(IllegalArgumentException unused_ex) {
                z = false;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bszz bszz3 = (bszz)hftp0.b_message;
            bszz3.b |= 4;
            bszz3.e = z;
            return (bszz)hftp0.N_build();
        }
        catch(BadParcelableException unused_ex) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bszz bszz4 = (bszz)hftp0.b_message;
            bszz4.b |= 4;
            bszz4.e = false;
            return (bszz)hftp0.N_build();
        }
        catch(RuntimeException runtimeException0) {
            if(!(runtimeException0.getCause() instanceof ClassNotFoundException)) {
                throw runtimeException0;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bszz bszz5 = (bszz)hftp0.b_message;
            bszz5.b |= 4;
            bszz5.e = false;
            return (bszz)hftp0.N_build();
        }
    }

    public static btae c(long v, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btae.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((btae)hftp0.b_message).e = 2;
        ((btae)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bszy.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((bszy)hftv0).b |= 1;
        ((bszy)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        bszy bszy0 = (bszy)hftp1.b_message;
        bszy0.b |= 2;
        bszy0.d = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        btae btae0 = (btae)hftp0.b_message;
        bszy bszy1 = (bszy)hftp1.N_build();
        bszy1.getClass();
        btae0.d = bszy1;
        btae0.c = 2;
        return (btae)hftp0.N_build();
    }

    public static List d(Iterable iterable0) {
        List list0;
        synchronized(ekum.class) {
            bxd bxd0 = new bxd();
            for(Object object0: iterable0) {
                btac btac0 = ((eksc)object0).a;
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)bxd0.get(Integer.valueOf(((int)btac0.f)));
                if(hftp0 == null) {
                    hftp0 = ((ProtoLiteMessage)btap.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((btap)hftv0).b |= 4;
                    ((btap)hftv0).e = 0L;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((btap)hftv1).b |= 2;
                    ((btap)hftv1).d = 0L;
                    long v1 = btac0.f;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    btap btap0 = (btap)hftp0.b_message;
                    btap0.b |= 1;
                    btap0.c = v1;
                    bxd0.put(Integer.valueOf(((int)btac0.f)), hftp0);
                }
                if(((eksc)object0).t()) {
                    ProtoLiteMessage hftv2 = hftp0.b_message;
                    long v2 = ((btap)hftv2).e + 1L;
                    if(!hftv2.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    btap btap1 = (btap)hftp0.b_message;
                    btap1.b |= 4;
                    btap1.e = v2;
                }
                else {
                    ProtoLiteMessage hftv3 = hftp0.b_message;
                    long v3 = ((btap)hftv3).d + 1L;
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    btap btap2 = (btap)hftp0.b_message;
                    btap2.b |= 2;
                    btap2.d = v3;
                }
            }
            list0 = new ArrayList(bxd0.d_num);
            for(Object object1: bxd0.values()) {
                list0.add(((btap)((ProtoLiteBuilder)object1).N_build()));
            }
        }
        return list0;
    }

    public static int e(int v) {
        switch(v - 1) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            default: {
                return -1;
            }
        }
    }

    public static int f(int v) {
        return v - 1 == 1 ? 1 : 0;
    }

    public static int g(int v) {
        switch(v - 1) {
            case 1: {
                return 2;
            }
            case 2: {
                return 0;
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        return 1;
                    }
                    case 4: {
                        return 3;
                    }
                    default: {
                        return -1;
                    }
                }
            }
        }
    }

    public static int h(int v) {
        return v == 1 ? 3 : 2;
    }

    public static int i(int v) {
        return v == 1 ? 2 : 1;
    }

    public static int j(int v) {
        if(v != 0) {
            switch(v) {
                case 1: {
                    return 4;
                }
                case 3: {
                    return 5;
                }
                default: {
                    return 2;
                }
            }
        }
        return 3;
    }

    public static int k(int v) {
        if(v != 0) {
            switch(v) {
                case 1: {
                    return 4;
                }
                case 2: {
                    return 3;
                }
                default: {
                    return 1;
                }
            }
        }
        return 2;
    }

    public static int l(int v) {
        switch(v) {
            case 1: {
                return 2;
            }
            case 4: {
                return 9;
            }
            case 0x20: {
                return 11;
            }
            case 0x40: {
                return 13;
            }
            case 0x100: {
                return 12;
            }
            case 8: 
            case 0x200: {
                return 8;
            }
            case 0x400: {
                return 10;
            }
            case 0x800: {
                return 7;
            }
            default: {
                return 1;
            }
        }
    }
}

