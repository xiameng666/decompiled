import com.google.android.gms.tapandpay.hce.service.TpHceSessionManager;

public final class esyb implements espx {
    public final TpHceSessionManager a;
    public final long b;
    public final espx c;

    public esyb(TpHceSessionManager tpHceSessionManager0, long v, espx espx0) {
        this.a = tpHceSessionManager0;
        this.b = v;
        this.c = espx0;
    }

    @Override  // espx
    public final void sendResponseApdu(byte[] arr_b) {
        if(this.a.c > this.b) {
            return;
        }
        this.c.sendResponseApdu(arr_b);
    }
}

