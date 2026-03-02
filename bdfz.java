import android.net.Uri;
import android.os.Bundle;

public final class bdfz implements acn {
    public final bdho a;

    public bdfz(bdho bdho0) {
        this.a = bdho0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        if(((Uri)object0) != null) {
            Bundle bundle0 = bewn.a(((Uri)object0));
            this.a.B().c(beuf.n, false, bundle0);
        }
    }
}

