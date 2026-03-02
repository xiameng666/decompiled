import android.app.slice.Slice.Builder;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.service.credentials.Action;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse.Builder;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.CredentialEntry;
import android.service.credentials.RemoteEntry;
import j..util.Collection.-EL;
import j..util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class kyg {
    public static final BeginGetCredentialResponse a(kvl kvl0) {
        ibuq.f(kvl0, "response");
        BeginGetCredentialResponse.Builder beginGetCredentialResponse$Builder0 = new BeginGetCredentialResponse.Builder();
        Iterator iterator0 = kvl0.a.iterator();
        while(true) {
            Slice slice0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            kwc kwc0 = (kwc)object0;
            ibuq.f(kwc0, "entry");
            if(Build.VERSION.SDK_INT >= 35) {
                ibuq.f(kwc0, "entry");
                if((kwc0 instanceof kwn)) {
                    slice0 = kwm.b(((kwn)kwc0));
                }
                else if((kwc0 instanceof kxa)) {
                    slice0 = kwz.b(((kxa)kwc0));
                }
                else if((kwc0 instanceof kwk)) {
                    slice0 = kwj.b(((kwk)kwc0));
                }
            }
            else {
                ibuq.f(kwc0, "entry");
                if((kwc0 instanceof kwn)) {
                    slice0 = kwm.b(((kwn)kwc0));
                }
                else if((kwc0 instanceof kxa)) {
                    slice0 = kwz.b(((kxa)kwc0));
                }
                else if((kwc0 instanceof kwk)) {
                    slice0 = kwj.b(((kwk)kwc0));
                }
            }
            if(slice0 != null) {
                String s = kwc0.a();
                beginGetCredentialResponse$Builder0.addCredentialEntry(new CredentialEntry(new BeginGetCredentialOption(kwc0.b.a, s, Bundle.EMPTY), slice0));
            }
        }
        for(Object object1: kvl0.b) {
            ibuq.f(((kuu)object1), "action");
            Slice.Builder slice$Builder0 = new Slice.Builder(Uri.EMPTY, new SliceSpec("Action", 0));
            List list0 = ibpo.b("androidx.credentials.provider.action.HINT_ACTION_TITLE");
            Slice.Builder slice$Builder1 = slice$Builder0.addText(((kuu)object1).a, null, list0);
            List list1 = ibpo.b("androidx.credentials.provider.action.HINT_ACTION_SUBTEXT");
            Slice.Builder slice$Builder2 = slice$Builder1.addText(((kuu)object1).c, null, list1);
            Slice slice1 = new Slice.Builder(slice$Builder2).addHints(Collections.singletonList("androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT")).build();
            slice$Builder2.addAction(((kuu)object1).b, slice1, null);
            Slice slice2 = slice$Builder2.build();
            ibuq.e(slice2, "build(...)");
            beginGetCredentialResponse$Builder0.addAction(new Action(slice2));
        }
        for(Object object2: kvl0.c) {
            ibuq.f(((kuw)object2), "authenticationAction");
            Slice.Builder slice$Builder3 = new Slice.Builder(Uri.EMPTY, new SliceSpec("AuthenticationAction", 0));
            Slice slice3 = new Slice.Builder(slice$Builder3).addHints(Collections.singletonList("androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT")).build();
            Slice.Builder slice$Builder4 = slice$Builder3.addAction(((kuw)object2).b, slice3, null);
            List list2 = ibpo.b("androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE");
            slice$Builder4.addText(((kuw)object2).a, null, list2);
            Slice slice4 = slice$Builder3.build();
            ibuq.e(slice4, "build(...)");
            beginGetCredentialResponse$Builder0.addAuthenticationAction(new Action(slice4));
        }
        kxc kxc0 = kvl0.d;
        if(kxc0 != null) {
            beginGetCredentialResponse$Builder0.setRemoteCredentialEntry(new RemoteEntry(kxb.c(kxc0)));
        }
        BeginGetCredentialResponse beginGetCredentialResponse0 = beginGetCredentialResponse$Builder0.build();
        ibuq.e(beginGetCredentialResponse0, "build(...)");
        return beginGetCredentialResponse0;
    }

    public static final kvi b(BeginGetCredentialRequest beginGetCredentialRequest0) {
        ibuq.f(beginGetCredentialRequest0, "request");
        ArrayList arrayList0 = new ArrayList();
        List list0 = beginGetCredentialRequest0.getBeginGetCredentialOptions();
        ibuq.e(list0, "getBeginGetCredentialOptions(...)");
        for(Object object0: list0) {
            String s = ((BeginGetCredentialOption)object0).getId();
            ibuq.e(s, "getId(...)");
            String s1 = ((BeginGetCredentialOption)object0).getType();
            ibuq.e(s1, "getType(...)");
            Bundle bundle0 = ((BeginGetCredentialOption)object0).getCandidateQueryData();
            ibuq.e(bundle0, "getCandidateQueryData(...)");
            arrayList0.add(kvf.a(s, s1, bundle0));
        }
        CallingAppInfo callingAppInfo0 = beginGetCredentialRequest0.getCallingAppInfo();
        if(callingAppInfo0 != null) {
            String s2 = callingAppInfo0.getPackageName();
            ibuq.e(s2, "getPackageName(...)");
            SigningInfo signingInfo0 = callingAppInfo0.getSigningInfo();
            ibuq.e(signingInfo0, "getSigningInfo(...)");
            return new kvi(arrayList0, kvu.a(s2, signingInfo0, callingAppInfo0.getOrigin()));
        }
        return new kvi(arrayList0, null);
    }

    public static final kvl c(BeginGetCredentialResponse beginGetCredentialResponse0) {
        Object object0 = Collection.-EL.stream(beginGetCredentialResponse0.getCredentialEntries()).map(new kyf(new kxm())).filter(new kxo(new kxn())).map(new kxq(new kxp())).collect(Collectors.toList());
        ibuq.e(object0, "collect(...)");
        Object object1 = Collection.-EL.stream(beginGetCredentialResponse0.getActions()).map(new kxs(new kxr())).filter(new kxu(new kxt())).map(new kxy(new kxx())).collect(Collectors.toList());
        ibuq.e(object1, "collect(...)");
        Object object2 = Collection.-EL.stream(beginGetCredentialResponse0.getAuthenticationActions()).map(new kya(new kxz())).filter(new kyc(new kyb())).map(new kye(new kyd())).collect(Collectors.toList());
        ibuq.e(object2, "collect(...)");
        RemoteEntry remoteEntry0 = beginGetCredentialResponse0.getRemoteCredentialEntry();
        if(remoteEntry0 != null) {
            Slice slice0 = remoteEntry0.getSlice();
            ibuq.e(slice0, "getSlice(...)");
            return new kvl(((List)object0), ((List)object1), ((List)object2), kxb.a(slice0));
        }
        return new kvl(((List)object0), ((List)object1), ((List)object2), null);
    }
}

