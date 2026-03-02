public final class bmtq implements Runnable {
    public final bmtu a;

    public bmtq(bmtu bmtu0) {
        this.a = bmtu0;
    }

    @Override
    public final void run() {
        bmzt.d(this.a.b.findViewById(0x7F0B17B7));  // id:layout
        this.a.b.findViewById(0x7F0B1D44).setVisibility(0);  // id:progress_indicator
    }
}

