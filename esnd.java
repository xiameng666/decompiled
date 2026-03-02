import com.google.android.gms.tapandpay.firstparty.PassInfo;
import com.google.android.gms.tapandpay.firstparty.SeInfo;
import com.google.android.gms.tapandpay.firstparty.TransmissionEvent;
import com.google.android.gms.tapandpay.firstparty.TransmissionFailureUiInfo;

public final class esnd {
    public final TransmissionEvent a;

    public esnd() {
        this.a = new TransmissionEvent();
    }

    public esnd(TransmissionEvent transmissionEvent0) {
        TransmissionEvent transmissionEvent1 = new TransmissionEvent();
        this.a = transmissionEvent1;
        transmissionEvent1.a = transmissionEvent0.a;
        transmissionEvent1.b = transmissionEvent0.b;
        transmissionEvent1.c = transmissionEvent0.c;
        transmissionEvent1.d = transmissionEvent0.d;
        transmissionEvent1.e = transmissionEvent0.e;
        transmissionEvent1.f = transmissionEvent0.f;
        transmissionEvent1.g = transmissionEvent0.g;
        transmissionEvent1.h = transmissionEvent0.h;
        transmissionEvent1.i = transmissionEvent0.i;
        transmissionEvent1.j = transmissionEvent0.j;
    }

    public final void a(int v) {
        this.a.a = v;
    }

    public final void b(boolean z) {
        this.a.c = z;
    }

    public final void c(int v) {
        this.a.d = v;
    }

    public final void d(TransmissionFailureUiInfo transmissionFailureUiInfo0) {
        this.a.e = transmissionFailureUiInfo0;
    }

    public final void e(String s) {
        this.a.g = s;
    }

    public final void f(long v) {
        this.a.f = v;
    }

    public final void g(PassInfo[] arr_passInfo) {
        this.a.b = arr_passInfo;
    }

    public final void h(SeInfo seInfo0) {
        this.a.j = seInfo0;
    }
}

