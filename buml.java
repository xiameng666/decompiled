import java.util.concurrent.CancellationException;

final class buml extends ibsl implements ibtw {
    int a;
    final bumo b;
    final hiwq c;

    public buml(bumo bumo0, hiwq hiwq0, ibrl ibrl0) {
        this.b = bumo0;
        this.c = hiwq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buml)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buml(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                burg burg0 = this.b.g;
                hiwq hiwq0 = this.c;
                hius hius0 = hiur.a(((ProtoLiteMessage)hiuq.a).v_newBuilder());
                ibuq.f(hiwq0, "value");
                ProtoLiteBuilder hftp0 = hius0.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hiuq hiuq0 = (hiuq)hftp0.b_message;
                hiwq0.getClass();
                hiuq0.d = hiwq0;
                hiuq0.b |= 2;
                hiuq hiuq1 = hius0.a();
                this.a = 1;
                hixg hixg0 = bure.a(bure.b(((hixg)burg0.b.a().q(cmlp.a, ckhk.b))), burg0.a);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hiuq1).jf(5, null);
                hftp1.X(((ProtoLiteMessage)hiuq1));
                hius hius1 = hiur.a(hftp1);
                hiwm hiwm0 = busb.a;
                ibuq.f(hiwm0, "value");
                ProtoLiteBuilder hftp2 = hius1.a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hiuq hiuq2 = (hiuq)hftp2.b_message;
                hiwm0.getClass();
                hiuq2.c = hiwm0;
                hiuq2.b |= 1;
                object0 = hixg0.b(hius1.a(), new iaof_metadata(), this);
                if(object0 == object1) {
                    return object1;
                }
            label_34:
                hiut hiut0 = (hiut)object0;
                this.b.d.ii(bume.a);
                return ibom.a;
            }
            catch(iapl iapl0) {
                goto label_38;
            }
            catch(iapn iapn0) {
                goto label_42;
            }
            catch(CancellationException cancellationException0) {
                goto label_46;
            }
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(iapl iapl0) {
                goto label_38;
            }
            catch(iapn iapn0) {
                goto label_42;
            }
            catch(CancellationException cancellationException0) {
                goto label_46;
            }
        }
        goto label_34;
    label_38:
        bumd bumd0 = new bumd(iapl0);
        this.b.d.ii(bumd0);
        return ibom.a;
    label_42:
        bumd bumd1 = new bumd(iapn0);
        this.b.d.ii(bumd1);
        return ibom.a;
    label_46:
        bumd bumd2 = new bumd(cancellationException0);
        this.b.d.ii(bumd2);
        return ibom.a;
    }
}

