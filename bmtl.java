public final class bmtl implements Runnable {
    public final bmtp a;

    public bmtl(bmtp bmtp0) {
        this.a = bmtp0;
    }

    @Override
    public final void run() {
        bmzt.d(this.a.b.findViewById(0x7F0B17B7));  // id:layout
        this.a.b.findViewById(0x7F0B1D44).setVisibility(0);  // id:progress_indicator
    }
}

