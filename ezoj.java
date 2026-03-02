import com.google.android.gms.location.reporting.ReportingState;
import java.util.ArrayList;

public final class ezoj implements evqk {
    @Override  // evqk
    public final evql a(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        boolean z = true;
        if(((ReportingState)object0) != null) {
            boolean z1 = ((ReportingState)object0).a && ((ReportingState)object0).f();
            if(!((ReportingState)object0).e() && !((ReportingState)object0).f()) {
                z = false;
            }
            arrayList0.add(ezok.a(hfqt.e, cntt.b(((ReportingState)object0).d()), z1, z));
            arrayList0.add(ezok.a(hfqt.d, cntt.b(((ReportingState)object0).c()), z1, z));
            return evrg.d(arrayList0);
        }
        hfqj hfqj0 = hfqj.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfqj0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hfqj)hftv0).d = 2;
        ((hfqj)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfqj hfqj1 = (hfqj)hftp0.b_message;
        hfqj1.b |= 1;
        hfqj1.c = 15;
        arrayList0.add(((hfqj)hftp0.N_build()));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfqj0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hfqj)hftv1).d = 2;
        ((hfqj)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        hfqj hfqj2 = (hfqj)hftp1.b_message;
        hfqj2.b |= 1;
        hfqj2.c = 2;
        arrayList0.add(((hfqj)hftp1.N_build()));
        return evrg.d(arrayList0);
    }
}

