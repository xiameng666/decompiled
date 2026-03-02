public final class dcpi implements Runnable {
    public final dcpn a;
    public final long b;

    public dcpi(dcpn dcpn0, long v) {
        this.a = dcpn0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.d = this.b;
    }
}

