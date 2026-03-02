public final class bmtc implements Runnable {
    public final bmtj a;

    public bmtc(bmtj bmtj0) {
        this.a = bmtj0;
    }

    @Override
    public final void run() {
        bmzt.d(this.a.c.findViewById(0x7F0B17B7));  // id:layout
        this.a.c.findViewById(0x7F0B1D44).setVisibility(0);  // id:progress_indicator
    }
}

