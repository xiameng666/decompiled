import j..time.Duration;
import j..time.Instant;
import j..time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

final class dmpb extends ibsl implements ibtw {
    Object a;
    int b;
    final dmpe c;

    public dmpb(dmpe dmpe0, ibrl ibrl0) {
        this.c = dmpe0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmpb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmpb(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            goto label_14;
        }
        ibnx.b(object0);
        Instant instant0 = Instant.now();
        ibuq.e(instant0, "now(...)");
        this.a = instant0;
        this.b = 1;
        Object object3 = this.c.a.a(this.c.i, this);
        if(object3 != object1) {
            object2 = instant0;
            object0 = object3;
        label_14:
            Duration duration0 = Duration.between(((Temporal)object2), Instant.now());
            ibuq.e(duration0, "between(...)");
            dmpe dmpe0 = this.c;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hahz.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dmnv dmnv0 = dmpe0.d;
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((hahz)hftv0).d = 5;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hahz)hftp1.b_message).e = dmnv0.a;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hahq.a).v_newBuilder();
            List list0 = ((dmls)object0).b;
            int v = list0.size();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hahq)hftp2.b_message).b = v;
            long v1 = duration0.toNanos();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hahq)hftp2.b_message).c = v1;
            hahq hahq0 = (hahq)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hahz hahz0 = (hahz)hftp1.b_message;
            hahq0.getClass();
            hahz0.c = hahq0;
            hahz0.b = 5;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hapr hapr0 = (hapr)hftp0.b_message;
            hahz hahz1 = (hahz)hftp1.N_build();
            hahz1.getClass();
            hapr0.ca = hahz1;
            hapr0.h |= 0x100;
            dmnv0.b(hftp0);
            dmpe0.k = (dmls)object0;
            if(!((dmls)object0).c.isEmpty()) {
                dmpe0.e.ii(dmov.e);
            }
            else if(!dmpe0.j.isEmpty() && hwja.c()) {
                dmpe0.e.ii(dmov.g);
            }
            else {
                dmpe0.e.ii(dmov.f);
            }
            List list1 = dmpe0.h;
            ArrayList arrayList0 = new ArrayList();
            for(Object object4: list1) {
                if(!list0.contains(((dmmb)object4))) {
                    arrayList0.add(object4);
                }
            }
            dmpe0.h = arrayList0;
            return ibom.a;
        }
        return object1;
    }
}

