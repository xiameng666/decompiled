import java.util.ArrayList;
import java.util.List;

final class azbt {
    public static List a(hlox hlox0) {
        List list0 = new ArrayList();
        int v = (int)hqzy.d();
        hlpa hlpa0 = hlox0.h == null ? hlpa.a : hlox0.h;
        gged_interceptors gged0 = ayyq.a;
        int v1 = ((ggna)gged0).c;
        int v3 = 0;
        while(v3 < v1) {
            boolean z = azbt.d(((ayyo)gged0.get(v3)).a(hlpa0), v);
            ++v3;
            if(z) {
                continue;
            }
            list0.add(azbs.a);
            goto label_34;
        }
        hlpd hlpd0 = hlox0.i == null ? hlpd.a : hlox0.i;
        gged_interceptors gged1 = ayyq.b;
        int v4 = ((ggna)gged1).c;
        int v5 = 0;
        while(v5 < v4) {
            boolean z1 = azbt.d(((ayyo)gged1.get(v5)).a(hlpd0), v);
            ++v5;
            if(z1) {
                continue;
            }
            list0.add(azbs.a);
            goto label_34;
        }
        for(Object object0: hlox0.j) {
            hlpd hlpd1 = ((hloy)object0).d;
            if(hlpd1 == null) {
                hlpd1 = hlpd.a;
            }
            int v6 = 0;
        label_29:
            if(v6 < v4) {
                boolean z2 = azbt.d(((ayyo)gged1.get(v6)).a(hlpd1), v);
                ++v6;
                if(z2) {
                    goto label_29;
                }
                list0.add(azbs.a);
                break;
            }
        }
    label_34:
        hlpa hlpa1 = hlox0.h == null ? hlpa.a : hlox0.h;
        long v7 = 0L;
        for(int v8 = 0; v8 < v1; ++v8) {
            v7 += (long)((ayyo)gged0.get(v8)).a(hlpa1);
        }
        hlpd hlpd2 = hlox0.i == null ? hlpd.a : hlox0.i;
        gged_interceptors gged2 = ayyq.b;
        int v9 = ((ggna)gged2).c;
        for(int v10 = 0; v10 < v9; ++v10) {
            v7 += (long)((ayyo)gged2.get(v10)).a(hlpd2);
        }
        long v11 = v7;
        for(Object object1: hlox0.j) {
            hlpd hlpd3 = ((hloy)object1).d;
            if(hlpd3 == null) {
                hlpd3 = hlpd.a;
            }
            for(int v12 = 0; v12 < v9; ++v12) {
                v11 += (long)((ayyo)gged2.get(v12)).a(hlpd3);
            }
        }
        long v13 = hqzy.c();
        if(!azbt.c((hlox0.k == null ? hlpc.a : hlox0.k).d, v11, v13)) {
            list0.add(azbs.b);
        }
        if((hlox0.h == null ? hlpa.a : hlox0.h).d == 0) {
            long v14 = hqzy.a.e().f();
            int v15 = 0;
            while(v15 < v9) {
                ayyo ayyo0 = (ayyo)gged2.get(v15);
                int v16 = 0;
                for(Object object2: hlox0.j) {
                    hlpd hlpd4 = ((hloy)object2).d;
                    if(hlpd4 == null) {
                        hlpd4 = hlpd.a;
                    }
                    v16 += ayyo0.a(hlpd4);
                }
                ++v15;
                if(azbt.c(v16, ayyo0.a((hlox0.i == null ? hlpd.a : hlox0.i)), v14)) {
                    continue;
                }
                else {
                    list0.add(azbs.c);
                }
                break;
            }
        }
        int v17 = (hlox0.h == null ? hlpa.a : hlox0.h).d;
        if(v17 != 0) {
            int v18 = 0;
            int v19 = 0;
            for(int v2 = 0; v2 < v9; ++v2) {
                ayyo ayyo1 = (ayyo)gged2.get(v2);
                for(Object object3: hlox0.j) {
                    hlpd hlpd5 = ((hloy)object3).d;
                    if(hlpd5 == null) {
                        hlpd5 = hlpd.a;
                    }
                    v18 += ayyo1.a(hlpd5);
                }
                v19 += ayyo1.a((hlox0.i == null ? hlpd.a : hlox0.i));
            }
            if(!azbt.c(v19, ((long)v18) + ((long)v17), hqzy.a.e().e())) {
                list0.add(azbs.d);
            }
        }
        return list0;
    }

    public static void b(List list0, int v, ProtoLiteBuilder hftp0) {
        for(Object object0: list0) {
            azbs azbs0 = (azbs)object0;
            int v1 = 3;
            if(v - 1 == 0) {
                switch(azbs0.ordinal()) {
                    case 0: {
                        v1 = 2;
                        break;
                    }
                    case 1: {
                        v1 = 5;
                        break;
                    }
                    case 2: {
                        v1 = 8;
                        break;
                    }
                    case 3: {
                        v1 = 11;
                        break;
                    }
                    case 4: {
                        v1 = 14;
                        break;
                    }
                    default: {
                        throw new AssertionError();
                    }
                }
            }
            else {
                switch(azbs0.ordinal()) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        v1 = 6;
                        break;
                    }
                    case 2: {
                        v1 = 9;
                        break;
                    }
                    case 3: {
                        v1 = 12;
                        break;
                    }
                    case 4: {
                        throw new IllegalArgumentException("CORRUPTED_VALIDATION_ERROR cannot occur in location UPLOAD");
                    }
                    default: {
                        throw new AssertionError();
                    }
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlpc hlpc0 = (hlpc)hftp0.b_message;
            hfuf hfuf0 = hlpc0.h;
            if(!hfuf0.c()) {
                hlpc0.h = ProtoLiteMessage.C(hfuf0);
            }
            hlpc0.h.i(v1 - 1);
        }
    }

    private static boolean c(long v, long v1, long v2) {
        return Math.abs(v1 - v) <= v2;
    }

    private static boolean d(int v, int v1) {
        return v >= 0 && v <= v1;
    }
}

