import android.os.Build.VERSION;
import android.os.Build;
import j..util.Objects;
import j..util.Optional;

public final class azoq {
    private static final ggeo a;
    private static final ggeo b;
    private final genu c;

    static {
        ggek ggek0 = new ggek();
        ggek0.i("arm64-v8a", genr.c);
        ggek0.i("armeabi-v7a", genr.f);
        ggek0.i("x86_64", genr.b);
        ggek0.i("x86", genr.e);
        azoq.a = ggek0.b();
        ggek ggek1 = new ggek();
        ggek1.i("user", gens.c);
        ggek1.i("userdebug", gens.d);
        ggek1.i("eng", gens.e);
        azoq.b = ggek1.b();
    }

    public azoq() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)genu.a).v_newBuilder();
        String s = Build.BOARD;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        genu genu0 = (genu)hftp0.b_message;
        s.getClass();
        genu0.d = s;
        String s1 = Build.VERSION.RELEASE;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((genu)hftv0).f = s1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        genu genu1 = (genu)hftp0.b_message;
        genu1.b = gent.a(5);
        String s2 = gfqz.c(Build.TYPE);
        gens gens0 = (gens)azoq.b.getOrDefault(s2, gens.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        genu genu2 = (genu)hftp0.b_message;
        genu2.i = gens0.a();
        if(Build.SUPPORTED_ABIS.length > 0) {
            ggeo ggeo0 = azoq.a;
            if(ggeo0.containsKey(gfqz.c(Build.SUPPORTED_ABIS[0]))) {
                genr genr0 = (genr)ggeo0.getOrDefault(gfqz.c(Build.SUPPORTED_ABIS[0]), genr.a);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                genu genu3 = (genu)hftp0.b_message;
                genu3.c = genr0.a();
            }
        }
        this.c = (genu)hftp0.N_build();
    }

    public final genu a(genm genm0, Optional optional0, ggfp ggfp0, Optional optional1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)genu.a).v_newBuilder();
        for(Object object0: new hfuh(genm0.n, genm.a)) {
            genv genv0 = (genv)object0;
            genr genr0 = null;
            int v = 5;
            int v1 = 1;
            switch(genv0.ordinal()) {
                case 0: {
                    switch(this.c.b) {
                        case 0: {
                            v = 2;
                            break;
                        }
                        case 1: {
                            v = 3;
                            break;
                        }
                        case 2: {
                            v = 4;
                            break;
                        }
                        case 3: {
                            break;
                        }
                        default: {
                            v = 0;
                        }
                    }
                    if(v != 0) {
                        v1 = v;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    genu genu0 = (genu)hftp0.b_message;
                    genu0.b = gent.a(v1);
                    break;
                }
                case 1: {
                    switch(this.c.c) {
                        case 0: {
                            genr0 = genr.a;
                            break;
                        }
                        case 1: {
                            genr0 = genr.b;
                            break;
                        }
                        case 2: {
                            genr0 = genr.c;
                            break;
                        }
                        case 3: {
                            genr0 = genr.d;
                            break;
                        }
                        case 4: {
                            genr0 = genr.e;
                            break;
                        }
                        case 5: {
                            genr0 = genr.f;
                        }
                    }
                    if(genr0 == null) {
                        genr0 = genr.g;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    genu genu1 = (genu)hftp0.b_message;
                    genu1.c = genr0.a();
                    break;
                }
                case 2: {
                    String s = this.c.d;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    genu genu2 = (genu)hftp0.b_message;
                    s.getClass();
                    genu2.d = s;
                    break;
                }
                case 3: {
                    String s1 = this.c.e;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    genu genu3 = (genu)hftp0.b_message;
                    s1.getClass();
                    genu3.e = s1;
                    break;
                }
                case 4: {
                    String s2 = this.c.f;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    genu genu4 = (genu)hftp0.b_message;
                    s2.getClass();
                    genu4.f = s2;
                    break;
                }
                case 5: {
                    Objects.requireNonNull(hftp0);
                    optional0.ifPresent(new azoo(hftp0));
                    break;
                }
                case 6: {
                    String s3 = this.c.h;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    genu genu5 = (genu)hftp0.b_message;
                    s3.getClass();
                    genu5.h = s3;
                    break;
                }
                case 7: {
                    switch(this.c.i) {
                        case 0: {
                            genr0 = gens.a;
                            break;
                        }
                        case 1: {
                            genr0 = gens.b;
                            break;
                        }
                        case 2: {
                            genr0 = gens.c;
                            break;
                        }
                        case 3: {
                            genr0 = gens.d;
                            break;
                        }
                        case 4: {
                            genr0 = gens.e;
                        }
                    }
                    if(genr0 == null) {
                        genr0 = gens.f;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    genu genu6 = (genu)hftp0.b_message;
                    genu6.i = ((gens)genr0).a();
                    break;
                }
                case 8: {
                    gggc gggc0 = gggc.S(ggog.e(ggfp.F(genm0.o), ggfp0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    genu genu7 = (genu)hftp0.b_message;
                    hfui hfui0 = genu7.j;
                    if(!hfui0.c()) {
                        genu7.j = ProtoLiteMessage.D(hfui0);
                    }
                    hfrj.E(gggc0, genu7.j);
                    break;
                }
                case 9: {
                    Objects.requireNonNull(hftp0);
                    optional1.ifPresent(new azop(hftp0));
                    break;
                }
                default: {
                    throw new AssertionError("Unrecognized or unsupported SystemProfileField: " + genv0.a());
                }
            }
        }
        return (genu)hftp0.N_build();
    }
}

