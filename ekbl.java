import android.content.Context;

public final class ekbl {
    public final cmbm a;
    public static final int b;
    private static final cmcg c;
    private static ekbl d;
    private final cmcg e;

    static {
        cmcf cmcf0 = new cmcf(hiiy.a);
        cmbp cmbp0 = cmbp.a("com.google.android.gms.romanesco.ContactsLoggerUploadService", "upload-contacts-incremental-periodic", "upload-contacts-incremental-oneoff", ((gful_cronetEngineProvider)new ekbi()));
        cmcf0.b(hiiy.b, cmbp0);
        cmbp cmbp1 = cmbp.a("com.google.android.gms.romanesco.ContactsLoggerUploadService", "upload-contacts-batch-periodic", "upload-contacts-batch-oneoff", ((gful_cronetEngineProvider)new ekbj()));
        cmcf0.b(hiiy.c, cmbp1);
        cmbp cmbp2 = cmbp.a("com.google.android.gms.romanesco.ContactsLoggerUploadService", "upload-contacts-expedite-periodic", "upload-contacts-expedite-oneoff", ((gful_cronetEngineProvider)new ekbk()));
        cmcf0.b(hiiy.d, cmbp2);
        ekbl.c = cmcf0.a();
    }

    private ekbl(cmcg cmcg0, Context context0) {
        Context context1 = context0.getApplicationContext();
        bblp bblp0 = new bblp(1, 10);
        cmcb cmcb0 = new cmcb();
        cmcb0.c(context1);
        cmcb0.f(cmcg0);
        cmcb0.a = new ekbh(context1);
        cmcb0.b = bblp0;
        cmcb0.e(cjtb.a);
        cmcb0.d("romanesco");
        cmbm cmbm0 = cmcb0.a(hija.i);
        super();
        this.e = cmcg0;
        this.a = cmbm0;
    }

    public final cmcg a() {
        synchronized(this) {
        }
        return this.e;
    }

    public static ekbl b(Context context0) {
        ekbl ekbl0;
        synchronized(ekbl.class) {
            ekbl0 = ekbl.c(context0);
        }
        return ekbl0;
    }

    private static ekbl c(Context context0) {
        synchronized(ekbl.class) {
            if(ekbl.d == null) {
                ekbl.d = new ekbl(ekbl.c, context0);
            }
        }
        return ekbl.d;
    }
}

