import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.wallet.callback.CallbackOutput;
import com.google.android.gms.wallet.callback.PaymentDataRequestUpdate;
import j..util.Objects;

public final class ifvy extends wby implements IInterface {
    final fbqz a;

    public ifvy() {
        super("org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback");
    }

    public ifvy(fbqz fbqz0) {
        Objects.requireNonNull(fbqz0);
        this.a = fbqz0;
        super("org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Message message1;
        String s;
        int v1 = 0;
        ifvx ifvx0 = null;
        switch(v) {
            case 1: {
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                ifvy.gr(parcel0);
                Parcelable[] arr_parcelable = bundle0.getParcelableArray("modifiers");
                while(true) {
                    s = "";
                    if(v1 >= arr_parcelable.length) {
                        break;
                    }
                    Bundle bundle1 = ((Bundle)arr_parcelable[v1]).getBundle("methodData");
                    if(bundle1 != null) {
                        s = bundle1.getString("details");
                        break;
                    }
                    ++v1;
                }
                fbqz fbqz1 = this.a;
                synchronized(fbqz1) {
                    Message message0 = fbqz1.d;
                    if(message0 == null) {
                        message1 = null;
                    }
                    else {
                        message1 = Message.obtain(message0);
                        fbqz1.d = null;
                    }
                }
                if(message1 != null) {
                    try {
                        Messenger messenger0 = message1.replyTo;
                        String s1 = message1.getData().getString("callbackType");
                        Message message2 = Message.obtain(null, 2);
                        fbdh fbdh0 = CallbackOutput.b();
                        fbdh0.a(Integer.parseInt(s1));
                        fbdh0.b(1);
                        batl.t(s, "JSON cannot be null!");
                        fbdh0.a.c = bauc.n(new PaymentDataRequestUpdate(s, null));
                        Bundle bundle2 = new Bundle();
                        bundle2.putByteArray("extra_callback_output", bauc.n(fbdh0.a));
                        message2.setData(bundle2);
                        message2.arg1 = message1.arg1;
                        messenger0.send(message2);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                return true;
            }
            case 2: {
                throw new UnsupportedOperationException("paymentDetailsNotUpdated is not supported");
            }
            default: {
                if(v != 3) {
                    return false;
                }
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("org.chromium.components.payments.IPaymentDetailsUpdateService");
                    ifvx0 = (iInterface0 instanceof ifvx) ? ((ifvx)iInterface0) : new ifvx(iBinder0);
                }
                ifvy.gr(parcel0);
                fbqz fbqz0 = this.a;
                int v2 = Binder.getCallingUid();
                String[] arr_s = fbqz0.b.k(v2);
                while(v1 < arr_s.length) {
                    fbqy fbqy0 = fbqz0.a(arr_s[v1]);
                    fbqy0.b = ifvx0;
                    fbqy0.a.countDown();
                    ++v1;
                }
                return true;
            }
        }
    }
}

