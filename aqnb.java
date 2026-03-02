import android.accounts.Account;
import android.content.Context;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class aqnb {
    public static final baun a;
    protected final aqzi b;
    public final gged_interceptors c;
    private final Context d;
    private final aqys e;

    static {
        aqnb.a = aqql.a("FlavorController");
    }

    public aqnb(Context context0, Executor executor0, aqys aqys0, gged_interceptors gged0) {
        aqzi aqzi0 = new aqzi(executor0);
        super();
        this.b = aqzi0;
        this.d = context0;
        this.e = aqys0;
        this.c = gged0;
    }

    public final void a(Callable callable0, aqzm aqzm0) {
        aqnb.b(this.b, callable0, aqzm0);
    }

    public static void b(aqzi aqzi0, Callable callable0, aqzm aqzm0) {
        aqzi0.b(new aqna(callable0, aqzm0));
    }

    public final void c(aqzm aqzm0, aqvd aqvd0) {
        aqnb.a.j("getDisabledBackupDataFlavors", new Object[0]);
        this.a(new aqne(this, aqvd0), aqzm0);
    }

    public final void d(Account account0, aqzm aqzm0, grkf grkf0, aqvd aqvd0) {
        aqnb.a.j("recordConsentAndEnableBackup", new Object[0]);
        this.a(new aqnf(this, account0, grkf0, aqvd0), aqzm0);
    }

    public final boolean e(Account account0, gged_interceptors gged0, grkf grkf0, aqvd aqvd0) {
        if(grkf0 != null) {
            String s = ((ProtoLiteMessage)(((grkg)((ProtoLiteBuilder)grkf0).N_build()))).toString();
            aqnb.a.j(s, new Object[0]);
            Context context0 = this.d;
            aqrn.d(context0, grkf0, account0, aqvd0.a).z(new aqnc());
            grns grns0 = ((grkg)grkf0.b_message).g;
            if(grns0 == null) {
                grns0 = grns.a;
            }
            if((gqtz.b(grns0.c) == null ? gqtz.a : gqtz.b(grns0.c)).equals(gqtz.O)) {
                grku grku0 = ((grkg)grkf0.b_message).f;
                if(grku0 == null) {
                    grku0 = grku.a;
                }
                grkv grkv0 = grku0.d == null ? grkv.a : grku0.d;
                grjl grjl0 = grkv0.h == null ? grjl.a : grkv0.h;
                aqjl.a.d(context0, grjl0.d);
                aqjl.a.h(context0, grjl0.e);
                aqjl.a.b(context0, grjl0.f);
                aqjl.a.c(context0, grjl0.h);
            }
        }
        EnumMap enumMap0 = new EnumMap(aqfx.class);
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            aqni aqni0 = (aqni)gged0.get(v1);
            boolean z = aqni0.e(account0, aqvd0);
            enumMap0.put(aqni0.c(), Boolean.valueOf(z));
            if(aqni0.c() == aqfx.c && !z) {
                String s1 = "recordConsentAndEnableBackup was not successful for flavor " + aqni0.c().name();
                aqnb.a.m(s1, new Object[0]);
                this.g(enumMap0);
                return false;
            }
        }
        this.g(enumMap0);
        return true;
    }

    public static aqnb f(Context context0, Executor executor0, boolean z) {
        ggdy ggdy0 = new ggdy();
        ggdy0.i(new aqnh(context0));
        if(hqje.N()) {
            ggdy0.i(new aqnj(context0));
        }
        if(z) {
            ggdy0.i(new aqnk(context0));
        }
        return new aqnb(context0, executor0, new aqys(context0), ggdy0.h());
    }

    private final void g(Map map0) {
        if(map0.isEmpty()) {
            return;
        }
        aqys aqys0 = this.e;
        Boolean boolean0 = (Boolean)map0.get(aqfx.g);
        Boolean boolean1 = (Boolean)map0.get(aqfx.i);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gicl.a).v_newBuilder();
        if(boolean0 != null) {
            boolean z = boolean0.booleanValue();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gicl gicl0 = (gicl)hftp0.b_message;
            gicl0.b |= 1;
            gicl0.c = z;
        }
        if(boolean1 != null) {
            boolean z1 = boolean1.booleanValue();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gicl gicl1 = (gicl)hftp0.b_message;
            gicl1.b |= 2;
            gicl1.d = z1;
        }
        ProtoLiteBuilder hftp1 = aqra.b();
        gicl gicl2 = (gicl)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gicl2.getClass();
        ghys0.al = gicl2;
        ghys0.d |= 0x2000;
        aqys0.x(hftp1, ghyr.ay, 0);
    }
}

