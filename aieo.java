import android.content.Context;
import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

public final class aieo extends wby implements IInterface {
    private final Context a;

    public aieo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    public aieo(Context context0) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = context0;
    }

    private final void a() {
        int v = Binder.getCallingUid();
        if(bbqw.a(this.a, v)) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azyy azyy0;
        aiei aiei0;
        switch(v) {
            case 1: {
                this.a();
                aiex aiex0 = aiex.c(this.a);
                GoogleSignInAccount googleSignInAccount0 = aiex0.a();
                GoogleSignInOptions googleSignInOptions0 = googleSignInAccount0 == null ? GoogleSignInOptions.f : aiex0.b();
                batl.s(googleSignInOptions0);
                aidv aidv0 = new aidv(this.a, googleSignInOptions0);
                if(googleSignInAccount0 != null) {
                    aztw aztw0 = aidv0.D;
                    int v1 = aidv0.b();
                    aiek.a.d("Revoking access", new Object[0]);
                    String s = aiex.c(aidv0.v).d("refreshToken");
                    aiek.a(aidv0.v);
                    if(v1 != 3) {
                        aiei0 = new aiei(aztw0);
                        aztw0.d(aiei0);
                    }
                    else if(s == null) {
                        Status status0 = new Status(4);
                        batl.c(((boolean)(status0.e() ^ 1)), "Status code must not be SUCCESS");
                        aiei0 = new azub(status0);
                        aiei0.n(status0);
                    }
                    else {
                        aiec aiec0 = new aiec(s);
                        new Thread(aiec0).start();
                        aiei0 = aiec0.a;
                    }
                    batf.c(aiei0);
                    return true;
                }
                aztw aztw1 = aidv0.D;
                int v2 = aidv0.b();
                aiek.a.d("Signing out", new Object[0]);
                aiek.a(aidv0.v);
                if(v2 == 3) {
                    azyy0 = new azyy(aztw1);
                    azyy0.n(Status.b);
                }
                else {
                    azyy0 = new aieg(aztw1);
                    aztw1.d(((azvc)azyy0));
                }
                batf.c(azyy0);
                return true;
            }
            case 2: {
                this.a();
                aiem.a(this.a).b();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

