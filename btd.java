import android.graphics.Rect;
import java.util.Map.Entry;

public final class btd {
    public final bsw a;
    public final bin b;
    public btc c;

    public btd(bin bin0, bsw bsw0) {
        this.b = bin0;
        this.a = bsw0;
    }

    public final void a(bss bss0, Map.Entry map$Entry0) {
        bss bss1 = (bss)map$Entry0.getValue();
        Rect rect0 = ((btr)map$Entry0.getKey()).c;
        int v = ((btr)map$Entry0.getKey()).e;
        boolean z = ((btr)map$Entry0.getKey()).f;
        bdq bdq0 = new bdq(bss0.g.b, rect0, (bss0.c ? this.b : null), v, z);
        bpt.j(bss1.c(((btr)map$Entry0.getKey()).b, bdq0, null), new bta(this, bss1), bow.a());
    }
}

