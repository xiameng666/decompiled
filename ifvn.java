import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import java.util.ArrayList;
import java.util.Arrays;

public final class ifvn extends wby implements IInterface {
    private final fbrc a;
    private final Bundle b;
    private final Context c;

    public ifvn() {
        super("org.chromium.IsReadyToPayService");
    }

    public ifvn(fbrc fbrc0, Bundle bundle0, Context context0) {
        super("org.chromium.IsReadyToPayService");
        this.a = fbrc0;
        this.b = bundle0;
        this.c = context0;
    }

    private final void a(ifvo ifvo0, Bundle bundle0) {
        IsReadyToPayRequest isReadyToPayRequest0;
        ArrayList arrayList0 = this.b.getStringArrayList("methodNames");
        fbqv fbqv0 = new fbqv(ifvo0, Boolean.valueOf((arrayList0 == null ? false : arrayList0.contains("https://pay.google.com/authentication"))));
        Bundle bundle1 = new Bundle(bundle0);
        bundle1.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", true);
        Context context0 = this.c;
        int v = Binder.getCallingUid();
        String s = bundle0.getString("packageName");
        if(TextUtils.isEmpty(s) || !bbqw.b(context0, v, s)) {
            String[] arr_s = bbsr.b(context0).k(v);
            if(arr_s != null) {
                int v1 = 0;
                while(v1 < arr_s.length) {
                    String s1 = arr_s[v1];
                    if(bbqw.b(context0, v, s1)) {
                        Arrays.toString(arr_s);
                        s = s1;
                        goto label_22;
                    }
                    ++v1;
                }
            }
            if(arr_s != null) {
                Arrays.toString(arr_s);
            }
            s = null;
        }
    label_22:
        bundle1.putString("androidPackageName", s);
        fbrc fbrc0 = this.a;
        String s2 = bundle0.getString("paymentRequestOrigin");
        if(s2 == null) {
            Log.e("IsRTPRequestError", "paymentRequestOrigin cannot be null!");
            isReadyToPayRequest0 = IsReadyToPayRequest.a().a;
        }
        else {
            Bundle bundle2 = bundle0.getBundle("methodData");
            if(bundle2 == null) {
                Log.e("IsRTPRequestError", "methodData cannot be null!");
                isReadyToPayRequest0 = IsReadyToPayRequest.a().a;
            }
            else {
                ArrayList arrayList1 = bundle0.getStringArrayList("methodNames");
                if(arrayList1 == null) {
                    Log.e("IsRTPRequestError", "methodNames cannot be null!");
                    isReadyToPayRequest0 = IsReadyToPayRequest.a().a;
                }
                else {
                    String s3 = (String)arrayList1.get(0);
                    if(s3 == null) {
                        Log.e("IsRTPRequestError", "methodName cannot be null!");
                        isReadyToPayRequest0 = IsReadyToPayRequest.a().a;
                    }
                    else {
                        String s4 = bundle2.getString(s3);
                        if(s4 == null) {
                            Log.e("IsRTPRequestError", "webWalletParameters cannot be null!");
                            isReadyToPayRequest0 = IsReadyToPayRequest.a().a;
                        }
                        else {
                            IsReadyToPayRequest isReadyToPayRequest1 = IsReadyToPayRequest.a().a;
                            isReadyToPayRequest1.b = s2;
                            isReadyToPayRequest1.c = s4;
                            isReadyToPayRequest0 = isReadyToPayRequest1;
                        }
                    }
                }
            }
        }
        fbrc0.g(isReadyToPayRequest0, bundle1, fbqv0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ifvo ifvo0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                ifvo0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("org.chromium.IsReadyToPayServiceCallback");
                ifvo0 = (iInterface0 instanceof ifvo) ? ((ifvo)iInterface0) : new ifvo(iBinder0);
            }
            Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
            ifvn.gr(parcel0);
            try {
                try {
                    if(bundle0 != null) {
                        ClassLoader classLoader0 = this.getClass().getClassLoader();
                        batl.s(classLoader0);
                        bundle0.setClassLoader(classLoader0);
                        this.a(ifvo0, bundle0);
                        return true;
                    }
                    this.a(ifvo0, this.b);
                }
                catch(NullPointerException nullPointerException0) {
                    Log.e("IbChromiumIsRTPBinder", "NullPointerException during isReadyToPay for Chromium", nullPointerException0);
                    this.a(ifvo0, this.b);
                }
                return true;
            }
            catch(RemoteException remoteException0) {
                Log.e("IbChromiumIsRTPBinder", "RemoteException during isReadyToPay for Chromium", remoteException0);
                throw new gfuz("isReadyToPay error for Chromium: ", remoteException0);
            }
        }
        return false;
    }
}

