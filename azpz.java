import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesImpl;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import j..util.Objects;
import java.util.ArrayList;

public final class azpz {
    private final GoogleCertificatesLookupQuery a;
    private final String b;
    private azra c;
    private gged_interceptors d;
    private ArrayList e;
    private boolean f;
    private boolean g;
    private final boolean h;

    public azpz(GoogleCertificatesImpl googleCertificatesImpl0, GoogleCertificatesLookupQuery googleCertificatesLookupQuery0, boolean z) {
        Objects.requireNonNull(googleCertificatesImpl0);
        super();
        this.a = googleCertificatesLookupQuery0;
        this.b = googleCertificatesLookupQuery0.a;
        this.h = z;
    }

    public final GoogleCertificatesLookupResponse a() {
        boolean z3;
        azpg azpg2;
        boolean z1;
        gged_interceptors gged0;
        GoogleCertificatesLookupResponse googleCertificatesLookupResponse0;
        GoogleCertificatesLookupQuery googleCertificatesLookupQuery0 = this.a;
        int v = googleCertificatesLookupQuery0.f ^ 1;
        this.g = v;
        Context context0 = googleCertificatesLookupQuery0.d;
        if(context0 == null) {
            googleCertificatesLookupResponse0 = GoogleCertificatesLookupResponse.b("null Context", null, null, googleCertificatesLookupQuery0.b, ((boolean)v));
        }
        else {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                googleCertificatesLookupResponse0 = GoogleCertificatesLookupResponse.b("null PackageManager", null, null, googleCertificatesLookupQuery0.b, this.g);
            }
            else {
                this.c = new azra(packageManager0);
                String s = this.b;
                if(s == null) {
                    googleCertificatesLookupResponse0 = GoogleCertificatesLookupResponse.b("null callingPackage", null, null, googleCertificatesLookupQuery0.b, this.g);
                }
                else {
                    try {
                        PackageInfo packageInfo0 = packageManager0.getPackageInfo(s, 0x8000200);
                        if(packageInfo0 == null) {
                            gged0 = ggna.a;
                        }
                        else {
                            SigningInfo signingInfo0 = packageInfo0.signingInfo;
                            if(signingInfo0 != null && !signingInfo0.hasMultipleSigners() && signingInfo0.getSigningCertificateHistory() != null) {
                                ggdy ggdy0 = new ggdy();
                                Signature[] arr_signature = signingInfo0.getSigningCertificateHistory();
                                for(int v1 = 0; v1 < arr_signature.length; ++v1) {
                                    ggdy0.i(new azpv(arr_signature[v1].toByteArray()));
                                }
                                gged0 = ggdy0.h();
                            }
                            else {
                                gged0 = ggna.a;
                            }
                        }
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                        googleCertificatesLookupResponse0 = new GoogleCertificatesLookupResponse(false, "callingPackage not found", 4, azpg.a);
                        goto label_65;
                    }
                    this.d = gged0;
                    String s1 = this.a.e ? "com.google.android.gms.chimera" : this.b;
                    this.e = new ArrayList();
                    gged_interceptors gged1 = this.d;
                    int v2 = ((ggna)gged1).c;
                    for(int v3 = 0; v3 < v2; ++v3) {
                        basd basd0 = (basd)gged1.get(v3);
                        this.e.add(new azrc(s1, basd0));
                    }
                    String s2 = this.b;
                    Context context1 = GoogleCertificatesImpl.a();
                    if(azoz.a(context1)) {
                        fpjb.f(context1);
                        try {
                            boolean z = hrjg.c();
                        }
                        catch(IllegalStateException illegalStateException0) {
                            Log.w("GoogleCertificatesImpl", "Flags cannot be read", illegalStateException0);
                            goto label_56;
                        }
                        if(!z || !Objects.equals(s2, "com.google.android.gms")) {
                            try {
                            label_56:
                                PackageInfo packageInfo1 = packageManager0.getPackageInfo(s2, 0);
                                goto label_59;
                            label_58:
                                packageInfo1 = packageManager0.getPackageInfo(s2, 0);
                            label_59:
                                if(packageInfo1.applicationInfo != null && (packageInfo1.applicationInfo.flags & 2) != 0) {
                                    z1 = true;
                                    goto label_63;
                                }
                            }
                            catch(PackageManager.NameNotFoundException unused_ex) {
                            }
                        }
                        goto label_62;
                    }
                    else {
                        goto label_58;
                    label_62:
                        z1 = false;
                    }
                label_63:
                    this.f = z1;
                    googleCertificatesLookupResponse0 = null;
                }
            }
        }
    label_65:
        if(googleCertificatesLookupResponse0 == null) {
            ArrayList arrayList0 = this.e;
            int v4 = arrayList0.size();
            int v5 = 0;
            while(true) {
                googleCertificatesLookupResponse0 = null;
                if(v5 < v4) {
                    azrc azrc0 = (azrc)arrayList0.get(v5);
                    azoy azoy0 = GoogleCertificatesImpl.d(azrc0, this.c);
                    if(azoy0.a && (!this.h || azoy0.a())) {
                        if(this.f) {
                            googleCertificatesLookupResponse0 = GoogleCertificatesLookupResponse.b("debuggable release cert app rejected", this.b, this.d, this.a.b, this.g);
                            goto label_94;
                        }
                        long v6 = -1L;
                        String s3 = this.b;
                        boolean z2 = this.a.g;
                        azqr azqr0 = GoogleCertificatesImpl.e(s3, azrc0, z2);
                        azpg azpg0 = azpg.a(azoy0.a());
                        if(!azqr0.a) {
                            googleCertificatesLookupResponse0 = new GoogleCertificatesLookupResponse(false, GoogleCertificatesLookupResponse.e(s3, azqr0.b, this.g), 6, azpg.a);
                            goto label_94;
                        }
                        if(z2) {
                            azqq azqq0 = azqr0.b;
                            if(azqq0 != null) {
                                v6 = azqq0.c;
                            }
                        }
                        googleCertificatesLookupResponse0 = new GoogleCertificatesLookupResponse(true, null, 1, azpg0, v6);
                        goto label_94;
                    }
                    ++v5;
                    continue;
                }
                goto label_94;
            }
        }
        else {
        label_94:
            if(googleCertificatesLookupResponse0 == null) {
                azpg azpg1 = azpg.a;
                ArrayList arrayList1 = this.e;
                int v7 = arrayList1.size();
                for(int v8 = 0; true; ++v8) {
                    if(v8 >= v7) {
                        azpg2 = azpg1;
                        z3 = false;
                        break;
                    }
                    azoy azoy1 = GoogleCertificatesImpl.c(((azrc)arrayList1.get(v8)));
                    if(azoy1.a && (!this.h || azoy1.a())) {
                        azpg2 = azpg.a(azoy1.a());
                        z3 = true;
                        break;
                    }
                }
                if(!z3) {
                    return new GoogleCertificatesLookupResponse(false, GoogleCertificatesLookupResponse.c("not allowed", this.b, this.d, this.a.b, this.g), 2, azpg1);
                }
                GoogleCertificatesLookupQuery googleCertificatesLookupQuery1 = this.a;
                if(googleCertificatesLookupQuery1.b) {
                    return new GoogleCertificatesLookupResponse(true, null, 1, azpg2);
                }
                if(googleCertificatesLookupQuery1.c) {
                    return GoogleCertificatesLookupResponse.f(this.b, this.d, this.g);
                }
                String s4 = this.b;
                if(azpd.a(GoogleCertificatesImpl.a(), s4)) {
                    Log.w("GoogleCertificatesImpl", s4 + " is signed with test keys");
                    return new GoogleCertificatesLookupResponse(true, null, 1, azpg2);
                }
                return GoogleCertificatesLookupResponse.f(s4, this.d, this.g);
            }
        }
        return googleCertificatesLookupResponse0;
    }
}

