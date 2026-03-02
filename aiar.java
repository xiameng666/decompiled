import android.telephony.SmsMessage;

public final class aiar {
    private final ahzs a;
    private final gged_interceptors b;

    public aiar(ahzs ahzs0) {
        this.a = ahzs0;
        this.b = null;
    }

    public aiar(gged_interceptors gged0) {
        this.b = gged0;
        this.a = null;
    }

    final int a() {
        if(this.f()) {
            return 1;
        }
        return this.e() ? 2 : 0;
    }

    final String b() {
        if(this.e()) {
            gged_interceptors gged0 = this.a.c;
            if(!gged0.isEmpty()) {
                return ((ahzr)gged0.get(0)).a;
            }
        }
        if(this.f()) {
            return aicz.a(this.b);
        }
        throw new IllegalStateException("Text message contains neither an RCS nor an SMS message");
    }

    final String c() {
        if(this.e()) {
            return this.a.a;
        }
        if(this.f()) {
            String s = ((SmsMessage)this.b.get(0)).getOriginatingAddress();
            if(s != null) {
                return s;
            }
        }
        throw new IllegalStateException("Text message contains neither an RCS nor an SMS message");
    }

    final boolean d() {
        return !this.e() && !this.f();
    }

    private final boolean e() {
        return this.a != null;
    }

    private final boolean f() {
        return this.b != null && !this.b.isEmpty();
    }
}

