import android.accounts.Account;
import android.content.Context;
import java.util.Collections;
import java.util.Set;

final class ezok {
    public final Account a;
    public final azts b;
    public static final int c;
    private static final ggfp d;
    private final Context e;

    static {
        ezok.d = ggfp.K(Integer.valueOf(2), Integer.valueOf(15));
    }

    public ezok(Context context0, Account account0) {
        azts azts0 = new azts(context0, null);
        super();
        this.e = context0;
        this.a = account0;
        this.b = azts0;
    }

    public static hfqj a(hfqt hfqt0, boolean z, boolean z1, boolean z2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfqj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hfqj)hftv0).d = 1;
        ((hfqj)hftv0).b |= 2;
        int v = hfqt0.l;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hfqj)hftv1).b |= 1;
        ((hfqj)hftv1).c = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfqj)hftp0.b_message).e = (z ? 3 : 4) - 1;
        ((hfqj)hftp0.b_message).b |= 4;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfqg.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((hfqg)hftv2).b |= 1;
        ((hfqg)hftv2).c = z1;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((hfqg)hftv3).b |= 2;
        ((hfqg)hftv3).d = false;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        hfqg hfqg0 = (hfqg)hftp1.b_message;
        hfqg0.b |= 4;
        hfqg0.e = z2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfqj hfqj0 = (hfqj)hftp0.b_message;
        hfqg hfqg1 = (hfqg)hftp1.N_build();
        hfqg1.getClass();
        hfqj0.f = hfqg1;
        hfqj0.b |= 8;
        return (hfqj)hftp0.N_build();
    }

    final Set b() {
        return this.c() ? ezok.d : Collections.EMPTY_SET;
    }

    public final boolean c() {
        return !bbnp.d(this.e);
    }
}

