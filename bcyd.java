import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.core.settings.ControlPageRequest;

public final class bcyd implements azys {
    public final bcyf a;
    public final ControlPageRequest b;

    public bcyd(bcyf bcyf0, ControlPageRequest controlPageRequest0) {
        this.a = bcyf0;
        this.b = controlPageRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bcyg bcyg0 = (bcyg)object0;
        bcxy bcxy0 = new bcxy(this.a, ((evqp)object1));
        bcyc bcyc0 = (bcyc)bcyg0.H();
        ApiMetadata apiMetadata0 = cclr.b(bcyg0.r);
        bcyc0.a(bcxy0, this.b, apiMetadata0);
    }
}

