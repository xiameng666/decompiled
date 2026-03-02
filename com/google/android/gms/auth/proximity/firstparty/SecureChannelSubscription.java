package com.google.android.gms.auth.proximity.firstparty;

import algd;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bbmu;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class SecureChannelSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR;
    public final PendingIntent a;
    public final String b;
    public final int c;
    public final List d;
    public final String e;

    static {
        SecureChannelSubscription.CREATOR = new algd();
    }

    public SecureChannelSubscription(PendingIntent pendingIntent0, String s, int v, List list0, String s1) {
        batl.s(pendingIntent0);
        this.a = pendingIntent0;
        batl.s(s);
        this.b = s;
        batl.b(((boolean)(s.isEmpty() ^ 1)));
        batl.b(Role.f(v));
        this.c = v;
        batl.s(list0);
        this.d = list0;
        batl.b(((boolean)(list0.isEmpty() ^ 1)));
        batl.s(s1);
        this.e = s1;
        batl.b(((boolean)(s1.isEmpty() ^ 1)));
    }

    @Override  // com.google.android.gms.auth.proximity.firstparty.Subscription
    public final PendingIntent a() {
        return this.a;
    }

    @Override  // com.google.android.gms.auth.proximity.firstparty.Subscription
    public final String b() {
        return this.e;
    }

    public final List c() {
        List list0 = new ArrayList();
        for(Object object0: this.d) {
            String s = (String)object0;
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                String s1 = jSONObject0.getString("i");
                ArrayList arrayList0 = new ArrayList();
                byte[] arr_b = bbmu.e(s1);
                list0.add(new RemoteDevice(3, s1, jSONObject0.getString("n"), jSONObject0.getString("a"), arr_b, "", arrayList0, jSONObject0.getString("t"), null));
            }
            catch(JSONException unused_ex) {
            }
        }
        return list0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a.equals(((SecureChannelSubscription)object0).a) && this.b.equals(((SecureChannelSubscription)object0).b) && this.c == ((SecureChannelSubscription)object0).c && this.d.equals(((SecureChannelSubscription)object0).d) && this.e.equals(((SecureChannelSubscription)object0).e);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, ((int)this.c), this.d, this.e});
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "SecureChannelSubscription{mCallbackIntent=%s, mFeatureName=%s, mConnectionMode=%d, mSerializedDevices=%s, mPackageName=%s}", this.a, this.b, ((int)this.c), this.d, this.e);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.x(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}

