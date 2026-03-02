import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

public final class ajvp extends cjtm {
    private static final bboh a;
    private final azxs b;
    private final akbo c;
    private final long d;
    private final String e;

    static {
        ajvp.a = akea.b("AddRecoveryContactToDependentKeychainOperation");
    }

    public ajvp(azxs azxs0, String s, String s1, String s2, String s3, azug azug0) {
        super(0xAC, "AddRecoveryContactToDependentKeychain", azug0);
        this.b = azxs0;
        this.d = SystemClock.elapsedRealtime();
        akbm akbm0 = new akbm();
        akbm0.a = new Account(s1, "com.google");
        akbm0.b(s);
        akbm0.b = akbn.z;
        akbm0.d = s3;
        this.c = akbm0.a();
        this.e = s2;
    }

    private final void b() {
        long v = SystemClock.elapsedRealtime() - this.d;
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
        ghsq0.d = v;
        ghsq ghsq1 = (ghsq)hftp0.N_build();
        akdz.b(this.c, ghsq1);
        this.b.a(Status.b);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        grdo grdo0;
        int v;
        ggtj ggtj0 = (ggtj)ajvp.a.h();
        akbo akbo0 = this.c;
        ggtj0.B("AddRecoveryContactToDependentKeychainOperation: %s", akbo0.e);
        akdz.a(akbo0);
        if(!hpvs.c()) {
            this.b();
            return;
        }
        try {
            v = 7;
            akbl akbl0 = new akbl(akbo0);
            String s = this.e;
            synchronized(akbl.class) {
                try {
                    akbl.a.h("Adding recovery contact to this user\'s keychain.", new Object[0]);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grdm.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grdj.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    grdj grdj0 = (grdj)hftp1.b_message;
                    s.getClass();
                    hfuo hfuo0 = grdj0.b;
                    if(!hfuo0.c()) {
                        grdj0.b = ProtoLiteMessage.E(hfuo0);
                    }
                    grdj0.b.add(s);
                    grdj grdj1 = (grdj)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    grdm grdm0 = (grdm)hftp0.b_message;
                    grdj1.getClass();
                    grdm0.c = grdj1;
                    grdm0.b = 2;
                    grdm grdm1 = (grdm)hftp0.N_build();
                    try {
                        grds grds0 = akbl0.a().a(grdm1);
                        grdo0 = grds0.b == 2 ? ((grdo)grds0.c) : grdo.a;
                    }
                    catch(ajqz ajqz0) {
                        int v2 = ajqz0.b - 1;
                        if(ajqz0.b == 0) {
                            throw null;
                        }
                        if(v2 == 6 || v2 == 8) {
                            akbl0.g.c(akbl0.e.name, ajqz0);
                        }
                        throw new akbi(8, ajqz0);
                    }
                    byte[] arr_b = (grdo0.c == null ? grek.a : grdo0.c).b.toByteArray();
                    for(Object object0: grdo0.b) {
                        String s1 = ((grdn)object0).b;
                        for(Object object1: ((grdn)object0).c) {
                            ajxc ajxc0 = akbl.E(ajxa.i);
                            byte[] arr_b1 = akdy.p(arr_b, ajxc0.d.toByteArray());
                            byte[] arr_b2 = akdy.h(((grem)object1).d.toByteArray(), arr_b1);
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grey.a).v_newBuilder();
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grfd.a).v_newBuilder();
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            grfd grfd0 = (grfd)hftp3.b_message;
                            s1.getClass();
                            grfd0.b |= 8;
                            grfd0.f = s1;
                            ByteString hfsf0 = ByteString.copyFrom(arr_b2);
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp3.b_message;
                            ((grfd)hftv0).b |= 1;
                            ((grfd)hftv0).c = hfsf0;
                            grek grek0 = grdo0.c == null ? grek.a : grdo0.c;
                            if(!hftv0.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            grfd grfd1 = (grfd)hftp3.b_message;
                            grek0.getClass();
                            grfd1.d = grek0;
                            grfd1.b |= 2;
                            grdv grdv0 = ((grem)object1).e;
                            if(grdv0 == null) {
                                grdv0 = grdv.a;
                            }
                            ByteString hfsf1 = grdv0.c;
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            grfd grfd2 = (grfd)hftp3.b_message;
                            hfsf1.getClass();
                            grfd2.b |= 4;
                            grfd2.e = hfsf1;
                            grfd grfd3 = (grfd)hftp3.N_build();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            grey grey0 = (grey)hftp2.b_message;
                            grfd3.getClass();
                            grey0.c = grfd3;
                            grey0.b = 7;
                            grey grey1 = (grey)hftp2.N_build();
                            akbl0.p(akbl.g(((grem)object1).g), ajxc0, false, true, grey1);
                        }
                    }
                    akbl.I(akbl0.d, 3);
                }
                catch(akbi akbi1) {
                    akbl.I(akbl0.d, akbi1.a);
                    throw akbi1;
                }
            }
        }
        catch(akbi akbi0) {
            int v3 = akbi0.a - 1;
            if(akbi0.a == 0) {
                throw null;
            }
            switch(v3) {
                case 7: {
                    break;
                }
                case 13: {
                    v = 38500;
                    break;
                }
                default: {
                    v = 8;
                }
            }
            Status status0 = new Status(v, "Can\'t create member.");
            long v4 = SystemClock.elapsedRealtime() - this.d;
            akbo akbo1 = this.c;
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
            int v5 = status0.i;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp4.b_message;
            ((ghsq)hftv1).b |= 1;
            ((ghsq)hftv1).c = v5;
            if(!hftv1.isImmutable()) {
                hftp4.ensureMutable();
            }
            ghsq ghsq0 = (ghsq)hftp4.b_message;
            ghsq0.b |= 2;
            ghsq0.d = v4;
            akdz.b(akbo1, ((ghsq)hftp4.N_build()));
            this.b.a(status0);
            return;
        }
        this.b();
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

