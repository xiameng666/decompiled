import android.accounts.Account;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class ffgs implements evqf {
    public final String a;
    public final Account b;
    public final fdiy c;

    public ffgs(String s, Account account0, fdiy fdiy0) {
        this.a = s;
        this.b = account0;
        this.c = fdiy0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Log.d("WearableService", "Obtained account key from FastPairClient");
        feml feml0 = feml.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fesz.a).v_newBuilder();
        String s = this.b.name;
        fdiy fdiy0 = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fesz fesz0 = (fesz)hftp0.b_message;
        s.getClass();
        fesz0.b |= 1;
        fesz0.c = s;
        ByteString hfsf0 = ByteString.copyFrom(((cxxq)object0).a());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fesz fesz1 = (fesz)hftp0.b_message;
        fesz1.b |= 2;
        fesz1.d = hfsf0;
        fesz fesz2 = (fesz)hftp0.N_build();
        feml0.d(this.a, fesz2);
        try {
            fdiy0.a(new Status(0));
        }
        catch(RemoteException unused_ex) {
        }
    }
}

