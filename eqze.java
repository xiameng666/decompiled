import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.smartdevice.quickstart.OsMigrationResult;
import com.google.android.gms.smartdevice.setup.auth.StartSessionRequest;
import com.google.android.gms.smartdevice.setup.auth.StartSessionResponse;
import j..util.Collection.-EL;
import j..util.Objects;
import j..util.stream.Collectors;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

final class eqze extends cvxf {
    final eqzf a;

    public eqze(eqzf eqzf0) {
        Objects.requireNonNull(eqzf0);
        this.a = eqzf0;
        super();
    }

    @Override  // cvxf
    public final void a(cuwd cuwd0, cuwu cuwu0) {
        List list1;
        DctDevice dctDevice0 = (DctDevice)cuwd0;
        byte[] arr_b = cuwu0.k;
        if(arr_b == null) {
            eqzf.a.m("Receive empty bytes payload", new Object[0]);
            return;
        }
        eqzh eqzh0 = this.a.f;
        if(eqzh0 != null) {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)eqof.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                if(eqzh0.g == null) {
                    throw new IllegalStateException("FidoHelper is null");
                }
                hfuo hfuo0 = ((eqof)hftv0).b;
                if(hfuo0.isEmpty()) {
                    eqzh.a.m("Received empty assertion list", new Object[0]);
                    eqzh0.a(10801, null);
                    return;
                }
                eqzh0.d.c = hfuo0.size();
                eqtr eqtr0 = eqzh0.g;
                batl.s(eqtr0);
                List list0 = (List)Collection.-EL.stream(hfuo0).map(new eqzg(eqtr0)).collect(Collectors.toList());
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: list0) {
                    AuthenticatorAssertionResponse authenticatorAssertionResponse0 = (AuthenticatorAssertionResponse)object0;
                    byte[] arr_b1 = authenticatorAssertionResponse0.g();
                    if(arr_b1 == null) {
                        eqzh.a.m("UserHandle shouldn\'t be null", new Object[0]);
                    }
                    else {
                        arrayList0.add(new StartSessionRequest(1, new String(arr_b1, StandardCharsets.UTF_8), bbmu.c(authenticatorAssertionResponse0.e()), authenticatorAssertionResponse0.c(), authenticatorAssertionResponse0.d(), authenticatorAssertionResponse0.f(), 2, false, null));
                    }
                }
                try {
                    list1 = eqzh0.f.c(arrayList0);
                }
                catch(erhq erhq0) {
                    eqzh.a.m("Start session returned exception " + erhq0.toString(), new Object[0]);
                    return;
                }
                baun baun0 = eqzh.a;
                baun0.h("processStartSessionResponses", new Object[0]);
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int v = 0;
                for(Object object1: list1) {
                    StartSessionResponse startSessionResponse0 = (StartSessionResponse)object1;
                    switch(startSessionResponse0.b) {
                        case 1: {
                            baun0.m("Account is rejected with reason: " + startSessionResponse0.c, new Object[0]);
                            v = startSessionResponse0.c;
                            continue;
                        }
                        case 2: {
                            arrayList1.add(startSessionResponse0);
                            continue;
                        }
                        case 3: {
                            arrayList2.add(startSessionResponse0);
                        }
                    }
                }
                eray eray0 = eqzh0.c;
                eray0.u(list1.size());
                eray0.t(arrayList1.size());
                eray0.v(arrayList2.size());
                eray0.p();
                if(arrayList2.isEmpty() && arrayList1.isEmpty()) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((eqoc)hftv1).c = 3;
                    ((eqoc)hftv1).b |= 1;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    eqoc eqoc0 = (eqoc)hftp0.b_message;
                    eqoc0.b |= 2;
                    eqoc0.d = v;
                    eqzh0.a(0x2A02, ((eqoc)hftp0.N_build()));
                    return;
                }
                if(!arrayList1.isEmpty()) {
                    if(hyhp.j()) {
                    label_82:
                        gged_interceptors gged0 = eqsh.i(eqzh0.b, arrayList1);
                        ArrayList arrayList3 = new OsMigrationResult(eqzh0.d.a, eqzh0.d.b, eqzh0.d.c).a;
                        arrayList3.addAll(gged0);
                        eqzh0.d.a = arrayList3;
                    }
                    else {
                        int v1 = (int)hyhp.f();
                        if(eqqw.f(eqzh0.b, arrayList1, v1)) {
                            goto label_82;
                        }
                        else {
                            baun0.m("Invalid tokenResponse when upserting accounts", new Object[0]);
                            if(arrayList2.isEmpty()) {
                                eqzh0.a(10502, null);
                                return;
                            }
                        }
                    }
                }
                if(!arrayList2.isEmpty()) {
                    eray0.x(12);
                    eqzh0.d.b = new ArrayList(((gged_interceptors)Collection.-EL.stream(arrayList2).map(new eqsb()).collect(ggaf.a)));
                }
            }
            catch(hfur hfur0) {
                eqzh.a.l(hfur0);
            }
        }
    }

    @Override  // cvxf
    public final void b(cuwd cuwd0, PayloadTransferUpdate payloadTransferUpdate0) {
        DctDevice dctDevice0 = (DctDevice)cuwd0;
    }
}

