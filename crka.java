public final class crka {
    final crkt a;

    public crka(crqq crqq0) {
        this.a = crqq0.i;
    }

    final boolean a() {
        try {
            crkt crkt0 = this.a;
            bbsq bbsq0 = bbsr.b(crkt0.a);
            if(bbsq0 == null) {
                crkt0.aJ().k.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if(bbsq0.e("com.android.vending", 0x80).versionCode >= 80837300) {
                return true;
            }
        }
        catch(Exception exception0) {
            this.a.aJ().k.b("Failed to retrieve Play Store version for Install Referrer", exception0);
        }
        return false;
    }
}

