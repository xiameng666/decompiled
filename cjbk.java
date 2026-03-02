import android.content.Context;
import android.os.Handler;
import android.os.Looper;

final class cjbk extends ali {
    public final fm a;
    private final Context b;
    private Handler c;
    private final cjby d;
    private final ali e;

    public cjbk(Context context0, fm fm0, cjby cjby0, ali ali0) {
        this.b = context0;
        this.a = fm0;
        this.d = cjby0;
        this.e = ali0;
    }

    @Override  // ali
    public final void a(int v, CharSequence charSequence0) {
        if(this.d.a && cjbx.h(this.b)) {
            switch(v) {
                case 7: 
                case 9: {
                    if(hrqc.c()) {
                        clht clht1 = new clht(Looper.getMainLooper());
                        this.c = clht1;
                        clht1.post(new cjbi(this, v, charSequence0));
                        return;
                    }
                    cjbw.F(v, charSequence0).showNow(this.a, "IdentityCheckLockoutErrorDialogFragment");
                    return;
                }
                case 1: 
                case 12: 
                case 15: {
                    if(hrqc.c()) {
                        clht clht0 = new clht(Looper.getMainLooper());
                        this.c = clht0;
                        clht0.post(new cjbj(this, v, charSequence0));
                        return;
                    }
                    cjbq.F(v, charSequence0).showNow(this.a, "IdentityCheckGenericErrorDialogFragment");
                    return;
                }
            }
        }
        this.e.a(v, charSequence0);
    }

    @Override  // ali
    public final void b() {
        this.e.b();
    }

    @Override  // ali
    public final void c(alj alj0) {
        this.e.c(alj0);
    }
}

