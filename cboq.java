import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.google.android.gms.kids.settings.download.client.AppDownloadClient.apkInstallEvents.1.receiver.1;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

final class cboq extends ibsl implements ibtw {
    Object a;
    int b;
    final cbpb c;
    private Object d;

    public cboq(cbpb cbpb0, ibrl ibrl0) {
        this.c = cbpb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cboq)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cboq(this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        List list0;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            ichm ichm0 = (ichm)this.d;
            list0 = new ArrayList();
            long v = SystemClock.elapsedRealtime();
            object2 = new AppDownloadClient.apkInstallEvents.1.receiver.1(this.c, list0, ichm0, v);
            try {
                IntentFilter intentFilter0 = new IntentFilter("com.google.android.finsky.installapi.ACTION_INSTALL_STATUS");
                jwe.b(this.c.c, ((BroadcastReceiver)object2), intentFilter0, 2);
                this.d = list0;
                this.a = object2;
                this.b = 1;
                if(iccv.b(this) == object1) {
                    return object1;
                }
            }
            catch(Throwable throwable0) {
                goto label_19;
            }
        }
        else {
            object2 = this.a;
            list0 = (List)this.d;
            try {
                ibnx.b(object0);
                throw new ibnm();
            }
            catch(Throwable throwable0) {
                goto label_19;
            }
        }
        throw new ibnm();
    label_19:
        cfvm cfvm0 = cfvm.v();
        gvib gvib0 = gvia.a(((hftr)((ProtoLiteMessage)gvij.a).v_newBuilder()));
        gvhy gvhy0 = gvhx.a(((ProtoLiteMessage)gvhl.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvhu.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        List list1 = DesugarCollections.unmodifiableList(((gvhu)hftp0.b_message).c);
        ibuq.e(list1, "getDownloadEventsList(...)");
        new hfxu(list1);
        ibuq.f(list0, "values");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvhu gvhu0 = (gvhu)hftp0.b_message;
        hfuo hfuo0 = gvhu0.c;
        if(!hfuo0.c()) {
            gvhu0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, gvhu0.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvhu gvhu1 = (gvhu)hftp0.b_message;
        gvhu1.b |= 1;
        gvhu1.d = "com.google.android.gms.supervision";
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gvhu)hftv0), "value");
        ProtoLiteBuilder hftp1 = gvhy0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvhl gvhl0 = (gvhl)hftp1.b_message;
        ((gvhu)hftv0).getClass();
        gvhl0.d = (gvhu)hftv0;
        gvhl0.c = 12;
        gvib0.b(gvhy0.a());
        cczb cczb0 = cfvm0.c(((ProtoLiteMessage)gvib0.a()));
        cczb0.c = new Integer(gvkq.V.er);
        cczb0.a();
        this.c.c.unregisterReceiver(((BroadcastReceiver)object2));
        throw throwable0;
    }
}

