import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

final class ueh implements ucs, uct {
    public final ucu a;
    public final ucs b;
    public volatile Object c;
    public volatile ucq d;
    private volatile int e;
    private volatile ucp f;
    private volatile uhn g;

    public ueh(ucu ucu0, ucs ucs0) {
        this.a = ucu0;
        this.b = ucs0;
    }

    @Override  // uct
    public final void a() {
        uhn uhn0 = this.g;
        if(uhn0 != null) {
            uhn0.c.d();
        }
    }

    @Override  // uct
    public final boolean b() {
        boolean z1;
        ubn ubn0;
        boolean z = false;
        if(this.c != null) {
            try {
                Object object0 = this.c;
                this.c = null;
                SystemClock.elapsedRealtimeNanos();
                try {
                    ucu ucu0 = this.a;
                    ubn0 = ucu0.c.a().a(object0);
                    Object object1 = ubn0.a();
                    uai uai0 = ucu0.c.a().b.a(object1.getClass());
                    if(uai0 == null) {
                        throw new txs(object1.getClass());
                    }
                    ucr ucr0 = new ucr(uai0, object1, ucu0.h);
                    ucq ucq0 = new ucq(this.g.a, ucu0.m);
                    ufa ufa0 = ucu0.c();
                    ufa0.c(ucq0, ucr0);
                    if(ufa0.a(ucq0) != null) {
                        this.d = ucq0;
                        this.f = new ucp(Collections.singletonList(this.g.a), ucu0, this);
                        goto label_22;
                    }
                    goto label_24;
                }
                catch(Throwable throwable0) {
                    z1 = false;
                    goto label_32;
                }
            label_22:
                this.g.c.e();
                goto label_35;
                try {
                label_24:
                    uay uay0 = this.g.a;
                    Object object2 = ubn0.a();
                    ubl ubl0 = this.g.c;
                    uag uag0 = this.g.c.fw();
                    this.b.d(uay0, object2, ubl0, uag0, this.g.a);
                    return true;
                }
                catch(Throwable throwable0) {
                    z1 = true;
                }
            label_32:
                if(!z1) {
                    this.g.c.e();
                }
                throw throwable0;
            }
            catch(IOException unused_ex) {
            }
        }
    label_35:
        if(this.f != null && this.f.b()) {
            return true;
        }
        this.f = null;
        this.g = null;
        while(!z) {
            ucu ucu1 = this.a;
            if(this.e >= ucu1.e().size()) {
                break;
            }
            List list0 = ucu1.e();
            int v = this.e;
            this.e = v + 1;
            this.g = (uhn)list0.get(v);
            if(this.g != null && (ucu1.o.c(this.g.c.fw()) || ucu1.g(this.g.c.a()))) {
                this.g.c.g(ucu1.n, new ueg(this, this.g));
                z = true;
            }
        }
        return z;
    }

    @Override  // ucs
    public final void c(uay uay0, Exception exception0, ubl ubl0, uag uag0) {
        uag uag1 = this.g.c.fw();
        this.b.c(uay0, exception0, ubl0, uag1);
    }

    @Override  // ucs
    public final void d(uay uay0, Object object0, ubl ubl0, uag uag0, uay uay1) {
        uag uag1 = this.g.c.fw();
        this.b.d(uay0, object0, ubl0, uag1, uay0);
    }

    final boolean e(uhn uhn0) {
        return this.g != null && this.g == uhn0;
    }
}

