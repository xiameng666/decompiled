import android.util.Size;

public final class hbti implements Runnable {
    public final hbtj a;
    public final bvh b;

    public hbti(hbtj hbtj0, bvh bvh0) {
        this.a = hbtj0;
        this.b = bvh0;
    }

    @Override
    public final void run() {
        bvh bvh0 = this.b;
        bvh0.b.c();
        Size size0 = new Size(480, 360);
        bbe bbe0 = new bbe();
        bbe0.e(size0);
        bbe0.a.c(bkj.a, Integer.valueOf(0));
        bbh bbh0 = bbe0.b();
        hbtj hbtj0 = this.a;
        hbtk hbtk0 = hbtj0.a;
        bbh0.i(hbtk0.b, hbtk0.c);
        if(hbtk0.j != null && hbtk0.j.get() != null) {
            bdc bdc0 = new bdc();
            bdc0.g(size0);
            bdf bdf0 = bdc0.b();
            bdf0.a(((bde)hbtk0.j.get()));
            hbtk.a.f("bind to lifecycle");
            bvh0.c(hbtk0, hbtk0.d, new ben[]{bdf0, bbh0});
            hbtk0.c(hbkn.a);
            return;
        }
        if(hbtk0.j != null && hbtk0.j.get() == null) {
            hbtj0.a(new IllegalStateException("The SurfaceProvider has been destroyed."));
            return;
        }
        bvh0.c(hbtk0, hbtk0.d, new ben[]{bbh0});
        hbtk0.c(hbkn.a);
    }
}

