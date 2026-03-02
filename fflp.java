import android.accounts.Account;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class fflp extends ffee {
    final String c;
    final fdiy d;
    final String e;
    final Account f;
    final String g;
    final fflv h;

    public fflp(fflv fflv0, String s, fdiy fdiy0, String s1, Account account0, String s2) {
        this.c = s;
        this.d = fdiy0;
        this.e = s1;
        this.f = account0;
        this.g = s2;
        Objects.requireNonNull(fflv0);
        this.h = fflv0;
        super("associateDeviceAndAccountWithFastPair");
    }

    @Override  // ffee
    public final void a() {
        try {
            String s = this.c;
            if(s != null) {
                this.h.bc(this.d, this.e, this.f, this.g, s);
                return;
            }
            batl.s(this.g);
            azzc azzc0 = new azzc();
            azzc0.a = new cyho(((cyhq)this.h.u), this.g);
            azzc0.c = new Feature[]{cumh.p};
            azzc0.d = 0x510;
            azzd azzd0 = azzc0.a();
            evql evql0 = ((azts)this.h.u).iG(azzd0);
            evql0.b(new ffhn(this.h, this.d, this.e, this.f, this.g));
            evql0.A(new ffho(this.d));
        }
        catch(Exception exception0) {
            if(Log.isLoggable("WearableService", 6)) {
                Log.e("WearableService", "associateDeviceAndAccountWithFastPair: exception during processing", exception0);
            }
            Status status0 = fdlg.a(8);
            this.d.a(status0);
        }
    }
}

