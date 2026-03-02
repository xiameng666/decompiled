import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

public final class ahhr implements glzn {
    public final ahia a;
    public final gmcd b;

    public ahhr(ahia ahia0, gmcd gmcd0) {
        this.a = ahia0;
        this.b = gmcd0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ahia ahia0 = this.a;
        CredentialRequest credentialRequest0 = ahia0.d;
        boolean z = credentialRequest0.b;
        if(z) {
            hpot hpot0 = hpot.a;
            if(hpot0.b().d()) {
                bxjn bxjn0 = (bxjn)bxjn.a.b();
                String s = ahia0.c;
                if(bxjn0.a(axzh.b(s), hpot0.b().a())) {
                    int v = ((gged_interceptors)object0).size();
                    int v1 = 0;
                    while(v1 < v) {
                        String s1 = ((InternalCredentialWrapper)((gged_interceptors)object0).get(v1)).a.e;
                        ++v1;
                        if(!TextUtils.isEmpty(s1)) {
                            continue;
                        }
                        goto label_17;
                    }
                    return ((ahfp)((bxrz)ahid.a.mr()).B(new ahid(credentialRequest0, s, ahia0.f, ahia0.e))).c();
                }
            }
        }
    label_17:
        if(((gged_interceptors)object0).isEmpty()) {
            String[] arr_s = credentialRequest0.c;
            CredentialPickerConfig credentialPickerConfig0 = credentialRequest0.e;
            if(!z && arr_s.length == 0) {
                throw new IllegalStateException("At least one authentication method must be specified");
            }
            HintRequest hintRequest0 = new HintRequest(2, credentialPickerConfig0, z, false, arr_s, false, null, null);
            String s2 = axzh.b(ahia0.c);
            Intent intent0 = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", s2).putExtra("logSessionId", ahia0.e);
            bauc.l(hintRequest0, intent0, "com.google.android.gms.credentials.HintRequest");
            bxly bxly0 = new bxly();
            bxly0.a = 0x6F05;
            bxly0.d = cjok.a(ahia0.a, 0, intent0, 0xA000000);
            throw bxly0.a();
        }
        gged_interceptors gged0 = (gged_interceptors)gmbu.r(this.b);
        return glzd.g(bxkv.b(gged_interceptors.h(gggq.j(gged0, new ahhx(ahia0))), new ahhy()), new ahhz(ahia0, ((gged_interceptors)object0), gged0), gmap.a);
    }
}

