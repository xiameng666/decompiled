import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import jeb.synthetic.FIN;

final class iawo implements ibbs {
    public final Object a;
    public final iaps b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public ibbr f;
    public Collection g;
    public volatile iawn h;
    private final iaml i;
    private final Executor j;

    public iawo(Executor executor0, iaps iaps0) {
        this.i = iaml.a(iawo.class, null);
        this.a = new Object();
        this.g = new LinkedHashSet();
        this.h = new iawn(null, null);
        this.j = executor0;
        this.b = iaps0;
    }

    final void a(iand iand0) {
        iauy iauy0;
        synchronized(this.a) {
            this.h = new iawn(iand0, this.h.b);
            if(iand0 != null && this.e()) {
                ArrayList arrayList0 = new ArrayList(this.g);
                ArrayList arrayList1 = new ArrayList();
                int v1 = arrayList0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    iawm iawm0 = (iawm)arrayList0.get(v2);
                    iana iana0 = iawm0.a;
                    iamz iamz0 = iand0.a(iana0);
                    iakq iakq0 = iana0.a;
                    if(iakq0.k() && iamz0.d()) {
                        iawm0.d = iamz0.c;
                    }
                    iavb iavb0 = iayh.c(iamz0, iakq0.k());
                    if(iavb0 != null) {
                        Executor executor0 = this.j;
                        Executor executor1 = iakq0.c;
                        if(executor1 != null) {
                            executor0 = executor1;
                        }
                        ialq ialq0 = iawm0.b;
                        ialq ialq1 = ialq0.a();
                        try {
                            iauy0 = iavb0.b(iana0.c, iana0.b, iakq0, iawm0.c);
                        }
                        catch(Throwable throwable0) {
                            iawm0.b.c(ialq1);
                            throw throwable0;
                        }
                        ialq0.c(ialq1);
                        Runnable runnable0 = iawm0.q(iauy0);
                        if(runnable0 != null) {
                            executor0.execute(runnable0);
                        }
                        arrayList1.add(iawm0);
                    }
                }
                synchronized(this.a) {
                    if(!this.e()) {
                        return;
                    }
                    for(Object object2: arrayList1) {
                        this.g.remove(((iawm)object2));
                    }
                    if(this.g.isEmpty()) {
                        this.g = new LinkedHashSet();
                    }
                    if(!this.e()) {
                        iaps iaps0 = this.b;
                        iaps0.c(this.d);
                        if(this.h.b != null) {
                            Runnable runnable1 = this.e;
                            if(runnable1 != null) {
                                iaps0.c(runnable1);
                                this.e = null;
                            }
                        }
                    }
                }
                this.b.b();
            }
        }
    }

    @Override  // iavb
    public final iauy b(gRPCMethodDescriptor iaoj0, iaof_metadata iaof0, iakq iakq0, ialc[] arr_ialc) {
        iauy iauy0;
        iawn iawn1;
        Object object0;
        iamz iamz0;
        int v = FIN.finallyOpen$NT();
        iana iana0 = new iana(iaoj0, iaof0, iakq0, new ibcf());
        iawn iawn0 = this.h;
        while(true) {
            iapk iapk0 = iawn0.b;
            if(iapk0 == null) {
                iand iand0 = iawn0.a;
                if(iand0 == null) {
                    iamz0 = null;
                }
                else {
                    iamz0 = iand0.a(iana0);
                    iakq iakq1 = iana0.a;
                    iavb iavb0 = iayh.c(iamz0, iakq1.k());
                    if(iavb0 != null) {
                        iauy0 = iavb0.b(iana0.c, iana0.b, iakq1, arr_ialc);
                        goto label_32;
                    }
                }
                object0 = this.a;
                __monitor_enter(object0);
                try {
                    iawn1 = this.h;
                    if(iawn0 == iawn1) {
                        iauy0 = new iawm(this, iana0, arr_ialc);
                        if(iana0.a.k() && iamz0 != null && iamz0.d()) {
                            iauy0.d = iamz0.c;
                        }
                        this.g.add(iauy0);
                        if(this.g.size() == 1) {
                            this.b.c(this.c);
                        }
                        int v1 = 0;
                        while(true) {
                            if(v1 >= arr_ialc.length) {
                                goto label_31;
                            }
                            ialc ialc0 = arr_ialc[v1];
                            ++v1;
                        }
                    }
                    goto label_36;
                }
                catch(Throwable throwable0) {
                    break;
                }
            label_31:
                __monitor_exit(object0);
            }
            else {
                iauy0 = new iaxs(iapk0, arr_ialc);
            }
        label_32:
            FIN.finallyCodeBegin$NT(v);
            return iauy0;
            try {
            label_36:
                __monitor_exit(object0);
                iawn0 = iawn1;
                continue;
            }
            catch(Throwable throwable0) {
            }
            break;
        }
        __monitor_exit(object0);
        throw throwable0;
    }

    @Override  // iamq
    public final iaml c() {
        return this.i;
    }

    @Override  // ibbs
    public final Runnable d(ibbr ibbr0) {
        throw null;
    }

    public final boolean e() {
        synchronized(this.a) {
        }
        return this.g.isEmpty() ^ 1;
    }

    @Override  // ibbs
    public final void p(iapk iapk0) {
        synchronized(this.a) {
            if(this.h.b != null) {
                return;
            }
            this.h = new iawn(this.h.a, iapk0);
            iaps iaps0 = this.b;
            iaps0.c(new iawl(this));
            if(!this.e()) {
                Runnable runnable0 = this.e;
                if(runnable0 != null) {
                    iaps0.c(runnable0);
                    this.e = null;
                }
            }
        }
        this.b.b();
    }

    @Override  // ibbs
    public final void q(iapk iapk0) {
        Runnable runnable0;
        this.p(iapk0);
        synchronized(this.a) {
            Collection collection0 = this.g;
            runnable0 = this.e;
            this.e = null;
            if(!collection0.isEmpty()) {
                this.g = Collections.EMPTY_LIST;
            }
        }
        if(runnable0 != null) {
            for(Object object1: collection0) {
                Runnable runnable1 = ((iawm)object1).q(new iaxs(iapk0, iauz.b, ((iawm)object1).c));
                if(runnable1 != null) {
                    runnable1.run();
                }
            }
            this.b.execute(runnable0);
        }
    }
}

