import android.os.Bundle;
import com.google.android.gms.auth.firstparty.shared.ApplicationInformation;

public final class acsd {
    public final Bundle a;

    public acsd(Bundle bundle0) {
        this.a = bundle0;
    }

    public static acsd a(Bundle bundle0) {
        batl.s(bundle0);
        return new acsd(bundle0);
    }

    public final ApplicationInformation b() {
        Bundle bundle0 = this.a;
        if(!bundle0.containsKey("keyApplicationInformationAuthExtrasBundle")) {
            return null;
        }
        Bundle bundle1 = bundle0.getBundle("keyApplicationInformationAuthExtrasBundle");
        bundle1.setClassLoader(ApplicationInformation.class.getClassLoader());
        return (ApplicationInformation)bundle1.getParcelable("keyApplicationInformationWrapperBundle");
    }

    public final gqvr c() {
        Bundle bundle0 = this.a;
        if(!bundle0.containsKey("keyTokenRequestOptionsAuthExtrasBundle")) {
            return null;
        }
        Bundle bundle1 = bundle0.getBundle("keyTokenRequestOptionsAuthExtrasBundle");
        if(!bundle1.containsKey("keyTokenRequestOptionsWrapperBundle")) {
            return null;
        }
        try {
            byte[] arr_b = bundle1.getByteArray("keyTokenRequestOptionsWrapperBundle");
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gqvr.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (gqvr)hftv0;
        }
        catch(hfur hfur0) {
            throw new IllegalStateException(hfur0);
        }
    }

    public final String d() {
        return this.a.getString("keyRemoteApplicationLabelString");
    }

    public final boolean e() {
        return this.b() == null;
    }
}

