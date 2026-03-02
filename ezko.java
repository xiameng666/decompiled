import android.os.Bundle;

public final class ezko extends du implements ezbl {
    public String a;
    public boolean b;
    public ezbn c;

    static {
        bboh.b("Trustlet_Onbody", bbcu.eL);
    }

    @Override  // ezbl
    public final void l() {
        batl.h("onPreferencesAvailable() should be called from the main thread.");
        this.z();
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.a = this.getArguments().getString("from_intent");
        this.b = false;
        ezbn ezbn0 = ezbn.a();
        this.c = ezbn0;
        ezbn0.h(this);
        if(this.c.k()) {
            this.z();
        }
    }

    @Override  // du
    public final void onDestroy() {
        super.onDestroy();
        ezbn ezbn0 = this.c;
        if(ezbn0 != null) {
            ezbn0.i(this);
            this.c = null;
        }
    }

    public final void y() {
        ezlj.f(this.c);
    }

    final void z() {
        String s;
        if(this.c != null && this.c.k()) {
            switch(this.a) {
                case "com.google.android.gms.trustlet.onbody.discovery.OnbodyPromotionActivity": {
                    s = "promotion_status_for_4";
                    break;
                }
                case "com.google.android.gms.trustlet.onbody.discovery.WebpageOnbodyPromotionActivity": {
                    s = "promotion_status_for_5";
                    break;
                }
                case "from_security_advisor": {
                    s = "promotion_status_for_6";
                    break;
                }
                default: {
                    s = "";
                }
            }
            if(this.c != null && !s.isEmpty()) {
                ezbn ezbn0 = this.c;
                synchronized(ezbn0.b) {
                    ezbn0.d.putInt(s, 3);
                }
                ezbn0.d(s, Integer.valueOf(3));
            }
            if(this.b) {
                this.y();
            }
        }
    }
}

