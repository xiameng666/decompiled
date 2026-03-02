import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import j..util.Optional;

public final class azly {
    public final azoq a;
    public final genm b;
    public final String c;
    public final ggfp d;
    public final azme e;
    public final azmb f;
    public final Optional g;
    private final azks h;

    @AssistedInject
    public azly(azoq azoq0, @Assisted azks azks0, @Assisted genm genm0, @Assisted String s, @Assisted ggfp ggfp0, @Assisted azme azme0, @Assisted azmb azmb0, @Assisted Optional optional0) {
        this.a = azoq0;
        this.h = azks0;
        this.b = genm0;
        this.c = s;
        this.d = ggfp0;
        this.e = azme0;
        this.f = azmb0;
        this.g = optional0;
    }

    public final int a() {
        int v = this.b.l;
        int v1 = 1;
        if(genx.a(v) == 2) {
            return 1;
        }
        int v2 = genx.a(v) == 0 ? 1 : genx.a(v);
        if(v2 - 2 != 1) {
            v1 = 7;
            switch(v2 - 2) {
                case 7: 
                case 28: {
                    break;
                }
                case 30: {
                    return 30;
                }
                default: {
                    throw new AssertionError("Unrecognized or unsupported WindowSize: " + v);
                }
            }
        }
        return v1;
    }

    public final gend b(int v, genu genu0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gend.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        azks azks0 = this.h;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        azkp azkp0 = azks0.a;
        ((gend)hftv0).c = azkp0.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gend)hftv1).d = azkp0.b;
        int v1 = azks0.b;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gend)hftv2).e = v1;
        int v2 = azks0.c;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gend)hftv3).f = v2;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gend)hftv4).g = v;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        gend gend0 = (gend)hftp0.b_message;
        genu0.getClass();
        gend0.h = genu0;
        gend0.b |= 1;
        return (gend)hftp0.N_build();
    }

    public final boolean c(genu genu0) {
        genm genm0 = this.b;
        if(genm0.o.size() == 0) {
            return true;
        }
        for(Object object0: genm0.o) {
            if(genu0.j.contains(((Long)object0))) {
                return true;
            }
        }
        return false;
    }
}

