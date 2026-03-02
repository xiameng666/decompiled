import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager.BasicModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.smartdevice.d2d.AdvertisementOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import com.google.android.gms.smartdevice.setup.auth.StartSessionResponse;
import j..util.Collection.-EL;
import j..util.DesugarArrays;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class eqsh {
    public static byte a(Context context0) {
        if(bbnp.f(context0)) {
            return 8;
        }
        return bbnp.o(context0.getResources()) ? 2 : 1;
    }

    public static int b(Context context0) {
        ModuleManager.BasicModuleInfo moduleManager$BasicModuleInfo0 = ModuleManager.getBasicModuleInfo(context0);
        return moduleManager$BasicModuleInfo0 == null ? -1 : moduleManager$BasicModuleInfo0.moduleVersion;
    }

    public static ResultReceiver c(ResultReceiver resultReceiver0) {
        Parcel parcel0 = Parcel.obtain();
        resultReceiver0.writeToParcel(parcel0, 0);
        parcel0.setDataPosition(0);
        ResultReceiver resultReceiver1 = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel0);
        parcel0.recycle();
        return resultReceiver1;
    }

    public static kau d(List list0, String s) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        Object object0 = null;
        for(Object object1: list0) {
            String s1 = ((Bundle)object1).getString("name");
            if(s1 != null) {
                Account account0 = new Account(s1, "com.google");
                if(account0.name != null && s != null && eqsh.v(account0.name, s)) {
                    object0 = account0;
                }
                arrayList0.add(account0);
            }
        }
        if(object0 == null && !arrayList0.isEmpty()) {
            object0 = (Account)arrayList0.get(0);
        }
        return new kau(object0, arrayList0);
    }

    public static BootstrapOptions e(Context context0, baun baun0) {
        String s = gajl.c(context0, 0x7F15284D);  // string:restore_app_package ""
        PostTransferAction postTransferAction0 = new PostTransferAction();
        postTransferAction0.p(gajl.c(context0, 0x7F15284E));  // string:restore_app_uri ""
        postTransferAction0.r(s);
        postTransferAction0.q(hykc.c());
        if(!TextUtils.isEmpty(s)) {
            batl.s(context0);
            long v = erpp.a(s, context0.getPackageManager());
            postTransferAction0.f = v;
            postTransferAction0.a.add(Integer.valueOf(6));
            baun0.d("OEM package name = %s, version = %d", new Object[]{s, v});
        }
        return epxk.a(4, new ArrayList(), 0, Build.MODEL, false, -1L, false, false, null, postTransferAction0, new AdvertisementOptions(0), new ArrayList());
    }

    public static MessagePayload f(List list0) {
        MessagePayload messagePayload0 = new MessagePayload();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            StartSessionResponse startSessionResponse0 = new StartSessionResponse();
            String s = ((Bundle)object0).getString("targetSessionId");
            if(!TextUtils.isEmpty(s)) {
                startSessionResponse0.q(s);
            }
            String s1 = ((Bundle)object0).getString("name");
            if(!TextUtils.isEmpty(s1)) {
                startSessionResponse0.p(s1);
            }
            arrayList0.add(startSessionResponse0);
        }
        messagePayload0.am(new SecondDeviceAuthPayload(arrayList0));
        messagePayload0.x(6);
        return messagePayload0;
    }

    public static eqoe g(byte b) {
        switch(b) {
            case 1: {
                return eqoe.f;
            }
            case 2: {
                return eqoe.g;
            }
            case 3: {
                return eqoe.c;
            }
            case 4: {
                return eqoe.e;
            }
            case 5: {
                return eqoe.d;
            }
            case 6: {
                return eqoe.h;
            }
            case 7: {
                return eqoe.i;
            }
            case 8: {
                return eqoe.j;
            }
            default: {
                return eqoe.a;
            }
        }
    }

    public static eqoe h(Context context0) {
        if(bbnp.f(context0)) {
            return eqoe.j;
        }
        return bbnp.o(context0.getResources()) ? eqoe.g : eqoe.f;
    }

    public static gged_interceptors i(Context context0, List list0) {
        if(hygx.d()) {
            ggeo ggeo0 = eqsh.m(context0);
            return (gged_interceptors)Collection.-EL.stream(list0).map(new eqsc(ggeo0)).collect(ggaf.a);
        }
        return (gged_interceptors)Collection.-EL.stream(list0).map(new eqsd()).collect(ggaf.a);
    }

    public static gged_interceptors j(List list0) {
        return (gged_interceptors)Collection.-EL.stream(list0).map(new eqry()).collect(ggaf.a);
    }

    public static gged_interceptors k(List list0) {
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            String s = ((Bundle)object0).getString("name");
            if(!TextUtils.isEmpty(s)) {
                ggdy0.i(new BootstrapAccount(s, "com.google"));
            }
        }
        return ggdy0.h();
    }

    public static gged_interceptors l(List list0) {
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            String s = ((Bundle)object0).getString("name");
            String s1 = ((Bundle)object0).getString("url");
            String s2 = ((Bundle)object0).getString("targetSessionId");
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                if(s2 == null) {
                    s2 = "";
                }
                ggdy0.i(new FallbackAccount(s, s1, s2));
            }
        }
        return ggdy0.h();
    }

    public static ggeo m(Context context0) {
        Account[] arr_account = cchj.b(context0).p("com.google");
        return arr_account.length <= 0 ? ggnf.a : ((ggeo)DesugarArrays.stream(arr_account).map(new eqse()).collect(ggaf.b(new eqsf(), new eqsg())));
    }

    public static String n(ggeo ggeo0, String s) {
        if(s != null && s.matches("^(.+)@(\\S+)$")) {
            List list0 = gfud.e('@').n(s);
            String s1 = (String)list0.get(0);
            return s1 + "@" + ((String)ggeo0.getOrDefault(s1, ((String)list0.get(1))));
        }
        return s;
    }

    public static ArrayList o(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            StartSessionResponse startSessionResponse0 = (StartSessionResponse)object0;
            Bundle bundle0 = new Bundle();
            bundle0.putString("name", startSessionResponse0.h);
            if(!TextUtils.isEmpty(startSessionResponse0.g)) {
                bundle0.putString("url", startSessionResponse0.g);
            }
            if(!TextUtils.isEmpty(startSessionResponse0.e)) {
                bundle0.putString("url", startSessionResponse0.e);
            }
            if(!TextUtils.isEmpty(startSessionResponse0.f)) {
                bundle0.putString("targetSessionId", startSessionResponse0.f);
            }
            arrayList0.add(bundle0);
        }
        return arrayList0;
    }

    public static ArrayList p(List list0) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            UserCredential userCredential0 = (UserCredential)object0;
            Bundle bundle0 = new Bundle();
            bundle0.putString("name", userCredential0.b);
            if(TextUtils.isEmpty(userCredential0.e)) {
                bundle0.putString("credential", userCredential0.f);
            }
            else {
                bundle0.putString("url", userCredential0.e);
            }
            if(!TextUtils.isEmpty(userCredential0.g)) {
                bundle0.putString("firstName", userCredential0.g);
            }
            if(!TextUtils.isEmpty(userCredential0.h)) {
                bundle0.putString("lastName", userCredential0.h);
            }
            arrayList0.add(bundle0);
        }
        return arrayList0;
    }

    public static ArrayList q(UserCredential[] arr_userCredential) {
        return eqsh.p(new ArrayList(Arrays.asList(arr_userCredential)));
    }

    public static void r(long v, float f, int v1, baun baun0) {
        try {
            Thread.sleep(((long)(((double)v) * Math.pow(f, v1))));
        }
        catch(InterruptedException interruptedException0) {
            baun0.k("Wait interrupted.", interruptedException0, new Object[0]);
        }
    }

    public static boolean s(Context context0) {
        return Objects.equals(Settings.Secure.getString(context0.getContentResolver(), "prefer_user_account_age_group"), "adult") ? hyjn.a.b().b() : hyjn.a.b().a();
    }

    public static boolean t(Context context0, Account account0) {
        try {
            if(!TextUtils.isEmpty(new adgg(context0).b(context0, account0, "https://www.googleapis.com/auth/userinfo.email"))) {
                return true;
            }
        }
        catch(IOException | acse unused_ex) {
        }
        return false;
    }

    public static boolean u(String s, List list0) {
        if(list0 == null) {
            return false;
        }
        for(Object object0: list0) {
            if(eqsh.v(((BootstrapAccount)object0).b, s)) {
                return true;
            }
        }
        return false;
    }

    public static boolean v(String s, String s1) {
        String[] arr_s = s.replace("@googlemail.com", "@gmail.com").split("\\.", -1);
        String[] arr_s1 = s1.replace("@googlemail.com", "@gmail.com").split("\\.", -1);
        StringBuilder stringBuilder0 = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            stringBuilder0.append(arr_s[v1]);
        }
        for(int v = 0; v < arr_s1.length; ++v) {
            stringBuilder1.append(arr_s1[v]);
        }
        return gfqz.e(stringBuilder0.toString(), stringBuilder1.toString());
    }

    public static boolean w(Context context0) {
        return Settings.Secure.getInt(context0.getContentResolver(), "user_setup_complete", 0) == 1;
    }

    public static int x(byte b) {
        switch(b) {
            case 2: {
                return 5;
            }
            case 3: {
                return 3;
            }
            case 4: {
                return 6;
            }
            case 6: {
                return 4;
            }
            default: {
                return 2;
            }
        }
    }

    public static int y(byte b) {
        switch(b) {
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            default: {
                return 1;
            }
        }
    }

    public static int z(int v) {
        switch(v) {
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            case 5: {
                return 6;
            }
            case 6: {
                return 7;
            }
            case 7: {
                return 8;
            }
            case 8: {
                return 9;
            }
            case 9: {
                return 10;
            }
            case 10: {
                return 11;
            }
            case 11: {
                return 12;
            }
            default: {
                return 1;
            }
        }
    }
}

