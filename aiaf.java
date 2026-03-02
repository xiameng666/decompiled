import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import j..util.Objects;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class aiaf {
    public final WeakHashMap a;
    final aiac b;

    public aiaf() {
        this.a = new WeakHashMap();
    }

    public aiaf(aiac aiac0) {
        Objects.requireNonNull(aiac0);
        this.b = aiac0;
        super();
        this.a = new WeakHashMap();
    }

    public final void a(ahyx ahyx0, long v) {
        long v1;
        if(hpph.a.b().d()) {
            aiac aiac0 = this.b;
            if(Long.compare(System.currentTimeMillis() + v - aiac0.g, hppk.a.c().a()) > 0) {
                aiak aiak0 = aiac0.h;
                aiac0.g = aiak0.a(v);
                if(hpph.d()) {
                    SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
                    aiao.d(35, smsRetrieverEvent0);
                    aiak0.d(new aicq(smsRetrieverEvent0, true));
                }
            }
            else if(hpph.d()) {
                SmsRetrieverEvent smsRetrieverEvent1 = new SmsRetrieverEvent();
                aiao.d(36, smsRetrieverEvent1);
                aicq aicq0 = new aicq(smsRetrieverEvent1, true);
                aiac0.h.d(aicq0);
            }
            v1 = aiac0.g;
        }
        else {
            v1 = this.b.h.a(v);
        }
        WeakHashMap weakHashMap0 = this.a;
        ArrayList arrayList0 = (ArrayList)weakHashMap0.get(ahyx0);
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            weakHashMap0.put(ahyx0, arrayList0);
        }
        arrayList0.add(Long.valueOf(v1));
    }
}

