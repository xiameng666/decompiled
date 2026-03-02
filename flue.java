public final class flue implements glzm {
    public final flvd a;
    public final gmcd b;
    public final flva c;

    public flue(flvd flvd0, gmcd gmcd0, flva flva0) {
        this.a = flvd0;
        this.b = gmcd0;
        this.c = flva0;
    }

    @Override  // glzm
    public final gmcd a() {
        gmcd gmcd0;
        try {
            gmcd0 = this.b;
            gmbu.r(gmcd0);
        }
        catch(Throwable throwable0) {
            flvd flvd0 = this.a;
            iapk iapk0 = iapk.d(throwable0);
            if(flrd.a(iapk0)) {
                gmcu gmcu0 = new gmcu();
                gmbu.t(gmcd0, new flrc(flvd0.b, this.c, gmcu0), gmap.a);
                return gmcu0;
            }
            flbj.a("RetryManager", "Non retryable error, Retry Category:CLIENT_BLOCKING_RPC Status:" + iapk0);
        }
        return gmcd0;
    }
}

