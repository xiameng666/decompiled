import android.content.Intent;

public final class bgnm {
    private final xnb a;

    public bgnm(xnb xnb0) {
        this.a = xnb0;
    }

    public final void a(String s) {
        ibuq.f(s, "accountName");
        ibuq.f(s, "accountName");
        Intent intent0 = bdin.c(s).addFlags(0x10000);
        ibuq.e(intent0, "addFlags(...)");
        this.a.finish();
        this.a.overridePendingTransition(0, 0);
        this.a.startActivity(intent0);
        this.a.overridePendingTransition(0, 0);
    }
}

