import android.os.Bundle;
import com.google.android.gms.common.api.ApiMetadata;

public final class ezdz implements azys {
    public final int a;
    public final Bundle b;
    public final azts c;

    public ezdz(azts azts0, int v, Bundle bundle0) {
        this.c = azts0;
        this.a = v;
        this.b = bundle0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ezct ezct0 = (ezct)object0;
        ezde ezde0 = new ezde(this.c, ((evqp)object1));
        ezdc ezdc0 = (ezdc)ezct0.H();
        ApiMetadata apiMetadata0 = cclr.b(ezct0.r);
        ezdc0.a(ezde0, this.a, this.b, apiMetadata0);
    }
}

