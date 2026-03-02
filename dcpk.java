public final class dcpk implements Runnable {
    public final dcpn a;
    public final dcox b;

    public dcpk(dcpn dcpn0, dcox dcox0) {
        this.a = dcpn0;
        this.b = dcox0;
    }

    @Override
    public final void run() {
        this.a.j(this.b, this.a.d);
    }
}

