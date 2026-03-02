import java.io.IOException;

public final class bmax implements Runnable {
    public final bmaz a;

    public bmax(bmaz bmaz0) {
        this.a = bmaz0;
    }

    @Override
    public final void run() {
        try {
            this.a.c.a.close();
        }
        catch(IOException iOException0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = iOException0;
            throw new gmdd(bxly0.a());
        }
    }
}

