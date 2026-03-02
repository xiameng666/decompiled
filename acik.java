import android.os.UserHandle;
import com.google.android.gms.appsearch.SearchSpec;
import com.google.android.gms.appsearch.aidl.AppSearchAttributionSource;
import com.google.android.gms.common.Feature;
import j..util.Objects;
import java.io.Closeable;

public final class acik implements Closeable {
    public final azts a;
    public final AppSearchAttributionSource b;
    public final String c;
    public final String d;
    public final SearchSpec e;
    public final UserHandle f;
    public long g;
    public boolean h;
    public boolean i;

    public acik(azts azts0, AppSearchAttributionSource appSearchAttributionSource0, String s, String s1, SearchSpec searchSpec0, UserHandle userHandle0) {
        this.h = true;
        this.i = false;
        this.a = (azts)Objects.requireNonNull(azts0);
        this.b = (AppSearchAttributionSource)Objects.requireNonNull(appSearchAttributionSource0);
        this.c = s;
        this.d = (String)Objects.requireNonNull(s1);
        this.e = (SearchSpec)Objects.requireNonNull(searchSpec0);
        this.f = (UserHandle)Objects.requireNonNull(userHandle0);
    }

    @Override
    public final void close() {
        if(!this.i) {
            azzc azzc0 = new azzc();
            azzc0.c = new Feature[]{achf.a};
            azzc0.a = new acih(this);
            azzc0.d = 0x75A0;
            azzd azzd0 = azzc0.a();
            this.a.jn(azzd0);
            this.i = true;
        }
    }
}

