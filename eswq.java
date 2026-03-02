import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.SystemClock;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HexFormat;
import java.util.List;
import java.util.UUID;

public final class eswq implements ibtw {
    public final eswy a;

    public eswq(eswy eswy0) {
        this.a = eswy0;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((eswv)object0), "oldState");
        ibuq.f(((eswv)object1), "newState");
        bboh bboh0 = eswy.b;
        ((ggtj)bboh0.h()).R("PollingFrameHandler state changed: %s -> %s", ((eswv)object0), ((eswv)object1));
        eswy eswy0 = this.a;
        if(((eswv)object0) == eswv.a) {
            eswy0.d = SystemClock.elapsedRealtime();
            eswy0.e = System.currentTimeMillis();
        }
        boolean z = false;
        boolean z1 = true;
        switch(((eswv)object1).ordinal()) {
            case 0: {
                if(((eswv)object0) == eswv.d) {
                    gjqn gjqn0 = gjqm.a(((ProtoLiteMessage)gjwt.a).v_newBuilder());
                    String s = UUID.randomUUID().toString();
                    ibuq.e(s, "toString(...)");
                    gjqn0.c(s);
                    gjqn0.d(eswy0.d);
                    gjqn0.e(eswy0.e);
                    gjqn0.h();
                    List list0 = ibpo.r(eswy0.h);
                    ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
                    for(Object object2: list0) {
                        arrayList0.add(eswy.d(((esww)object2)));
                    }
                    gjqn0.f(arrayList0);
                    long v = eswy0.f;
                    if(v != -1L) {
                        gjqn0.b(v);
                    }
                    gjqn0.g();
                    eswy0.b(gjqn0.a());
                }
                eswy0.g.clear();
                eswy0.h.clear();
                eswy0.d = -1L;
                eswy0.e = -1L;
                eswy0.f = -1L;
                return ibom.a;
            }
            case 1: {
                return ibom.a;
            }
            case 2: {
                ArrayList arrayList1 = eswy0.h;
                ArrayList arrayList2 = eswy0.g;
                Context context0 = AppContextProvider.a();
                arrayList1.add(ibpo.ar(arrayList2));
                ((ggtj)bboh0.h()).H("Polling loop #%d with frames: %s", arrayList1.size(), ibpo.aK(arrayList2, " ", null, null, eswx.a, 30));
                if(((long)arrayList1.size()) >= (!hysx.l() || !new eubv(context0).q() ? hysx.a.f().g() : 2L)) {
                    boolean z2 = false;
                    ibuq.c(context0);
                    List list1 = ibpo.r(arrayList1);
                    if(hysx.e().b.isEmpty()) {
                        if(!list1.isEmpty()) {
                            for(Object object3: list1) {
                                if(((esww)object3).a == 85) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        boolean z3 = false;
                        if(!list1.isEmpty()) {
                            for(Object object4: list1) {
                                byte[] arr_b = ((esww)object4).b;
                                esxb esxb0 = esxd.a(arr_b);
                                if(!Arrays.equals((esxb0 == null ? null : esxb0.a), esxc.c)) {
                                    esxb esxb1 = esxd.a(arr_b);
                                    if(!Arrays.equals((esxb1 == null ? null : esxb1.a), esxc.a)) {
                                        esxb esxb2 = esxd.a(arr_b);
                                        if(Arrays.equals((esxb2 == null ? null : esxb2.a), esxc.b)) {
                                            z3 = true;
                                            break;
                                        }
                                        continue;
                                    }
                                }
                                z3 = true;
                                break;
                            }
                        }
                        if(z2 && !z3) {
                            z = true;
                        }
                    }
                    else {
                        for(Object object5: list1) {
                            if(((esww)object5).a != 85) {
                                continue;
                            }
                            goto label_77;
                        }
                        object5 = null;
                    label_77:
                        if(((esww)object5) != null) {
                            String s1 = HexFormat.ofDelimiter("").withLowerCase().formatHex(((esww)object5).b);
                            ibuq.e(s1, "formatHex(...)");
                            hfuo hfuo0 = hysx.e().b;
                            ibuq.e(hfuo0, "getElementList(...)");
                            if(!(hfuo0 instanceof Collection) || !hfuo0.isEmpty()) {
                                for(Object object6: hfuo0) {
                                    ibuq.c(((String)object6));
                                    if(!new ibzd(((String)object6)).g(s1)) {
                                        continue;
                                    }
                                    goto label_90;
                                }
                            }
                            z = true;
                        label_90:
                            ((ggtj)bboh0.h()).B("Found annotation frame, require auth = %s", Boolean.valueOf(z));
                        }
                        else if(hysx.a.f().u()) {
                            if(!list1.isEmpty()) {
                                for(Object object7: list1) {
                                    esww esww0 = (esww)object7;
                                    if(esww0.a == 70 && ibuq.m(HexFormat.ofDelimiter("").withLowerCase().formatHex(esww0.b), "00ffff0003")) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            if(z) {
                                ((ggtj)bboh0.h()).x("Found wildcard frame, skipping auth");
                            }
                        }
                    }
                    ((ggtj)bboh0.h()).B("Processed polling loop, and decided should skip auth: %s", Boolean.valueOf(z));
                    if(hysx.l() && new eubv(context0).q()) {
                        ((ggtj)bboh0.h()).x("Using alternative closed loop mitigation, forcing skipAuth = true");
                    }
                    else {
                        z1 = z;
                    }
                    if(!hysx.a.f().m() || z1) {
                        eswy0.c(eswu.e);
                    }
                    else if(hysx.m()) {
                        esgi esgi0 = esgj.g(context0, null);
                        if(esgi0 == null) {
                            eswy0.c(eswu.e);
                        }
                        else {
                            CardInfo cardInfo0 = new etrk(esgi0).b();
                            if(cardInfo0 != null && (eswo.f(esgi0, cardInfo0) || !new etmk(context0).b((cardInfo0.t == null ? ((int)hypj.b()) : cardInfo0.t.b)))) {
                                eswy0.c(eswu.f);
                            }
                            else {
                                eswy0.c(eswu.e);
                            }
                        }
                    }
                    else if(new etmk(context0).b(((int)hypj.b()))) {
                        eswy0.c(eswu.e);
                    }
                    else {
                        eswy0.c(eswu.f);
                    }
                }
                else {
                    eswy0.c(eswu.d);
                }
                arrayList2.clear();
                return ibom.a;
            }
            case 3: {
                Context context1 = AppContextProvider.a();
                if(((KeyguardManager)context1.getSystemService(KeyguardManager.class)).isDeviceLocked()) {
                    context1.startService(eudx.b(context1, 0x30, null, true));
                    return ibom.a;
                }
                context1.startActivity(new Intent().setClassName(context1, "com.google.android.gms.tapandpay.tap.TransparentAuthActivity").addFlags(0x10000000));
                return ibom.a;
            }
            case 4: {
                Context context2 = AppContextProvider.a();
                gjqn gjqn1 = gjqm.a(((ProtoLiteMessage)gjwt.a).v_newBuilder());
                String s2 = UUID.randomUUID().toString();
                ibuq.e(s2, "toString(...)");
                gjqn1.c(s2);
                gjqn1.d(eswy0.d);
                gjqn1.e(eswy0.e);
                gjqn1.h();
                List list2 = ibpo.r(eswy0.h);
                ArrayList arrayList3 = new ArrayList(ibpo.q(list2, 10));
                for(Object object8: list2) {
                    arrayList3.add(eswy.d(((esww)object8)));
                }
                gjqn1.f(arrayList3);
                long v1 = eswy0.f;
                if(v1 != -1L) {
                    gjqn1.b(v1);
                }
                ProtoLiteBuilder hftp0 = gjqn1.a;
                long v2 = SystemClock.elapsedRealtime();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjwt gjwt0 = (gjwt)hftp0.b_message;
                gjwt0.b |= 4;
                gjwt0.f = v2;
                long v3 = System.currentTimeMillis();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjwt gjwt1 = (gjwt)hftp0.b_message;
                gjwt1.b |= 0x20;
                gjwt1.i = v3;
                if(((eswv)object0) == eswv.d) {
                    gjqn1.g();
                }
                eswy0.b(gjqn1.a());
                if(!hysx.m()) {
                    hysx hysx0 = hysx.a;
                    if(!hysx0.f().v()) {
                        boolean z4 = NfcAdapter.getDefaultAdapter(context2).setObserveModeEnabled(false);
                        ((ggtj)bboh0.h()).B("Successful setObserveModeEnabled(false) with state transition to AWAITING_TRANSACTION: %s", Boolean.valueOf(z4));
                        ibuq.c(context2);
                        ibuq.f(context2, "context");
                        int v4 = Math.max(((int)hysx.c()), 10);
                        clkn clkn0 = new clkn();
                        clkn0.j = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
                        clkn0.q("hce.observemode.enableobservemode.oneoff");
                        clkn0.y(2, 2);
                        clkn0.e(hysx.c(), hysx0.f().b());
                        clkn0.t = cllb.a(1, v4, ((int)hysx0.f().e()) * v4);
                        clkn0.v(1);
                        clkn0.p = false;
                        clko clko0 = clkn0.a();
                        cljp.a(context2).f(clko0);
                        return ibom.a;
                    }
                }
                ibuq.c(context2);
                boolean z5 = eswo.d(context2, false);
                ((ggtj)bboh0.h()).B("Successful setObserveModeEnabled(false) with state transition to AWAITING_TRANSACTION: %s", Boolean.valueOf(z5));
                eswh.a.a().c(context2, ibzw.h(ibzy.i(hysx.c(), ibzz.d)));
                return ibom.a;
            }
            case 5: {
                Context context3 = AppContextProvider.a();
                context3.startService(eudx.b(context3, 18, null, true));
                return ibom.a;
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

