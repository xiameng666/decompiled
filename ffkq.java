import android.text.TextUtils;
import com.google.android.gms.wearable.internal.RecordUntetheredSupervisedAccountTransferRequest;
import j..util.Objects;

final class ffkq extends ffee {
    final RecordUntetheredSupervisedAccountTransferRequest c;
    final fdiy d;
    final fflv e;

    public ffkq(fflv fflv0, RecordUntetheredSupervisedAccountTransferRequest recordUntetheredSupervisedAccountTransferRequest0, fdiy fdiy0) {
        this.c = recordUntetheredSupervisedAccountTransferRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("recordConsentUntetheredSupervisedAccountTransfer");
    }

    @Override  // ffee
    public final void a() {
        evql evql1;
        fdch fdch0 = this.e.C;
        batl.s(fdch0);
        String s = this.c.a;
        String s1 = this.c.b;
        boolean z = this.c.c;
        if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s)) {
            evql evql0 = fdch0.d(s);
            evql0.b(new fdbh(fdch0, s1, z));
            evql0.A(new fdbi());
            evql1 = evql0.g(new fdbj());
        }
        else {
            evql1 = evrg.c(new IllegalArgumentException("Missing child gaia ID or parentAccountName not recording consent! parentAccountName =  " + TextUtils.isEmpty(s) + " childGaiaId " + TextUtils.isEmpty(s1)));
        }
        evql1.z(new ffko(this.d));
        evql1.A(new ffkp());
    }
}

