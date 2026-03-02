import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;

public final class esov implements gftc {
    public final String a;

    public esov(String s) {
        this.a = s;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        return this.a.equals(((GlobalActionCard)object0).b);
    }
}

