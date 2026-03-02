import java.util.Locale;

final class bcrq {
    final boolean a;
    final gmfx b;
    final String c;
    String d;

    public bcrq(int v) {
        gmfx gmfx0;
        this.c = "";
        this.d = "";
        this.a = false;
        switch(v) {
            case 1: {
                gmfx0 = gmfx.al;
                break;
            }
            case 2: {
                gmfx0 = gmfx.am;
                break;
            }
            case 3: {
                gmfx0 = gmfx.an;
                break;
            }
            case 4: {
                gmfx0 = gmfx.ao;
                break;
            }
            case 5: {
                gmfx0 = gmfx.ap;
                break;
            }
            case 6: {
                gmfx0 = gmfx.aq;
                break;
            }
            default: {
                gmfx0 = gmfx.ak;
            }
        }
        this.b = gmfx0;
        Integer integer0 = v;
        this.d = String.format(Locale.getDefault(), "FlashCall verification failed, reason code: %d, %s.", integer0, bcrr.b.getOrDefault(integer0, "UNKNOWN"));
    }

    public bcrq(gmfx gmfx0) {
        this.c = "";
        this.a = false;
        this.b = gmfx0;
        this.d = "GMSCore is not in the allowlist to use the interception API";
    }

    public bcrq(String s) {
        this.d = "";
        this.a = true;
        this.b = gmfx.a;
        this.c = s;
    }

    @Override
    public final String toString() {
        return this.a ? this.c : this.d;
    }
}

