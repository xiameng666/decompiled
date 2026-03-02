package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import basz;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import cpnq;
import cpnv;
import cpoh;
import java.util.ArrayList;

public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public CameraPosition b;
    public Float c;
    public Float d;
    public LatLngBounds e;
    public Integer f;
    public String g;
    public int h;
    private static final Integer i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;
    private Boolean r;
    private Boolean s;
    private Boolean t;
    private Boolean u;

    static {
        GoogleMapOptions.CREATOR = new cpnq();
        GoogleMapOptions.i = Color.argb(0xFF, 0xEC, 0xE9, 0xE1);
    }

    public GoogleMapOptions() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public GoogleMapOptions(byte b, byte b1, int v, CameraPosition cameraPosition0, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, Float float0, Float float1, LatLngBounds latLngBounds0, byte b11, Integer integer0, String s, int v1) {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = cpoh.b(b);
        this.k = cpoh.b(b1);
        this.a = v;
        this.b = cameraPosition0;
        this.l = cpoh.b(b2);
        this.m = cpoh.b(b3);
        this.n = cpoh.b(b4);
        this.o = cpoh.b(b5);
        this.p = cpoh.b(b6);
        this.q = cpoh.b(b7);
        this.r = cpoh.b(b8);
        this.s = cpoh.b(b9);
        this.t = cpoh.b(b10);
        this.c = float0;
        this.d = float1;
        this.e = latLngBounds0;
        this.u = cpoh.b(b11);
        this.f = integer0;
        this.g = s;
        this.h = v1;
    }

    public static GoogleMapOptions a(Context context0, AttributeSet attributeSet0) {
        LatLngBounds latLngBounds0 = null;
        if(context0 != null && attributeSet0 != null) {
            Resources resources0 = context0.getResources();
            int[] arr_v = cpnv.a;
            TypedArray typedArray0 = resources0.obtainAttributes(attributeSet0, arr_v);
            GoogleMapOptions googleMapOptions0 = new GoogleMapOptions();
            if(typedArray0.hasValue(16)) {
                googleMapOptions0.a = typedArray0.getInt(16, -1);
            }
            if(typedArray0.hasValue(26)) {
                googleMapOptions0.j = Boolean.valueOf(typedArray0.getBoolean(26, false));
            }
            if(typedArray0.hasValue(25)) {
                googleMapOptions0.k = Boolean.valueOf(typedArray0.getBoolean(25, false));
            }
            if(typedArray0.hasValue(17)) {
                googleMapOptions0.m = Boolean.valueOf(typedArray0.getBoolean(17, true));
            }
            if(typedArray0.hasValue(19)) {
                googleMapOptions0.q = Boolean.valueOf(typedArray0.getBoolean(19, true));
            }
            if(typedArray0.hasValue(21)) {
                googleMapOptions0.u = Boolean.valueOf(typedArray0.getBoolean(21, true));
            }
            if(typedArray0.hasValue(20)) {
                googleMapOptions0.n = Boolean.valueOf(typedArray0.getBoolean(20, true));
            }
            if(typedArray0.hasValue(22)) {
                googleMapOptions0.p = Boolean.valueOf(typedArray0.getBoolean(22, true));
            }
            if(typedArray0.hasValue(24)) {
                googleMapOptions0.o = Boolean.valueOf(typedArray0.getBoolean(24, true));
            }
            if(typedArray0.hasValue(23)) {
                googleMapOptions0.l = Boolean.valueOf(typedArray0.getBoolean(23, true));
            }
            if(typedArray0.hasValue(13)) {
                googleMapOptions0.r = Boolean.valueOf(typedArray0.getBoolean(13, false));
            }
            if(typedArray0.hasValue(18)) {
                googleMapOptions0.s = Boolean.valueOf(typedArray0.getBoolean(18, true));
            }
            if(typedArray0.hasValue(0)) {
                googleMapOptions0.t = Boolean.valueOf(typedArray0.getBoolean(0, false));
            }
            if(typedArray0.hasValue(4)) {
                googleMapOptions0.c = typedArray0.getFloat(4, -Infinityf);
            }
            if(typedArray0.hasValue(4)) {
                googleMapOptions0.d = typedArray0.getFloat(3, Infinityf);
            }
            if(typedArray0.hasValue(1)) {
                googleMapOptions0.f = typedArray0.getColor(1, GoogleMapOptions.i.intValue());
            }
            if(typedArray0.hasValue(15)) {
                String s = typedArray0.getString(15);
                if(s != null && !s.isEmpty()) {
                    googleMapOptions0.g = s;
                }
            }
            if(typedArray0.hasValue(14)) {
                googleMapOptions0.h = typedArray0.getInt(14, 0);
            }
            TypedArray typedArray1 = context0.getResources().obtainAttributes(attributeSet0, arr_v);
            float f = 0.0f;
            Float float0 = typedArray1.hasValue(11) ? typedArray1.getFloat(11, 0.0f) : null;
            Float float1 = typedArray1.hasValue(12) ? typedArray1.getFloat(12, 0.0f) : null;
            Float float2 = typedArray1.hasValue(9) ? typedArray1.getFloat(9, 0.0f) : null;
            Float float3 = typedArray1.hasValue(10) ? typedArray1.getFloat(10, 0.0f) : null;
            typedArray1.recycle();
            if(float0 != null && float1 != null && float2 != null && float3 != null) {
                latLngBounds0 = new LatLngBounds(new LatLng(((double)(((float)float0))), ((double)(((float)float1)))), new LatLng(((double)(((float)float2))), ((double)(((float)float3)))));
            }
            googleMapOptions0.e = latLngBounds0;
            TypedArray typedArray2 = context0.getResources().obtainAttributes(attributeSet0, arr_v);
            LatLng latLng0 = new LatLng(((double)(typedArray2.hasValue(5) ? typedArray2.getFloat(5, 0.0f) : 0.0f)), ((double)(typedArray2.hasValue(6) ? typedArray2.getFloat(6, 0.0f) : 0.0f)));
            float f1 = typedArray2.hasValue(8) ? typedArray2.getFloat(8, 0.0f) : 0.0f;
            float f2 = typedArray2.hasValue(2) ? typedArray2.getFloat(2, 0.0f) : 0.0f;
            if(typedArray2.hasValue(7)) {
                f = typedArray2.getFloat(7, 0.0f);
            }
            typedArray2.recycle();
            googleMapOptions0.b = new CameraPosition(latLng0, f1, f, f2);
            typedArray0.recycle();
            return googleMapOptions0;
        }
        return null;
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("MapType", Integer.valueOf(this.a), arrayList0);
        basz.b("LiteMode", this.r, arrayList0);
        basz.b("Camera", this.b, arrayList0);
        basz.b("CompassEnabled", this.m, arrayList0);
        basz.b("ZoomControlsEnabled", this.l, arrayList0);
        basz.b("ScrollGesturesEnabled", this.n, arrayList0);
        basz.b("ZoomGesturesEnabled", this.o, arrayList0);
        basz.b("TiltGesturesEnabled", this.p, arrayList0);
        basz.b("RotateGesturesEnabled", this.q, arrayList0);
        basz.b("ScrollGesturesEnabledDuringRotateOrZoom", this.u, arrayList0);
        basz.b("MapToolbarEnabled", this.s, arrayList0);
        basz.b("AmbientEnabled", this.t, arrayList0);
        basz.b("MinZoomPreference", this.c, arrayList0);
        basz.b("MaxZoomPreference", this.d, arrayList0);
        basz.b("BackgroundColor", this.f, arrayList0);
        basz.b("LatLngBoundsForCameraTarget", this.e, arrayList0);
        basz.b("ZOrderOnTop", this.j, arrayList0);
        basz.b("UseViewLifecycleInFragment", this.k, arrayList0);
        basz.b("mapColorScheme", Integer.valueOf(this.h), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.h(parcel0, 2, cpoh.a(this.j));
        baub.h(parcel0, 3, cpoh.a(this.k));
        baub.o(parcel0, 4, this.a);
        baub.t(parcel0, 5, this.b, v, false);
        baub.h(parcel0, 6, cpoh.a(this.l));
        baub.h(parcel0, 7, cpoh.a(this.m));
        baub.h(parcel0, 8, cpoh.a(this.n));
        baub.h(parcel0, 9, cpoh.a(this.o));
        baub.h(parcel0, 10, cpoh.a(this.p));
        baub.h(parcel0, 11, cpoh.a(this.q));
        baub.h(parcel0, 12, cpoh.a(this.r));
        baub.h(parcel0, 14, cpoh.a(this.s));
        baub.h(parcel0, 15, cpoh.a(this.t));
        baub.C(parcel0, 16, this.c);
        baub.C(parcel0, 17, this.d);
        baub.t(parcel0, 18, this.e, v, false);
        baub.h(parcel0, 19, cpoh.a(this.u));
        baub.F(parcel0, 20, this.f);
        baub.v(parcel0, 21, this.g, false);
        baub.o(parcel0, 23, this.h);
        baub.c(parcel0, v1);
    }
}

