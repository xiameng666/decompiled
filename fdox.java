import android.content.Context;

public final class fdox {
    public final Context a;
    public final ayud b;
    public final ayvf c;
    public final fdow d;
    private static fdox e;
    private static final Long f;

    static {
        fdox.f = (long)1800000L;
    }

    private fdox(Context context0) {
        this.a = context0;
        ayud ayud0 = new ayud(context0, "CW", null);
        this.b = ayud0;
        ayvf ayvf0 = new ayvf(ayud0, "CW_COUNTERS", 30);
        this.c = ayvf0;
        ayvf0.j();
        ayvf0.k(clhl.b.h(1, clhr.a), fdox.f.intValue());
        this.d = fdow.a(context0);
    }

    public static fdox a(Context context0) {
        synchronized(fdox.class) {
            if(fdox.e == null) {
                fdox.e = new fdox(context0);
            }
        }
        return fdox.e;
    }

    public static final gilb b(gilb gilb0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gila.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gila gila0 = (gila)hftp0.b_message;
        gila0.b |= 2;
        gila0.c = true;
        gila gila1 = (gila)hftp0.N_build();
        if(gilb0 == null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gilb.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gilb gilb1 = (gilb)hftp1.b_message;
            gila1.getClass();
            gilb1.d = gila1;
            gilb1.b |= 4;
            return (gilb)hftp1.N_build();
        }
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gilb0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)gilb0));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gilb gilb2 = (gilb)hftp2.b_message;
        gila1.getClass();
        gilb2.d = gila1;
        gilb2.b |= 4;
        return (gilb)hftp2.N_build();
    }
}

