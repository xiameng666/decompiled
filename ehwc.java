public final class ehwc implements glzn {
    public final ehwi a;
    public final String b;

    public ehwc(ehwi ehwi0, String s) {
        this.a = ehwi0;
        this.b = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        String s = eice.c(this.b);
        eica.a(this.a.g, "Product Data obtained: " + s + ". Initiating server fetch.");
        return this.a.c(this.b, ((gwhg)object0).j);
    }
}

