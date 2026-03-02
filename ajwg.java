import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public final class ajwg extends cjtm {
    private static final baun a;
    private final ajsz b;
    private final String c;
    private final long d;
    private final String e;

    static {
        ajwg.a = akea.a("ListVaultsOperation");
    }

    public ajwg(ajsz ajsz0, String s, String s1, azug azug0) {
        super(0xAC, "ListVaultsOperation", azug0);
        this.b = ajsz0;
        this.c = s;
        this.d = SystemClock.elapsedRealtime();
        this.e = s1;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmlk gmlk0;
        int v = (int)hpvv.b();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmlj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gmlj)hftp0.b_message).c = v;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmln.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmln.b(((gmln)hftp1.b_message));
        String s = this.e;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmln gmln0 = (gmln)hftp1.b_message;
        s.getClass();
        gmln0.b = s;
        gmln gmln1 = (gmln)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        gmln1.getClass();
        ((gmlj)hftv0).f = gmln1;
        ((gmlj)hftv0).b |= 4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gmlj)hftp0.b_message).e = 4;
        gmlj gmlj0 = (gmlj)hftp0.N_build();
        ajzg ajzg0 = new ajzg(AppContextProvider.a(), new Account(this.c, "com.google"));
        try {
            ajwg.a.d("Starting ListVaults request", new Object[0]);
            gmlk0 = ajzg0.a(gmlj0);
        }
        catch(ajqz ajqz0) {
            ajwg.a.i("Network error during ListVaults request", ajqz0, new Object[0]);
            this.j(new Status(7));
            return;
        }
        gged_interceptors gged0 = gged_interceptors.h(gggq.j(gmlk0.b, new ajwf()));
        long v1 = SystemClock.elapsedRealtime() - this.d;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((ghsq)hftv1).b |= 1;
        ((ghsq)hftv1).c = 0;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ghsq ghsq0 = (ghsq)hftp2.b_message;
        ghsq0.b |= 2;
        ghsq0.d = v1;
        akdz.p(((ghsq)hftp2.N_build()), this.e);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.b.a(Status.b, gged0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        long v = SystemClock.elapsedRealtime() - this.d;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghsq)hftv0).b |= 1;
        ((ghsq)hftv0).c = status0.i;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghsq ghsq0 = (ghsq)hftp0.b_message;
        ghsq0.b |= 2;
        ghsq0.d = v;
        akdz.p(((ghsq)hftp0.N_build()), this.e);
        ArrayList arrayList0 = new ArrayList();
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.b.a(status0, arrayList0, apiMetadata0);
    }
}

