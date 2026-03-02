public final class bmtx implements Runnable {
    public final bmue a;

    public bmtx(bmue bmue0) {
        this.a = bmue0;
    }

    @Override
    public final void run() {
        bmzt.d(this.a.c.findViewById(0x7F0B17B7));  // id:layout
        this.a.c.findViewById(0x7F0B1D44).setVisibility(0);  // id:progress_indicator
    }
}

