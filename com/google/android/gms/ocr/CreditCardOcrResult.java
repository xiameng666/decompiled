package com.google.android.gms.ocr;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dkhm;
import dkhn;

public final class CreditCardOcrResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public int b;
    public int c;
    public int d;
    public String e;
    public String f;
    public boolean g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int[] l;
    public int[] m;
    public String[] n;
    public String[] o;
    public int p;
    public int q;

    static {
        CreditCardOcrResult.CREATOR = new dkhn();
    }

    private CreditCardOcrResult() {
    }

    public CreditCardOcrResult(String s, int v, int v1, int v2, String s1, String s2, boolean z, String s3, String s4, String s5, String s6, int[] arr_v, int[] arr_v1, String[] arr_s, String[] arr_s1, int v3, int v4) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = s1;
        this.f = s2;
        this.g = z;
        this.h = s3;
        this.i = s4;
        this.j = s5;
        this.k = s6;
        this.m = arr_v1;
        this.l = arr_v;
        this.n = arr_s;
        this.o = arr_s1;
        this.p = v3;
        this.q = v4;
    }

    public static dkhm a() {
        return new dkhm(new CreditCardOcrResult());
    }

    public static CreditCardOcrResult b(Intent intent0) {
        if(intent0 != null && intent0.hasExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT")) {
            intent0.setExtrasClassLoader(CreditCardOcrResult.class.getClassLoader());
            return (CreditCardOcrResult)intent0.getParcelableExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT");
        }
        return null;
    }

    public final boolean c() {
        return this.c >= 0 && this.b != 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.o(parcel0, 3, this.b);
        baub.o(parcel0, 4, this.c);
        baub.o(parcel0, 5, this.d);
        baub.v(parcel0, 6, this.e, false);
        baub.v(parcel0, 7, this.f, false);
        baub.e(parcel0, 8, this.g);
        baub.v(parcel0, 9, this.h, false);
        baub.v(parcel0, 10, this.i, false);
        baub.v(parcel0, 11, this.j, false);
        baub.v(parcel0, 12, this.k, false);
        baub.p(parcel0, 13, this.l, false);
        baub.p(parcel0, 14, this.m, false);
        baub.w(parcel0, 15, this.n, false);
        baub.w(parcel0, 16, this.o, false);
        baub.o(parcel0, 17, this.p);
        baub.o(parcel0, 18, this.q);
        baub.c(parcel0, v1);
    }
}

