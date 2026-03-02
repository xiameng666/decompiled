import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.SyncDeviceInfoRequest;
import j..util.DesugarCollections;

public final class ebsc implements evpo {
    public final ebsf a;
    public final long b;

    public ebsc(ebsf ebsf0, long v) {
        this.a = ebsf0;
        this.b = v;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        Status status0 = Status.b;
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ebsf ebsf0 = this.a;
        dyfi dyfi0 = ebsf0.u;
        etgl etgl0 = null;
        if(dyfi0 == null) {
            ibuq.j("responseBuilder");
            dyfi0 = null;
        }
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)dyfi0).N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((dyfl)hftv0), "value");
        ProtoLiteBuilder hftp0 = dyga0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp0.b_message;
        ((dyfl)hftv0).getClass();
        dyfy0.c = (dyfl)hftv0;
        dyfy0.b = 2;
        byte[] arr_b = dyga0.a().toBytesArray();
        ebsf0.c.b(status0, arr_b);
        ebst ebst0 = ebsf0.f();
        String s = ebsf0.a().name;
        ibuq.e(s, "name");
        ebsf0.r();
        ebst.e(ebst0, s, 0x31B60, System.currentTimeMillis() - this.b, 0, 24);
        dyfi dyfi1 = ebsf0.u;
        if(dyfi1 == null) {
            ibuq.j("responseBuilder");
            dyfi1 = null;
        }
        boolean z = false;
        for(Object object0: DesugarCollections.unmodifiableList(((dyfl)dyfi1.b_message).b)) {
            dyfj dyfj0 = dyfj.b(((dyfk)object0).e);
            if(dyfj0 == null) {
                dyfj0 = dyfj.j;
            }
            if(!dyfj0.equals(dyfj.b)) {
                break;
            }
            dyib dyib0 = ((dyfk)object0).d;
            if(dyib0 == null) {
                dyib0 = dyib.a;
            }
            dyna dyna0 = dyna.b(dyib0.b) == null ? dyna.k : dyna.b(dyib0.b);
            ibuq.e(dyna0, "getServiceProvider(...)");
            ebsf0.e().n(dyna0).v(ebsf0.k(), new ebrp());
            z = true;
        }
        if(z) {
            Context context0 = ebsf0.e;
            ebza.h(context0);
            ebsf0.r();
            long v = System.currentTimeMillis();
            dmgi dmgi0 = ebsf0.q;
            if(dmgi0 == null) {
                ibuq.j("clearcutEventLogger");
                dmgi0 = null;
            }
            hafk hafk0 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
            halv halv0 = ebxg.a(v);
            ibuq.e(halv0, "buildSyncInitiatedEvent(...)");
            ibuq.f(halv0, "value");
            ProtoLiteBuilder hftp1 = hafk0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hapr hapr0 = (hapr)hftp1.b_message;
            halv0.getClass();
            hapr0.br = halv0;
            hapr0.f |= 0x10000;
            dmgi0.b(hafk0.a());
            if(hwsd.M()) {
                ebsf0.r();
                ebja.b(context0, System.currentTimeMillis());
                ebst ebst1 = ebsf0.f();
                String s1 = ebsf0.a().name;
                ibuq.e(s1, "name");
                ebst1.a(s1, 273037);
            }
            if(hwfk.ae()) {
                etgl etgl1 = ebsf0.w;
                if(etgl1 == null) {
                    ibuq.j("firstPartyTapAndPayClient");
                }
                else {
                    etgl0 = etgl1;
                }
                SyncDeviceInfoRequest syncDeviceInfoRequest0 = new SyncDeviceInfoRequest();
                syncDeviceInfoRequest0.a = ebsf0.b.d;
                etgl0.cV(syncDeviceInfoRequest0).v(ebsf0.k(), new ebrn());
            }
        }
        return ibom.a;
    }
}

