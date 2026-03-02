import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.PlainText;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class aihk {
    public static final long a;

    static {
        aihk.a = TimeUnit.MINUTES.toMillis(60L);
    }

    public static Object a(evql evql0) {
        evrg.o(evql0, aihk.a, TimeUnit.MILLISECONDS);
        return evql0.j();
    }

    public static final CryptauthPublicKey b(Context context0, Account account0) {
        return (CryptauthPublicKey)aihk.a(new ajes(context0).k(account0));
    }

    public static final byte[] c(Context context0, hhtt hhtt0, byte[] arr_b, Account account0) {
        ajes ajes0 = new ajes(context0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhto.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = hhtt0.q - 1;
        if(hhtt0.q == 0) {
            throw null;
        }
        ((hhto)hftv0).c = v;
        ((hhto)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhto.b(((hhto)hftp0.b_message));
        return ((SignCryptedBlob)aihk.a(ajes0.m(account0, new Payload(null, ((hhto)hftp0.N_build()).toBytesArray(), arr_b)))).c;
    }

    public static final aihj d(Context context0, byte[] arr_b, byte[] arr_b1) {
        ajes ajes0 = new ajes(context0);
        PlainText plainText0 = (PlainText)aihk.a(ajes0.iG(new ajer(ajes0, arr_b1, new Payload(null, null, arr_b))));
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhva.a), plainText0.b, 0, plainText0.b.length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        hfsl hfsl0 = ((hhva)hftv0).h.k();
        ProtoLiteMessage hftv1 = ((ProtoLiteMessage)hhto.a).x_newMutableInstance();
        try {
            hfwc hfwc0 = hfvu.a.c(hftv1);
            hfwc0.l(hftv1, hfsm.p(hfsl0), hftc.a);
            hfwc0.g(hftv1);
        }
        catch(hfur hfur0) {
            if(hfur0.b) {
                hfur0 = new hfur(hfur0);
            }
            hfur0.a = hftv1;
            throw hfur0;
        }
        catch(hfwr hfwr0) {
            hfur hfur1 = hfwr0.a();
            hfur1.a = hftv1;
            throw hfur1;
        }
        catch(IOException iOException0) {
            if((iOException0.getCause() instanceof hfur)) {
                throw (hfur)iOException0.getCause();
            }
            hfur hfur2 = new hfur(iOException0);
            hfur2.a = hftv1;
            throw hfur2;
        }
        catch(RuntimeException runtimeException0) {
            if((runtimeException0.getCause() instanceof hfur)) {
                throw (hfur)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        try {
            hfsl0.z(0);
        }
        catch(hfur hfur3) {
            hfur3.a = hftv1;
            throw hfur3;
        }
        ProtoLiteMessage.P_makeImmutable(hftv1);
        ProtoLiteMessage.P_makeImmutable(hftv1);
        int v = hhtq.a(((hhto)hftv1).c);
        if(v == 0) {
            v = 1;
        }
        return new aihj(new hhts(hhtt.b(v), plainText0.c), plainText0.d.name);
    }
}

