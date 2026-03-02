import android.net.Uri;
import android.os.Bundle;

public final class bdli implements acn {
    public final bdmb a;

    public bdli(bdmb bdmb0) {
        this.a = bdmb0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        if(((Uri)object0) != null) {
            this.a.z().a();
            beug beug0 = this.a.z();
            Bundle bundle0 = bewn.a(((Uri)object0));
            beug0.c(beuf.n, false, bundle0);
        }
    }
}

