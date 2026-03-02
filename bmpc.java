import com.google.android.gms.fido.fido2.api.common.RequestOptions;

public final class bmpc extends lsb {
    public static final bboh a;
    public static final ggfp b;
    public final lqi c;
    public final lqi d;
    public final lqi e;
    public final gmcg f;
    public String g;
    public bmzy h;

    static {
        bmpc.a = bnaa.a("AuthenticateViewModel");
        bmpc.b = ggfp.M("com.chrome.canary", "com.chrome.beta", "com.android.chrome", "com.chrome.dev");
    }

    public bmpc() {
        this.c = new lqi();
        this.d = new lqi();
        this.e = new lqi();
        this.f = new bblp(2, 9);
    }

    final void a(RequestOptions requestOptions0, String s) {
        bmow bmow0 = new bmow(requestOptions0, s);
        gmbu.t(this.f.e(bmow0), new bmpb(this), gmap.a);
    }

    public static int b(bngm bngm0, boolean z) {
        switch(bngm0.b().ordinal()) {
            case 0: {
                return z ? 1740 : 0x6DE;
            }
            case 1: {
                return z ? 0x68C : 0x6DD;
            }
            case 2: {
                return z ? 0x6C1 : 0x6DF;
            }
            case 3: {
                return z ? 0x68B : 0x6DC;
            }
            case 4: {
                return z ? 0x6D3 : 0x6E0;
            }
            case 5: {
                return z ? 0x6D4 : 0x6E1;
            }
            default: {
                return 0;
            }
        }
    }

    public final void c(int v) {
        if(v != 0) {
            bmzy bmzy0 = this.h;
            if(bmzy0 != null) {
                String s = this.g;
                if(s != null) {
                    fhvl.a(v, s, bmzy0.a);
                    return;
                }
                bmzy0.a(v);
            }
        }
    }
}

