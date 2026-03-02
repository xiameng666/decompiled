import android.content.Intent;
import com.google.android.gms.common.api.ApiMetadata;

public final class ektj implements azys {
    public final ektm a;
    public final Intent b;

    public ektj(ektm ektm0, Intent intent0) {
        this.a = ektm0;
        this.b = intent0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ektn ektn0 = (ektn)object0;
        ekqo ekqo0 = new ekqo(this.a, ((evqp)object1));
        ekqm ekqm0 = (ekqm)ektn0.H();
        ApiMetadata apiMetadata0 = cclr.a(ektn0.r);
        ekqm0.a(this.b, ekqo0, apiMetadata0);
    }
}

