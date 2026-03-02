package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eskp;
import ggfp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    final boolean A;
    public final long B;
    public final long C;
    public static final Parcelable.Creator CREATOR;
    public final boolean D;
    public final long E;
    public final String F;
    public final String G;
    final CardRewardsInfo H;
    public final int I;
    public final boolean J;
    public final String K;
    public final int L;
    public final boolean M;
    final long N;
    public final String O;
    public final int P;
    public final List Q;
    public final SeInfo R;
    final String S;
    public final String T;
    public final String U;
    public final long V;
    public final int W;
    public final int X;
    public final int Y;
    final byte[] Z;
    public final String a;
    private static final ggfp aa;
    public final String b;
    public final byte[] c;
    final String d;
    public final String e;
    public final int f;
    public final TokenStatus g;
    public final String h;
    public final Uri i;
    public final int j;
    public final int k;
    public final IssuerInfo l;
    public final String m;
    public final TransactionInfo n;
    public final String o;
    public final byte[] p;
    final int q;
    final int r;
    public final int s;
    public final InStoreCvmConfig t;
    public final InAppCvmConfig u;
    public final String v;
    public final OnlineAccountCardLinkInfo[] w;
    final boolean x;
    final List y;
    final boolean z;

    static {
        CardInfo.CREATOR = new eskp();
        CardInfo.aa = ggfp.K(Integer.valueOf(10), Integer.valueOf(9));
    }

    public CardInfo(String s, String s1, byte[] arr_b, String s2, String s3, int v, TokenStatus tokenStatus0, String s4, Uri uri0, int v1, int v2, IssuerInfo issuerInfo0, String s5, TransactionInfo transactionInfo0, String s6, byte[] arr_b1, int v3, int v4, int v5, InStoreCvmConfig inStoreCvmConfig0, InAppCvmConfig inAppCvmConfig0, String s7, OnlineAccountCardLinkInfo[] arr_onlineAccountCardLinkInfo, boolean z, List list0, boolean z1, boolean z2, long v6, long v7, boolean z3, long v8, String s8, String s9, CardRewardsInfo cardRewardsInfo0, int v9, boolean z4, String s10, int v10, boolean z5, long v11, String s11, int v12, List list1, SeInfo seInfo0, String s12, String s13, String s14, long v13, int v14, int v15, int v16, byte[] arr_b2) {
        this.a = s;
        this.b = s1;
        this.c = arr_b;
        this.d = s2;
        this.e = s3;
        this.f = v;
        this.g = tokenStatus0;
        this.h = s4;
        this.i = uri0;
        this.j = v1;
        this.k = v2;
        this.l = issuerInfo0;
        this.m = s5;
        this.n = transactionInfo0;
        this.o = s6;
        this.p = arr_b1;
        this.q = v3;
        this.r = v4;
        this.s = v5;
        this.t = inStoreCvmConfig0;
        this.u = inAppCvmConfig0;
        this.v = s7;
        this.w = arr_onlineAccountCardLinkInfo;
        this.x = z;
        this.y = list0;
        this.z = z1;
        this.A = z2;
        this.B = v6;
        this.C = v7;
        this.D = z3;
        this.E = v8;
        this.F = s8;
        this.G = s9;
        this.H = cardRewardsInfo0;
        this.I = v9;
        this.J = z4;
        this.K = s10;
        this.L = v10;
        this.M = z5;
        this.N = v11;
        this.O = s11;
        this.P = v12;
        this.Q = list1;
        this.R = seInfo0;
        this.S = s12;
        this.T = s13;
        this.U = s14;
        this.V = v13;
        this.W = v14;
        this.X = v15;
        this.Y = v16;
        this.Z = arr_b2;
    }

    public final boolean a() {
        return CardInfo.aa.contains(Integer.valueOf(this.f));
    }

    public final boolean b() {
        return this.f == 18 || this.P == 18;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof CardInfo) && bata.b(this.a, ((CardInfo)object0).a) && bata.b(this.b, ((CardInfo)object0).b) && Arrays.equals(this.c, ((CardInfo)object0).c) && bata.b(this.d, ((CardInfo)object0).d) && bata.b(this.e, ((CardInfo)object0).e) && this.f == ((CardInfo)object0).f && bata.b(this.g, ((CardInfo)object0).g) && bata.b(this.h, ((CardInfo)object0).h) && bata.b(this.i, ((CardInfo)object0).i) && this.j == ((CardInfo)object0).j && this.k == ((CardInfo)object0).k && bata.b(this.l, ((CardInfo)object0).l) && bata.b(this.m, ((CardInfo)object0).m) && bata.b(this.n, ((CardInfo)object0).n) && this.q == ((CardInfo)object0).q && this.r == ((CardInfo)object0).r && this.s == ((CardInfo)object0).s && bata.b(this.t, ((CardInfo)object0).t) && bata.b(this.u, ((CardInfo)object0).u) && bata.b(this.v, ((CardInfo)object0).v) && Arrays.equals(this.w, ((CardInfo)object0).w) && this.x == ((CardInfo)object0).x && bata.b(this.y, ((CardInfo)object0).y) && this.z == ((CardInfo)object0).z && this.A == ((CardInfo)object0).A && this.B == ((CardInfo)object0).B && this.D == ((CardInfo)object0).D && this.E == ((CardInfo)object0).E && bata.b(this.F, ((CardInfo)object0).F) && bata.b(this.G, ((CardInfo)object0).G) && bata.b(this.H, ((CardInfo)object0).H) && this.I == ((CardInfo)object0).I && this.J == ((CardInfo)object0).J && this.L == ((CardInfo)object0).L && this.M == ((CardInfo)object0).M && this.P == ((CardInfo)object0).P && this.N == ((CardInfo)object0).N && bata.b(this.O, ((CardInfo)object0).O) && bata.b(this.Q, ((CardInfo)object0).Q) && bata.b(this.R, ((CardInfo)object0).R) && bata.b(this.S, ((CardInfo)object0).S) && bata.b(this.T, ((CardInfo)object0).T) && bata.b(this.U, ((CardInfo)object0).U) && this.V == ((CardInfo)object0).V && this.W == ((CardInfo)object0).W && this.X == ((CardInfo)object0).X && this.Y == ((CardInfo)object0).Y && Arrays.equals(this.Z, ((CardInfo)object0).Z);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, ((int)this.f), this.g, this.h, this.i, ((int)this.j), ((int)this.k), this.m, this.n, ((int)this.q), ((int)this.r), ((int)this.s), this.t, this.u, this.v, this.w, Boolean.valueOf(this.x), this.y, Boolean.valueOf(this.z), Boolean.valueOf(this.A), ((long)this.B), Boolean.valueOf(this.D), ((long)this.E), this.F, this.G, this.H, ((int)this.I), Boolean.valueOf(this.J), ((int)this.L), Boolean.valueOf(this.M), ((long)this.N), this.O, ((int)this.P), this.Q, this.R, this.S, this.T, this.U, ((long)this.V), ((int)this.W), ((int)this.X), ((int)this.Y), this.Z});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("billingCardId", this.a, arrayList0);
        basz.b("auxClientTokenId", this.b, arrayList0);
        String s = null;
        basz.b("serverToken", (this.c == null ? null : Arrays.toString(this.c)), arrayList0);
        basz.b("cardholderName", this.d, arrayList0);
        basz.b("displayName", this.e, arrayList0);
        basz.b("cardNetwork", Integer.valueOf(this.f), arrayList0);
        basz.b("tokenStatus", this.g, arrayList0);
        basz.b("panLastDigits", this.h, arrayList0);
        basz.b("cardImageUrl", this.i, arrayList0);
        basz.b("cardColor", Integer.valueOf(this.j), arrayList0);
        basz.b("overlayTextColor", Integer.valueOf(this.k), arrayList0);
        basz.b("issuerInfo", (this.l == null ? null : this.l.toString()), arrayList0);
        basz.b("tokenLastDigits", this.m, arrayList0);
        basz.b("transactionInfo", this.n, arrayList0);
        basz.b("issuerTokenId", this.o, arrayList0);
        basz.b("inAppCardToken", (this.p == null ? null : Arrays.toString(this.p)), arrayList0);
        basz.b("cachedEligibility", Integer.valueOf(this.q), arrayList0);
        basz.b("paymentProtocol", Integer.valueOf(this.r), arrayList0);
        basz.b("tokenType", Integer.valueOf(this.s), arrayList0);
        basz.b("inStoreCvmConfig", this.t, arrayList0);
        basz.b("inAppCvmConfig", this.u, arrayList0);
        basz.b("tokenDisplayName", this.v, arrayList0);
        basz.b("onlineAccountCardLinkInfos", (this.w == null ? null : Arrays.toString(this.w)), arrayList0);
        basz.b("allowAidSelection", Boolean.valueOf(this.x), arrayList0);
        basz.b("badges", "[" + TextUtils.join(", ", this.y) + "]", arrayList0);
        basz.b("upgradeAvailable", Boolean.valueOf(this.z), arrayList0);
        basz.b("requiresSignature", Boolean.valueOf(this.A), arrayList0);
        basz.b("googleTokenId", Long.valueOf(this.B), arrayList0);
        basz.b("isTransit", Boolean.valueOf(this.D), arrayList0);
        basz.b("googleWalletId", Long.valueOf(this.E), arrayList0);
        basz.b("devicePaymentMethodId", this.F, arrayList0);
        basz.b("cloudPaymentMethodId", this.G, arrayList0);
        basz.b("auxiliaryGoogleTokenId", Long.valueOf(this.N), arrayList0);
        basz.b("auxiliaryIssuerTokenId", this.O, arrayList0);
        basz.b("auxiliaryNetwork", Integer.valueOf(this.P), arrayList0);
        List list0 = this.Q;
        if(list0 != null) {
            s = list0.toString();
        }
        basz.b("cobadgedDefaultOrderOfPaymentNetwork", s, arrayList0);
        basz.b("seInfo", this.R, arrayList0);
        basz.b("rawPrevPanLastDigits", this.S, arrayList0);
        basz.b("prevPanDisplayName", this.T, arrayList0);
        basz.b("cardDisplayName", this.U, arrayList0);
        basz.b("BillingCustomerNumber", Long.valueOf(this.V), arrayList0);
        basz.b("applicationPriorityIndicatorOverride", Integer.valueOf(this.W), arrayList0);
        basz.b("auxiliaryApplicationPriorityIndicatorOverride", Integer.valueOf(this.X), arrayList0);
        basz.b("tokenizationMethod", Integer.valueOf(this.Y), arrayList0);
        basz.b("financialAccountDetailsBytes", this.Z, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.i(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.o(parcel0, 6, this.f);
        baub.t(parcel0, 7, this.g, v, false);
        baub.v(parcel0, 8, this.h, false);
        baub.t(parcel0, 9, this.i, v, false);
        baub.o(parcel0, 10, this.j);
        baub.o(parcel0, 11, this.k);
        baub.t(parcel0, 12, this.l, v, false);
        baub.v(parcel0, 13, this.m, false);
        baub.t(parcel0, 15, this.n, v, false);
        baub.v(parcel0, 16, this.o, false);
        baub.i(parcel0, 17, this.p, false);
        baub.o(parcel0, 18, this.q);
        baub.o(parcel0, 20, this.r);
        baub.o(parcel0, 21, this.s);
        baub.t(parcel0, 22, this.t, v, false);
        baub.t(parcel0, 23, this.u, v, false);
        baub.v(parcel0, 24, this.v, false);
        baub.J(parcel0, 25, this.w, v);
        baub.e(parcel0, 26, this.x);
        baub.y(parcel0, 27, this.y, false);
        baub.e(parcel0, 28, this.z);
        baub.e(parcel0, 29, this.A);
        baub.q(parcel0, 30, this.B);
        baub.q(parcel0, 0x1F, this.C);
        baub.e(parcel0, 0x20, this.D);
        baub.q(parcel0, 33, this.E);
        baub.v(parcel0, 34, this.F, false);
        baub.v(parcel0, 35, this.G, false);
        baub.t(parcel0, 36, this.H, v, false);
        baub.o(parcel0, 37, this.I);
        baub.e(parcel0, 38, this.J);
        baub.v(parcel0, 39, this.K, false);
        baub.o(parcel0, 40, this.L);
        baub.e(parcel0, 41, this.M);
        baub.q(parcel0, 42, this.N);
        baub.v(parcel0, 43, this.O, false);
        baub.o(parcel0, 44, this.P);
        baub.v(parcel0, 45, this.b, false);
        baub.E(parcel0, 0x2F, this.Q);
        baub.t(parcel0, 0x30, this.R, v, false);
        baub.v(parcel0, 49, this.S, false);
        baub.v(parcel0, 50, this.T, false);
        baub.v(parcel0, 51, this.U, false);
        baub.q(parcel0, 52, this.V);
        baub.o(parcel0, 53, this.W);
        baub.o(parcel0, 54, this.X);
        baub.o(parcel0, 55, this.Y);
        baub.i(parcel0, 56, this.Z, false);
        baub.c(parcel0, v1);
    }
}

