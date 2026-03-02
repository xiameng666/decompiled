public final class bmyb implements Runnable {
    public final bmyh a;

    public bmyb(bmyh bmyh0) {
        this.a = bmyh0;
    }

    @Override
    public final void run() {
        bmzt.d(this.a.ai.findViewById(0x7F0B17B7));  // id:layout
        this.a.ai.findViewById(0x7F0B1D44).setVisibility(0);  // id:progress_indicator
    }
}

