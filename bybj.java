import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.credentials.selection.AuthenticationEntry;
import android.credentials.selection.CancelSelectionRequest;
import android.credentials.selection.CreateCredentialProviderInfo;
import android.credentials.selection.DisabledProviderInfo;
import android.credentials.selection.Entry;
import android.credentials.selection.FailureResult;
import android.credentials.selection.GetCredentialProviderInfo;
import android.credentials.selection.IntentHelper;
import android.credentials.selection.RequestInfo;
import android.credentials.selection.RequestToken;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class bybj implements byax {
    public final icnl a;
    private final icnj b;

    public bybj() {
        icnl icnl0 = icnm.a(null);
        this.a = icnl0;
        this.b = icnl0;
    }

    @Override  // byax
    public final Object a(Intent intent0, Context context0, ibrl ibrl0) {
        byaf byaf0;
        bybx bybx0;
        kwn kwn0;
        String s7;
        Slice slice1;
        byaw byaw0;
        bybm bybm0;
        ibuq.f(intent0, "<this>");
        ResultReceiver resultReceiver0 = IntentHelper.extractResultReceiver(intent0);
        CancelSelectionRequest cancelSelectionRequest0 = IntentHelper.extractCancelUiRequest(intent0);
        if(cancelSelectionRequest0 == null) {
            RequestInfo requestInfo0 = IntentHelper.extractRequestInfo(intent0);
            if(requestInfo0 == null) {
                byaf0 = new byaf(resultReceiver0);
            }
            else {
                switch(requestInfo0.getType()) {
                    case "android.credentials.selection.TYPE_CREATE": {
                        List list4 = IntentHelper.extractCreateCredentialProviderInfoList(intent0);
                        ibuq.e(list4, "extractCreateCredentialProviderInfoList(...)");
                        List list5 = IntentHelper.extractDisabledProviderInfoList(intent0);
                        ibuq.e(list5, "extractDisabledProviderInfoList(...)");
                        ibuq.f(list4, "createCredentialProviderInfoList");
                        ibuq.f(list5, "frameworkDisabledProviderInfoList");
                        ibuq.f(list4, "providerDataList");
                        ArrayList arrayList4 = new ArrayList();
                        Iterator iterator5 = list4.iterator();
                        while(iterator5.hasNext()) {
                            Object object6 = iterator5.next();
                            CreateCredentialProviderInfo createCredentialProviderInfo0 = (CreateCredentialProviderInfo)object6;
                            PackageManager packageManager2 = context0.getPackageManager();
                            ibuq.e(packageManager2, "getPackageManager(...)");
                            String s21 = createCredentialProviderInfo0.getProviderName();
                            ibuq.e(s21, "getProviderName(...)");
                            ibns ibns1 = byca.d(packageManager2, s21);
                            if(ibns1 != null) {
                                String s22 = (String)ibns1.a;
                                Drawable drawable1 = (Drawable)ibns1.b;
                                String s23 = createCredentialProviderInfo0.getProviderName();
                                ibuq.e(s23, "getProviderName(...)");
                                String s24 = createCredentialProviderInfo0.getProviderName();
                                ibuq.e(s24, "getProviderName(...)");
                                List list6 = createCredentialProviderInfo0.getSaveEntries();
                                ibuq.e(list6, "getSaveEntries(...)");
                                ArrayList arrayList5 = new ArrayList();
                                for(Iterator iterator6 = list6.iterator(); iterator6.hasNext(); iterator6 = iterator6) {
                                    Object object7 = iterator6.next();
                                    Entry entry2 = (Entry)object7;
                                    Slice slice4 = entry2.getSlice();
                                    ibuq.e(slice4, "getSlice(...)");
                                    kwa kwa0 = kvz.c(slice4);
                                    if(kwa0 == null) {
                                        bybm0 = null;
                                    }
                                    else {
                                        String s25 = entry2.getKey();
                                        ibuq.e(s25, "getKey(...)");
                                        String s26 = entry2.getSubkey();
                                        ibuq.e(s26, "getSubkey(...)");
                                        bybm0 = new bybm(kwa0, s25, s26, entry2.getFrameworkExtrasIntent(), bybk.a(entry2, "androidx.credentials.provider.createEntry."));
                                    }
                                    if(bybm0 != null) {
                                        arrayList5.add(bybm0);
                                    }
                                }
                                List list7 = bybo.b(context0, s24, arrayList5);
                                String s27 = createCredentialProviderInfo0.getProviderName();
                                ibuq.e(s27, "getProviderName(...)");
                                arrayList4.add(new byat(drawable1, s23, s22, list7, bybk.b(s27, createCredentialProviderInfo0.getRemoteEntry())));
                            }
                            iterator5 = iterator5;
                            list5 = list5;
                        }
                        Context context1 = context0;
                        ArrayList arrayList6 = new ArrayList();
                        if(list5 != null) {
                            for(Object object8: list5) {
                                DisabledProviderInfo disabledProviderInfo0 = (DisabledProviderInfo)object8;
                                PackageManager packageManager3 = context1.getPackageManager();
                                ibuq.e(packageManager3, "getPackageManager(...)");
                                String s28 = disabledProviderInfo0.getProviderName();
                                ibuq.e(s28, "getProviderName(...)");
                                ibns ibns2 = byca.d(packageManager3, s28);
                                if(ibns2 != null) {
                                    String s29 = disabledProviderInfo0.getProviderName();
                                    ibuq.e(s29, "getProviderName(...)");
                                    ibuq.f(((Drawable)ibns2.b), "icon");
                                    ibuq.f(s29, "id");
                                    ibuq.f(((String)ibns2.a), "displayName");
                                    arrayList6.add(new byau(((Drawable)ibns2.b), s29, ((String)ibns2.a)));
                                }
                                context1 = context0;
                            }
                        }
                        CreateCredentialRequest createCredentialRequest0 = requestInfo0.getCreateCredentialRequest();
                        if(createCredentialRequest0 == null) {
                            byaw0 = null;
                        }
                        else {
                            try {
                                String s30 = createCredentialRequest0.getType();
                                ibuq.e(s30, "getType(...)");
                                Bundle bundle2 = createCredentialRequest0.getCredentialData();
                                ibuq.e(bundle2, "getCredentialData(...)");
                                Bundle bundle3 = createCredentialRequest0.getCandidateQueryData();
                                ibuq.e(bundle3, "getCandidateQueryData(...)");
                                boolean z3 = createCredentialRequest0.isSystemProviderRequired();
                                String s31 = createCredentialRequest0.getOrigin();
                                String s32 = requestInfo0.getPackageName();
                                ibuq.e(s32, "getPackageName(...)");
                                boolean z4 = requestInfo0.hasPermissionToOverrideDefault();
                                List list8 = requestInfo0.getDefaultProviderIds();
                                ibuq.e(list8, "getDefaultProviderIds(...)");
                                byaw0 = bybo.a(context0, s30, bundle2, bundle3, z3, s31, s32, z4, ibpo.ay(list8));
                            }
                            catch(IllegalArgumentException illegalArgumentException0) {
                                Log.e("CredentialSelector", "Failed to initialize RequestDisplayInfo for create flow", illegalArgumentException0);
                                byaw0 = null;
                            }
                        }
                        if(byaw0 == null) {
                            byaf0 = new byaf(resultReceiver0);
                        }
                        else {
                            bxzr bxzr0 = new bxzr(arrayList4, arrayList6, byaw0);
                            RequestToken requestToken3 = requestInfo0.getRequestToken();
                            ibuq.e(requestToken3, "getRequestToken(...)");
                            byaf0 = new byad(bxzr0, new bybl(requestToken3), resultReceiver0);
                        }
                        break;
                    }
                    case "android.credentials.selection.TYPE_GET": {
                        List list0 = IntentHelper.extractGetCredentialProviderInfoList(intent0);
                        ibuq.e(list0, "extractGetCredentialProviderInfoList(...)");
                        ibuq.f(list0, "getCredentialProviderInfoList");
                        ibuq.f(list0, "providerDataList");
                        ArrayList arrayList0 = new ArrayList();
                        Iterator iterator0 = list0.iterator();
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            GetCredentialProviderInfo getCredentialProviderInfo0 = (GetCredentialProviderInfo)object0;
                            PackageManager packageManager1 = context0.getPackageManager();
                            ibuq.e(packageManager1, "getPackageManager(...)");
                            String s2 = getCredentialProviderInfo0.getProviderName();
                            ibuq.e(s2, "getProviderName(...)");
                            ibns ibns0 = byca.d(packageManager1, s2);
                            if(ibns0 != null) {
                                String s3 = (String)ibns0.a;
                                Drawable drawable0 = (Drawable)ibns0.b;
                                Object object1 = null;
                                String s4 = getCredentialProviderInfo0.getProviderName();
                                ibuq.e(s4, "getProviderName(...)");
                                String s5 = getCredentialProviderInfo0.getProviderName();
                                ibuq.e(s5, "getProviderName(...)");
                                String s6 = s5;
                                List list1 = getCredentialProviderInfo0.getCredentialEntries();
                                ibuq.e(list1, "getCredentialEntries(...)");
                                ArrayList arrayList1 = new ArrayList();
                                Iterator iterator1 = list1.iterator();
                                while(iterator1.hasNext()) {
                                    Object object2 = iterator1.next();
                                    Entry entry0 = (Entry)object2;
                                    Slice slice0 = entry0.getSlice();
                                    ibuq.e(slice0, "getSlice(...)");
                                    SliceSpec sliceSpec0 = slice0.getSpec();
                                    if(sliceSpec0 == null) {
                                        slice1 = slice0;
                                        s7 = null;
                                    }
                                    else {
                                        slice1 = slice0;
                                        s7 = sliceSpec0.getType();
                                    }
                                    if(ibuq.m(s7, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                                        kwn0 = kwm.a(slice1);
                                    }
                                    else if(ibuq.m(s7, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                                        kwn0 = kwz.a(slice1);
                                    }
                                    else {
                                        kwn0 = kwj.a(slice1);
                                    }
                                    if(kwn0 == null) {
                                        kwn0 = kwj.a(slice1);
                                    }
                                    if(kwn0 != null) {
                                        String s8 = entry0.getKey();
                                        ibuq.e(s8, "getKey(...)");
                                        String s9 = entry0.getSubkey();
                                        ibuq.e(s9, "getSubkey(...)");
                                        bybu bybu0 = bybp.d(context0, s6, s3, kwn0, s8, s9, entry0.getFrameworkExtrasIntent(), bybk.a(entry0, "androidx.credentials.provider.credentialEntry."));
                                        if(bybu0 != null) {
                                            arrayList1.add(bybu0);
                                        }
                                    }
                                    iterator1 = iterator1;
                                    getCredentialProviderInfo0 = getCredentialProviderInfo0;
                                    object1 = object1;
                                }
                                String s10 = getCredentialProviderInfo0.getProviderName();
                                ibuq.e(s10, "getProviderName(...)");
                                List list2 = getCredentialProviderInfo0.getAuthenticationEntries();
                                ibuq.e(list2, "getAuthenticationEntries(...)");
                                ArrayList arrayList2 = new ArrayList();
                                for(Object object3: list2) {
                                    AuthenticationEntry authenticationEntry0 = (AuthenticationEntry)object3;
                                    Slice slice2 = authenticationEntry0.getSlice();
                                    ibuq.e(slice2, "getSlice(...)");
                                    kuw kuw0 = kuv.a(slice2);
                                    if(kuw0 == null) {
                                        s10 = s10;
                                    }
                                    else {
                                        String s11 = authenticationEntry0.getKey();
                                        ibuq.e(s11, "getKey(...)");
                                        String s12 = authenticationEntry0.getSubkey();
                                        ibuq.e(s12, "getSubkey(...)");
                                        Intent intent1 = authenticationEntry0.getFrameworkExtrasIntent();
                                        boolean z = true;
                                        boolean z1 = authenticationEntry0.getStatus() != 0;
                                        if(authenticationEntry0.getStatus() != 2) {
                                            z = false;
                                        }
                                        arrayList2.add(bybp.c(s10, s3, drawable0, kuw0, s11, s12, intent1, z1, z));
                                        s10 = s10;
                                        arrayList1 = arrayList1;
                                    }
                                }
                                String s13 = getCredentialProviderInfo0.getProviderName();
                                ibuq.e(s13, "getProviderName(...)");
                                bxzv bxzv0 = bybk.b(s13, getCredentialProviderInfo0.getRemoteEntry());
                                String s14 = getCredentialProviderInfo0.getProviderName();
                                ibuq.e(s14, "getProviderName(...)");
                                List list3 = getCredentialProviderInfo0.getActionChips();
                                ibuq.e(list3, "getActionChips(...)");
                                ArrayList arrayList3 = new ArrayList();
                                for(Object object4: list3) {
                                    Entry entry1 = (Entry)object4;
                                    Slice slice3 = entry1.getSlice();
                                    ibuq.e(slice3, "getSlice(...)");
                                    kuu kuu0 = kut.a(slice3);
                                    if(kuu0 == null) {
                                        s14 = s14;
                                    }
                                    else {
                                        String s15 = entry1.getKey();
                                        ibuq.e(s15, "getKey(...)");
                                        String s16 = entry1.getSubkey();
                                        ibuq.e(s16, "getSubkey(...)");
                                        bybs bybs0 = bybp.b(s14, kuu0, s15, s16, entry1.getFrameworkExtrasIntent(), drawable0);
                                        s14 = s14;
                                        drawable0 = drawable0;
                                        arrayList3.add(bybs0);
                                    }
                                }
                                super(s4, drawable0, s3, arrayList1, arrayList2, bxzv0, arrayList3);
                                arrayList0.add(object1);
                                iterator0 = iterator0;
                            }
                        }
                        GetCredentialRequest getCredentialRequest0 = requestInfo0.getGetCredentialRequest();
                        if(getCredentialRequest0 == null) {
                            bybx0 = null;
                        }
                        else {
                            Bundle bundle0 = getCredentialRequest0.getData();
                            ibuq.e(bundle0, "getData(...)");
                            String s17 = getCredentialRequest0.getOrigin();
                            String s18 = requestInfo0.getPackageName();
                            ibuq.e(s18, "getPackageName(...)");
                            boolean z2 = requestInfo0.hasPermissionToOverrideDefault();
                            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                            for(Object object5: getCredentialRequest0.getCredentialOptions()) {
                                String s19 = ((CredentialOption)object5).getType();
                                Bundle bundle1 = ((CredentialOption)object5).getCandidateQueryData();
                                ibuq.e(bundle1, "getCandidateQueryData(...)");
                                String s20 = ((CredentialOption)object5).getType();
                                ibuq.e(s20, "getType(...)");
                                linkedHashMap0.put(s19, Integer.valueOf(bybp.a(bundle1, s20)));
                            }
                            bybx0 = bybp.e(context0, bundle0, s17, s18, z2, linkedHashMap0);
                        }
                        if(bybx0 == null) {
                            byaf0 = new byaf(resultReceiver0);
                        }
                        else {
                            bxzx bxzx0 = new bxzx(arrayList0, bybx0, requestInfo0.isShowAllOptionsRequested());
                            RequestToken requestToken2 = requestInfo0.getRequestToken();
                            ibuq.e(requestToken2, "getRequestToken(...)");
                            byaf0 = new byae(bxzx0, new bybl(requestToken2), resultReceiver0);
                        }
                        break;
                    }
                    default: {
                        Log.e("CredentialSelector", "Unsupported request type: " + requestInfo0.getType());
                        byaf0 = new byaf(resultReceiver0);
                    }
                }
            }
        }
        else if(cancelSelectionRequest0.shouldShowCancellationExplanation()) {
            PackageManager packageManager0 = context0.getPackageManager();
            ibuq.e(packageManager0, "getPackageManager(...)");
            String s = cancelSelectionRequest0.getPackageName();
            ibuq.e(s, "getPackageName(...)");
            String s1 = byca.c(packageManager0, s);
            if(s1 == null) {
                byaf0 = new byaf(resultReceiver0);
            }
            else {
                RequestToken requestToken0 = cancelSelectionRequest0.getRequestToken();
                ibuq.e(requestToken0, "getRequestToken(...)");
                byaf0 = new byab(s1, new bybl(requestToken0), resultReceiver0);
            }
        }
        else {
            RequestToken requestToken1 = cancelSelectionRequest0.getRequestToken();
            ibuq.e(requestToken1, "getRequestToken(...)");
            byaf0 = new byac(new bybl(requestToken1));
        }
        if((byaf0 instanceof byaf)) {
            Log.e("CredentialSelector", "Received invalid request");
            this.a.g(byaf0);
            this.c(new bxzw(0, "Invalid request"));
            return ibom.a;
        }
        if(!(byaf0 instanceof byae) && !(byaf0 instanceof byad)) {
            if(!(byaf0 instanceof byab) && !(byaf0 instanceof byac)) {
                throw new ibnq();
            }
            icnl icnl0 = this.a;
            byag byag0 = (byag)icnl0.b();
            byai byai0 = byag0 == null ? null : byag0.b;
            if(byag0 == null) {
                Log.e("CredentialSelector", "Received intent to cancel or close request but no existing valid request");
            }
            if(byag0 == null || byai0 == null || byai0.a(byaf0.b)) {
                icnl0.g(byaf0);
                return ibom.a;
            }
            Log.e("CredentialSelector", "Received intent to cancel or close with invalid or stale token");
            if(!(byag0 instanceof byae) && !(byag0 instanceof byad)) {
                icnl0.g(byaf0);
                return ibom.a;
            }
        }
        else {
            this.a.g(byaf0);
        }
        return ibom.a;
    }

    @Override  // byax
    public final icnj b() {
        return this.b;
    }

    public final void c(bxzw bxzw0) {
        byag byag0 = (byag)this.a.b();
        if(byag0 == null) {
            Log.w("CredentialSelector", "Call to send error but no active request available");
            return;
        }
        ResultReceiver resultReceiver0 = byag0.c;
        if(resultReceiver0 != null) {
            FailureResult.sendFailureResult(resultReceiver0, new FailureResult(bxzw0.a, bxzw0.b));
        }
    }
}

