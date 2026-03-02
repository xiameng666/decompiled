package com.google.android.gms.awareness.snapshot.internal;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import aqdk;
import batl;
import baub;
import com.google.android.gms.awareness.state.BeaconState.TypeFilter;
import heso;
import hftc;
import hfur;
import java.util.Arrays;
import xti;

public class BeaconStateImpl.TypeFilterImpl extends BeaconState.TypeFilter {
    public static final Parcelable.Creator CREATOR;
    private final heso a;

    static {
        BeaconStateImpl.TypeFilterImpl.CREATOR = new aqdk();
    }

    public BeaconStateImpl.TypeFilterImpl(String s, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)heso.a).v_newBuilder();
        batl.q(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        heso heso0 = (heso)hftp0.b_message;
        s.getClass();
        heso0.b |= 1;
        heso0.c = s;
        batl.q(s1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        heso heso1 = (heso)hftp0.b_message;
        s1.getClass();
        heso1.b |= 2;
        heso1.d = s1;
        this.a = (heso)hftp0.N_build();
    }

    public BeaconStateImpl.TypeFilterImpl(byte[] arr_b) {
        heso heso0;
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)heso.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            heso0 = (heso)hftv0;
        }
        catch(hfur unused_ex) {
            xti.a("BeaconStateImpl", "Could not deserialize BeaconFence.BeaconTypeFilter");
            heso0 = null;
        }
        batl.s(heso0);
        this.a = heso0;
    }

    public final String a() {
        return this.a == null ? null : this.a.c;
    }

    public final String b() {
        return this.a == null ? null : this.a.d;
    }

    public final boolean c(String s, String s1, byte[] arr_b) {
        return TextUtils.equals(s, this.a()) && TextUtils.equals(s1, this.b()) && (this.d() == null || Arrays.equals(arr_b, this.d()));
    }

    public final byte[] d() {
        return this.a == null || this.a.e.size() == 0 ? null : this.a.e.toByteArray();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof BeaconStateImpl.TypeFilterImpl) ? TextUtils.equals(this.a(), ((BeaconStateImpl.TypeFilterImpl)object0).a()) && TextUtils.equals(this.b(), ((BeaconStateImpl.TypeFilterImpl)object0).b()) && Arrays.equals(this.d(), ((BeaconStateImpl.TypeFilterImpl)object0).d()) : false;
    }

    @Override
    public final int hashCode() {
        String s = this.a();
        String s1 = this.b();
        return this.d() == null ? Arrays.hashCode(new Object[]{s, s1, ((int)0)}) : Arrays.hashCode(new Object[]{s, s1, Arrays.hashCode(this.d())});
    }

    @Override
    public final String toString() {
        byte[] arr_b = this.d();
        String s = this.a();
        String s1 = this.b();
        return arr_b == null ? a.ak("null", s1, new StringBuilder(), s, "(", ",", ",", ")") : a.ak(new String(arr_b), s1, new StringBuilder(), s, "(", ",", ",", ")");
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 2, this.a.toBytesArray(), false);
        baub.c(parcel0, v1);
    }
}

