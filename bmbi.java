public final class bmbi implements Runnable {
    public final bmbj a;

    public bmbi(bmbj bmbj0) {
        this.a = bmbj0;
    }

    @Override
    public final void run() {
        try {
            int v = this.a.b.a();
            this.a.c.set(v);
            this.a.d.set(true);
        }
        catch(bmcm bmcm0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = bmcm0;
            throw new gmdd(bxly0.a());
        }
    }
}

