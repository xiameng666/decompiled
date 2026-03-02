import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import java.util.ArrayList;
import java.util.ListIterator;

public final class ahyw {
    public final baun a;
    public final ArrayList b;
    public final ahyx c;
    public final aiaa d;
    public final aiaf e;

    public ahyw(aiaa aiaa0, aiaf aiaf0) {
        this.a = new baun("LegacyRequestHandler");
        this.b = new ArrayList();
        this.c = new ahyv(this);
        this.d = aiaa0;
        this.e = aiaf0;
    }

    public final void a(long v) {
        long v1 = v - hppt.b();
        ArrayList arrayList0 = new ArrayList();
        ListIterator listIterator0 = this.b.listIterator();
        while(listIterator0.hasNext()) {
            Object object0 = listIterator0.next();
            aiaq aiaq0 = (aiaq)object0;
            long v2 = aiaq0.b;
            if(v2 <= v1) {
                aiaa aiaa0 = this.d;
                String s = aiaq0.a;
                SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
                aiao.d(2, smsRetrieverEvent0);
                if(s != null) {
                    aiao.a(s, smsRetrieverEvent0);
                }
                aiaa0.a(new aicq(smsRetrieverEvent0, true));
                arrayList0.add(s);
                this.a.d("removeRequest. Timestamp: %d", new Object[]{v2});
                listIterator0.remove();
            }
        }
        if(!arrayList0.isEmpty()) {
            this.d.c(arrayList0);
        }
    }

    public final boolean b() {
        return this.b.isEmpty();
    }
}

