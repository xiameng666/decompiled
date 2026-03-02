import android.content.Context;
import android.content.Intent;
import android.util.MutableBoolean;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.common.api.Status;
import java.util.List;

final class alfs extends alif {
    final boolean a;
    final List b;
    final Context c;
    final MutableBoolean d;

    public alfs(boolean z, List list0, Context context0, MutableBoolean mutableBoolean0) {
        this.a = z;
        this.b = list0;
        this.c = context0;
        this.d = mutableBoolean0;
        super();
    }

    @Override  // alig
    public final void a(Status status0, List list0) {
        if(status0.equals(Status.b) && list0 != null) {
            if(albt.c() && hpzc.h() && (!hpzc.j() || this.a)) {
                for(Object object0: list0) {
                    SyncedCryptauthDevice syncedCryptauthDevice0 = (SyncedCryptauthDevice)object0;
                    AttestationVerifier attestationVerifier0 = syncedCryptauthDevice0.o;
                    if(attestationVerifier0 == null) {
                        Object[] arr_object = {alfs.c(syncedCryptauthDevice0)};
                        alft.a.h("No attestation verifier: %s", arr_object);
                    }
                    else {
                        Object[] arr_object1 = {alfs.c(syncedCryptauthDevice0)};
                        alft.a.h("Has attestation verifier: %s", arr_object1);
                    }
                    if(attestationVerifier0 != null && attestationVerifier0.a()) {
                        this.b.add(syncedCryptauthDevice0);
                    }
                }
            }
            else {
                this.b.addAll(list0);
            }
            if(albt.c() && (hpzc.d() || hpzc.h()) && (!hpzc.j() || this.a)) {
                StringBuilder stringBuilder0 = new StringBuilder();
                int v = 0;
                int v1 = 0;
                int v2 = 0;
                for(Object object1: list0) {
                    AttestationVerifier attestationVerifier1 = ((SyncedCryptauthDevice)object1).o;
                    if(attestationVerifier1 == null) {
                        stringBuilder0.append("NP: (");
                        ++v2;
                    }
                    else if(attestationVerifier1.a()) {
                        stringBuilder0.append("V: (");
                        ++v;
                    }
                    else {
                        stringBuilder0.append("F: (");
                        ++v1;
                    }
                    stringBuilder0.append(alfs.c(((SyncedCryptauthDevice)object1)));
                    stringBuilder0.append(") (");
                    stringBuilder0.append(((SyncedCryptauthDevice)object1).b);
                    stringBuilder0.append(") ");
                    stringBuilder0.append(((SyncedCryptauthDevice)object1).c);
                    stringBuilder0.append("\n");
                }
                if(hpzc.d()) {
                    Intent intent0 = new Intent().setClassName("com.google.ambient.streaming", "com.google.ambient.streaming.platform.development.AttestationWarningActivity").putExtra("com.google.ambient.streaming.extra.ATTESTATION_WARNING_NUMBER_VERIFIED", v).putExtra("com.google.ambient.streaming.extra.ATTESTATION_WARNING_NUMBER_FAILED", v1).putExtra("com.google.ambient.streaming.extra.ATTESTATION_WARNING_NUMBER_NOT_PRESENT", v2).putExtra("com.google.ambient.streaming.extra.ATTESTATION_WARNING_SERIALIZED", stringBuilder0.toString()).setFlags(0x10000000);
                    Context context0 = this.c;
                    if(context0.getPackageManager().queryIntentActivities(intent0, 0).isEmpty()) {
                        alft.a.m("Couldn\'t start attestation warning activity; no such activity found", new Object[0]);
                    }
                    else {
                        context0.startActivity(intent0);
                    }
                }
                alft.a.m("AttestationData=%s", new Object[]{stringBuilder0.toString()});
            }
            if(this.b.isEmpty()) {
                alft.a.m("Attestation: No devices out of %s passed verification.", new Object[]{list0.size()});
            }
            this.d.value = true;
        }
    }

    private static final String c(SyncedCryptauthDevice syncedCryptauthDevice0) {
        String s = bbmu.b(syncedCryptauthDevice0.a);
        return s.length() <= 5 ? "?" : s.substring(s.length() - 5);
    }
}

