import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;

public final class feax {
    public final Context a;
    public final HashMap b;
    private final HashMap c;

    public feax(Context context0) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = context0;
    }

    public final gged_interceptors a() {
        ggdy ggdy0 = new ggdy();
        try {
            this.b();
            for(Object object0: this.b.keySet()) {
                String s = (String)object0;
                HashMap hashMap0 = this.c;
                String s1 = (String)hashMap0.get(s);
                int v = 0;
                while(v < 3 && s1 == null) {
                    try {
                        s1 = acso.e(this.a, s);
                        hashMap0.put(s, s1);
                    }
                    catch(acse unused_ex) {
                        if(!Log.isLoggable("AccountMatchRecordPrvdr", 5)) {
                            continue;
                        }
                        Log.w("AccountMatchRecordPrvdr", "Could not fetch account id for " + s);
                    }
                    catch(IOException unused_ex) {
                        Thread.sleep((1L << v) * 300L);
                        ++v;
                    }
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fewz.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s.getClass();
                ((fewz)hftv0).b |= 2;
                ((fewz)hftv0).d = s;
                if(s1 != null) {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fewz fewz0 = (fewz)hftp0.b_message;
                    fewz0.b |= 1;
                    fewz0.c = s1;
                }
                ggdy0.i(((fewz)hftp0.N_build()));
            }
        }
        catch(InterruptedException interruptedException0) {
            if(Log.isLoggable("AccountMatchRecordPrvdr", 5)) {
                Log.w("AccountMatchRecordPrvdr", "Fetching accounts interrupted", interruptedException0);
            }
            Thread.currentThread().interrupt();
        }
        return ggdy0.h();
    }

    public final void b() {
        try {
            Account[] arr_account = new adgg(this.a).e(this.a);
            HashMap hashMap0 = this.b;
            hashMap0.clear();
            for(int v = 0; v < arr_account.length; ++v) {
                Account account0 = arr_account[v];
                hashMap0.put(account0.name, account0);
            }
        }
        catch(RemoteException | azqj | azqi exception0) {
            if(Log.isLoggable("AccountMatchRecordPrvdr", 6)) {
                Log.e("AccountMatchRecordPrvdr", "Get accounts failed.", exception0);
            }
        }
    }
}

