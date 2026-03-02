import java.util.Map;

public final class fmpb implements fmoz {
    public final fmpc a;

    public fmpb(fmpc fmpc0) {
        this.a = fmpc0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        fmpc fmpc0 = this.a;
        synchronized(fmpc0.c) {
            synchronized(fmpc0) {
                if(!fmpc0.b) {
                    fmpc0.b = true;
                    --fmpc0.c.b;
                }
                fmpe fmpe1 = fmpc0.c;
                Map map0 = fmpe1.a;
                map0.put(fmpc0.a, object0);
                if(fmpe1.b == 0) {
                    fmpe1.c(new fmpd(map0));
                }
            }
        }
    }
}

