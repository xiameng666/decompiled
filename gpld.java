public final class gpld implements Runnable {
    public final gplt a;
    public final gmcd b;

    public gpld(gplt gplt0, gmcd gmcd0) {
        this.a = gplt0;
        this.b = gmcd0;
    }

    @Override
    public final void run() {
        this.a.b.remove(this.b);
    }
}

