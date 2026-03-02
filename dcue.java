import com.google.android.gms.nearby.sharing.ShareTarget;
import j..util.concurrent.ConcurrentMap.-EL;

final class dcue implements icih {
    final dcus a;

    public dcue(dcus dcus0) {
        this.a = dcus0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dcvz.a.b().h("[CLOUD_SHARING_PROVIDER]: %s", ((dcqt)object0));
        if((((dcqt)object0) instanceof dcqr)) {
            dcud dcud0 = new dcud(new dcuc(((dcqr)(((dcqt)object0))), this.a));
            ShareTarget shareTarget0 = ((dcuk)ConcurrentMap.-EL.computeIfAbsent(this.a.e, ((dcqr)(((dcqt)object0))).a.b, dcud0)).b;
            this.a.b.k(shareTarget0, "CLOUD_SHARING_PROVIDER_ID");
            dclv dclv0 = (dclv)this.a.g.b();
            if(dclv0 == null) {
                return ibom.a;
            }
            dclv0.jJ(shareTarget0);
            return ibom.a;
        }
        if(!(((dcqt)object0) instanceof dcqs)) {
            throw new ibnq();
        }
        dcus dcus0 = this.a;
        dcuk dcuk0 = (dcuk)dcus0.e.remove(((dcqs)(((dcqt)object0))).a.b);
        if(dcuk0 != null) {
            ShareTarget shareTarget1 = dcuk0.b;
            dcus0.b.o(shareTarget1);
            dclv dclv1 = (dclv)dcus0.g.b();
            if(dclv1 != null) {
                dclv1.c(shareTarget1);
            }
        }
        return ibom.a;
    }
}

