public final class dtyu implements evqc {
    public final dtyw a;
    public final String b;
    public final String c;

    public dtyu(dtyw dtyw0, String s, String s1) {
        this.a = dtyw0;
        this.b = s;
        this.c = s1;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)this.a.c.i()).s(exception0)).R("IdCardRepository: Failed to get IdCard for provisioningId: %s, accountName: %s", this.b, this.c);
    }
}

