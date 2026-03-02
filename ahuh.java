import android.os.Bundle;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahuh implements azys {
    public final ahul a;
    public final Bundle b;
    public final String c;

    public ahuh(ahul ahul0, Bundle bundle0, String s) {
        this.a = ahul0;
        this.b = bundle0;
        this.c = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahqz ahqz0 = (ahqz)object0;
        ahrk ahrk0 = new ahrk(this.a, ((evqp)object1));
        ahru ahru0 = (ahru)ahqz0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahqz0.r);
        ahru0.a(ahrk0, this.b, this.c, apiMetadata0);
    }
}

