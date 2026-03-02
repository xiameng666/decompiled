import com.google.android.gms.pay.ProtoSafeParcelable;
import java.util.ArrayList;

final class dlvn extends ibuo implements ibts {
    public dlvn(Object object0) {
        super(1, object0, dlvo.class, "onCalloutsRetrieved", "onCalloutsRetrieved(Lcom/google/android/gms/pay/ProtoSafeParcelable;)V", 0);
    }

    // This method was un-flattened
    @Override  // ibts
    public final Object a(Object object0) {
        int v2;
        ibuq.f(((ProtoSafeParcelable)object0), "p0");
        dlvo dlvo0 = (dlvo)this.e;
        ibuq.e(dluf.a, "getDefaultInstance(...)");
        MessageLite hfvm0 = ftqe.c(((ProtoSafeParcelable)object0), ((MessageLite)dluf.a));
        ibuq.e(hfvm0, "parse(...)");
        hfuo hfuo0 = ((dluf)hfvm0).b;
        ibuq.e(hfuo0, "getCalloutsList(...)");
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: hfuo0) {
            hjrn hjrn0 = (hjrn)object1;
            Object object2 = null;
            if(hjrn0 != null && hjrn0.c == 12) {
                String s = hjrn0.e;
                ibuq.e(s, "getId(...)");
                hjwf hjwf0 = hjrn0.c == 12 ? ((hjwf)hjrn0.d) : hjwf.a;
                String s1 = "";
                String s2 = hjwf0.b == 4 ? ((String)hjwf0.c) : "";
                ibuq.e(s2, "getMessageText(...)");
                int v = hjrn0.c;
                int v1 = 0;
                switch((v == 12 ? ((hjwf)hjrn0.d) : hjwf.a).f) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        v2 = 3;
                        break;
                    }
                    case 2: {
                        v2 = 4;
                        break;
                    }
                    case 3: {
                        v2 = 5;
                        break;
                    }
                    case 4: {
                        v2 = 6;
                        break;
                    }
                    default: {
                        v2 = 1;
                    }
                }
                switch(v2 - 2) {
                    case 2: {
                        v1 = 1;
                        break;
                    }
                    case 3: {
                        v1 = 2;
                        break;
                    }
                    case 4: {
                        v1 = 3;
                    }
                }
                hjwf hjwf1 = v == 12 ? ((hjwf)hjrn0.d) : hjwf.a;
                if(hjwf1.d == 6) {
                    s1 = (String)hjwf1.e;
                }
                ibuq.e(s1, "getActionText(...)");
                hfuo hfuo1 = (hjrn0.c == 12 ? ((hjwf)hjrn0.d) : hjwf.a).h;
                ibuq.e(hfuo1, "getUserActionsList(...)");
                gged_interceptors gged0 = hfuo1.isEmpty() ? ggna.a : gged_interceptors.l(fsae.b);
                ibuq.c(gged0);
                object2 = new fsak(s, s2, v1, s1, gged0, hjrn0, ggna.a);
            }
            if(object2 != null) {
                arrayList0.add(object2);
            }
        }
        dlvo0.b.ii(arrayList0);
        return ibom.a;
    }
}

