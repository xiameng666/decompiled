import android.content.Context;
import com.google.android.gms.auth.folsom.RecoveryRequest;
import com.google.android.gms.auth.folsom.RecoveryResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajwn extends cjtm {
    private static final bboh a;
    private final ajtr b;
    private final RecoveryRequest c;
    private final String d;

    static {
        ajwn.a = akea.b("StartRecoveryOperation");
    }

    public ajwn(ajtr ajtr0, RecoveryRequest recoveryRequest0, String s, azug azug0) {
        super(0xAC, "StartRecoveryOperation", azug0);
        this.b = ajtr0;
        this.c = recoveryRequest0;
        this.d = s;
    }

    private final void b(int v) {
        RecoveryResult recoveryResult0 = new RecoveryResult();
        recoveryResult0.a = v;
        this.c(recoveryResult0);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.b.a(Status.b, recoveryResult0, apiMetadata0);
    }

    private final void c(RecoveryResult recoveryResult0) {
        int v;
        switch(recoveryResult0.a) {
            case 1: {
                v = 2;
                break;
            }
            case 2: {
                v = 3;
                break;
            }
            case 3: {
                v = 4;
                break;
            }
            case 4: {
                v = 5;
                break;
            }
            case 5: {
                v = 6;
                break;
            }
            case 6: {
                v = 7;
                break;
            }
            case 7: {
                v = 8;
                break;
            }
            case 8: {
                v = 9;
                break;
            }
            case 10: {
                v = 11;
                break;
            }
            case 12: {
                v = 13;
                break;
            }
            case 13: {
                v = 14;
                break;
            }
            case 14: {
                v = 15;
                break;
            }
            case 15: {
                v = 16;
                break;
            }
            case 16: {
                v = 17;
                break;
            }
            case 17: {
                v = 18;
                break;
            }
            default: {
                v = 1;
            }
        }
        akdz.l(v, 29, this.d);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmlm gmlm0;
        ajxq ajxq0;
        bboh bboh0 = ajwn.a;
        ((ggtj)bboh0.h()).B("StartRecoveryOperation: %s", this.d);
        if(!akdv.a) {
            ((ggtj)bboh0.j()).x("Can\'t start recovery - build is lower than P");
            this.b(16);
            return;
        }
        try {
            ajxq0 = ajxq.b(this.c);
        }
        catch(ajxr ajxr0) {
            a.ae(ajwn.a.j(), "Can\'t parse recovery request", ajxr0);
            this.b(13);
            return;
        }
        try(ajxo ajxo0 = new ajxo(context0, ajxq0, this.d)) {
            ((ggtj)bboh0.h()).x("Sending OpenVault request");
            try {
                gmlm0 = ajxo0.a();
            }
            catch(ajqz ajqz0) {
                a.ae(ajwn.a.j(), "Network exception during OpenVault call", ajqz0);
                this.b(9);
                return;
            }
            catch(ajxr ajxr1) {
                a.ae(ajwn.a.j(), "RecoveryException during OpenVault call", ajxr1);
                this.b(ajxr1.a - 1);
                return;
            }
            gmlo gmlo0 = gmlo.b(gmlm0.b);
            if(gmlo0 == null) {
                gmlo0 = gmlo.l;
            }
            ((ggtj)bboh0.h()).B("OpenVault result %s", gmlo0);
            if(gmlo0 == gmlo.b) {
                try {
                    ajxo0.b(this.d);
                }
                catch(ajxr ajxr2) {
                    a.ae(ajwn.a.j(), "importApplicationKeys failed", ajxr2);
                    this.b(ajxr2.a - 1);
                    return;
                }
            }
            hfst hfst0 = gmlm0.d;
            if(hfst0 == null) {
                hfst0 = hfst.a;
            }
            int v = ajxs.a(ajxs.b(gmlo0));
            RecoveryResult recoveryResult0 = new RecoveryResult();
            recoveryResult0.a = v;
            recoveryResult0.b = hfst0.b;
            this.c(recoveryResult0);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
            this.b.a(Status.b, recoveryResult0, apiMetadata0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        RecoveryResult recoveryResult0 = new RecoveryResult();
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.b.a(status0, recoveryResult0, apiMetadata0);
    }
}

