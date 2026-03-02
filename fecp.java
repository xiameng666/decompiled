import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.wearable.node.accountmatching.ui.AutoValue_GoogleAccountInfo;
import com.google.android.gms.wearable.node.accountmatching.ui.GoogleAccountInfo;
import java.util.ArrayList;

public final class fecp implements acn {
    public final fecr a;

    public fecp(fecr fecr0) {
        this.a = fecr0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        Intent intent0 = ((ActivityResult)object0).b;
        if(intent0 != null) {
            fecr fecr0 = this.a;
            Bundle bundle0 = intent0.getExtras();
            if(fecr0.d != null && bundle0 != null) {
                String s = bundle0.getString("authAccount");
                Log.i("Wear_AccountMatching", "[AccountMatchingFragment] Processing Google sign in result.");
                ArrayList arrayList0 = fecr0.b;
                int v = arrayList0.size();
                int v1 = 0;
                int v3 = 0;
                for(int v2 = 0; v2 < v; ++v2) {
                    v3 |= ((GoogleAccountInfo)arrayList0.get(v2)).a().equals(s);
                }
                if(v3 != 0 && s != null) {
                    if(Log.isLoggable("Wear_AccountMatching", 4)) {
                        Log.i("Wear_AccountMatching", "[AccountMatchingFragment] Sign in success for:" + s);
                    }
                    while(true) {
                        if(v1 >= arrayList0.size()) {
                            v1 = -1;
                            break;
                        }
                        if(((GoogleAccountInfo)arrayList0.get(v1)).a().equals(s)) {
                            break;
                        }
                        ++v1;
                    }
                    if(v1 != -1) {
                        arrayList0.set(v1, new AutoValue_GoogleAccountInfo(s, true));
                        fech fech0 = fecr0.e;
                        if(fech0 != null) {
                            fech0.r(v1);
                        }
                    }
                    else if(Log.isLoggable("Wear_AccountMatching", 5)) {
                        Log.w("Wear_AccountMatching", "[AccountMatchingFragment] Sign in was successful but the account was not found?");
                    }
                    fecr0.f.z();
                }
                else {
                    fecr0.f.B();
                }
                fecr0.f.A();
                fecr0.d = null;
                return;
            }
            if(Log.isLoggable("Wear_AccountMatching", 5)) {
                Log.w("Wear_AccountMatching", "[AccountMatchingFragment] Received a signInResult but we don\'t know which e");
            }
        }
        else if(Log.isLoggable("Wear_AccountMatching", 5)) {
            Log.w("Wear_AccountMatching", "[AccountMatchingFragment] No data for sign in result.");
        }
    }
}

