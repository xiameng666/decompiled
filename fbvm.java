import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvm implements bboe {
    final Object a;
    final String b;
    final gamm c;
    final int d;
    final fbvw e;

    public fbvm(fbvw fbvw0, Object object0, String s, gamm gamm0, int v) {
        this.a = object0;
        this.b = s;
        this.c = gamm0;
        this.d = v;
        Objects.requireNonNull(fbvw0);
        this.e = fbvw0;
        super();
    }

    @Override  // bboe
    public final Object a(Object object0) {
        Void void0 = (Void)object0;
        Object object1 = this.a;
        if(!(object1 instanceof MessageLite)) {
            throw new IllegalArgumentException("Request should be MessageLite type");
        }
        byte[] arr_b = ((MessageLite)object1).toBytesArray();
        Object object2 = this.e.d.d(this.b, this.c, arr_b, this.d);
        if(((ServerResponse)object2).d()) {
            if(((ServerResponse)object2).c() == null) {
                throw new IllegalArgumentException("ServerResponse should contain proto response");
            }
            ((ServerResponse)object2).c();
            return object2;
        }
        return object2;
    }
}

