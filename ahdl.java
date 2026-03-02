import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;

public final class ahdl implements glzm {
    public static final bxrs a;
    private final String b;

    static {
        ahdl.a = new bxrs(((gful_cronetEngineProvider)new ahdh()));
    }

    public ahdl(String s) {
        this.b = s;
    }

    @Override  // glzm
    public final gmcd a() {
        String s = this.b;
        if(gfta.c(s)) {
            return gmbu.i(ahdl.b());
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ahbh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ahbh ahbh0 = (ahbh)hftp0.b_message;
        s.getClass();
        ahbh0.b |= 1;
        ahbh0.c = s;
        ahbh ahbh1 = (ahbh)hftp0.N_build();
        clbc clbc0 = new clbc(null);
        AppContextProvider.a();
        clbc0.d(((MessageLite)ahbh1), cjyz.c, ahbi.a);
        clcf clcf0 = clcg.a(new clbd(clbc0), cjyz.b);
        ahfo ahfo0 = (ahfo)bxrv.b(new ahfo(), "GmsGlideWrapper", "getBitmap(GmsNetworkUrl gmsNetworkUrl)");
        bxrv.c(ahfo0, new ahdi(clcf0));
        ahfo0.ao("GetAvatarOperation", bbcu.aB);
        ahfo0.D(new bxlw(Exception.class).a(new ahdj()));
        return ahfo0.d().c();
    }

    static Bitmap b() {
        return Bitmap.createBitmap(0x80, 0x80, Bitmap.Config.ARGB_8888);
    }
}

