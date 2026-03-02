import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;

public final class aiao {
    public static final void a(String s, SmsRetrieverEvent smsRetrieverEvent0) {
        smsRetrieverEvent0.n |= 2;
        smsRetrieverEvent0.b = s;
    }

    public static final void b(int v, SmsRetrieverEvent smsRetrieverEvent0) {
        smsRetrieverEvent0.n |= 0x100;
        smsRetrieverEvent0.i = v;
    }

    public static final void c(int v, SmsRetrieverEvent smsRetrieverEvent0) {
        smsRetrieverEvent0.n |= 8;
        smsRetrieverEvent0.d = v;
    }

    public static final void d(int v, SmsRetrieverEvent smsRetrieverEvent0) {
        smsRetrieverEvent0.n |= 1;
        smsRetrieverEvent0.a = v;
    }

    public static final void e(boolean z, SmsRetrieverEvent smsRetrieverEvent0) {
        smsRetrieverEvent0.n |= 0x400;
        smsRetrieverEvent0.k = z;
    }

    public static final void f(int v, SmsRetrieverEvent smsRetrieverEvent0) {
        smsRetrieverEvent0.n |= 0x1000;
        smsRetrieverEvent0.m = v;
    }

    public static final void g(int v, SmsRetrieverEvent smsRetrieverEvent0) {
        smsRetrieverEvent0.n |= 0x200;
        smsRetrieverEvent0.j = v;
    }

    public static final void h(int v, SmsRetrieverEvent smsRetrieverEvent0) {
        smsRetrieverEvent0.n |= 4;
        smsRetrieverEvent0.c = v;
    }
}

