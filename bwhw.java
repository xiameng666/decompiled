import com.google.android.gms.home.stub.HubInfo;

final class bwhw implements icih {
    public static final bwhw a;

    static {
        bwhw.a = new bwhw();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if(((HubInfo)object0) != null) {
            ((ggtj)bwhz.a.h()).B("HUB FOUND: %s", ((HubInfo)object0));
            return ibom.a;
        }
        ((ggtj)bwhz.a.h()).x("Hub search prematurely ended");
        return ibom.a;
    }
}

