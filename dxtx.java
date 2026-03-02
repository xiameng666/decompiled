import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsData;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;

public final class dxtx implements Runnable {
    public final du a;
    public final edtj b;
    public final Context c;
    public final gtur d;

    public dxtx(du du0, edtj edtj0, Context context0, gtur gtur0) {
        this.a = du0;
        this.b = edtj0;
        this.c = context0;
        this.d = gtur0;
    }

    @Override
    public final void run() {
        ByteString hfsf0 = (this.d.f == null ? hbzz.a : this.d.f).c;
        fbjm fbjm0 = new fbjm(this.c);
        fbjm0.h(new SecurePaymentsPayload(hfsf0.toByteArray(), new SecurePaymentsData[0]));
        this.b.d(this.c, fbjm0);
        Intent intent0 = fbjm0.a();
        this.a.startActivityForResult(intent0, 0x461);
    }
}

