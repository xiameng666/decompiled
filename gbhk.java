import android.accounts.Account;
import android.util.Log;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class gbhk implements gbhm {
    public final bmei a;
    private final int b;
    private final Account c;
    private final ByteString d;
    private final long e;
    private final fbov f;

    public gbhk(fbov fbov0, bmei bmei0, int v, Account account0, ByteString hfsf0) {
        ibuq.f(hfsf0, "authToken");
        super();
        this.f = fbov0;
        this.a = bmei0;
        this.b = v;
        this.c = account0;
        this.d = hfsf0;
        gaxl.a();
        this.e = hzks.a.c().b();
    }

    @Override  // gbhm
    public final int a() {
        return 6;
    }

    @Override  // gbhm
    public final long b() {
        return this.e;
    }

    @Override  // gbhm
    public final Object c() {
        ibps ibps0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcjs.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        List list0 = DesugarCollections.unmodifiableList(((hcjs)hftp0.b_message).c);
        ibuq.e(list0, "getSignatureBasedAuthenticationKeyIdList(...)");
        new hfxu(list0);
        fbov fbov0 = this.f;
        boolean z = false;
        if(fbov0 == null) {
            ibps0 = ibps.a;
        }
        else {
            Account account0 = this.c;
            if(account0 == null) {
                ibps0 = ibps.a;
            }
            else {
                hfzc hfzc0 = new fbwk(fbov0.a).c(this.b, account0);
                fbdw fbdw0 = fbdw.b(fbov0.a, this.b, account0);
                ibps0 = new ArrayList();
                int[] arr_v = geuv.b();
                for(int v = 0; v < 3; ++v) {
                    int v1 = arr_v[v];
                    if(v1 != 1) {
                        gevm gevm0 = fben.a(hfzc0, v1);
                        if(gevm0 != null && fbdw0.j(v1)) {
                            ((ArrayList)ibps0).add(gevm0.e);
                        }
                    }
                }
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcjs hcjs0 = (hcjs)hftp0.b_message;
        hfuo hfuo0 = hcjs0.c;
        if(!hfuo0.c()) {
            hcjs0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(ibps0, hcjs0.c);
        gaxl.a();
        try {
            Object object0 = icbb.c(new gbhj(this, null));
            ibuq.c(object0);
            z = ((Boolean)object0).booleanValue();
        }
        catch(icfl icfl0) {
            Log.e("FidoDataLoader", "IsUVPAA call failed due to timeout exception", icfl0.getCause());
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcjs hcjs1 = (hcjs)hftp0.b_message;
        hcjs1.b |= 1;
        hcjs1.d = z;
        ByteString hfsf0 = this.d;
        if(!hfsf0.isEmpty()) {
            ibuq.f(hfsf0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcjs hcjs2 = (hcjs)hftp0.b_message;
            hfsf0.getClass();
            hcjs2.b |= 2;
            hcjs2.e = hfsf0;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcjs)hftv0;
    }

    @Override  // gbhm
    public final void d(Object object0, Object object1) {
        ibuq.f(object0, "setter");
        ((ibts)object0).a(((hcjs)object1));
    }
}

