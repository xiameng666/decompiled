import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.authzen.SigncryptedMessage;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class aiib extends aihz {
    private final Account a;
    private final int b;
    private final byte[] c;
    private final baun d;
    private final aijm e;

    public aiib(aijm aijm0, Account account0, int v, byte[] arr_b) {
        super("SigncryptPayload");
        this.d = new baun(new String[]{"SigncryptPayloadOperation"});
        batl.s(aijm0);
        this.e = aijm0;
        batl.s(account0);
        this.a = account0;
        this.b = v;
        batl.s(arr_b);
        this.c = arr_b;
    }

    @Override  // aihz
    protected final void b(Context context0) {
        byte[] arr_b2;
        byte[] arr_b1;
        Account account0 = this.a;
        if(account0.name.equals("<<default account>>")) {
            Account[] arr_account = cchj.b(context0).p("com.google");
            if(arr_account.length <= 0) {
                throw new cjuh(8, "No account found to sign");
            }
            account0 = arr_account[0];
        }
        hhtt hhtt0 = hhtt.a(this.b);
        hhtt hhtt1 = hhtt.p;
        if(hhtt0 == hhtt1) {
            try {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhto.a).v_newBuilder();
                int v = hhtt1.q;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhto hhto0 = (hhto)hftp0.b_message;
                if(v == 0) {
                    throw null;
                }
                hhto0.c = v - 1;
                hhto0.b |= 1;
                byte[] arr_b = ((hhto)hftp0.N_build()).toBytesArray();
                arr_b1 = ((SignedBlob)aihk.a(new ajes(context0).n(account0, new Payload(this.c, arr_b, new byte[0])))).b;
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                this.d.g("Failed to sign message", exception0, new Object[0]);
                throw new cjuh(8, exception0.getMessage());
            }
            SigncryptedMessage signcryptedMessage0 = new SigncryptedMessage(arr_b1);
            Bundle bundle0 = new aijp(Status.b, signcryptedMessage0).b();
            this.e.a(bundle0);
            return;
        }
        try {
            arr_b2 = aihk.c(context0, hhtt0, this.c, account0);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception1) {
            this.d.g("Failed to sign message", exception1, new Object[0]);
            throw new cjuh(8, exception1.getMessage());
        }
        SigncryptedMessage signcryptedMessage1 = new SigncryptedMessage(arr_b2);
        Bundle bundle1 = new aijp(Status.b, signcryptedMessage1).b();
        this.e.a(bundle1);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        Bundle bundle0 = new aijp(status0, null).b();
        this.e.a(bundle0);
    }
}

