import android.os.Handler;
import android.util.Log;
import java.util.ArrayDeque;

public abstract class febd implements febe, febn {
    public final Handler a;
    public febm b;
    private final String c;
    private final fduk d;
    private final ArrayDeque e;
    private febc f;

    public febd(String s, fduk fduk0, Handler handler0) {
        this.e = new ArrayDeque();
        this.b = null;
        this.f = null;
        this.c = s;
        this.d = fduk0;
        this.a = handler0;
    }

    protected abstract febb a();

    protected void b(fean fean0) {
        fean fean1 = fean0 == null ? "null" : fean0;
        ffmn.d("AccountMatchService", "Aborting account match with error: %s", new Object[]{fean1});
        this.i();
        if(fean0 == null) {
            this.j(7, false);
        }
        else if(fean0.a()) {
            this.l(fean0);
        }
        febm febm0 = this.b;
        if(febm0 != null) {
            febm0.b(fean0);
        }
    }

    @Override  // febn
    public final void c() {
        this.l(new fean("Matching interrupted"));
        this.i();
    }

    @Override  // febe
    public final void d(fewy fewy0) {
        ffmn.a("AccountMatchService", "Message received %s", new Object[]{feap.b(fewy0)});
        febc febc0 = this.f;
        if(febc0 != null) {
            febc0.a();
        }
        try {
            ArrayDeque arrayDeque0 = this.e;
            febb febb0 = (febb)arrayDeque0.poll();
            if(febb0 == null) {
                febb0 = this.a();
            }
            gftb.check(fewy0);
            febb0.a = fewy0;
            fewy fewy1 = febb0.a;
            gftb.check(fewy1);
            switch((feww.b(fewy1.c) == 0 ? 1 : feww.b(fewy1.c)) - 2) {
                case 1: {
                    if(Log.isLoggable("AccountMatchService", 3)) {
                        Log.d("AccountMatchService", "Message received: GET_ACCOUNTS");
                    }
                    febb0.b();
                    arrayDeque0.add(febb0);
                    return;
                }
                case 2: {
                    if(Log.isLoggable("AccountMatchService", 3)) {
                        Log.d("AccountMatchService", "Message received: ACCOUNTS_RESPONSE");
                    }
                    febb0.c(febb0.a.d);
                    arrayDeque0.add(febb0);
                    return;
                }
                case 3: {
                    if(Log.isLoggable("AccountMatchService", 3)) {
                        Log.d("AccountMatchService", "Message received: REMOVE_ACCOUNTS");
                    }
                    febb0.d(febb0.a.d);
                    arrayDeque0.add(febb0);
                    return;
                }
                case 4: {
                    if(Log.isLoggable("AccountMatchService", 3)) {
                        Log.d("AccountMatchService", "Message received: REMOVE_ACCOUNTS_CONFIRM");
                    }
                    if(!febb0.a()) {
                        this.i();
                        arrayDeque0.add(febb0);
                        return;
                    }
                    arrayDeque0.add(febb0);
                    return;
                }
                case 5: {
                    if(Log.isLoggable("AccountMatchService", 3)) {
                        Log.d("AccountMatchService", "Message received: CANCEL");
                    }
                    febm febm0 = febb0.b.b;
                    if(febm0 != null) {
                        febm0.b(null);
                    }
                    this.i();
                    arrayDeque0.add(febb0);
                    return;
                }
                case 6: {
                    throw new feat(febb0.a.e);
                }
                default: {
                    throw new feaw(febb0.a);
                }
            }
        }
        catch(fean fean0) {
            this.b(fean0);
        }
    }

    protected final void e(fewy fewy0, boolean z) {
        this.f(fewy0, z, 0);
    }

    // Detected as a lambda impl.
    public final void f(fewy fewy0, boolean z, int v) {
        ffmn.a("AccountMatchService", "sendMessage(%s, shouldTimeout=%s, retryCount=%s", new Object[]{feap.b(fewy0), Boolean.valueOf(z), v});
        String s = this.c;
        ffmn.d("ControlPlaneTransport", "sendAccountMatchMessageToNode(%s, %s)", new Object[]{s, feap.b(fewy0)});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)feyp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((feyp)hftv0).c = 5;
        ((feyp)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        feyp feyp0 = (feyp)hftp0.b_message;
        fewy0.getClass();
        feyp0.d = fewy0;
        feyp0.b |= 2;
        feyp feyp1 = (feyp)hftp0.N_build();
        boolean z1 = this.d.b(s, feyp1);
        febc febc0 = this.f;
        if(febc0 != null) {
            febc0.a();
        }
        if(!z1) {
            if(v < 3) {
                ffmn.d("AccountMatchService", "Message delivery failed, retrying...", new Object[0]);
                feba feba0 = new feba(this, fewy0, z, v);
                this.a.postDelayed(feba0, 1000L);
                return;
            }
            this.b(new fear(fewy0));
            return;
        }
        if(z) {
            febc febc1 = new febc(this, fewy0);
            this.f = febc1;
            long v1 = hzyg.a.b().b();
            this.a.postDelayed(febc1, v1);
        }
    }

    @Override  // febn
    public final void g(febm febm0) {
        this.b = febm0;
    }

    @Override  // febn
    public void h() {
        this.d.c = this;
        febm febm0 = this.b;
        if(febm0 != null) {
            febm0.d();
        }
    }

    protected void i() {
        this.d.c = null;
    }

    protected final void j(int v, boolean z) {
        fewx fewx0 = (fewx)((ProtoLiteMessage)fewy.a).v_newBuilder();
        if(!fewx0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fewx0).ensureMutable();
        }
        ((fewy)fewx0.b_message).c = v - 2;
        ((fewy)fewx0.b_message).b |= 1;
        this.e(((fewy)((ProtoLiteBuilder)fewx0).N_build()), z);
    }

    protected final void k() {
        this.j(3, true);
    }

    private final void l(fean fean0) {
        String s = fean0.getMessage();
        gftb.check(s);
        fewx fewx0 = (fewx)((ProtoLiteMessage)fewy.a).v_newBuilder();
        if(!fewx0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fewx0).ensureMutable();
        }
        ((fewy)fewx0.b_message).c = 6;
        ((fewy)fewx0.b_message).b |= 1;
        if(!fewx0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fewx0).ensureMutable();
        }
        fewy fewy0 = (fewy)fewx0.b_message;
        fewy0.b |= 2;
        fewy0.e = s;
        this.e(((fewy)((ProtoLiteBuilder)fewx0).N_build()), false);
    }
}

