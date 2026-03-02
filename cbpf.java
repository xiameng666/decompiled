import android.content.Context;

public final class cbpf {
    static final cbpf a;

    static {
        cbpf.a = new cbpf();
        bboh.a("KidsDownloadClient");
    }

    public final cbpi a(Context context0, boolean z) {
        ibuq.f(context0, "context");
        if(z && bbqa.c()) {
            return huld.a.b().g() ? new cbpp(context0) : new cbpb(context0, cclw.a);
        }
        return new cbpo(context0, new bawz(context0));
    }

    public static cbpi b(cbpf cbpf0, Context context0) {
        return cbpf0.a(context0, false);
    }
}

