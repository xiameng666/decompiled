import android.util.Log;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public final class azdo implements azeg {
    private final azdw a;
    private final Random b;
    private final azea c;

    public azdo(Random random0, azdw azdw0, azea azea0) {
        this.a = azdw0;
        this.b = random0;
        this.c = azea0;
    }

    @Override  // azeg
    public final azef a() {
        azdw azdw0 = this.a;
        azea azea0 = this.c;
        String s = azdw0.c;
        ayvu ayvu0 = azea0.a(s);
        double f = ayvu0 == null ? 0.0 : ayvu0.c;
        boolean z = true;
        if(ayvu0 == null) {
            synchronized(azea.class) {
                if(azea0.a(s) == null) {
                    f = this.b.nextDouble();
                    hlqr hlqr0 = azdw0.a.b == 3 ? ((hlqr)azdw0.a.c) : hlqr.a;
                    try {
                        long v1 = hlqr0.c;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ayvu.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ayvu ayvu1 = (ayvu)hftp0.b_message;
                        ayvu1.b |= 1;
                        ayvu1.c = f;
                        long v2 = System.currentTimeMillis() + v1;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ayvu ayvu2 = (ayvu)hftp0.b_message;
                        ayvu2.b |= 2;
                        ayvu2.d = v2;
                        azdz azdz0 = new azdz(s, ((ayvu)hftp0.N_build()));
                        gmde.a(azea0.c.b(azdz0, azea0.b));
                    }
                    catch(ExecutionException executionException0) {
                        Log.e("CCTRandomNumberStore", "Writing to the ProtoDataStore failed", executionException0);
                    }
                }
            }
        }
        azdw azdw1 = this.a;
        hlqv hlqv0 = azdw1.a;
        if(f >= (hlqv0.b == 3 ? ((hlqr)hlqv0.c) : hlqr.a).b) {
            z = false;
        }
        return hlqv0.b == 3 ? new azef(z, ((hlqr)hlqv0.c).b, azdw1.b) : new azef(z, hlqr.a.b, azdw1.b);
    }
}

