import java.util.HashMap;

public final class zhl implements lqj {
    public final zhm a;

    public zhl(zhm zhm0) {
        this.a = zhm0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        zho zho0 = (zho)object0;
        zhm zhm0 = this.a;
        HashMap hashMap0 = new HashMap(zhm0.a.size());
        for(Object object1: zhm0.a) {
            zho zho1 = (zho)((lqd)object1).ij();
            if(zho1 == null) {
                return;
            }
            hashMap0.put((zho1.a.e == null ? grxw.a : zho1.a.e), zho1.a);
        }
        zhm0.l(hashMap0);
    }
}

