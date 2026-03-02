import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.nio.charset.StandardCharsets;
import java.util.Map.Entry;

public final class ajvr extends cjtm {
    private static final bboh a;
    private final azxs b;
    private final akbo c;
    private final long d;
    private final byte[] e;
    private final byte[] f;

    static {
        ajvr.a = akea.b("CreatePrfMemberOperation");
    }

    public ajvr(azxs azxs0, String s, String s1, byte[] arr_b, byte[] arr_b1, String s2, azug azug0) {
        super(0xAC, "CreatePrfMember", azug0);
        this.b = azxs0;
        this.d = SystemClock.elapsedRealtime();
        akbm akbm0 = new akbm();
        akbm0.a = new Account(s1, "com.google");
        akbm0.b(s);
        akbm0.b = akbn.n;
        akbm0.d = s2;
        this.c = akbm0.a();
        this.e = arr_b;
        this.f = arr_b1;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ((ggtj)ajvr.a.h()).B("CreatePrfMemberOperation: %s", this.c.e);
        akdz.a(this.c);
        try {
            akbl akbl0 = new akbl(this.c);
            synchronized(akbl.class) {
                try {
                    akbl.a.h("Creating PRF member.", new Object[0]);
                    akbl0.n(true);
                    ajxc ajxc0 = akbl.E(ajxa.g);
                    byte[] arr_b = akdy.d(akdy.j(this.e, "GoogleKeychainPrfMemberWrappingKey".getBytes(StandardCharsets.UTF_8)), ajxc0.d.toByteArray());
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grfb.a).v_newBuilder();
                    ByteString hfsf0 = ByteString.copyFrom(this.f);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((grfb)hftp0.b_message).c = hfsf0;
                    ByteString hfsf1 = ByteString.copyFrom(arr_b);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((grfb)hftp0.b_message).b = hfsf1;
                    grfb grfb0 = (grfb)hftp0.N_build();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grey.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    grey grey0 = (grey)hftp1.b_message;
                    grfb0.getClass();
                    grey0.c = grfb0;
                    grey0.b = 6;
                    grey grey1 = (grey)hftp1.N_build();
                    for(Object object0: akbl0.l().entrySet()) {
                        String s = (String)((Map.Entry)object0).getKey();
                        if(akbl.A(s)) {
                            continue;
                            try {
                            label_33:
                                akbl0.p(s, ajxc0, false, false, grey1);
                            }
                            catch(akbi akbi1) {
                                a.ae(akbl.b.j(), "Error creating member.", akbi1);
                            }
                            continue;
                        }
                        else {
                            goto label_33;
                        }
                        break;
                    }
                    akbl.I(akbl0.d, 3);
                }
                catch(akbi akbi0) {
                    akbl.I(akbl0.d, akbi0.a);
                    throw akbi0;
                }
            }
        }
        catch(akbi unused_ex) {
            int v1 = 7;
            int v2 = akbi2.a;
            if(v2 == 0) {
                throw null;
            }
            switch(v2 - 1) {
                case 7: {
                    break;
                }
                case 13: {
                    v1 = 38500;
                    break;
                }
                default: {
                    v1 = 8;
                }
            }
            Status status0 = new Status(v1, "Can\'t create member.");
            long v3 = SystemClock.elapsedRealtime() - this.d;
            akbo akbo0 = this.c;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
            int v4 = status0.i;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            ((ghsq)hftv0).b |= 1;
            ((ghsq)hftv0).c = v4;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ghsq ghsq0 = (ghsq)hftp2.b_message;
            ghsq0.b |= 2;
            ghsq0.d = v3;
            akdz.b(akbo0, ((ghsq)hftp2.N_build()));
            this.b.a(status0);
            return;
        }
        long v5 = SystemClock.elapsedRealtime() - this.d;
        akbo akbo1 = this.c;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        ((ghsq)hftv1).b |= 1;
        ((ghsq)hftv1).c = 0;
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        ghsq ghsq1 = (ghsq)hftp3.b_message;
        ghsq1.b |= 2;
        ghsq1.d = v5;
        akdz.b(akbo1, ((ghsq)hftp3.N_build()));
        this.b.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

