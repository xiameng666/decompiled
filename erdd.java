import android.accounts.Account;
import android.app.KeyguardManager;
import android.app.RemoteLockscreenValidationSession;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.quickstart.QuickStartTargetEventData;
import com.google.android.gms.smartdevice.quickstart.ui.TargetQuickStartChimeraActivity;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class erdd extends eqwt {
    final erde a;

    public erdd(erde erde0) {
        Objects.requireNonNull(erde0);
        this.a = erde0;
        super();
    }

    @Override  // eqwu
    public final void a() {
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a.a;
        int v = targetQuickStartChimeraActivity0.G == 101 || targetQuickStartChimeraActivity0.G == 102 || targetQuickStartChimeraActivity0.G == 107 ? 103 : 105;
        targetQuickStartChimeraActivity0.G = v;
        targetQuickStartChimeraActivity0.u(targetQuickStartChimeraActivity0.n(v));
    }

    @Override  // eqwu
    public final void b(BootstrapCompletionResult bootstrapCompletionResult0) {
        BootstrapAccount bootstrapAccount3;
        BootstrapAccount bootstrapAccount2;
        String s2;
        baun baun0 = TargetQuickStartChimeraActivity.i;
        baun0.h("onCompleted().", new Object[0]);
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a.a;
        targetQuickStartChimeraActivity0.H = bootstrapCompletionResult0;
        int v1 = -1;
        if(hyis.y()) {
            baun0.d("refactorReturnResultsToSuw", new Object[0]);
            ArrayList arrayList0 = bootstrapCompletionResult0.k;
            if(arrayList0 != null) {
                v1 = arrayList0.size();
            }
            ArrayList arrayList1 = bootstrapCompletionResult0.c;
            if(arrayList1 != null && !arrayList1.isEmpty()) {
                BootstrapAccount bootstrapAccount0 = bootstrapCompletionResult0.d;
                String s = bootstrapCompletionResult0.b;
                if(bootstrapAccount0 != null && eqsh.u(bootstrapAccount0.b, arrayList1)) {
                    targetQuickStartChimeraActivity0.J.putString("restoreAccount", bootstrapAccount0.b);
                    targetQuickStartChimeraActivity0.J.putString("restoreToken", s);
                    targetQuickStartChimeraActivity0.J.putString("authAccount", bootstrapAccount0.b);
                }
                else {
                    String s1 = ((BootstrapAccount)arrayList1.get(0)).b;
                    targetQuickStartChimeraActivity0.J.putString("authAccount", s1);
                }
                targetQuickStartChimeraActivity0.J.putString("accountType", "com.google");
                int v2 = arrayList1.size();
                Bundle bundle0 = new Bundle();
                bundle0.putInt("accounts_total", v1);
                bundle0.putInt("accounts_transferred", v2);
                targetQuickStartChimeraActivity0.J.putBundle("account_transfer_info", bundle0);
                targetQuickStartChimeraActivity0.C = eqsh.j(arrayList1);
                if(targetQuickStartChimeraActivity0.u + v2 < v1) {
                    targetQuickStartChimeraActivity0.B();
                    return;
                }
                targetQuickStartChimeraActivity0.o(targetQuickStartChimeraActivity0.C);
                return;
            }
            if(v1 > targetQuickStartChimeraActivity0.u) {
                targetQuickStartChimeraActivity0.x();
                return;
            }
            targetQuickStartChimeraActivity0.C();
            return;
        }
        ArrayList arrayList2 = bootstrapCompletionResult0.c;
        ArrayList arrayList3 = new ArrayList();
        if(arrayList2 != null) {
            int v3 = arrayList2.size();
            for(int v = 0; v < v3; ++v) {
                BootstrapAccount bootstrapAccount1 = (BootstrapAccount)arrayList2.get(v);
                Bundle bundle1 = new Bundle();
                bundle1.putString("name", bootstrapAccount1.b);
                arrayList3.add(bundle1);
            }
        }
        int v4 = arrayList3.size();
        BootstrapCompletionResult bootstrapCompletionResult1 = targetQuickStartChimeraActivity0.H;
        if(bootstrapCompletionResult1 == null) {
            s2 = null;
            bootstrapAccount3 = null;
            bootstrapAccount2 = null;
        }
        else {
            v1 = bootstrapCompletionResult1.i;
            s2 = bootstrapCompletionResult1.b;
            bootstrapAccount2 = bootstrapCompletionResult1.d;
            bootstrapAccount3 = bootstrapCompletionResult1.j;
        }
        kau kau0 = eqsh.d(arrayList3, (bootstrapAccount2 == null ? "" : bootstrapAccount2.b));
        ProtoLiteBuilder hftp0 = targetQuickStartChimeraActivity0.L;
        Account account0 = (Account)kau0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjjb gjjb0 = (gjjb)hftp0.b_message;
        gjjb0.b |= 2;
        gjjb0.d = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjjb gjjb1 = (gjjb)hftp0.b_message;
        gjjb1.b |= 1;
        gjjb1.c = v4;
        if(account0 != null) {
            Object object0 = kau0.b;
            if(object0 != null && !((List)object0).isEmpty()) {
                targetQuickStartChimeraActivity0.C = (List)object0;
                if(bootstrapAccount2 == null || TextUtils.isEmpty(bootstrapAccount2.b)) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gjjb)hftv0).e = 3;
                    ((gjjb)hftv0).b |= 4;
                    if(bootstrapAccount3 != null) {
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gjjb)hftp0.b_message).f = 2;
                        ((gjjb)hftp0.b_message).b |= 8;
                        for(Object object1: targetQuickStartChimeraActivity0.C) {
                            if(eqsh.v(((Account)object1).name, bootstrapAccount3.b)) {
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((gjjb)hftp0.b_message).f = 1;
                                ((gjjb)hftp0.b_message).b |= 8;
                                break;
                            }
                        }
                    }
                }
                else if(eqsh.v(account0.name, bootstrapAccount2.b)) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gjjb)hftp0.b_message).e = 1;
                    ((gjjb)hftp0.b_message).b |= 4;
                    targetQuickStartChimeraActivity0.J.putString("restoreAccount", account0.name);
                    targetQuickStartChimeraActivity0.J.putString("restoreToken", s2);
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gjjb)hftp0.b_message).e = 2;
                    ((gjjb)hftp0.b_message).b |= 4;
                }
                if(v4 >= 0 || v1 >= 0) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("accounts_total", v1);
                    bundle2.putInt("accounts_transferred", v4);
                    targetQuickStartChimeraActivity0.J.putBundle("account_transfer_info", bundle2);
                }
                targetQuickStartChimeraActivity0.J.putString("authAccount", account0.name);
                targetQuickStartChimeraActivity0.J.putString("accountType", account0.type);
                if(targetQuickStartChimeraActivity0.u + v4 < v1) {
                    targetQuickStartChimeraActivity0.B();
                    return;
                }
                targetQuickStartChimeraActivity0.o(targetQuickStartChimeraActivity0.C);
                return;
            }
        }
        if(v1 > targetQuickStartChimeraActivity0.u) {
            targetQuickStartChimeraActivity0.x();
            return;
        }
        targetQuickStartChimeraActivity0.C();
    }

    @Override  // eqwu
    public final void c() {
        baun baun0 = TargetQuickStartChimeraActivity.i;
        baun0.h("onConnected", new Object[0]);
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a.a;
        switch(targetQuickStartChimeraActivity0.G) {
            case 104: {
                baun0.d("QA latency - reconnected timestamp: %d", new Object[]{SystemClock.elapsedRealtime()});
                try {
                    targetQuickStartChimeraActivity0.q.c(eqsh.e(targetQuickStartChimeraActivity0.getApplicationContext(), baun0));
                }
                catch(RemoteException remoteException0) {
                    TargetQuickStartChimeraActivity.i.l(remoteException0);
                }
                return;
            }
            case 101: 
            case 102: 
            case 107: {
                baun0.d("QA latency - connected timestamp: %d", new Object[]{SystemClock.elapsedRealtime()});
            }
        }
    }

    @Override  // eqwu
    public final void d() {
        baun baun0 = TargetQuickStartChimeraActivity.i;
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a.a;
        baun0.m("onDisconnected at state: " + targetQuickStartChimeraActivity0.G, new Object[0]);
        switch(targetQuickStartChimeraActivity0.G) {
            case 101: 
            case 102: {
                if(hyis.w() && eqsh.w(targetQuickStartChimeraActivity0)) {
                    baun0.d("Unexpected disconnection at Instruction/QR page.", new Object[0]);
                    return;
                }
                targetQuickStartChimeraActivity0.c(1003, Bundle.EMPTY);
                return;
            }
            case 104: 
            case 105: {
                targetQuickStartChimeraActivity0.x();
                return;
            }
            case 103: 
            case 107: {
                targetQuickStartChimeraActivity0.c(1003, Bundle.EMPTY);
                return;
            }
            case 0x6F: {
                targetQuickStartChimeraActivity0.finishActivity(13);
                targetQuickStartChimeraActivity0.A();
            }
        }
    }

    @Override  // eqwu
    public final void e(int v, Bundle bundle0) {
        TargetQuickStartChimeraActivity.i.m("onError at state: " + this.a.a.G, new Object[0]);
        this.a.a.q(v);
    }

    @Override  // eqwu
    public final void f(QuickStartTargetEventData quickStartTargetEventData0) {
        int v = quickStartTargetEventData0.a;
        switch(v) {
            case 1: {
                TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a.a;
                targetQuickStartChimeraActivity0.l = quickStartTargetEventData0.b;
                du du0 = targetQuickStartChimeraActivity0.m();
                if((du0 instanceof ermb) && targetQuickStartChimeraActivity0.l != null) {
                    targetQuickStartChimeraActivity0.runOnUiThread(new erdb(this, ((ermb)du0)));
                    return;
                }
                return;
            }
            case 4: {
                Bundle bundle0 = new Bundle();
                bundle0.putInt("key_source_restore_check_not_support_reason", quickStartTargetEventData0.d);
                this.a.a.c(1005, bundle0);
                return;
            }
            case 5: {
                if(!quickStartTargetEventData0.e) {
                    batl.s(quickStartTargetEventData0.j);
                    this.a.a.G = 106;
                    this.a.a.v = quickStartTargetEventData0.j.size();
                    this.a.a.o = eriy.a(new ArrayList(quickStartTargetEventData0.j));
                    this.a.a.u(this.a.a.o);
                    return;
                }
                return;
            }
            case 12: {
                this.a.a.D = quickStartTargetEventData0.h;
                return;
            }
            case 13: {
                this.a.a.E = quickStartTargetEventData0.i;
                return;
            }
            default: {
                TargetQuickStartChimeraActivity.i.h("Unexpected EventType: " + v, new Object[0]);
            }
        }
    }

    @Override  // eqwu
    public final void g(VerificationInfo verificationInfo0) {
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a.a;
        if(targetQuickStartChimeraActivity0.G != 104) {
            targetQuickStartChimeraActivity0.w = verificationInfo0;
            gjpi gjpi0 = gjpi.b(verificationInfo0.b);
            switch(gjpi0.ordinal()) {
                case 5: {
                    if(verificationInfo0.c) {
                        targetQuickStartChimeraActivity0.p.o(gjjm.f);
                        targetQuickStartChimeraActivity0.r(verificationInfo0);
                        return;
                    }
                    if(targetQuickStartChimeraActivity0.G == 101) {
                        targetQuickStartChimeraActivity0.p.o(gjjm.d);
                        targetQuickStartChimeraActivity0.s();
                        return;
                    }
                    break;
                }
                case 6: {
                    if(targetQuickStartChimeraActivity0.G == 101 || targetQuickStartChimeraActivity0.G == 102) {
                        targetQuickStartChimeraActivity0.p.o(gjjm.e);
                        targetQuickStartChimeraActivity0.r(verificationInfo0);
                        return;
                    }
                    break;
                }
                default: {
                    TargetQuickStartChimeraActivity.i.m("Unexpected verification style: %d", new Object[]{((int)gjpi0.h)});
                }
            }
        }
    }

    @Override  // eqwu
    public final void h(RemoteLockscreenValidationSession remoteLockscreenValidationSession0) {
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a.a;
        KeyguardManager keyguardManager0 = (KeyguardManager)targetQuickStartChimeraActivity0.getApplicationContext().getSystemService("keyguard");
        if(bbqa.d() && keyguardManager0 != null) {
            TargetQuickStartChimeraActivity.i.d("promptForLskf", new Object[0]);
            this.a.a.p.o(gjjm.l);
            this.a.a.G = 0x6F;
            this.a.a.y = remoteLockscreenValidationSession0.getLockType();
            Intent intent0 = keyguardManager0.createConfirmDeviceCredentialForRemoteValidationIntent(remoteLockscreenValidationSession0, new ComponentName("com.google.android.gms", "com.google.android.gms.smartdevice.quickstart.RemoteLockscreenValidationService"), null, null, null, null);
            this.a.a.startActivityForResult(intent0, 13);
            return;
        }
        TargetQuickStartChimeraActivity.i.f("Target device is not U+ or KeyguardManager is null!", new Object[0]);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((eqoc)hftv0).c = 6;
        ((eqoc)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqoc eqoc0 = (eqoc)hftp0.b_message;
        eqoc0.b |= 2;
        eqoc0.d = 1;
        eqoc eqoc1 = (eqoc)hftp0.N_build();
        targetQuickStartChimeraActivity0.p.n(10769, eqoc1);
        targetQuickStartChimeraActivity0.q(10769);
        try {
            targetQuickStartChimeraActivity0.q.e(QuickStartTargetEventData.a(10769));
        }
        catch(RemoteException remoteException0) {
            TargetQuickStartChimeraActivity.i.l(remoteException0);
        }
    }

    @Override  // eqwu
    public final void i(int v) {
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a.a;
        if(targetQuickStartChimeraActivity0.G == 105) {
            targetQuickStartChimeraActivity0.G = 104;
            targetQuickStartChimeraActivity0.u(targetQuickStartChimeraActivity0.n(104));
        }
    }

    @Override  // eqwu
    public final void j(Bundle bundle0) {
        baun baun0 = TargetQuickStartChimeraActivity.i;
        baun0.d("onWifiAvailable()", new Object[0]);
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a.a;
        targetQuickStartChimeraActivity0.G = 0x71;
        if(bundle0.getBoolean("keep_connection_after_wifi_transfer")) {
            baun0.d("Try to keep the connection after wifi transfer", new Object[0]);
        }
        else if(hyis.n()) {
            erdc erdc0 = new erdc(this);
            targetQuickStartChimeraActivity0.F.execute(erdc0);
        }
        else {
            targetQuickStartChimeraActivity0.E();
        }
        bundle0.remove("keep_connection_after_wifi_transfer");
        Bundle bundle1 = (Bundle)targetQuickStartChimeraActivity0.I.get();
        bundle1.putAll(bundle0);
        targetQuickStartChimeraActivity0.I.set(bundle1);
        targetQuickStartChimeraActivity0.v();
    }

    @Override  // eqwu
    public final void k(BootstrapProgressResult bootstrapProgressResult0) {
    }
}

