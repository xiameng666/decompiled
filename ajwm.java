import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;

public final class ajwm extends cjtm {
    private static final baun a;
    private final ajtc b;
    private final akba c;
    private final String d;
    private final String e;
    private final SharedKey[] f;
    private final boolean g;
    private final akbo h;
    private final long i;
    private final akef j;

    static {
        ajwm.a = akea.a("SetKeyMaterialOperation");
    }

    public ajwm(ajtc ajtc0, String s, String s1, SharedKey[] arr_sharedKey, boolean z, String s2, int v, azug azug0) {
        super(0xAC, "SetKeyMaterial", azug0);
        this.b = ajtc0;
        this.i = SystemClock.elapsedRealtime();
        this.c = (akba)akba.b.b();
        batl.q(s1);
        this.d = s1;
        batl.q(s);
        this.e = s;
        batl.s(arr_sharedKey);
        this.f = arr_sharedKey;
        akbm akbm0 = new akbm();
        akbm0.a = new Account(s1, "com.google");
        akbm0.b(s);
        akbm0.b = akbn.b;
        akbm0.d = s2;
        akbm0.e = v;
        this.h = akbm0.a();
        this.g = z;
        this.j = new akef(s2);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        akbo akbo0 = this.h;
        String s = akbo0.e;
        baun baun0 = ajwm.a;
        baun0.h("SetKeyMaterialOperation: %s", new Object[]{s});
        try {
            if(this.g) {
                akdz.a(akbo0);
                akba akba0 = this.c;
                String s1 = this.d;
                String s2 = this.e;
                SharedKey[] arr_sharedKey = this.f;
                ArrayList arrayList0 = new ArrayList(arr_sharedKey.length);
                for(int v = 0; v < arr_sharedKey.length; ++v) {
                    SharedKey sharedKey0 = arr_sharedKey[v];
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ajxe.a).v_newBuilder();
                    int v1 = sharedKey0.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((ajxe)hftp0.b_message).c = v1;
                    ByteString hfsf0 = ByteString.copyFrom(sharedKey0.b);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((ajxe)hftp0.b_message).d = hfsf0;
                    arrayList0.add(((ajxe)hftp0.N_build()));
                }
                akba0.u(s1, s2, arrayList0, s);
                akba0.I(s1, s2, 3);
                new akbl(akbo0).t();
                akdz.j(akbo0, 17, akbo0.c.C);
                baun0.h("Mark Recoverability data stale to force a recoverability sync: %s", new Object[]{s});
                this.j.b(s1);
                long v2 = SystemClock.elapsedRealtime() - this.i;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((ghsq)hftv0).b |= 1;
                ((ghsq)hftv0).c = 0;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ghsq ghsq0 = (ghsq)hftp1.b_message;
                ghsq0.b |= 2;
                ghsq0.d = v2;
                akdz.b(akbo0, ((ghsq)hftp1.N_build()));
                this.b.a(Status.b, ApiMetadata.b);
                return;
            }
            baun0.f("Blocked attempt to use 0P API", new Object[0]);
            throw new SecurityException("Access denied");
        }
        catch(IOException | acse unused_ex) {
            akbo akbo1 = this.h;
            akdz.j(akbo1, 13, akbo1.c.C);
            Status status0 = new Status(8);
            long v3 = SystemClock.elapsedRealtime() - this.i;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghsq.a).v_newBuilder();
            int v4 = status0.i;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            ((ghsq)hftv1).b |= 1;
            ((ghsq)hftv1).c = v4;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ghsq ghsq1 = (ghsq)hftp2.b_message;
            ghsq1.b |= 2;
            ghsq1.d = v3;
            akdz.b(akbo1, ((ghsq)hftp2.N_build()));
            this.b.a(status0, ApiMetadata.b);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, ApiMetadata.b);
    }
}

