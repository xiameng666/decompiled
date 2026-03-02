import android.app.Activity;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.TokenizeAccountRequest;

public final class etda implements azys {
    public final Activity a;
    public final int b;
    public final TokenizeAccountRequest c;

    public etda(Activity activity0, int v, TokenizeAccountRequest tokenizeAccountRequest0) {
        this.a = activity0;
        this.b = v;
        this.c = tokenizeAccountRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        etat etat0 = new etat(this.a, this.b);
        eszv eszv0 = (eszv)etau0.H();
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.aq(this.c, etat0, apiMetadata0);
        azzf.c(Status.b, null, ((evqp)object1));
    }
}

