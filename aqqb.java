import android.accounts.Account;
import j..util.Objects;
import java.io.IOException;

public final class aqqb extends aqqa {
    private final aqpv a;

    public aqqb(aqpv aqpv0) {
        this.a = aqpv0;
    }

    @Override  // aqqa
    public final arzs a(Account account0) {
        arzt arzt0;
        try {
            baqr baqr0 = this.a.c.a(account0);
            int v = 0;
            aqpv.a.h("Calling AndroidPlatformBackupRestoreServiceGrpc#getStorageQuotaInfo grpc withOption", new Object[0]);
            aqqc aqqc0 = new aqqc(this.a.b, cmlp.a, ckbb.c);
            Objects.requireNonNull(aqqc0);
            aqpu aqpu0 = new aqpu(aqqc0);
            groj groj0 = (groj)this.a.d.a(baqr0, groi.a, aqpu0);
            grok grok0 = groj0.d == null ? grok.a : groj0.d;
            if(grok0 == null) {
                arzt0 = null;
            }
            else {
                int v1 = 3;
                switch(grok0.b) {
                    case 0: {
                        v = 2;
                        break;
                    }
                    case 1: {
                        v = 3;
                        break;
                    }
                    case 2: {
                        v = 4;
                    }
                }
                if(v == 0) {
                    v = 1;
                }
                if(v == 3) {
                    v1 = 2;
                }
                else if(v != 4) {
                    v1 = 1;
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arzt.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((arzt)hftv0).c = v1 - 1;
                ((arzt)hftv0).b |= 1;
                long v2 = grok0.c;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                arzt arzt1 = (arzt)hftp0.b_message;
                arzt1.b |= 2;
                arzt1.d = v2;
                arzt0 = (arzt)hftp0.N_build();
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arzs.a).v_newBuilder();
            long v3 = groj0.b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((arzs)hftv1).b |= 1;
            ((arzs)hftv1).c = v3;
            long v4 = groj0.c;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            ((arzs)hftv2).b |= 2;
            ((arzs)hftv2).d = v4;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            arzs arzs0 = (arzs)hftp1.b_message;
            arzt0.getClass();
            arzs0.e = arzt0;
            arzs0.b |= 4;
            return (arzs)hftp1.N_build();
        }
        catch(iapl | acse exception0) {
            throw new IOException(exception0);
        }
    }
}

