import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;

public final class aiee extends bark {
    public final GoogleSignInOptions a;

    public aiee(Context context0, Looper looper0, baqv baqv0, GoogleSignInOptions googleSignInOptions0, aztu aztu0, aztv aztv0) {
        super(context0, looper0, 91, baqv0, aztu0, aztv0);
        aidx aidx0 = googleSignInOptions0 == null ? new aidx() : new aidx(googleSignInOptions0);
        aidx0.b = bxol.a();
        if(!baqv0.c.isEmpty()) {
            for(Object object0: baqv0.c) {
                aidx0.c(((Scope)object0), new Scope[0]);
            }
        }
        this.a = aidx0.a();
    }

    @Override  // baqp, azsz
    public final int a() {
        return 12451000;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return (iInterface0 instanceof aieu) ? ((aieu)iInterface0) : new aies(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override  // baqp, azsz
    public final Intent j() {
        aiek.a.d("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration0 = new SignInConfiguration("com.google.android.gms", this.a);
        Intent intent0 = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent0.setPackage("com.google.android.gms");
        intent0.setClass(this.r, SignInHubActivity.class);
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("config", signInConfiguration0);
        intent0.putExtra("config", bundle0);
        return intent0;
    }

    @Override  // baqp, azsz
    public final boolean k() {
        return true;
    }
}

