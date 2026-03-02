import android.content.Context;

public final class ebgl extends ebhb {
    public static final ebgk a;
    private final Context b;

    static {
        ebgl.a = new ebgk();
    }

    public ebgl(Context context0) {
        this.b = context0;
    }

    @Override  // ebhb
    public final ftcg a() {
        ibuq.f(this.b, "context");
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkn0.t("mdoc.delete.usercorrupted");
        clkn0.v(1);
        clkn0.e(0L, 1L);
        clko clko0 = clkn0.a();
        cljp.a(this.b).f(clko0);
        ibuq.e(ftcg.a, "getDefaultInstance(...)");
        return ftcg.a;
    }
}

