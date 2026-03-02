import java.util.concurrent.TimeUnit;

public final class ccgp {
    private final cljp a;
    private final cbyw b;
    private final fmzy c;

    public ccgp(cljp cljp0, cbyw cbyw0, fmzy fmzy0) {
        this.a = cljp0;
        this.b = cbyw0;
        this.c = fmzy0;
    }

    public final void a(fnan fnan0) {
        this.a.d(ccgq.a(fnan0.g), "com.google.android.gms.learning.dynamite.training.GmsTrainingJobTaskBoundService");
    }

    public final void b(fnan fnan0, long v) {
        clkn clkn0 = new clkn();
        clkn0.t(ccgq.a(fnan0.g));
        clkn0.w("com.google.android.gms.learning.dynamite.training.GmsTrainingJobTaskBoundService");
        if(Long.compare(v, 0L) <= 0) {
            fnaj fnaj0 = fnan0.n == null ? fnaj.a : fnan0.n;
            if((fnaj0.c == null ? hfst.a : fnaj0.c).b <= 0L) {
                long v1 = Math.max(0L, (fnan0.l == null ? hfwn.a : fnan0.l).b - TimeUnit.MILLISECONDS.toSeconds(this.c.a()));
                clkn0.e(v1, 1L + v1);
                goto label_13;
            }
            goto label_9;
        }
        else {
        label_9:
            long v2 = TimeUnit.MILLISECONDS.toSeconds(v);
            fnaj fnaj1 = fnan0.n == null ? fnaj.a : fnan0.n;
            long v3 = Math.max(v2, (fnaj1.c == null ? hfst.a : fnaj1.c).b);
            clkn0.e(v3, 1L + v3);
        }
    label_13:
        String s = fnar.a((fnan0.e + "/" + fnan0.f), (fnan0.c == 4 ? ((fnaf)fnan0.d).c : ""));
        fnaj fnaj2 = fnan0.n == null ? fnaj.a : fnan0.n;
        boolean z = this.b.T() || this.b.F(s) || !fnaj2.d;
        int v4 = this.b.H() || !fnaj2.e ? 1 : 0;
        int v5 = this.b.H() || !fnaj2.f ? 1 : 0;
        int v6 = v4 ^ 1;
        clkn0.x(v6, v6);
        clkn0.i(!this.b.H() && !z);
        if(this.b.ab() && fnan0.c == 13) {
            clkn0.y(0, 0);
        }
        else {
            int v7 = v5 ^ 1;
            clkn0.y(v7, v7);
        }
        clko clko0 = clkn0.a();
        this.a.f(clko0);
    }
}

