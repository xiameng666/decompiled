package com.google.android.gms.auth.api.fido;

import ByteString;
import ahmv;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import bbmu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import gged_interceptors;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class PublicKeyCredentialCreationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final ByteString c;
    public final gged_interceptors d;
    public final Double e;
    public final gged_interceptors f;
    public final AuthenticatorSelectionCriteria g;
    public final TokenBinding h;
    public final AttestationConveyancePreference i;
    public final AuthenticationExtensions j;
    public final gged_interceptors k;

    static {
        PublicKeyCredentialCreationOptions.CREATOR = new ahmv();
    }

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity0, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity0, ByteString hfsf0, List list0, Double double0, List list1, AuthenticatorSelectionCriteria authenticatorSelectionCriteria0, TokenBinding tokenBinding0, AttestationConveyancePreference attestationConveyancePreference0, AuthenticationExtensions authenticationExtensions0, List list2) {
        batl.t(publicKeyCredentialRpEntity0, "relying party entity shouldn\'t be null");
        this.a = publicKeyCredentialRpEntity0;
        batl.t(publicKeyCredentialUserEntity0, "user entity shouldn\'t be null");
        this.b = publicKeyCredentialUserEntity0;
        this.c = hfsf0;
        batl.t(list0, "parameters shouldn\'t be null");
        this.d = gged_interceptors.i(list0);
        this.e = double0;
        gged_interceptors gged0 = null;
        this.f = list1 == null ? null : gged_interceptors.i(list1);
        this.g = authenticatorSelectionCriteria0;
        this.h = tokenBinding0;
        this.i = attestationConveyancePreference0;
        this.j = authenticationExtensions0;
        if(list2 != null) {
            gged0 = gged_interceptors.i(list2);
        }
        this.k = gged0;
    }

    public final String a() {
        return this.i == null ? null : this.i.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        if(bata.b(this.a, ((PublicKeyCredentialCreationOptions)object0).a) && bata.b(this.b, ((PublicKeyCredentialCreationOptions)object0).b) && bata.b(this.c, ((PublicKeyCredentialCreationOptions)object0).c) && bata.b(this.e, ((PublicKeyCredentialCreationOptions)object0).e)) {
            gged_interceptors gged0 = ((PublicKeyCredentialCreationOptions)object0).d;
            if(this.d.containsAll(gged0) && gged0.containsAll(this.d)) {
                gged_interceptors gged1 = this.f;
                if(gged1 == null && ((PublicKeyCredentialCreationOptions)object0).f == null) {
                label_10:
                    if(bata.b(this.g, ((PublicKeyCredentialCreationOptions)object0).g) && bata.b(this.h, ((PublicKeyCredentialCreationOptions)object0).h) && bata.b(this.i, ((PublicKeyCredentialCreationOptions)object0).i) && bata.b(this.j, ((PublicKeyCredentialCreationOptions)object0).j)) {
                        gged_interceptors gged3 = this.k;
                        if(gged3 == null && ((PublicKeyCredentialCreationOptions)object0).k == null) {
                            return true;
                        }
                        if(gged3 != null) {
                            gged_interceptors gged4 = ((PublicKeyCredentialCreationOptions)object0).k;
                            return gged4 == null || !gged3.containsAll(gged4) ? false : gged4.containsAll(gged3);
                        }
                    }
                }
                else if(gged1 != null) {
                    gged_interceptors gged2 = ((PublicKeyCredentialCreationOptions)object0).f;
                    if(gged2 != null && gged1.containsAll(gged2) && gged2.containsAll(gged1)) {
                        goto label_10;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k});
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        String s = bbmu.c(this.c.toByteArray());
        String s1 = this.a();
        return String.format(locale0, "PublicKeyCredentialCreationOptions: {\nrp: %s\nuser: %s\nchallenge: %s\ntimeoutSeconds: %s\nparameters: %s\nexcludeList: %s\nauthenticatorSelection: %s\ntokenBinding: %s\nattestationConveyancePreference: %s\nauthenticationExtensions :%s\nattestationFormats: %s}", this.a, this.b, s, this.e, this.d, this.f, this.g, this.h, s1, this.j, this.k);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.t(parcel0, 3, this.b, v, false);
        baub.i(parcel0, 4, this.c.toByteArray(), false);
        baub.y(parcel0, 5, this.d, false);
        baub.B(parcel0, 6, this.e);
        baub.y(parcel0, 7, this.f, false);
        baub.t(parcel0, 8, this.g, v, false);
        baub.t(parcel0, 9, this.h, v, false);
        baub.v(parcel0, 10, this.a(), false);
        baub.t(parcel0, 11, this.j, v, false);
        baub.x(parcel0, 12, this.k, false);
        baub.c(parcel0, v1);
    }
}

