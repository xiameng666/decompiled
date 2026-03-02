import android.content.Context;

public final class dlvp {
    private final Context a;
    private final fsac b;
    private final frzk c;

    public dlvp(Context context0, fsac fsac0, frzk frzk0) {
        this.a = context0;
        this.b = fsac0;
        this.c = frzk0;
    }

    public final void a(fsak fsak0) {
        ibuq.f(fsak0, "callout");
        if(fsak0.e.contains(fsae.b)) {
            hjwf hjwf0 = fsak0.f.c == 12 ? ((hjwf)fsak0.f.d) : hjwf.a;
            hfuo hfuo0 = hjwf0 == null ? null : hjwf0.h;
            if(hfuo0 != null && !hfuo0.isEmpty()) {
                for(Object object0: hfuo0) {
                    hjrq hjrq0 = (hjrq)object0;
                    hjrp hjrp0 = hjrq0.b == 1 ? ((hjrp)hjrq0.c) : hjrp.a;
                    ibuq.e(hjrp0, "getAction(...)");
                    if(hjro.a(hjrp0.b).ordinal() == 13) {
                        ibuq.e("Verify it\'s you", "getString(...)");
                        boolean z = jys.d();
                        frzk.g(this.c, "Verify it\'s you", null, true, null, false, z, 0, 0, 0xDA);
                        return;
                    }
                }
                this.b.b(hfuo0);
            }
        }
    }
}

