import android.content.Context;
import android.os.Build.VERSION;
import j..util.DesugarCollections;
import java.util.Map;

public final class arsv {
    public final Context a;
    public final arto b;
    private final aqjk c;
    private final aruf d;
    private final arue e;

    public arsv(Context context0) {
        this.a = context0.getApplicationContext();
        this.b = arto.a(context0);
        this.c = new aqjk(context0);
        this.d = new aruf(context0);
        this.e = new arue(context0);
    }

    public final long a() {
        return this.c.b("--");
    }

    public final gged_interceptors b() {
        hfuo hfuo0 = hqil.i().b;
        ggdy ggdy0 = new ggdy();
        for(Object object0: hfuo0) {
            String s = (String)object0;
            if(this.n(s) == 1 && this.m(s)) {
                ggdy0.i(s);
            }
        }
        return ggdy0.h();
    }

    public final gged_interceptors c() {
        gged_interceptors gged0 = this.d();
        ggdy ggdy0 = new ggdy();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)gged0.get(v1);
            if(!this.g(s) && !this.h(s)) {
                Map map0 = this.e();
                if(!map0.containsKey(s) || ((arts)map0.get(s)).h <= 2) {
                    ggdy0.i(s);
                }
            }
        }
        return ggdy0.h();
    }

    public final gged_interceptors d() {
        hfuo hfuo0 = hqil.i().b;
        ggdy ggdy0 = new ggdy();
        for(Object object0: hfuo0) {
            String s = (String)object0;
            if(this.n(s) == 2 && this.m(s)) {
                ggdy0.i(s);
            }
        }
        return ggdy0.h();
    }

    public final Map e() {
        return DesugarCollections.unmodifiableMap(this.b.b().c);
    }

    public final boolean f() {
        arts arts0 = (arts)this.e().get("com.google.android.gms");
        if(arts0 != null && (arts0.b & 16) != 0) {
            return arts0.g != 0L;
        }
        long v = this.a();
        long v1 = this.d.a(v);
        arts arts1 = arts.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arts1).v_newBuilder();
        if(arts0 != null) {
            hftp0 = ((ProtoLiteMessage)arts1).w(((ProtoLiteMessage)arts0));
        }
        arue arue0 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arts arts2 = (arts)hftp0.b_message;
        arts2.b |= 16;
        arts2.g = v1;
        arts arts3 = (arts)hftp0.N_build();
        artu artu0 = arue0.a.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)artu.a).w(((ProtoLiteMessage)artu0));
        hftp1.cS("com.google.android.gms", arts3);
        artu artu1 = (artu)hftp1.N_build();
        arue0.a.c(artu1);
        if(v1 == 0L) {
            arue0.c("com.google.android.gms", 3);
        }
        return v1 != 0L;
    }

    public final boolean g(String s) {
        Map map0 = this.e();
        return map0.containsKey(s) ? ((arts)map0.get(s)).c : false;
    }

    public final boolean h(String s) {
        Map map0 = this.e();
        return map0.containsKey(s) ? ((arts)map0.get(s)).d : false;
    }

    public final boolean i() {
        return this.a() != 0L;
    }

    public final boolean j() {
        return !this.c().isEmpty();
    }

    public static final boolean k() {
        return hqil.a.j().U() && ((long)Build.VERSION.SDK_INT) >= hqil.a.j().e();
    }

    public final void l(artu artu0, ProtoLiteBuilder hftp0, int v, String s) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)artu.a).w(((ProtoLiteMessage)artu0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arts arts0 = (arts)hftp0.b_message;
        arts0.b |= 4;
        arts0.e = v;
        hftp1.cS(s, ((arts)hftp0.N_build()));
        artu artu1 = (artu)hftp1.N_build();
        this.b.c(artu1);
    }

    private final boolean m(String s) {
        Map map0 = this.e();
        return map0.containsKey(s) ? ((arts)map0.get(s)).e < 10 : true;
    }

    private final int n(String s) {
        Map map0 = this.e();
        if(map0.containsKey(s)) {
            int v = artr.a(((arts)map0.get(s)).f);
            return v == 0 ? 1 : v;
        }
        return 1;
    }
}

