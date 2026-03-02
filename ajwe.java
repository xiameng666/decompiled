import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.auth.folsom.SecurityDomainMember;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public final class ajwe extends cjtm {
    private static final baun a;
    private final ajtu b;
    private final String c;
    private final akbo d;
    private final long e;

    static {
        ajwe.a = akea.a("ListSecurityDomainMembersOperation");
    }

    public ajwe(ajtu ajtu0, String s, String s1, String s2, azug azug0) {
        super(0xAC, "ListSecurityDomainMembers", azug0);
        this.b = ajtu0;
        batl.q(s);
        this.c = s;
        batl.q(s1);
        this.e = SystemClock.elapsedRealtime();
        akbm akbm0 = new akbm();
        akbm0.a = new Account(s1, "com.google");
        akbm0.b(s);
        akbm0.b = akbn.q;
        akbm0.d = s2;
        this.d = akbm0.a();
    }

    private final void b(Status status0) {
        long v = SystemClock.elapsedRealtime() - this.e;
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
        ghsq ghsq1 = (ghsq)hftp0.N_build();
        akdz.b(this.d, ghsq1);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.b.a(status0, ggna.a, apiMetadata0);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        akbo akbo0 = this.d;
        baun baun0 = ajwe.a;
        baun0.h("ListSecurityDomainMembersOperation: %s", new Object[]{akbo0.e});
        if(!this.c.startsWith("single_device_snapshot/")) {
            try {
                akbl akbl0 = new akbl(akbo0);
                Class class0 = akbl.class;
                synchronized(class0) {
                    try {
                        gree gree0 = akbl0.H(((String)akbl0.d.b.d()), 5);
                        akbl.I(akbl0.d, 3);
                    }
                    catch(akbi akbi1) {
                        akbl.I(akbl0.d, akbi1.a);
                        throw akbi1;
                    }
                }
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: gree0.b) {
                    int v1 = ((grff)object0).f;
                    grey grey0 = ((grff)object0).g;
                    if(grey0 == null) {
                        grey0 = grey.a;
                    }
                    arrayList0.add(new SecurityDomainMember(v1, grey0.toBytesArray()));
                }
                long v2 = SystemClock.elapsedRealtime() - this.e;
                akbo akbo1 = this.d;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((ghsq)hftv0).b |= 1;
                ((ghsq)hftv0).c = 0;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghsq ghsq0 = (ghsq)hftp0.b_message;
                ghsq0.b |= 2;
                ghsq0.d = v2;
                akdz.b(akbo1, ((ghsq)hftp0.N_build()));
                ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
                this.b.a(Status.b, arrayList0, apiMetadata0);
            }
            catch(akbi akbi0) {
                int v3 = akbi0.a;
                if(v3 == 0) {
                    throw null;
                }
                if(v3 - 1 != 7) {
                    this.b(new Status(8));
                    return;
                }
                this.b(new Status(7));
            }
            return;
        }
        baun0.m("Security domain is not supported", new Object[0]);
        this.b(new Status(8));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.b.a(status0, ggna.a, apiMetadata0);
    }
}

