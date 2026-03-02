import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.romanesco.model.RestoreOptionsEntity;
import com.google.android.gms.romanesco.model.RestoreSourceEntity;

public final class ejxw implements azys {
    public final ejyn a;
    public final String b;
    public final String c;
    public final RestoreOptionsEntity d;
    public final RestoreSourceEntity[] e;

    public ejxw(ejyn ejyn0, String s, String s1, RestoreOptionsEntity restoreOptionsEntity0, RestoreSourceEntity[] arr_restoreSourceEntity) {
        this.a = ejyn0;
        this.b = s;
        this.c = s1;
        this.d = restoreOptionsEntity0;
        this.e = arr_restoreSourceEntity;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ekfl ekfl0 = (ekfl)object0;
        ejym ejym0 = new ejym(this.a, ((evqp)object1));
        ekfk ekfk0 = (ekfk)ekfl0.H();
        ApiMetadata apiMetadata0 = cclr.b(ekfl0.r);
        ekfk0.i(ejym0, this.b, this.c, this.d, this.e, apiMetadata0);
    }
}

