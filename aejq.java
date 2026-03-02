import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;

public final class aejq implements glzn {
    @Override  // glzn
    public final gmcd a(Object object0) {
        clbc clbc0 = new clbc(null);
        clbc0.b("https://oauth2.googleapis.com/revoke");
        clbd clbd0 = new clbd(clbc0);
        clba clba0 = new clba(null);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)advo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        advo advo0 = (advo)hftp0.b_message;
        ((String)object0).getClass();
        hfuo hfuo0 = advo0.b;
        if(!hfuo0.c()) {
            advo0.b = ProtoLiteMessage.E(hfuo0);
        }
        advo0.b.add(((String)object0));
        advo advo1 = (advo)hftp0.N_build();
        AppContextProvider.a();
        clba0.c(((MessageLite)advo1), cjyy.c, advp.a);
        clcf clcf0 = clcg.b(clbd0, new cldm(clba0), cjyy.b);
        claw claw0 = new claw(null);
        claw0.a("Content-Type", "application/x-www-form-urlencoded");
        clax clax0 = new clax(claw0);
        bxrz bxrz0 = (bxrz)aeqd.a.mr();
        aepx aepx0 = aepy.a();
        aepx0.a = clcf0;
        aepx0.c = new aejp(clax0);
        aepx0.b = "POST";
        return bxrz0.P(aepx0.a()).c();
    }
}

