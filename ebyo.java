import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class ebyo {
    public static final bboh a;
    public final dyfv b;
    public final donp c;
    public final String d;
    public final Context e;
    public dyra f;
    public dypv g;
    public fsge h;
    private static final dyfy i;

    static {
        ebyo.a = bboh.b("Pay", bbcu.cZ);
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyka.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((dyka)hftv0), "value");
        ProtoLiteBuilder hftp1 = dyga0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp1.b_message;
        ((dyka)hftv0).getClass();
        dyfy0.c = (dyka)hftv0;
        dyfy0.b = 10;
        ebyo.i = dyga0.a();
    }

    public ebyo(dyfv dyfv0, donp donp0, String s, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.b = dyfv0;
        this.c = donp0;
        this.d = s;
        this.e = context0;
    }

    public final void a(String s, String s1) {
        dyra dyra0 = this.f;
        fsge fsge0 = null;
        if(dyra0 == null) {
            ibuq.j("octopusCardManager");
            dyra0 = null;
        }
        if(dyra0.o(s1)) {
            ((ggtj)ebyo.a.h()).B("Notifying Octopus for card disassociation: %s", s1);
            fsge fsge1 = this.h;
            if(fsge1 == null) {
                ibuq.j("octopusClient");
            }
            else {
                fsge0 = fsge1;
            }
            fsge0.d(s, s1, ftps.c).A(new ebyn());
            byte[] arr_b = ebyo.i.toBytesArray();
            this.c.b(Status.b, arr_b);
            return;
        }
        this.c.x(Status.d);
    }
}

