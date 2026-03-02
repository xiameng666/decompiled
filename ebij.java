import android.content.Context;

public final class ebij extends ebhb {
    dtvz a;
    private final fthb b;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    private ebij(fthb fthb0) {
        this.b = fthb0;
    }

    @Override  // ebhb
    public final ftcg a() {
        fthb fthb0 = this.b;
        if((fthb0.b & 1) != 0) {
            this.a.a(fthb0.c);
            return ftcg.a;
        }
        this.a.b();
        return ftcg.a;
    }

    public static ebij d(Context context0, ftcd ftcd0) {
        dola dola0 = ebij.f(context0, ftcd0);
        ebgf ebgf0 = new ebgf(dola0, dpst.a(dola0), new done());
        ebij ebij0 = new ebij((ftcd0.c == 9 ? ((fthb)ftcd0.d) : fthb.a));
        gfqx.a.f(ebgf0);
        ebgf0.inject(ebij0);
        return ebij0;
    }
}

