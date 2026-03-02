import android.accounts.Account;
import java.util.concurrent.Callable;

public final class aatj implements Callable {
    public final aatl a;
    public final Account b;
    public final int c;

    public aatj(aatl aatl0, Account account0, int v) {
        this.a = aatl0;
        this.b = account0;
        this.c = v;
    }

    @Override
    public final Object call() {
        try {
            aatl aatl0 = this.a;
            int v = this.c;
            zec zec0 = new zec(aatl0.b, cmlp.a, cjxo.b);
            baqr baqr0 = new baqr();
            baqr0.d = "com.google.android.gms";
            baqr0.e = "com.google.android.gms";
            baqr0.a = bbmq.b;
            baqr0.c = this.b;
            baqr0.b = this.b;
            baqr0.l(hojn.j());
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grvz.a).v_newBuilder();
            grxu grxu0 = (grxu)((ProtoLiteMessage)grxw.a).v_newBuilder();
            if(!grxu0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)grxu0).ensureMutable();
            }
            grxw grxw0 = (grxw)grxu0.b_message;
            grxw0.b |= 1;
            grxw0.c = v;
            grxw grxw1 = (grxw)((ProtoLiteBuilder)grxu0).N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvz grvz0 = (grvz)hftp0.b_message;
            grxw1.getClass();
            grvz0.d = grxw1;
            grvz0.b |= 2;
            grxq grxq0 = aatl0.c.b("com.google.android.gms");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvz grvz1 = (grvz)hftp0.b_message;
            grxq0.getClass();
            grvz1.c = grxq0;
            grvz1.b |= 1;
            Object object0 = zec0.a(baqr0, ((grvz)hftp0.N_build())).c;
            return object0 == null ? grxr.a : object0;
        }
        catch(acse | iapl exception0) {
            throw new clix("Account settings grpc failed", exception0);
        }
    }
}

