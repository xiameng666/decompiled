import android.widget.Toast;

public final class dmwt implements evqc {
    public final dmyx a;

    public dmwt(dmyx dmyx0) {
        this.a = dmyx0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(dmyx.a.i(), "Failed to get payment methods, exiting activity.", exception0);
        Toast.makeText(this.a.getContext(), this.a.getString(0x7F151DDD), 1).show();  // string:pay_error_dialog_body "Please try again later"
        xob xob0 = this.a.an();
        if(xob0 != null) {
            xob0.finish();
        }
    }
}

