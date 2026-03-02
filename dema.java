import android.app.Activity;
import android.content.ClipData;

public final class dema implements hha {
    final gra a;
    final Activity b;
    final ibts c;

    public dema(gra gra0, Activity activity0, ibts ibts0) {
        this.a = gra0;
        this.b = activity0;
        this.c = ibts0;
        super();
    }

    @Override  // hha
    public final void a(hgs hgs0) {
        demb.b(this.a, dekp.a);
    }

    @Override  // hha
    public final void e(hgs hgs0) {
        demb.b(this.a, dekp.c);
    }

    @Override  // hha
    public final void f(hgs hgs0) {
        demb.b(this.a, dekp.b);
    }

    @Override  // hha
    public final void g(hgs hgs0) {
    }

    @Override  // hha
    public final void j(hgs hgs0) {
        demb.b(this.a, dekp.b);
    }

    @Override  // hha
    public final boolean k(hgs hgs0) {
        if((this.b == null ? null : this.b.requestDragAndDropPermissions(hgs0.a)) == null) {
            return false;
        }
        ClipData clipData0 = hgs0.a.getClipData();
        ibuq.e(clipData0, "getClipData(...)");
        this.c.a(clipData0);
        return true;
    }
}

