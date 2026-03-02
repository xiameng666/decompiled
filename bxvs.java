import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;
import java.util.List;

public final class bxvs extends bxvv {
    public final GetCredentialRequest a;

    public bxvs(Bundle bundle0) {
        super(bundle0);
        Bundle bundle1 = bundle0.getBundle("EXTRA_REQUEST");
        batl.s(bundle1);
        ArrayList arrayList0 = new ArrayList();
        int v = 0;
        int v1 = bundle1.getInt("credentialOptionsSize", 0);
        while(v < v1) {
            Bundle bundle2 = bundle1.getBundle("credentialOptionsPrefix" + v);
            if(bundle2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String s = bundle2.getString("type");
            if(s == null) {
                s = "";
            }
            Bundle bundle3 = bundle2.getBundle("credentialRetrievalData");
            if(bundle3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Bundle bundle4 = bundle2.getBundle("candidateQueryData");
            if(bundle4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String s1 = bundle2.getString("requestMatcher");
            if(s1 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String s2 = bundle2.getString("requestType");
            if(s2 == null) {
                s2 = "";
            }
            String s3 = bundle2.getString("protocolType");
            arrayList0.add(new CredentialOption(s, bundle3, bundle4, s1, s2, (s3 == null ? "" : s3)));
            ++v;
            continue;
        }
        Bundle bundle5 = bundle1.getBundle("data");
        if(bundle5 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String s4 = bundle1.getString("origin");
        Parcelable parcelable0 = bundle1.getParcelable("resultReceiver");
        if(parcelable0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        GetCredentialRequest getCredentialRequest0 = new GetCredentialRequest(arrayList0, bundle5, s4, ((ResultReceiver)parcelable0));
        this.a = getCredentialRequest0;
        batl.s(getCredentialRequest0);
    }

    public bxvs(IBinder iBinder0, String s, GetCredentialRequest getCredentialRequest0, List list0) {
        super(iBinder0, s, list0);
        this.a = getCredentialRequest0;
    }

    @Override  // bxvv
    protected final void a(Bundle bundle0) {
        super.a(bundle0);
        Bundle bundle1 = new Bundle();
        bundle1.putBundle("data", this.a.b);
        bundle1.putString("origin", this.a.c);
        bundle1.putParcelable("resultReceiver", this.a.d);
        bundle1.putInt("credentialOptionsSize", this.a.a.size());
        int v = 0;
        for(Object object0: this.a.a) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("type", ((CredentialOption)object0).a);
            bundle2.putBundle("credentialRetrievalData", ((CredentialOption)object0).b);
            bundle2.putBundle("candidateQueryData", ((CredentialOption)object0).c);
            bundle2.putString("requestMatcher", ((CredentialOption)object0).d);
            bundle2.putString("requestType", ((CredentialOption)object0).e);
            bundle2.putString("protocolType", ((CredentialOption)object0).f);
            bundle1.putBundle("credentialOptionsPrefix" + v, bundle2);
            ++v;
        }
        bundle0.putBundle("EXTRA_REQUEST", bundle1);
    }
}

