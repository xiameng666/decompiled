import android.app.PendingIntent;
import android.content.Context;

public final class aqsm {
    public final aqtf a;

    public aqsm(aqtf aqtf0) {
        this.a = aqtf0;
    }

    public final PendingIntent a(aqvd aqvd0) {
        return !((Boolean)this.a.a.mr()).booleanValue() || !this.a.c.f() || !aqtf.d(((aqvg)this.a.f.mr())) ? ((PendingIntent)((aquj)this.a.h.mr()).b.a(new aqub(), 2, aqvd0)) : ((aquo)this.a.i.mr()).e(aqvd0);
    }

    public static aqsm b(Context context0) {
        return new aqsm(new aqtf(context0, new aqrd(context0, new bblp(3, 9)), new aquw(context0)));
    }

    @Deprecated
    public final String c(aqvd aqvd0) {
        return this.a.c().a(aqvd0);
    }

    public final void d(String s, aqvd aqvd0) {
        this.a.c().b(s, aqvd0);
    }

    public final boolean e(String s, aqvd aqvd0) {
        return this.a.c().c(s, aqvd0);
    }
}

