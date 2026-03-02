import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.romanesco.model.RestoreSourceEntity;

public final class ejxt implements azys {
    public final ejyn a;
    public final String b;
    public final String c;
    public final RestoreSourceEntity[] d;

    public ejxt(ejyn ejyn0, String s, String s1, RestoreSourceEntity[] arr_restoreSourceEntity) {
        this.a = ejyn0;
        this.b = s;
        this.c = s1;
        this.d = arr_restoreSourceEntity;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ekfl ekfl0 = (ekfl)object0;
        ejyl ejyl0 = new ejyl(this.a, ((evqp)object1));
        ekfk ekfk0 = (ekfk)ekfl0.H();
        ApiMetadata apiMetadata0 = cclr.b(ekfl0.r);
        ekfk0.a(ejyl0, this.b, this.c, this.d, apiMetadata0);
    }
}

