import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.targetdevice.TargetDirectTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import com.google.android.gms.smartdevice.setup.auth.StartSessionRequest;
import com.google.android.gms.smartdevice.setup.auth.StartSessionResponse;
import j..util.Objects;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class eqfs implements evpz {
    public final eqft a;

    public eqfs(eqft eqft0) {
        this.a = eqft0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        eqoc eqoc6;
        boolean z3;
        List list1;
        eqoc eqoc1;
        boolean z2;
        eqft eqft0 = this.a;
        if(evql0.n()) {
            TargetDirectTransferResult targetDirectTransferResult0 = (TargetDirectTransferResult)evql0.j();
            erqc erqc0 = eqft.a;
            erqc0.h("Processing Fido assertions.", new Object[0]);
            eqft0.b.f(10);
            ArrayList arrayList0 = new ArrayList();
            List list0 = targetDirectTransferResult0.b;
            if(list0 != null && !list0.isEmpty()) {
                boolean z = eqft0.f || eqft0.m != null;
                erqc0.j("isAndroidIdRequired: " + z, new Object[0]);
                eqoc eqoc0 = null;
                for(Object object0: list0) {
                    PublicKeyCredential publicKeyCredential0 = (PublicKeyCredential)object0;
                    AuthenticatorAssertionResponse authenticatorAssertionResponse0 = publicKeyCredential0.f;
                    if(authenticatorAssertionResponse0 == null) {
                        z2 = z;
                        eqoc1 = eqoc0;
                        AuthenticatorErrorResponse authenticatorErrorResponse0 = publicKeyCredential0.g;
                        if(authenticatorErrorResponse0 != null) {
                            ErrorCode errorCode0 = authenticatorErrorResponse0.a;
                            erqc0.m("Fido failed with error code: " + errorCode0, new Object[0]);
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp0.b_message;
                            ((eqoc)hftv0).c = 2;
                            ((eqoc)hftv0).b |= 1;
                            int v = errorCode0.m;
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            eqoc eqoc2 = (eqoc)hftp0.b_message;
                            eqoc2.b |= 2;
                            eqoc2.d = v;
                            eqoc0 = (eqoc)hftp0.N_build();
                            goto label_54;
                        }
                    }
                    else {
                        boolean z1 = !eqft0.d;
                        byte[] arr_b = authenticatorAssertionResponse0.g();
                        if(arr_b == null) {
                            erqc0.m("UserHandle shouldn\'t be null", new Object[0]);
                            z2 = z;
                            eqoc1 = eqoc0;
                        }
                        else {
                            String s = new String(arr_b, Charset.forName("UTF-8"));
                            byte[] arr_b1 = authenticatorAssertionResponse0.c();
                            byte[] arr_b2 = authenticatorAssertionResponse0.d();
                            byte[] arr_b3 = authenticatorAssertionResponse0.f();
                            z2 = z;
                            eqoc1 = eqoc0;
                            arrayList0.add(new StartSessionRequest(((int)z1), s, publicKeyCredential0.b, arr_b1, arr_b2, arr_b3, eqft0.h, z2, eqft0.m));
                        }
                    }
                    eqoc0 = eqoc1;
                label_54:
                    z = z2;
                }
                if(arrayList0.isEmpty()) {
                    eqft0.i.a(10704, "Fido api returned no AuthenticatorAssertionResponse.", eqoc0);
                }
                else {
                    if(hyhp.m()) {
                        try {
                            list1 = eqft0.k.c(arrayList0);
                        }
                        catch(erhq erhq0) {
                            eqft0.i.a(erhq0.a, "StartSession api returned exception.", null);
                            goto label_200;
                        }
                    }
                    else {
                        try {
                            erhn erhn0 = eqft0.j;
                            azzc azzc0 = new azzc();
                            azzc0.a = new eric(((erih)erhn0), arrayList0);
                            azzc0.c = new Feature[]{epvj.j};
                            azzc0.d = 0x510F;
                            list1 = (List)evrg.n(((azts)erhn0).jn(azzc0.a()));
                            eqrf eqrf0 = eqft0.c;
                            if(eqrf0 != null) {
                                gmcd gmcd0 = glzd.f(eqrf0.b.a.a(), new erot(), gmap.a);
                                Objects.requireNonNull(eqft0.b);
                                eqrf0.a(gmcd0, new eqrb(eqft0.b));
                            }
                        }
                        catch(ExecutionException | InterruptedException exception0) {
                            int v1 = erqf.a(exception0);
                            eqft0.i.a(v1, "SecondDeviceAuth api returned exception " + exception0.toString(), null);
                            goto label_200;
                        }
                    }
                    erqc erqc1 = eqft.a;
                    erqc1.h("Process StartSessionResponses().", new Object[0]);
                    ArrayList arrayList1 = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    String s1 = "";
                    int v2 = 0;
                    for(Object object1: list1) {
                        StartSessionResponse startSessionResponse0 = (StartSessionResponse)object1;
                        if(startSessionResponse0.b == gqoq.a(4)) {
                            if(TextUtils.isEmpty(startSessionResponse0.d)) {
                                continue;
                            }
                            arrayList1.add(startSessionResponse0);
                        }
                        else if(startSessionResponse0.b == gqoq.a(5)) {
                            if(startSessionResponse0.e == null) {
                                continue;
                            }
                            arrayList2.add(startSessionResponse0);
                        }
                        else if(startSessionResponse0.b != gqoq.a(6)) {
                            if(startSessionResponse0.b != gqoq.a(3)) {
                                continue;
                            }
                            erqc1.m("Account is rejected with reason: " + startSessionResponse0.c, new Object[0]);
                            s1 = s1 + String.format("%s: %s; ", startSessionResponse0.h, ((int)startSessionResponse0.c));
                            v2 = startSessionResponse0.c;
                            BootstrapAccount bootstrapAccount0 = new BootstrapAccount(startSessionResponse0.h, "com.google");
                            eqft0.i.c(bootstrapAccount0);
                        }
                        else if(startSessionResponse0.g != null) {
                            arrayList2.add(startSessionResponse0);
                        }
                    }
                    eqmd eqmd0 = eqft0.b;
                    eqmd0.h(list1.size());
                    eqmd0.g(arrayList1.size());
                    eqmd0.b(arrayList2.size());
                    if((eqmd0 instanceof eray)) {
                        ((eray)eqmd0).p();
                    }
                    if(arrayList2.isEmpty() && arrayList1.isEmpty()) {
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp1.b_message;
                        ((eqoc)hftv1).c = 3;
                        ((eqoc)hftv1).b |= 1;
                        if(!hftv1.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        eqoc eqoc3 = (eqoc)hftp1.b_message;
                        eqoc3.b |= 2;
                        eqoc3.d = v2;
                        eqoc eqoc4 = (eqoc)hftp1.N_build();
                        if(v2 == 1) {
                            eqft0.i.a(0x2A0C, "Account has invalid oauth on Source device.", eqoc4);
                        }
                        else if(v2 == 2) {
                            eqft0.i.a(0x2A0D, "Account is not supported.", eqoc4);
                        }
                        else if(v2 == 3) {
                            eqft0.i.a(0x2A0E, "Target device is not secure.", eqoc4);
                        }
                        else {
                            eqft0.i.a(0x2A02, s1, eqoc4);
                        }
                    }
                    else if(arrayList1.isEmpty()) {
                    label_161:
                        if(arrayList2.isEmpty()) {
                            eqft0.i.e();
                        }
                        else if(eqft0.d) {
                            eqft0.i.f();
                            erqc1.h("Sending source challenges.", new Object[0]);
                            eqmd0.f(11);
                            MessagePayload messagePayload0 = new MessagePayload();
                            messagePayload0.am(new SecondDeviceAuthPayload(arrayList2));
                            eqft0.i.b(messagePayload0);
                        }
                        else {
                            eqmd0.f(12);
                            eqfu eqfu0 = eqft0.i;
                            eqfu0.g(eqsh.o(arrayList2));
                            if(eqft0.e) {
                                eqfu0.e();
                            }
                        }
                    }
                    else {
                        if(hyhp.a.g().y()) {
                            int v3 = (int)hyhp.f();
                            z3 = eqqw.f(eqft0.g, arrayList1, v3);
                        }
                        else {
                            z3 = true;
                            Context context0 = eqft0.g;
                            int v4 = (int)hyhp.f();
                            batl.s(context0);
                            for(Object object2: arrayList1) {
                                String s2 = ((StartSessionResponse)object2).d;
                                String s3 = ((StartSessionResponse)object2).h;
                                if(!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3) && !eqqw.e(context0, s2, s3, v4)) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        if(z3) {
                            gged_interceptors gged0 = eqsh.i(eqft0.g, arrayList1);
                            eqft0.i.d(gged0);
                            goto label_161;
                        }
                        else {
                            eqft0.i.a(10502, "received invalid tokenResponse when upserting accounts (exchange authCode for LST)", null);
                        }
                    }
                }
            }
            else {
                eqft0.i.a(10702, "Fido api returned empty publicKeyCredentials.", null);
            }
        }
        else {
            Exception exception1 = evql0.i();
            if(exception1 != null) {
                eqft.a.l(exception1);
                if((exception1 instanceof aztb)) {
                    int v5 = ((aztb)exception1).b();
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp2.b_message;
                    ((eqoc)hftv2).c = 2;
                    ((eqoc)hftv2).b |= 1;
                    if(!hftv2.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    eqoc eqoc5 = (eqoc)hftp2.b_message;
                    eqoc5.b |= 2;
                    eqoc5.d = v5;
                    eqoc6 = (eqoc)hftp2.N_build();
                }
                else {
                    eqoc6 = null;
                }
                eqft0.i.a(10700, "Fido api returned exception.", eqoc6);
            }
        }
    label_200:
        eqft0.b();
    }
}

