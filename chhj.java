public final class chhj {
    public static final void a(ayuc ayuc0) {
        aytu aytu0 = ayuc0.a;
        if(aytu0.f()) {
            throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
        }
        if(aytu0.k) {
            throw new IllegalStateException("setZwiebackCookieOverride forbidden on pseudonymous session logger");
        }
        hftr hftr0 = ayuc0.n;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hlpp hlpp0 = (hlpp)hftr0.b_message;
        hlpp0.b |= 0x1000000;
        hlpp0.r = "dtdi-logging-upload";
    }
}

