import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.model.GetTokenResponse;
import j..util.Objects;

final class govw implements goxl {
    final goxa a;
    final goxl b;
    final govx c;

    public govw(govx govx0, goxa goxa0, goxl goxl0) {
        this.a = goxa0;
        this.b = goxl0;
        Objects.requireNonNull(govx0);
        this.c = govx0;
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        this.b.a(s);
    }

    @Override  // goxl
    public final void b(Object object0) {
        if(!TextUtils.isEmpty(((gozf)object0).e)) {
            Status status0 = new Status(17025);
            goxa goxa0 = this.a;
            PhoneAuthCredential phoneAuthCredential0 = new PhoneAuthCredential(null, null, false, ((gozf)object0).h, true, ((gozf)object0).e, null);
            try {
                Parcel parcel0 = goxa0.c.jo();
                wbz.f(parcel0, status0);
                wbz.f(parcel0, phoneAuthCredential0);
                goxa0.c.jq(12, parcel0);
            }
            catch(RemoteException remoteException0) {
                goxa0.b.g("RemoteException when sending failure result.", remoteException0, new Object[0]);
            }
            return;
        }
        GetTokenResponse getTokenResponse0 = new GetTokenResponse(((gozf)object0).b, ((gozf)object0).a, ((long)((gozf)object0).c), "Bearer");
        gowy.g(this.c.d, getTokenResponse0, "phone", Boolean.valueOf(((gozf)object0).d), this.a, this.b);
    }
}

