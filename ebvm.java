import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class ebvm {
    public static final bboh a;
    public final dyfv b;
    public final String c;
    public final Context d;
    public Account e;
    public dyra f;
    public dypv g;
    private final donp h;

    static {
        ebvm.a = bboh.b("Pay", bbcu.cZ);
    }

    public ebvm(dyfv dyfv0, donp donp0, String s, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.b = dyfv0;
        this.h = donp0;
        this.c = s;
        this.d = context0;
    }

    public final void a() {
        this.h.x(Status.d);
    }

    public final void b() {
        Status status0 = Status.b;
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyhv.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((dyhv)hftv0), "value");
        ProtoLiteBuilder hftp1 = dyga0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp1.b_message;
        ((dyhv)hftv0).getClass();
        dyfy0.c = (dyhv)hftv0;
        dyfy0.b = 15;
        byte[] arr_b = dyga0.a().toBytesArray();
        this.h.b(status0, arr_b);
    }
}

