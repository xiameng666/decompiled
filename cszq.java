import android.content.Context;

public final class cszq {
    private static boolean a;
    private static final bboh b;
    private final Context c;
    private final ctdo d;

    static {
        cszq.b = cume.a(new ibuk(cszq.class));
    }

    public cszq(Context context0, ctdo ctdo0) {
        this.c = context0;
        this.d = ctdo0;
    }

    public final void a() {
        if(cszq.a) {
            return;
        }
        if(hvmp.d()) {
            try {
                System.loadLibrary("datastore_shared_counter");
                cszq.a = true;
                return;
            }
            catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
                this.d.b(ctdi.i, ctdh.n);
                throw unsatisfiedLinkError0;
            }
        }
        if(!bboj.g(this.c, "datastore_shared_counter")) {
            this.d.b(ctdi.i, ctdh.n);
            ((ggtj)cszq.b.h()).x("Failed to load native lib: datastore_shared_counter.");
            return;
        }
        cszq.a = true;
    }
}

