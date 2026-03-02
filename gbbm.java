import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gbbm {
    public final String a;
    public final ckcq b;

    public gbbm(String s, ckcq ckcq0) {
        this.a = s;
        this.b = ckcq0;
    }

    public final gcsg a(WidgetConfig widgetConfig0) {
        wvw wvw0 = widgetConfig0.a();
        if(wvw0 != null && (wvw0.b & 8) != 0) {
            wvw wvw1 = widgetConfig0.a();
            ibuq.c(wvw1);
            String s = wvw1.c;
            ibuq.c(s);
            return new gcsg(s + this.a, this.b);
        }
        return new gcsg(gbbm.b(widgetConfig0.b) + "payments/apis-secure/ui2/" + this.a, this.b);
    }

    public static final String b(int v) {
        switch(v) {
            case 0: {
                return "https://payments-pa.sandbox.googleapis.com/";
            }
            case 1: 
            case 2: {
                return "https://payments-pa.googleapis.com/";
            }
            case 22: {
                return "http://localhost:8887/";
            }
            case 23: {
                return "https://localhost:29880/";
            }
            case 24: {
                return "http://localhost:8886/";
            }
            default: {
                throw new IllegalArgumentException("Unknown environment: " + v);
            }
        }
    }
}

