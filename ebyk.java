import android.content.Context;

public final class ebyk {
    public static final dyfy a;
    public final dyfv b;
    public final donp c;
    public final String d;
    public final Context e;
    public ibrt f;
    public dyra g;

    static {
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyjy.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((dyjy)hftv0), "value");
        ProtoLiteBuilder hftp1 = dyga0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp1.b_message;
        ((dyjy)hftv0).getClass();
        dyfy0.c = (dyjy)hftv0;
        dyfy0.b = 14;
        ebyk.a = dyga0.a();
    }

    public ebyk(dyfv dyfv0, donp donp0, String s, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.b = dyfv0;
        this.c = donp0;
        this.d = s;
        this.e = context0;
    }
}

