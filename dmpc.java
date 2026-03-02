import j..time.Duration;
import j..time.Instant;
import j..time.temporal.Temporal;
import java.util.List;

final class dmpc extends ibsl implements ibtw {
    Object a;
    int b;
    final dmpe c;

    public dmpc(dmpe dmpe0, ibrl ibrl0) {
        this.c = dmpe0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmpc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmpc(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            Instant instant0 = Instant.now();
            ibuq.e(instant0, "now(...)");
            dmpe dmpe0 = this.c;
            List list0 = dmpe0.j;
            this.a = instant0;
            this.b = 1;
            Object object3 = hwkz.d() && hwkz.c() ? dmpe0.m.a.c(list0, this) : dmmd.a;
            if(object3 == object1) {
                return object1;
            }
            object2 = instant0;
            object0 = object3;
        }
        else {
            object2 = this.a;
            ibnx.b(object0);
        }
        Duration duration0 = Duration.between(((Temporal)object2), Instant.now());
        ibuq.e(duration0, "between(...)");
        dmpe dmpe1 = this.c;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hahz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dmnv dmnv0 = dmpe1.d;
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hahz)hftv0).d = 8;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hahz)hftp1.b_message).e = dmnv0.a;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hahs.a).v_newBuilder();
        long v = (long)((dmmd)object0).b.size();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hahs)hftp2.b_message).b = v;
        long v1 = duration0.toNanos();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hahs)hftp2.b_message).c = v1;
        hahs hahs0 = (hahs)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hahz hahz0 = (hahz)hftp1.b_message;
        hahs0.getClass();
        hahz0.c = hahs0;
        hahz0.b = 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hahz hahz1 = (hahz)hftp1.N_build();
        hahz1.getClass();
        hapr0.ca = hahz1;
        hapr0.h |= 0x100;
        dmnv0.b(hftp0);
        if(((dmmd)object0).c.isEmpty()) {
            dmpe1.e.ii(dmov.f);
            dmpe1.j = ibps.a;
            return ibom.a;
        }
        dmpe1.e.ii(dmov.d);
        return ibom.a;
    }
}

