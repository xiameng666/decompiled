public final class azta_api {
    public final String a;
    public final azsy b;
    public final azss c;

    public azta_api(String s, azsy azsy0, azss azss0) {
        batl.t(azsy0, "Cannot construct an Api with a null ClientBuilder");
        batl.t(azss0, "Cannot construct an Api with a null ClientKey");
        this.a = s;
        this.b = azsy0;
        this.c = azss0;
    }
}

