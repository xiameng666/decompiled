import android.content.Intent;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class aiaa {
    final aiac a;

    public aiaa(aiac aiac0) {
        Objects.requireNonNull(aiac0);
        this.a = aiac0;
        super();
    }

    public final void a(aicq aicq0) {
        this.a.h.d(aicq0);
    }

    public final void b(String s, String s1, int v, String s2) {
        Intent intent0 = ahxf.a(s, Status.b);
        intent0.putExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE", s1);
        if(v != -1) {
            intent0.putExtra("com.google.android.gms.auth.api.phone.EXTRA_SIM_SUBSCRIPTION_ID", v);
        }
        if(s2 != null) {
            intent0.putExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_ORIGINATING_ADDRESS", s2);
        }
        this.a.h.c(intent0);
    }

    public final void c(Iterable iterable0) {
        for(Object object0: iterable0) {
            Intent intent0 = ahxf.a(((String)object0), Status.e).putExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE", "");
            this.a.h.c(intent0);
        }
    }

    public final void d(String s, String s1) {
        gftb.check(s);
        gftb.check(s1);
        Intent intent0 = ahxe.a(s, Status.b).putExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE", s1);
        this.a.h.c(intent0);
    }

    public final void e(String s, int v) {
        Intent intent0 = ahxe.b(s, v);
        this.a.h.c(intent0);
    }
}

