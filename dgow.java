import android.content.Context;
import android.media.MediaScannerConnection;
import java.io.File;

final class dgow extends ibsl implements ibtw {
    int a;
    final Context b;
    final File c;
    final String d;

    public dgow(Context context0, File file0, String s, ibrl ibrl0) {
        this.b = context0;
        this.c = file0;
        this.d = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgow)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgow(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        icbk icbk0 = new icbk(ibsc.c(this), 1);
        icbk0.z();
        dgov dgov0 = new dgov(icbk0);
        MediaScannerConnection.scanFile(this.b, new String[]{this.c.toString()}, new String[]{this.d}, dgov0);
        Object object2 = icbk0.k();
        if(object2 == object1) {
            ibsi.b(this);
        }
        return object2 == object1 ? object1 : object2;
    }
}

