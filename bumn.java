import java.util.concurrent.CancellationException;

final class bumn extends ibsl implements ibtw {
    int a;
    final bumo b;
    final String c;

    public bumn(bumo bumo0, String s, ibrl ibrl0) {
        this.b = bumo0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bumn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bumn(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                burn burn0 = this.b.i;
                hjcj hjcj0 = hjci.a(((ProtoLiteMessage)hjch.a).v_newBuilder());
                hjcg hjcg0 = hjcg.d;
                ibuq.f(hjcg0, "value");
                ProtoLiteBuilder hftp0 = hjcj0.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hjch hjch0 = (hjch)hftp0.b_message;
                hjch0.d = hjcg0.a();
                hjch hjch1 = hjcj0.a();
                String s = this.c;
                this.a = 1;
                fhad fhad0 = fhae.a();
                fhad0.b(burn0.b.a);
                iakr iakr0 = cmma.g(0x11101, -1, fhad0.a(), new fhbw()).a(hjcv.i);
                ibuq.e(iakr0, "get(...)");
                hjcn hjcn0 = (hjcn)new hjcn(iakr0, iakq.a).q(cmlp.a, ckhi.b);
                gpie gpie0 = new gpie(null);
                hfuo hfuo0 = htuh.c().b;
                ibuq.e(hfuo0, "getElementList(...)");
                gpie0.b(ggdx.d(hfuo0));
                gpig gpig0 = new gpig(gpie0.a());
                hjcn hjcn1 = (hjcn)hjcn0.q(gpji.g, gpig0);
                gphs gphs0 = new gphs(burn0.a, "google");
                hjcn hjcn2 = (hjcn)hjcn1.q(gphs.a, gphs0);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hjch1).jf(5, null);
                hftp1.X(((ProtoLiteMessage)hjch1));
                hjcj hjcj1 = hjci.a(hftp1);
                ibuq.f(s, "versionCode");
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hjcd.a).v_newBuilder();
                ibuq.f(hftp2, "builder");
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hjcf.a).v_newBuilder();
                ibuq.f(hftp3, "builder");
                hjce hjce0 = hjce.p;
                ibuq.f(hjce0, "value");
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hjcf hjcf0 = (hjcf)hftp3.b_message;
                hjcf0.c = hjce0.a();
                ibuq.f(s, "value");
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hjcf hjcf1 = (hjcf)hftp3.b_message;
                s.getClass();
                hjcf1.b = s;
                ProtoLiteMessage hftv0 = hftp3.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((hjcf)hftv0), "value");
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hjcd hjcd0 = (hjcd)hftp2.b_message;
                ((hjcf)hftv0).getClass();
                hjcd0.c = (hjcf)hftv0;
                hjcd0.b |= 1;
                ProtoLiteMessage hftv1 = hftp2.N_build();
                ibuq.e(hftv1, "build(...)");
                ibuq.f(((hjcd)hftv1), "value");
                ProtoLiteBuilder hftp4 = hjcj1.a;
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                hjch hjch2 = (hjch)hftp4.b_message;
                ((hjcd)hftv1).getClass();
                hjch2.c = (hjcd)hftv1;
                hjch2.b |= 1;
                object0 = hjcn2.a(hjcj1.a(), new iaof_metadata(), this);
                if(object0 == object1) {
                    return object1;
                }
            label_72:
                hjck hjck0 = (hjck)object0;
            }
            catch(iapl iapl0) {
                a.ae(bumo.a.j(), "There was an error while recording upsell dismissal", iapl0);
            }
            catch(iapn iapn0) {
                a.ae(bumo.a.j(), "There was an error while recording upsell dismissal", iapn0);
            }
            catch(CancellationException cancellationException0) {
                a.ae(bumo.a.j(), "There was an error while recording upsell dismissal", cancellationException0);
            }
            return ibom.a;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(iapl iapl0) {
                a.ae(bumo.a.j(), "There was an error while recording upsell dismissal", iapl0);
                return ibom.a;
            }
            catch(iapn iapn0) {
                a.ae(bumo.a.j(), "There was an error while recording upsell dismissal", iapn0);
                return ibom.a;
            }
            catch(CancellationException cancellationException0) {
                a.ae(bumo.a.j(), "There was an error while recording upsell dismissal", cancellationException0);
                return ibom.a;
            }
        }
        goto label_72;
    }
}

