import android.content.Context;
import android.content.Intent;
import android.credentials.selection.ProviderPendingIntentResponse;
import android.credentials.selection.UserSelectionResult;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.service.credentials.BeginGetCredentialResponse;
import android.util.Log;
import com.google.android.gms.chimera.modules.identity.credentials.shared.AppContextProvider;
import j..util.Collection.-EL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class bxvq {
    public static final Intent a(bxzw bxzw0, byax byax0) {
        if((byax0 instanceof bybj)) {
            ((bybj)byax0).c(bxzw0);
            return null;
        }
        if((byax0 instanceof bybb)) {
            return ((bybb)byax0).c(bxzw0);
        }
        Class class0 = byax0.getClass();
        Objects.toString(class0);
        throw new UnsupportedOperationException("Unsupported type of CredentialManagerClient: " + class0);
    }

    public static final Intent b(byal byal0, byax byax0) {
        Iterator iterator4;
        Iterator iterator3;
        ArrayList arrayList1;
        bybh bybh1;
        icnl icnl1;
        kvl kvl0;
        if((byax0 instanceof bybj)) {
            byag byag0 = (byag)((bybj)byax0).a.b();
            if(byag0 == null) {
                Log.w("CredentialSelector", "Call to send result but no active request available");
                return null;
            }
            ResultReceiver resultReceiver0 = byag0.c;
            if(resultReceiver0 != null) {
                ProviderPendingIntentResponse providerPendingIntentResponse0 = byal0.d == null ? null : new ProviderPendingIntentResponse(byal0.d.a, byal0.d.b);
                UserSelectionResult.sendUserSelectionResult(resultReceiver0, new UserSelectionResult(byal0.a, byal0.b, byal0.c, providerPendingIntentResponse0));
            }
            return null;
        }
        if((byax0 instanceof bybb)) {
            if(ibuq.m(byal0.b, "lockedEntryKey")) {
                icnl icnl0 = ((bybb)byax0).b;
                Context context0 = AppContextProvider.a();
                byag byag1 = (byag)icnl0.b();
                bybh bybh0 = ((bybb)byax0).a;
                if((byag1 instanceof byae)) {
                    byaa byaa0 = byal0.d;
                    Intent intent0 = byaa0 == null ? null : byaa0.b;
                    if(bybh0 == null) {
                        Log.e("CredentialSelector", "Unexpected null request info for get flow");
                        return ((bybb)byax0).c(new bxzw(0, null));
                    }
                    if((intent0 == null ? null : kwr.c(intent0)) == null) {
                        if(intent0 == null) {
                            kvl0 = null;
                        }
                        else if(Build.VERSION.SDK_INT < 34) {
                            Bundle bundle0 = intent0.getBundleExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE");
                            kvl0 = bundle0 == null ? null : kvk.b(bundle0);
                        }
                        else if(intent0.hasExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE")) {
                            BeginGetCredentialResponse beginGetCredentialResponse0 = bjk..ExternalSyntheticApiModelOutline0.m(intent0.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", BeginGetCredentialResponse.class));
                            kvl0 = beginGetCredentialResponse0 == null ? null : kyg.c(beginGetCredentialResponse0);
                        }
                        else {
                            kvl0 = null;
                        }
                        if(kvl0 != null) {
                            List list0 = kvl0.a;
                            if(!list0.isEmpty() || !kvl0.c.isEmpty() || kvl0.d != null || !kvl0.b.isEmpty()) {
                                bxzx bxzx0 = ((byae)byag1).a;
                                ArrayList arrayList0 = new ArrayList(ibpo.q(bxzx0.a, 10));
                                for(Object object0: bxzx0.a) {
                                    bybv bybv0 = (bybv)object0;
                                    String s = bybv0.a;
                                    if(ibuq.m(s, byal0.a)) {
                                        List list1 = ibpo.at(bybv0.d);
                                        ibuq.c(context0);
                                        icnl1 = icnl0;
                                        bybh1 = bybh0;
                                        arrayList1 = arrayList0;
                                        list1.addAll(bybc.c(context0, list0, bybh0.b, bybh0.a, bybh0.c, s, bybv0.c));
                                        List list2 = ibpo.at(bybv0.e);
                                        Collection.-EL.removeIf(list2, new byaz(new byay(byal0)));
                                        list2.addAll(bybc.b(kvl0.c, bybh0.b, bybh0.a, bybh0.c, s, bybv0.c, bybv0.b));
                                        bxzv bxzv0 = bybc.d(kvl0.d, bybh0.b, bybh0.a, s);
                                        List list3 = ibpo.at(bybv0.f);
                                        list3.addAll(bybc.a(kvl0.b, bybh0.b, bybh0.a, bybh0.c, s, bybv0.b));
                                        bybv0 = bybv.a(bybv0, list1, list2, bxzv0, list3, 7);
                                    }
                                    else {
                                        icnl1 = icnl0;
                                        arrayList1 = arrayList0;
                                        bybh1 = bybh0;
                                    }
                                    arrayList1.add(bybv0);
                                    arrayList0 = arrayList1;
                                    bybh0 = bybh1;
                                    icnl0 = icnl1;
                                }
                                bxzx bxzx1 = bxzx.a(bxzx0, arrayList0);
                                byai byai0 = ((byae)byag1).b;
                                if(byai0 == null) {
                                    return ((bybb)byax0).c(new bxzw(0, null));
                                }
                                icnl0.g(new byae(bxzx1, byai0, ((byae)byag1).c));
                                return null;
                            }
                        }
                        bxzx bxzx2 = ((byae)byag1).a;
                        ArrayList arrayList2 = new ArrayList(ibpo.q(bxzx2.a, 10));
                        for(Iterator iterator1 = bxzx2.a.iterator(); iterator1.hasNext(); iterator1 = iterator4) {
                            Object object1 = iterator1.next();
                            bybv bybv1 = (bybv)object1;
                            if(ibuq.m(bybv1.a, byal0.a)) {
                                ArrayList arrayList3 = new ArrayList(ibpo.q(bybv1.e, 10));
                                for(Object object2: bybv1.e) {
                                    bybt bybt0 = (bybt)object2;
                                    String s1 = bybt0.c;
                                    if(ibuq.m(s1, byal0.c)) {
                                        iterator3 = iterator1;
                                        bybt0 = new bybt(bybt0.a, bybt0.b, s1, bybt0.d, bybt0.e, bybt0.g, bybt0.h, bybt0.i, true, true);
                                    }
                                    else {
                                        iterator3 = iterator1;
                                        if(bybt0.k) {
                                            bybt0 = new bybt(bybt0.a, bybt0.b, s1, bybt0.d, bybt0.e, bybt0.g, bybt0.h, bybt0.i, bybt0.j, false);
                                        }
                                    }
                                    arrayList3.add(bybt0);
                                    iterator1 = iterator3;
                                }
                                iterator4 = iterator1;
                                bybv1 = bybv.a(bybv1, null, arrayList3, null, null, 0x6F);
                            }
                            else {
                                iterator4 = iterator1;
                            }
                            arrayList2.add(bybv1);
                        }
                        bxzx bxzx3 = bxzx.a(bxzx2, arrayList2);
                        byai byai1 = ((byae)byag1).b;
                        if(byai1 == null) {
                            return ((bybb)byax0).c(new bxzw(0, null));
                        }
                        icnl0.g(new byae(bxzx3, byai1, ((byae)byag1).c));
                        return null;
                    }
                    return byaa0.b;
                }
            }
            return byal0.d == null ? null : byal0.d.b;
        }
        Class class0 = byax0.getClass();
        Objects.toString(class0);
        throw new UnsupportedOperationException("Unsupported type of CredentialManagerClient: " + class0);
    }
}

