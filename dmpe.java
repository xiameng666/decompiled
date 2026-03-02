import android.content.Context;
import j..time.Duration;
import j..time.Instant;
import java.util.List;

public final class dmpe extends lsb {
    public final dmmu a;
    public final ibrt b;
    public final Context c;
    public final dmnv d;
    public final lqi e;
    public final lqi f;
    public final lqi g;
    public List h;
    public List i;
    public List j;
    public dmls k;
    public Instant l;
    public final dmou m;
    public int n;

    public dmpe(dmmu dmmu0, dmou dmou0, ibrt ibrt0, Context context0, dmnv dmnv0) {
        this.a = dmmu0;
        this.m = dmou0;
        this.b = ibrt0;
        this.c = context0;
        this.d = dmnv0;
        this.e = new lqi(dmov.a);
        this.f = new lqi();
        this.g = new lqi();
        this.n = 1;
        this.h = ibps.a;
        this.i = ibps.a;
        this.j = ibps.a;
        Instant instant0 = Instant.now();
        ibuq.e(instant0, "now(...)");
        this.l = instant0;
        icbb.b(lsc.a(this), null, null, new dmpa(this, null), 3);
    }

    public final dmov a() {
        Object object0 = this.e.ij();
        if(object0 != null) {
            return (dmov)object0;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final Object b(List list0, List list1, ibrl ibrl0) {
        Object object2;
        dmpd dmpd0;
        if((ibrl0 instanceof dmpd)) {
            dmpd0 = (dmpd)ibrl0;
            int v = dmpd0.e;
            if((v & 0x80000000) == 0) {
                dmpd0 = new dmpd(this, ibrl0);
            }
            else {
                dmpd0.e = v - 0x80000000;
            }
        }
        else {
            dmpd0 = new dmpd(this, ibrl0);
        }
        Object object0 = dmpd0.c;
        Object object1 = ibrx.a;
        switch(dmpd0.e) {
            case 0: {
                ibnx.b(object0);
                dmpd0.a = list0;
                dmpd0.b = list1;
                dmpd0.e = 1;
                Instant instant0 = this.l.plusMillis(hwja.a.b().a());
                ibuq.e(instant0, "plusMillis(...)");
                Instant instant1 = Instant.now();
                ibuq.e(instant1, "now(...)");
                if(instant1.isBefore(instant0)) {
                    object2 = iccv.c(Duration.between(instant1, instant0).toMillis(), dmpd0);
                    if(object2 != object1) {
                        object2 = ibom.a;
                    }
                }
                else {
                    object2 = ibom.a;
                }
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                list1 = dmpd0.b;
                list0 = dmpd0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.h = list0;
        this.j = list1;
        if(!list0.isEmpty()) {
            this.f(dmov.b);
            return ibom.a;
        }
        if(!list1.isEmpty() && hwja.c()) {
            this.f(dmov.g);
            return ibom.a;
        }
        this.c(-1);
        return ibom.a;
    }

    public final void c(int v) {
        this.g.ii(Integer.valueOf(v));
    }

    public final void e() {
        icbb.b(lsc.a(this), null, null, new dmpb(this, null), 3);
    }

    public final void f(dmov dmov0) {
        ibuq.f(dmov0, "page");
        if(dmov0 == dmov.b) {
            this.n = 2;
        }
        if(dmov0 == dmov.g) {
            this.n = 3;
        }
        this.e.ii(dmov0);
        dmnv dmnv0 = this.d;
        hahw hahw0 = (hahw)dmnv0.b.get(dmov0);
        gftb.check(hahw0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hahz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hahz)hftv0).d = 3;
        String s = dmnv0.a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hahz)hftp1.b_message).e = s;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hahv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hahv hahv0 = (hahv)hftp2.b_message;
        hahv0.b = hahw0.a();
        hahv hahv1 = (hahv)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hahz hahz0 = (hahz)hftp1.b_message;
        hahv1.getClass();
        hahz0.c = hahv1;
        hahz0.b = 3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hahz hahz1 = (hahz)hftp1.N_build();
        hahz1.getClass();
        hapr0.ca = hahz1;
        hapr0.h |= 0x100;
        dmnv0.b(hftp0);
    }

    public final void g(List list0) {
        ibuq.f(list0, "<set-?>");
        this.i = list0;
    }
}

