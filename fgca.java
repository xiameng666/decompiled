import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import jeb.synthetic.TWR;

public final class fgca {
    public final fgch a;
    public final ggfp b;
    public final gful_cronetEngineProvider c;
    private final gfsx d;

    public fgca(fgbz fgbz0) {
        this.a = fgbz0.a;
        this.d = gfsx.l(fgbz0.b);
        this.b = fgbz0.c.h();
        gful_cronetEngineProvider gful0 = fgbz0.d;
        if(gful0 == null) {
            gful0 = new fgby();
        }
        this.c = gful0;
    }

    public static gfsx a(Class class0) {
        try {
            return gfsx.m(((fgck)class0.getDeclaredConstructor(null).newInstance(null)));
        }
        catch(ReflectiveOperationException unused_ex) {
            return gfqx.a;
        }
    }

    public final ggeo b() {
        gfsx gfsx0 = this.d;
        if(gfsx0.i()) {
            ggek ggek0 = new ggek();
            ggek0.m(fgca.c());
            ggek0.m(((Map)((gful_cronetEngineProvider)gfsx0.d()).mr()));
            return ggek0.b();
        }
        return fgca.c();
    }

    static ggeo c() {
        return ggeo.s(abyk.b, fgde.class, abyk.d, fgdh.class, abyk.e, fgdf.class, abyk.f, fgdj.class, abyk.i, fgdi.class, abyk.j, fgdo.class, abyk.l, fgdd.class, abyk.n, fgdp.class);
    }

    public final void d(Context context0, abyk abyk0, abyg abyg0) {
        Log.e("AppDoctor", "Failed on fix: " + abyk0.a());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)abyi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        "com.google.android.gms".getClass();
        ((abyi)hftv0).b |= 1;
        ((abyi)hftv0).c = "com.google.android.gms";
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        abyi abyi0 = (abyi)hftp0.b_message;
        abyi0.g = abyg0.a();
        abyi0.b |= 16;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        abyi abyi1 = (abyi)hftp0.b_message;
        abyi1.f = abyh.a(6);
        abyi1.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        abyi abyi2 = (abyi)hftp0.b_message;
        abyi2.e = abyk0.a();
        abyi2.b |= 4;
        abyi abyi3 = (abyi)hftp0.N_build();
        this.a.b(abyi3);
    }

    public final void e(Context context0, abzf abzf0, abyg abyg0) {
        abyk abyk0;
        if(abzf0 == null) {
            abyk0 = abyk.a;
        }
        else {
            abyk0 = abyk.b(abzf0.b);
            if(abyk0 == null) {
                abyk0 = abyk.o;
            }
        }
        this.d(context0, abyk0, abyg0);
    }

    public final void f(Context context0, abyk abyk0, abyg abyg0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)abyi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        "com.google.android.gms".getClass();
        ((abyi)hftv0).b |= 1;
        ((abyi)hftv0).c = "com.google.android.gms";
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        abyi abyi0 = (abyi)hftp0.b_message;
        abyi0.g = abyg0.a();
        abyi0.b |= 16;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        abyi abyi1 = (abyi)hftp0.b_message;
        abyi1.f = abyh.a(5);
        abyi1.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        abyi abyi2 = (abyi)hftp0.b_message;
        abyi2.e = abyk0.a();
        abyi2.b |= 4;
        abyi abyi3 = (abyi)hftp0.N_build();
        this.a.b(abyi3);
    }

    public final boolean g(Context context0, abyg abyg0) {
        fgcw fgcw0;
        abyk abyk4;
        fgcg fgcg0;
        fgcf fgcf0 = (fgcf)this.c.mr();
        if(fgcf0.b(context0)) {
            fgcp fgcp0 = new fgcp();
            fgcp0.b = context0;
            fgcp0.a = abyg0;
            fgcp0.c = this.a;
            fgcq fgcq0 = fgcp0.a();
            try(fgcg0 = fgcf0.a(context0)) {
                fgcx fgcx0 = new fgcx(new fgbw(this, fgcg0, fgcq0));
                ggeo ggeo0 = this.b();
                Iterator iterator0 = fgcg0.b().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    abzf abzf0 = (abzf)object0;
                    abyk abyk0 = abyk.b(abzf0.b);
                    if(abyk0 == null) {
                        abyk0 = abyk.o;
                    }
                    if(ggeo0.containsKey(abyk0)) {
                        abyk abyk1 = abyk.b(abzf0.b);
                        if(abyk1 == null) {
                            abyk1 = abyk.o;
                        }
                        gfsx gfsx0 = fgca.a(((Class)ggeo0.get(abyk1)));
                        if(gfsx0.i()) {
                            String s = abzf0.e;
                            abyk abyk2 = abyk.b(abzf0.b);
                            if(abyk2 == null) {
                                abyk2 = abyk.o;
                            }
                            abzc abzc0 = abzf0.c;
                            if(abzc0 == null) {
                                abzc0 = abzc.a;
                            }
                            fgcx0.c(new fgco(s, abyk2, abzc0, ((fgck)gfsx0.d()), fgco.a));
                        }
                        else {
                            this.e(fgcq0.b, abzf0, fgcq0.a);
                        }
                    }
                    else {
                        Context context1 = fgcq0.b;
                        abyg abyg1 = fgcq0.a;
                        if(abzf0 == null) {
                            abyk4 = abyk.a;
                        }
                        else {
                            abyk abyk3 = abyk.b(abzf0.b);
                            abyk4 = abyk3 == null ? abyk.o : abyk3;
                        }
                        this.f(context1, abyk4, abyg1);
                    }
                }
                fgcw0 = fgcx0.b(fgcq0);
            }
            catch(RemoteException | RuntimeException unused_ex) {
                goto label_74;
            }
            try {
                TWR.useResource$NT(fgcg0);
                fgcw0.b.get();
                return fgcw0.a;
            }
            catch(ExecutionException | InterruptedException | RuntimeException unused_ex) {
                try {
                    TWR.useResource$NT(fgcg0);
                    this.e(context0, abzf.a, abyg0);
                    return false;
                }
                catch(RemoteException | RuntimeException unused_ex) {
                    goto label_74;
                }
            }
            catch(RemoteException unused_ex) {
            label_74:
                this.e(context0, abzf.a, abyg0);
            }
        }
        return false;
    }
}

