public final class dcpd implements Runnable {
    public final dcpn a;
    public final long b;

    public dcpd(dcpn dcpn0, long v) {
        this.a = dcpn0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.e = this.b;
    }
}

