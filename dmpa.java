import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import j..time.Duration;
import j..time.Instant;
import j..time.temporal.Temporal;
import java.util.Collection;
import java.util.List;

final class dmpa extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    int d;
    final dmpe e;

    public dmpa(dmpe dmpe0, ibrl ibrl0) {
        this.e = dmpe0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmpa)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmpa(this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        List list0;
        Object object8;
        Object object5;
        Object object4;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.d) {
            case 0: {
                ibnx.b(object0);
                object2 = Instant.now();
                ibuq.e(object2, "now(...)");
                dmoz dmoz0 = new dmoz(this.e, null);
                this.a = object2;
                this.d = 1;
                object0 = icbd.a(this.e.b, dmoz0, this);
                if(object0 != object1) {
                    goto label_15;
                }
                break;
            }
            case 1: {
                object2 = this.a;
                ibnx.b(object0);
            label_15:
                if(((AccountInfo)object0) != null) {
                    this.e.d.c = ((AccountInfo)object0).b;
                }
                dmpe dmpe0 = this.e;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hahz.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                dmnv dmnv0 = dmpe0.d;
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((hahz)hftv0).e = dmnv0.a;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hahz)hftp1.b_message).d = 1;
                hahz hahz0 = (hahz)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hapr hapr0 = (hapr)hftp0.b_message;
                hahz0.getClass();
                hapr0.ca = hahz0;
                hapr0.h |= 0x100;
                dmnv0.b(hftp0);
                if(((AccountInfo)object0) == null) {
                    this.a = null;
                    this.d = 2;
                    return dmpe0.b(ibps.a, ibps.a, this) != object1 ? ibom.a : object1;
                }
                this.a = object2;
                this.b = (AccountInfo)object0;
                this.d = 3;
                Object object3 = dmpe0.a.b(this);
                if(object3 != object1) {
                    object4 = (AccountInfo)object0;
                    object0 = object3;
                    object5 = object2;
                    goto label_55;
                }
                break;
            }
            case 3: {
                Object object6 = this.b;
                Object object7 = this.a;
                ibnx.b(object0);
                object5 = object7;
                object4 = object6;
            label_55:
                object8 = (List)object0;
                if(hwja.c()) {
                    this.a = object5;
                    this.b = object4;
                    this.c = object8;
                    this.d = 4;
                    object0 = this.e.m.a(this);
                    if(object0 != object1) {
                        list0 = (List)object0;
                        goto label_72;
                    }
                }
                else {
                    list0 = ibps.a;
                    goto label_72;
                }
                break;
            }
            case 4: {
                object8 = this.c;
                object4 = this.b;
                object5 = this.a;
                ibnx.b(object0);
                list0 = (List)object0;
            label_72:
                Duration duration0 = Duration.between(((Temporal)object5), Instant.now());
                ibuq.e(duration0, "between(...)");
                dmpe dmpe1 = this.e;
                List list1 = ibpo.ak(((Collection)object8), list0);
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hahz.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                dmnv dmnv1 = dmpe1.d;
                ProtoLiteMessage hftv1 = hftp3.b_message;
                ((hahz)hftv1).e = dmnv1.a;
                if(!hftv1.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((hahz)hftp3.b_message).d = 4;
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hahr.a).v_newBuilder();
                int v = list1.size();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ((hahr)hftp4.b_message).b = v;
                long v1 = duration0.toNanos();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ((hahr)hftp4.b_message).c = v1;
                hahr hahr0 = (hahr)hftp4.N_build();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hahz hahz1 = (hahz)hftp3.b_message;
                hahr0.getClass();
                hahz1.c = hahr0;
                hahz1.b = 4;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hapr hapr1 = (hapr)hftp2.b_message;
                hahz hahz2 = (hahz)hftp3.N_build();
                hahz2.getClass();
                hapr1.ca = hahz2;
                hapr1.h |= 0x100;
                dmnv1.b(hftp2);
                dmpe1.f.ii(object4);
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 5;
                if(dmpe1.b(((List)object8), list0, this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return object1;
    }
}

