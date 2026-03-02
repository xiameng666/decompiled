import j..util.Collection.-EL;
import j..util.Comparator.-CC;
import j..util.DesugarCollections;
import j..util.Objects;
import j..util.Optional;

public final class ehtm {
    public final ehso a;
    public ehtl b;
    public final ProtoLiteBuilder c;

    public ehtm(ehso ehso0, boolean z, Optional optional0) {
        this.b = ehtl.a;
        this.a = ehso0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwpa.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwpa gwpa0 = (gwpa)hftp0.b_message;
        gwpa0.b |= 4;
        gwpa0.f = z;
        this.c = hftp0;
        Objects.requireNonNull(hftp0);
        optional0.ifPresent(new ehth(hftp0));
    }

    public final Optional a() {
        return Collection.-EL.stream(DesugarCollections.unmodifiableList(((gwpa)this.c.b_message).c)).min(Comparator.-CC.comparing(new ehtj(), hfym.a)).map(new ehtk());
    }

    public final Optional b() {
        return Collection.-EL.stream(DesugarCollections.unmodifiableList(((gwpa)this.c.b_message).c)).max(Comparator.-CC.comparing(new ehtj(), hfym.a)).map(new ehtk());
    }

    public final Optional c() {
        gwpa gwpa0 = (gwpa)this.c.b_message;
        return (gwpa0.b & 16) == 0 ? Optional.empty() : Optional.of(Boolean.valueOf(gwpa0.h));
    }

    public final int d() {
        int v = gwpq.a(((gwpa)this.c.b_message).i);
        return v == 0 ? 1 : v;
    }

    public final void e(int v) {
        ProtoLiteBuilder hftp0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwpa)hftp0.b_message).i = v - 1;
        ((gwpa)hftp0.b_message).b |= 0x20;
    }
}

