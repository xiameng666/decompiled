public final class bsn implements Runnable {
    public final bss a;

    public bsn(bss bss0) {
        this.a = bss0;
    }

    @Override
    public final void run() {
        bss bss0 = this.a;
        if(!bss0.k) {
            bss0.i();
        }
    }
}

