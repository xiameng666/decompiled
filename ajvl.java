import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;
import java.util.List;

public final class ajvl implements azys {
    final List a;
    final String b;

    public ajvl(azts azts0, List list0, String s) {
        this.a = list0;
        this.b = s;
        Objects.requireNonNull(azts0);
        super();
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ajvn ajvn0 = (ajvn)object0;
        ajvk ajvk0 = new ajvk(this, ((evqp)object1));
        SharedKey[] arr_sharedKey = new SharedKey[this.a.size()];
        this.a.toArray(arr_sharedKey);
        ajti ajti0 = (ajti)ajvn0.H();
        ApiMetadata apiMetadata0 = cclr.a(ajvn0.r);
        ajti0.y(ajvk0, this.b, arr_sharedKey, apiMetadata0);
    }
}

