public final class arpg implements Runnable {
    public final arpn a;
    public final long b;
    public final arli c;

    public arpg(arpn arpn0, long v, arli arli0) {
        this.a = arpn0;
        this.b = v;
        this.c = arli0;
    }

    @Override
    public final void run() {
        byte[] arr_b = arpn.v(this.b).toBytesArray();
        this.a.e.h(arr_b, this.c);
    }
}

