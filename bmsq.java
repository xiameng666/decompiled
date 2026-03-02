public final class bmsq implements Runnable {
    public final bmsw a;

    public bmsq(bmsw bmsw0) {
        this.a = bmsw0;
    }

    @Override
    public final void run() {
        bmzt.d(this.a.c.findViewById(0x7F0B17B7));  // id:layout
        this.a.c.findViewById(0x7F0B1D44).setVisibility(0);  // id:progress_indicator
    }
}

