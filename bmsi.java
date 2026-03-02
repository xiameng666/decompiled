public final class bmsi implements Runnable {
    public final bmsp a;

    public bmsi(bmsp bmsp0) {
        this.a = bmsp0;
    }

    @Override
    public final void run() {
        bmzt.d(this.a.c.findViewById(0x7F0B17B7));  // id:layout
        this.a.c.findViewById(0x7F0B1D44).setVisibility(0);  // id:progress_indicator
    }
}

