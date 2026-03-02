import java.io.IOException;

public final class atgu extends hjjx {
    public final gmcu a;
    private final aqql b;
    private final gfsx c;
    private final atnv d;

    public atgu(aqql aqql0, gfsx gfsx0, atnv atnv0) {
        this.a = new gmcu();
        this.b = aqql0;
        this.c = gfsx0;
        this.d = atnv0;
    }

    @Override  // hjjx
    public final void a(hjjt hjjt0, hjjv hjjv0) {
        this.b.g("Exception during transfer", hjjv0, new Object[0]);
        gfsx gfsx0 = this.c;
        if(gfsx0.i()) {
            try {
                ((hjiy)gfsx0.d()).close();
            }
            catch(IOException iOException0) {
                throw new IllegalStateException("error closing the upload data stream", iOException0);
            }
        }
        this.a.r(hjjv0);
        long v = hjjt0.a();
        this.d.i(v);
        this.d.d(hjjv0);
    }

    @Override  // hjjx
    public final void b(hjjt hjjt0, hjjd hjjd0) {
        this.b.d("Response received with code %d", new Object[]{((int)hjjd0.a)});
        gfsx gfsx0 = this.c;
        if(gfsx0.i()) {
            try {
                ((hjiy)gfsx0.d()).close();
            }
            catch(IOException iOException0) {
                throw new IllegalStateException("error closing the upload data stream", iOException0);
            }
        }
        this.a.q(hjjd0);
        long v = hjjt0.a();
        this.d.i(v);
        this.d.h(hjjd0.a);
    }

    @Override  // hjjx
    public final void c(hjjt hjjt0) {
        this.b.d("Transfer started", new Object[0]);
    }

    @Override  // hjjx
    public final void d(hjjt hjjt0) {
        Object[] arr_object = {hjjt0.a()};
        this.b.j("Progress: uploaded %d bytes", arr_object);
    }
}

