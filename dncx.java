import android.content.Context;
import android.widget.Toast;

public final class dncx implements evqc {
    public final dndr a;

    public dncx(dndr dndr0) {
        this.a = dndr0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(dndr.a.i(), "Failed to get payment methods, exiting activity.", exception0);
        dndr dndr0 = this.a;
        Context context0 = dndr0.getContext();
        if(context0 != null) {
            Toast.makeText(context0, dndr0.getString(0x7F151DDD), 1).show();  // string:pay_error_dialog_body "Please try again later"
        }
        xob xob0 = dndr0.an();
        if(xob0 != null) {
            xob0.finish();
        }
    }
}

