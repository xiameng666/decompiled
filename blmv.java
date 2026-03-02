import java.io.IOException;
import java.util.concurrent.Callable;

public final class blmv implements Callable {
    public final blnd a;

    public blmv(blnd blnd0) {
        this.a = blnd0;
    }

    @Override
    public final Object call() {
        try {
            return this.a.f.a();
        }
        catch(blzr blzr0) {
            bxly bxly0 = new bxly();
            bxly0.a = 34026;
            bxly0.c = blzr0;
            throw bxly0.a();
        }
        catch(IOException iOException0) {
            if(!(iOException0 instanceof hhrl)) {
                throw bxma.g(18, iOException0);
            }
            bxly bxly1 = new bxly();
            bxly1.a = 34025;
            bxly1.c = iOException0;
            throw bxly1.a();
        }
    }
}

