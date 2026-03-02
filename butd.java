public final class butd implements ibth {
    public final buty a;
    public final butr b;
    public final boolean c;

    public butd(buty buty0, butr butr0, boolean z) {
        this.a = buty0;
        this.b = butr0;
        this.c = z;
    }

    @Override  // ibth
    public final Object a() {
        buht buht0 = this.b.b;
        if(buht0 == null) {
            ibuq.j("fragmentArgs");
            buht0 = null;
        }
        ghip ghip0 = buht0.d == null ? ghip.a : buht0.d;
        ibuq.e(ghip0, "getWebviewUrl(...)");
        this.a.a(ghip0, this.c);
        return ibom.a;
    }
}

