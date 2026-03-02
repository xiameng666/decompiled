package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dkht;
import dkhu;

public class RecognitionScreen extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;

    static {
        RecognitionScreen.CREATOR = new dkhu();
    }

    private RecognitionScreen() {
        this.g = "";
    }

    public RecognitionScreen(String s, String s1, int v, String s2, String s3, String s4, String s5, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = s5;
        this.h = z;
    }

    public static dkht a() {
        return new dkht(new RecognitionScreen());
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.o(parcel0, 4, this.c);
        baub.v(parcel0, 5, this.d, false);
        baub.v(parcel0, 6, this.e, false);
        baub.v(parcel0, 7, this.f, false);
        baub.v(parcel0, 8, this.g, false);
        baub.e(parcel0, 9, this.h);
        baub.c(parcel0, v1);
    }
}

