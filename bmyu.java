public final class bmyu implements Runnable {
    public final bmza a;

    public bmyu(bmza bmza0) {
        this.a = bmza0;
    }

    @Override
    public final void run() {
        bmzt.d(this.a.c.findViewById(0x7F0B17B7));  // id:layout
        this.a.c.findViewById(0x7F0B1D44).setVisibility(0);  // id:progress_indicator
    }
}

