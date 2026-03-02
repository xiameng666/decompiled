package com.google.android.gms.identity.credentialprovider;

import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import bxqa;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibpo;
import ibuq;
import j..time.Instant;
import java.util.Arrays;
import kld;
import kle;
import kvc;
import kvz;
import kwa;
import kxb;
import kxc;
import kxl;

public class AuxiliaryCreateCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final kvc b;
    public final kle c;

    static {
        AuxiliaryCreateCredentialResponse.CREATOR = new bxqa();
    }

    public AuxiliaryCreateCredentialResponse(String s, kvc kvc0, kle kle0) {
        boolean z = false;
        batl.c(kvc0 != null || kle0 != null, "Both response and exception cannot be null. At least one must be set.");
        batl.c(kvc0 == null || kle0 == null, "Only one of response or exception can be set, not both.");
        if(s != null || kle0 != null) {
            z = true;
        }
        batl.c(z, "fullyQualifiedServiceName can only be null when exception is not null");
        this.a = s;
        this.b = kvc0;
        this.c = kle0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof AuxiliaryCreateCredentialResponse) && bata.b(this.a, ((AuxiliaryCreateCredentialResponse)object0).a) && bata.b(this.c, ((AuxiliaryCreateCredentialResponse)object0).c) && bata.b(this.b, ((AuxiliaryCreateCredentialResponse)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Bundle bundle1;
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        kvc kvc0 = this.b;
        Bundle bundle0 = null;
        if(kvc0 == null) {
            bundle1 = null;
        }
        else {
            bundle1 = new Bundle();
            if(Build.VERSION.SDK_INT >= 34) {
                bundle1.putParcelable("androidx.credentials.provider.BeginCreateCredentialResponse", kxl.a(kvc0));
            }
            else {
                ibuq.f(kvc0.a, "<this>");
                bundle1.putInt("androidx.credentials.provider.extra.CREATE_ENTRY_SIZE", kvc0.a.size());
                int v2 = 0;
                for(Object object0: kvc0.a) {
                    if(v2 < 0) {
                        ibpo.m();
                    }
                    bundle1.putCharSequence("androidx.credentials.provider.extra.ACCOUNT_NAME_" + v2, ((kwa)object0).a);
                    bundle1.putParcelable("androidx.credentials.provider.extra.PENDING_INTENT_" + v2, ((kwa)object0).b);
                    Icon icon0 = ((kwa)object0).c;
                    if(icon0 != null) {
                        bundle1.putParcelable("androidx.credentials.provider.extra.ICON_" + v2, icon0);
                    }
                    CharSequence charSequence0 = ((kwa)object0).d;
                    if(charSequence0 != null) {
                        bundle1.putCharSequence("androidx.credentials.provider.extra.DESCRIPTION_" + v2, charSequence0);
                    }
                    Instant instant0 = ((kwa)object0).e;
                    if(instant0 != null) {
                        bundle1.putSerializable("androidx.credentials.provider.extra.LAST_USED_TIME_" + v2, instant0);
                    }
                    Bundle bundle2 = kvz.b(((kwa)object0).f);
                    if(bundle2 != null) {
                        bundle1.putBundle("androidx.credentials.provider.extra.CREDENTIAL_COUNT_INFO_" + v2, bundle2);
                    }
                    bundle1.putBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_" + v2, ((kwa)object0).g);
                    ++v2;
                }
                kxc kxc0 = kvc0.b;
                if(kxc0 != null) {
                    kxb.b(kxc0, bundle1);
                }
            }
        }
        baub.g(parcel0, 3, bundle1, false);
        kle kle0 = this.c;
        if(kle0 != null) {
            bundle0 = kld.a(kle0);
        }
        baub.g(parcel0, 4, bundle0, false);
        baub.c(parcel0, v1);
    }
}

