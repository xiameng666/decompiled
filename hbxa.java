import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.vision.common.aidls.ImageMetadataParcel;
import com.google.mlkit.vision.text.aidls.TextParcel;
import com.google.mlkit.vision.text.aidls.TextRecognizerOptions;

final class hbxa implements hbxm {
    private final Context a;
    private final hbwm b;
    private boolean c;
    private boolean d;
    private final hbqy e;
    private hbwo f;

    public hbxa(Context context0, hbwm hbwm0, hbqy hbqy0) {
        this.a = context0;
        this.b = hbwm0;
        this.e = hbqy0;
    }

    @Override  // hbxm
    public final hbwk a(hbtp hbtp0) {
        if(this.f == null) {
            this.b();
        }
        hbwo hbwo0 = this.f;
        batl.s(hbwo0);
        if(!this.c) {
            try {
                hbwo0.jp(1, hbwo0.jo());
                this.c = true;
            }
            catch(RemoteException remoteException0) {
                throw new havd("Failed to init text recognizer " + this.b.e(), remoteException0);
            }
        }
        int v = hbts.a(hbtp0.f);
        long v1 = SystemClock.elapsedRealtime();
        ImageMetadataParcel imageMetadataParcel0 = new ImageMetadataParcel(hbtp0.g, hbtp0.d, hbtp0.e, v, v1);
        bjgw bjgw0 = hbtu.a.b(hbtp0);
        try {
            Parcel parcel0 = hbwo0.jo();
            wbz.h(parcel0, bjgw0);
            wbz.f(parcel0, imageMetadataParcel0);
            Parcel parcel1 = hbwo0.hM(3, parcel0);
            TextParcel textParcel0 = (TextParcel)wbz.a(parcel1, TextParcel.CREATOR);
            parcel1.recycle();
            return new hbwk(textParcel0);
        }
        catch(RemoteException remoteException1) {
            throw new havd("Failed to run text recognizer " + this.b.e(), remoteException1);
        }
    }

    @Override  // hbxm
    public final void b() {
        hbwp hbwp1;
        wbx wbx0;
        hbwo hbwo0;
        if(this.f != null) {
            return;
        }
        try {
            hbwm hbwm0 = this.b;
            hbwp hbwp0 = null;
            String s = (hbwm0 instanceof hbwy) ? ((hbwy)hbwm0).j() : null;
            if(hbwm0.h()) {
                Context context0 = this.a;
                String s1 = hbwm0.g();
                IBinder iBinder0 = bjia.f(context0, bjia.b, s1).e("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator");
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
                    hbwp0 = (iInterface0 instanceof hbwp) ? ((hbwp)iInterface0) : new hbwp(iBinder0);
                }
                hbwo0 = hbwp0.a(new ObjectWrapper(context0), hbxa.d(hbwm0, s));
            }
            else if((hbwm0 instanceof hbwy)) {
                Context context1 = this.a;
                String s2 = hbwm0.g();
                IBinder iBinder1 = bjia.f(context1, bjia.a, s2).e("com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator");
                if(iBinder1 == null) {
                    wbx0 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
                    wbx0 = (iInterface1 instanceof hbwn) ? ((hbwn)iInterface1) : new hbwn(iBinder1);
                }
                ObjectWrapper objectWrapper0 = new ObjectWrapper(context1);
                TextRecognizerOptions textRecognizerOptions0 = hbxa.d(hbwm0, s);
                Parcel parcel0 = wbx0.jo();
                wbz.h(parcel0, objectWrapper0);
                wbz.h(parcel0, null);
                wbz.f(parcel0, textRecognizerOptions0);
                Parcel parcel1 = wbx0.hM(1, parcel0);
                IBinder iBinder2 = parcel1.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
                    hbwp0 = (iInterface2 instanceof hbwo) ? ((hbwo)iInterface2) : new hbwo(iBinder2);
                }
                parcel1.recycle();
                goto label_54;
            }
            else {
                Context context2 = this.a;
                String s3 = hbwm0.g();
                IBinder iBinder3 = bjia.f(context2, bjia.a, s3).e("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator");
                if(iBinder3 == null) {
                    hbwp1 = null;
                }
                else {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
                    hbwp1 = (iInterface3 instanceof hbwp) ? ((hbwp)iInterface3) : new hbwp(iBinder3);
                }
                if(hbwm0.b() == 1) {
                    ObjectWrapper objectWrapper1 = new ObjectWrapper(context2);
                    Parcel parcel2 = hbwp1.jo();
                    wbz.h(parcel2, objectWrapper1);
                    Parcel parcel3 = hbwp1.hM(1, parcel2);
                    IBinder iBinder4 = parcel3.readStrongBinder();
                    if(iBinder4 != null) {
                        IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
                        hbwp0 = (iInterface4 instanceof hbwo) ? ((hbwo)iInterface4) : new hbwo(iBinder4);
                    }
                    parcel3.recycle();
                label_54:
                    hbwo0 = hbwp0;
                }
                else {
                    hbwo0 = hbwp1.a(new ObjectWrapper(context2), hbxa.d(hbwm0, s));
                }
            }
            this.f = hbwo0;
            boolean z = hbwm0.h();
            hbxj.b(this.e, z, hbkn.a);
        }
        catch(bjhw bjhw0) {
            hbwm hbwm1 = this.b;
            boolean z1 = hbwm1.h();
            hbxj.b(this.e, z1, hbkn.B);
            if(hbwm1.h()) {
                throw new havd(String.format("Failed to load text module %s. %s", hbwm1.e(), bjhw0.getMessage()), bjhw0);
            }
            if(!this.d) {
                Feature[] arr_feature = hbxl.a(hbwm1);
                hawq.c(this.a, arr_feature);
                this.d = true;
            }
            throw new havd("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
        catch(RemoteException remoteException0) {
            boolean z2 = this.b.h();
            hbxj.b(this.e, z2, hbkn.C);
            throw new havd("Failed to create text recognizer " + this.b.e(), remoteException0);
        }
    }

    @Override  // hbxm
    public final void c() {
        hbwo hbwo0 = this.f;
        if(hbwo0 != null) {
            try {
                hbwo0.jp(2, hbwo0.jo());
            }
            catch(RemoteException remoteException0) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer " + this.b.e(), remoteException0);
            }
            this.f = null;
        }
        this.c = false;
    }

    private static TextRecognizerOptions d(hbwm hbwm0, String s) {
        boolean z = (hbwm0 instanceof hbwz) && ((hbwz)hbwm0).a();
        String s1 = hbwm0.c();
        String s2 = hbwm0.f();
        switch(hbwm0.b()) {
            case 1: {
                return new TextRecognizerOptions(s1, s2, s, true, 1, hbwm0.d(), z);
            }
            case 2: {
                return new TextRecognizerOptions(s1, s2, s, true, 2, hbwm0.d(), z);
            }
            case 3: {
                return new TextRecognizerOptions(s1, s2, s, true, 3, hbwm0.d(), z);
            }
            case 4: {
                return new TextRecognizerOptions(s1, s2, s, true, 4, hbwm0.d(), z);
            }
            case 5: {
                return new TextRecognizerOptions(s1, s2, s, true, 5, hbwm0.d(), z);
            }
            case 6: {
                return new TextRecognizerOptions(s1, s2, s, true, 6, hbwm0.d(), z);
            }
            case 7: {
                return new TextRecognizerOptions(s1, s2, s, true, 7, hbwm0.d(), z);
            }
            case 8: {
                return new TextRecognizerOptions(s1, s2, s, true, 8, hbwm0.d(), z);
            }
            default: {
                return new TextRecognizerOptions(s1, s2, s, true, 9, hbwm0.d(), z);
            }
        }
    }
}

