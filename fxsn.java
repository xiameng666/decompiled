import android.accounts.Account;
import com.google.android.location.reporting.server.RemoteDevice;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class fxsn {
    public final fxsf a;
    public final List b;

    public fxsn(fxsf fxsf0, List list0) {
        this.a = fxsf0;
        Collator collator0 = Collator.getInstance(Locale.getDefault());
        collator0.setStrength(0);
        Collections.sort(list0, new fxuz(collator0));
        this.b = list0;
    }

    public static fxsn a(Account account0, gzvg gzvg0) {
        fxsf fxsf0 = fxsf.b(account0, (gzvg0.b == null ? gzvd.a : gzvg0.b));
        hfuo hfuo0 = gzvg0.c;
        ArrayList arrayList0 = new ArrayList();
        if(hfuo0 != null) {
            for(Object object0: hfuo0) {
                gzvu gzvu0 = (gzvu)object0;
                boolean z = gzvu0.d;
                int v = gzvu0.c;
                Long long0 = null;
                String s = (gzvu0.b & 8) == 0 ? null : gzvu0.f;
                boolean z1 = gzvu0.e;
                Long long1 = (gzvu0.b & 16) == 0 ? null : ((long)gzvu0.g);
                if((gzvu0.b & 0x20) != 0) {
                    long0 = (long)gzvu0.h;
                }
                arrayList0.add(new RemoteDevice(v, s, z1, z, long1, long0));
            }
        }
        return new fxsn(fxsf0, arrayList0);
    }
}

