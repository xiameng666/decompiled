import com.google.android.gms.pay.PayApiError;

public final class dlgy extends Exception {
    public final PayApiError a;

    public dlgy(PayApiError payApiError0) {
        this.a = payApiError0;
    }
}

