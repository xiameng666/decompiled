import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;

public final class fcde {
    public final SharedPreferences a;
    public int b;
    private final Context c;

    public fcde(Context context0) {
        this.c = context0;
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.android.gms.wallet.upstream.InitializeResponseCache", 0);
        this.a = sharedPreferences0;
        if(sharedPreferences0.contains("version_key")) {
            if(sharedPreferences0.getInt("version_key", 1) <= 0) {
                this.c(5);
                if(this.b == 5) {
                    return;
                }
            }
            long v = sharedPreferences0.getLong("legal_document_version_key", 0L);
            if(v != 0L && v == hzic.b()) {
                long v1 = sharedPreferences0.getLong("bin_ranges_hash_key", 0L);
                if(v1 != 0L && v1 == hzhz.b()) {
                    this.b = 1;
                    return;
                }
                this.c(3);
                return;
            }
            this.c(4);
            return;
        }
        this.b = 2;
        this.b();
    }

    public final String a(String s, int v, Account account0, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfyx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((hfyx)hftv0).b |= 4;
        ((hfyx)hftv0).e = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfyx hfyx0 = (hfyx)hftp0.b_message;
        hfyx0.b |= 2;
        hfyx0.d = v;
        String s1 = account0.name;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfyx hfyx1 = (hfyx)hftp0.b_message;
        s1.getClass();
        hfyx1.b |= 1;
        hfyx1.c = s1;
        String s2 = gcut.b(this.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hfyx)hftv1).b |= 8;
        ((hfyx)hftv1).f = s2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfyx hfyx2 = (hfyx)hftp0.b_message;
        hfyx2.b |= 16;
        hfyx2.g = v1;
        return gciq.g(((MessageLite)(((hfyx)hftp0.N_build()))));
    }

    private final void b() {
        this.a.edit().putInt("version_key", 1).putLong("legal_document_version_key", hzic.b()).putLong("bin_ranges_hash_key", hzhz.b()).apply();
    }

    private final void c(int v) {
        this.b = v;
        this.a.edit().clear().apply();
        this.b();
    }
}

