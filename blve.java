import java.util.concurrent.Callable;

public final class blve implements Callable {
    public final blvl a;

    public blve(blvl blvl0) {
        this.a = blvl0;
    }

    @Override
    public final Object call() {
        blvl blvl0;
        try {
            blvl0 = this.a;
            return blvl0.ai.a();
        }
        catch(blzr blzr0) {
            if(hsvd.l()) {
                blvl0.al.r(blvl0.am, 34026, null, Long.valueOf(blvl0.an));
            }
            bxly bxly0 = new bxly();
            bxly0.a = 34026;
            bxly0.c = blzr0;
            throw bxly0.a();
        }
        catch(hhrl hhrl0) {
            if(hsvd.l()) {
                blvl0.al.r(blvl0.am, 34025, null, Long.valueOf(blvl0.an));
            }
            bxly bxly1 = new bxly();
            bxly1.a = 34025;
            bxly1.c = hhrl0;
            throw bxly1.a();
        }
    }
}

