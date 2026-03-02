import android.widget.Toast;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvtn implements evqc {
    public final dvts a;
    public final Valuable b;
    public final boolean c;
    public final fshh d;

    public dvtn(dvts dvts0, Valuable valuable0, boolean z, fshh fshh0) {
        this.a = dvts0;
        this.b = valuable0;
        this.c = z;
        this.d = fshh0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)dvts.a.i()).s(exception0)).B("Failed to update wallet surfacing state for valuable ID: %s", this.b.b);
        Toast.makeText(this.a.requireContext(), 0x7F151DDD, 1).show();  // string:pay_error_dialog_body "Please try again later"
        this.b.m = this.c;
        this.d.f(this.c);
    }
}

