import android.accounts.Account;
import android.util.Log;
import j..util.DesugarCollections;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public final class fdnd {
    public final ciqf a;
    public final fdpb b;
    public String c;

    public fdnd() {
        this.a = ciqf.v();
        ffar ffar0 = hzxv.a.d().d();
        ggek ggek0 = new ggek();
        for(Object object0: DesugarCollections.unmodifiableMap(ffar0.b).entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            ggek ggek1 = new ggek();
            for(Object object1: DesugarCollections.unmodifiableMap(((ffbj)((Map.Entry)object0).getValue()).b).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(!gfta.c(((String)map$Entry0.getValue()))) {
                    ggek1.i(((String)map$Entry0.getKey()), Pattern.compile(((String)map$Entry0.getValue())));
                }
            }
            ggek0.i(s, ggek1.b());
        }
        this.b = new fdpb(ffar0, new fdpa(ggek0.b()));
        this.c = "";
    }

    public final void a(fdng fdng0) {
        if(hzxv.g() && hzxv.f()) {
            this.f(((gful_cronetEngineProvider)new fdnb(this, fdng0)));
            return;
        }
        if(Log.isLoggable("WearableEventLogger", 2)) {
            Log.v("WearableEventLogger", "log: Data item logging is disabled");
        }
    }

    public final void b(fdni fdni0) {
        if(hzxv.g() && hzxv.h()) {
            this.f(((gful_cronetEngineProvider)new fdnc(this, fdni0)));
            return;
        }
        if(Log.isLoggable("WearableLogger", 2)) {
            Log.v("WearableLogger", "log: RPC logging is disabled");
        }
    }

    public final void c(gged_interceptors gged0) {
        if(!gged0.isEmpty() && gged0.get(0) != null) {
            this.c = gfta.b(((Account)gged0.get(0)).name);
        }
    }

    public static final gild d(fdom fdom0) {
        hftr hftr0 = (hftr)((ProtoLiteMessage)gild.a).v_newBuilder();
        hftr0.n(fdoq.a, fdom0);
        return (gild)((ProtoLiteBuilder)hftr0).N_build();
    }

    public final void e(String s, int v, int v1, fdog fdog0) {
        if(hzxv.g() && hzxv.e()) {
            this.f(((gful_cronetEngineProvider)new fdna(s, v, fdog0, v1)));
            return;
        }
        if(Log.isLoggable("WearableLogger", 2)) {
            Log.v("WearableLogger", "log: Asset logging is disabled");
        }
    }

    private final void f(gful_cronetEngineProvider gful0) {
        ciqf ciqf0 = this.a;
        if(ciqf0.s().b.booleanValue()) {
            ciqf0.g(gful0, this.c);
            return;
        }
        ciqf0.d(gful0);
    }
}

