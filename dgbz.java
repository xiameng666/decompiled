import com.google.android.gms.nearby.sharing.RangingData;
import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dgbz implements ibtx {
    public final dgcp a;
    public final dclv b;

    public dgbz(dgcp dgcp0, dclv dclv0) {
        this.a = dgcp0;
        this.b = dclv0;
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ShareTarget shareTarget0 = (ShareTarget)object0;
        ibuq.f(shareTarget0, "shareTarget");
        this.a.i.execute(new dgcd(this.b, shareTarget0, ((int)(((Integer)object1))), ((RangingData)object2)));
        return ibom.a;
    }
}

