import j..util.DesugarCollections;
import java.util.List;
import java.util.concurrent.CancellationException;

final class bumk extends ibsl implements ibtw {
    int a;
    final bumo b;
    final hiwq c;
    final ggdy d;

    public bumk(bumo bumo0, hiwq hiwq0, ggdy ggdy0, ibrl ibrl0) {
        this.b = bumo0;
        this.c = hiwq0;
        this.d = ggdy0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bumk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bumk(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                burf burf0 = this.b.f;
                hiwq hiwq0 = this.c;
                ggdy ggdy0 = this.d;
                hiuk hiuk0 = hiuj.a(((ProtoLiteMessage)hiui.a).v_newBuilder());
                ibuq.f(hiwq0, "value");
                ProtoLiteBuilder hftp0 = hiuk0.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hiui hiui0 = (hiui)hftp0.b_message;
                hiwq0.getClass();
                hiui0.d = hiwq0;
                hiui0.b |= 2;
                List list0 = DesugarCollections.unmodifiableList(hiui0.e);
                ibuq.e(list0, "getResourceNamesList(...)");
                new hfxu(list0);
                gged_interceptors gged0 = ggdy0.h();
                ibuq.e(gged0, "build(...)");
                ibuq.f(gged0, "values");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hiui hiui1 = (hiui)hftp0.b_message;
                hfuo hfuo0 = hiui1.e;
                if(!hfuo0.c()) {
                    hiui1.e = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(gged0, hiui1.e);
                hiui hiui2 = hiuk0.a();
                this.a = 1;
                hixg hixg0 = bure.a(bure.b(((hixg)burf0.b.a().q(cmlp.a, ckhj.b))), burf0.a);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hiui2).jf(5, null);
                hftp1.X(((ProtoLiteMessage)hiui2));
                hiuk hiuk1 = hiuj.a(hftp1);
                hiwm hiwm0 = busb.a;
                ibuq.f(hiwm0, "value");
                ProtoLiteBuilder hftp2 = hiuk1.a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hiui hiui3 = (hiui)hftp2.b_message;
                hiwm0.getClass();
                hiui3.c = hiwm0;
                hiui3.b |= 1;
                object0 = hixg0.a(hiuk1.a(), new iaof_metadata(), this);
                if(object0 == object1) {
                    return object1;
                }
            label_48:
                hium hium0 = (hium)object0;
                this.b.d.ii(bume.a);
                return ibom.a;
            }
            catch(iapl iapl0) {
                goto label_52;
            }
            catch(iapn iapn0) {
                goto label_56;
            }
            catch(CancellationException cancellationException0) {
                goto label_60;
            }
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(iapl iapl0) {
                goto label_52;
            }
            catch(iapn iapn0) {
                goto label_56;
            }
            catch(CancellationException cancellationException0) {
                goto label_60;
            }
        }
        goto label_48;
    label_52:
        bumd bumd0 = new bumd(iapl0);
        this.b.d.ii(bumd0);
        return ibom.a;
    label_56:
        bumd bumd1 = new bumd(iapn0);
        this.b.d.ii(bumd1);
        return ibom.a;
    label_60:
        bumd bumd2 = new bumd(cancellationException0);
        this.b.d.ii(bumd2);
        return ibom.a;
    }
}

