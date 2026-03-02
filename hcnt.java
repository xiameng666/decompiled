import j..util.DesugarCollections;
import java.util.List;

public final class hcnt {
    public final hftr a;

    public hcnt(hftr hftr0) {
        this.a = hftr0;
    }

    public final hcnu a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcnu)hftv0;
    }

    public final void b(hcnr hcnr0) {
        ibuq.f(hcnr0, "value");
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu0 = (hcnu)hftr0.b_message;
        hcnr0.getClass();
        hcnu0.j = hcnr0;
        hcnu0.b |= 16;
    }

    public final void c(hcos hcos0) {
        ibuq.f(hcos0, "value");
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu0 = (hcnu)hftr0.b_message;
        hcos0.getClass();
        hcnu0.c = hcos0;
        hcnu0.b |= 1;
    }

    public final void d(hfta hfta0, Object object0) {
        ibuq.f(hfta0, "extension");
        ibuq.f(object0, "value");
        this.a.n(hfta0, object0);
    }

    public final void e(int v) {
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu0 = (hcnu)hftr0.b_message;
        hcnu0.b |= 8;
        hcnu0.i = v;
    }

    public final void f(hcqv hcqv0) {
        ibuq.f(hcqv0, "value");
        this.a.p(hcqv0);
    }

    public final void g(hcrz hcrz0) {
        ibuq.f(hcrz0, "value");
        this.a.q(hcrz0);
    }

    public final void h(hcsi hcsi0) {
        ibuq.f(hcsi0, "value");
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnu hcnu0 = (hcnu)hftr0.b_message;
        hcsi0.getClass();
        hcnu0.d();
        hcnu0.f.add(hcsi0);
    }

    public final void i() {
        List list0 = DesugarCollections.unmodifiableList(((hcnu)this.a.b_message).g);
        ibuq.e(list0, "getConditionList(...)");
        new hfxu(list0);
    }

    public final void j() {
        List list0 = DesugarCollections.unmodifiableList(((hcnu)this.a.b_message).h);
        ibuq.e(list0, "getResultingActionList(...)");
        new hfxu(list0);
    }

    public final void k() {
        List list0 = DesugarCollections.unmodifiableList(((hcnu)this.a.b_message).f);
        ibuq.e(list0, "getTriggerList(...)");
        new hfxu(list0);
    }
}

