import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ajwj extends cjtm {
    private static final baun a;
    private final azxs b;
    private final String c;
    private final akbo d;
    private final long e;

    static {
        ajwj.a = akea.a("ResetSecurityDomainOperation");
    }

    public ajwj(azxs azxs0, String s, String s1, String s2, azug azug0) {
        super(0xAC, "ResetSecurityDomain", azug0);
        this.b = azxs0;
        this.e = SystemClock.elapsedRealtime();
        batl.q(s);
        this.c = s;
        akbm akbm0 = new akbm();
        batl.q(s1);
        akbm0.a = new Account(s1, "com.google");
        akbm0.b(s);
        akbm0.b = akbn.p;
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
        this.b.a(status0);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        akbo akbo0 = this.d;
        baun baun0 = ajwj.a;
        baun0.h("ResetSecurityDomainOperation: %s", new Object[]{akbo0.e});
        akdz.a(akbo0);
        if(!akbl.A(this.c)) {
            try {
                akbl akbl0 = new akbl(akbo0);
                Class class0 = akbl.class;
                synchronized(class0) {
                    try {
                        akbl.a.d("Started security domain reset", new Object[0]);
                        Object object0 = akbl0.d.b.d();
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grep.a).v_newBuilder();
                        String s = akbl.h(((String)object0));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((grep)hftv0).b = s;
                        String s1 = akbl0.f;
                        if(s1 != null) {
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((grep)hftp0.b_message).c = s1;
                        }
                        try {
                            ajsq ajsq0 = akbl0.b();
                            grep grep0 = (grep)hftp0.N_build();
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghsx.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((ghsx)hftp1.b_message).c = 4;
                            ((ghsx)hftp1.b_message).b |= 1;
                            String s2 = ajsq.f(grep0.b);
                            try {
                                long v1 = hput.b();
                                if(v1 <= 0L) {
                                    Objects.requireNonNull(ajsq0.a);
                                    ajrj ajrj1 = new ajrj(ajsq0.a);
                                    ajrr ajrr0 = new ajrr(grep0);
                                    hfsw hfsw2 = (hfsw)ajsq0.a.b(ajrj1, ajrr0);
                                }
                                else if(hput.f()) {
                                    Objects.requireNonNull(ajsq0.a);
                                    ajsf ajsf0 = new ajsf(ajsq0.a);
                                    ajrp ajrp0 = new ajrp(v1, grep0);
                                    hfsw hfsw0 = (hfsw)ajsq0.a.b(ajsf0, ajrp0);
                                }
                                else {
                                    Objects.requireNonNull(ajsq0.a);
                                    ajrj ajrj0 = new ajrj(ajsq0.a);
                                    ajrq ajrq0 = new ajrq(v1, grep0);
                                    hfsw hfsw1 = (hfsw)ajsq0.a.b(ajrj0, ajrq0);
                                }
                                akdz.c(s2, ((ghsx)hftp1.N_build()), ajsq0.b.e);
                            }
                            catch(ajqz ajqz1) {
                                int v2 = ajqz1.a;
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ghsx ghsx0 = (ghsx)hftp1.b_message;
                                ghsx0.b |= 2;
                                ghsx0.d = v2;
                                akdz.c(s2, ((ghsx)hftp1.N_build()), ajsq0.b.e);
                                throw ajqz1;
                            }
                        }
                        catch(ajqz ajqz0) {
                            int v3 = ajqz0.b - 1;
                            if(ajqz0.b == 0) {
                                throw null;
                            }
                            switch(v3) {
                                case 6: {
                                    akbl0.g.c(akbl0.e.name, ajqz0);
                                    akbl.a.i("Error during resetSecurityDomain call", ajqz0, new Object[0]);
                                    throw new akbi(8, ajqz0);
                                }
                                case 8: {
                                    akbl.a.i("Security domain was not found.", ajqz0, new Object[0]);
                                    akbl0.r(((String)object0));
                                    goto label_72;
                                }
                                default: {
                                    akbl.a.i("Error during resetSecurityDomain call", ajqz0, new Object[0]);
                                    throw new akbi(8, ajqz0);
                                }
                            }
                        }
                        akbl.a.h("Security domain was reset", new Object[0]);
                        akbl0.r(((String)object0));
                    label_72:
                        akbl.I(akbl0.d, 3);
                    }
                    catch(akbi akbi1) {
                        akbl.I(akbl0.d, akbi1.a);
                        throw akbi1;
                    }
                }
            }
            catch(akbi akbi0) {
                int v4 = akbi0.a - 1;
                if(akbi0.a == 0) {
                    throw null;
                }
                if(v4 != 7) {
                    this.b(new Status(8));
                    return;
                }
                this.b(new Status(7));
                return;
            }
            long v5 = SystemClock.elapsedRealtime() - this.e;
            akbo akbo1 = this.d;
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
            ghsq0.d = v5;
            akdz.b(akbo1, ((ghsq)hftp2.N_build()));
            this.b.a(Status.b);
            return;
        }
        baun0.m("Security domain is not supported", new Object[0]);
        this.b(new Status(8));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

