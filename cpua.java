import android.os.Parcel;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class cpua extends wby implements cpub {
    private final fimi a;

    public cpua() {
        super("com.google.android.gms.matchstick.lighter.ILighterWebListener");
    }

    public cpua(fimi fimi0) {
        super("com.google.android.gms.matchstick.lighter.ILighterWebListener");
        this.a = fimi0;
    }

    @Override  // cpub
    public final void a(String s) {
        this.a.a(s);
    }

    @Override  // cpub
    public final void b(ParcelFileDescriptor parcelFileDescriptor0) {
        try {
            ParcelFileDescriptor.AutoCloseInputStream parcelFileDescriptor$AutoCloseInputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0);
            StringBuilder stringBuilder0 = new StringBuilder();
            BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(parcelFileDescriptor$AutoCloseInputStream0, Charset.forName(StandardCharsets.UTF_8.name())));
            int v;
            while((v = bufferedReader0.read()) != -1) {
                stringBuilder0.append(((char)v));
            }
            this.a.a(stringBuilder0.toString());
        }
        catch(IOException iOException0) {
            fihk.b("LWListenerImpl", iOException0, "evaluateJavascriptParcel", new Object[0]);
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 2: {
                String s = parcel0.readString();
                cpua.gr(parcel0);
                this.a(s);
                return true;
            }
            case 3: {
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                cpua.gr(parcel0);
                this.b(parcelFileDescriptor0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

