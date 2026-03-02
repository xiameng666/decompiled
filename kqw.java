public final class kqw implements Runnable {
    public final krd a;

    public kqw(krd krd0) {
        this.a = krd0;
    }

    @Override
    public final void run() {
        kjk kjk0 = this.a.f;
        if(kjk0 == null) {
            ibuq.j("callback");
            kjk0 = null;
        }
        kjk0.a(new kmf(new kme(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }
}

