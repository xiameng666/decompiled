import android.content.Context;
import android.media.MediaScannerConnection;
import java.io.File;

final class dgou extends ibsl implements ibtw {
    final Context a;
    final File b;
    final String c;

    public dgou(Context context0, File file0, String s, ibrl ibrl0) {
        this.a = context0;
        this.b = file0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgou)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgou(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dgot dgot0 = new dgot();
        MediaScannerConnection.scanFile(this.a, new String[]{this.b.toString()}, new String[]{this.c}, dgot0);
        return ibom.a;
    }
}

