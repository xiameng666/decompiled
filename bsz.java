public final class bsz implements Runnable {
    public final btd a;

    public bsz(btd btd0) {
        this.a = btd0;
    }

    @Override
    public final void run() {
        btc btc0 = this.a.c;
        if(btc0 != null) {
            for(Object object0: btc0.values()) {
                ((bss)object0).g();
            }
        }
    }
}

