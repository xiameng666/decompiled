import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.common.api.ApiMetadata;

public final class atsc implements azys {
    public final atst a;
    public final String b;
    public final JoinOptions c;

    public atsc(atst atst0, String s, JoinOptions joinOptions0) {
        this.a = atst0;
        this.b = s;
        this.c = joinOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        atst atst0 = this.a;
        atst0.f();
        aurk aurk0 = (aurk)((aurd)object0).H();
        ApiMetadata apiMetadata0 = cclr.a(((aurd)object0).r);
        aurk0.d(this.b, null, this.c, apiMetadata0);
        synchronized(atst0.h) {
            if(atst0.e != null) {
                atst0.h(0x9AD);
            }
            atst0.e = (evqp)object1;
        }
    }
}

