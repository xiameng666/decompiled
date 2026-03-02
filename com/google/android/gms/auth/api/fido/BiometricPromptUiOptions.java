package com.google.android.gms.auth.api.fido;

import ahlr;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class BiometricPromptUiOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final Bitmap d;
    public final String e;

    static {
        BiometricPromptUiOptions.CREATOR = new ahlr();
    }

    public BiometricPromptUiOptions(String s, String s1, String s2, Bitmap bitmap0, String s3) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = bitmap0;
        this.e = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof BiometricPromptUiOptions) ? bata.b(this.a, ((BiometricPromptUiOptions)object0).a) && bata.b(this.b, ((BiometricPromptUiOptions)object0).b) && bata.b(this.c, ((BiometricPromptUiOptions)object0).c) && this.d.sameAs(((BiometricPromptUiOptions)object0).d) && bata.b(this.e, ((BiometricPromptUiOptions)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        Bitmap.Config bitmap$Config0 = this.d.getConfig();
        batl.s(bitmap$Config0);
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(this.d.getRowBytes() * this.d.getHeight());
        this.d.copyPixelsToBuffer(byteBuffer0);
        int v2 = this.d.getWidth();
        int v3 = this.d.getHeight();
        if(bitmap$Config0 == null) {
            throw new NullPointerException("Null config");
        }
        byte[] arr_b = byteBuffer0.array();
        if(arr_b == null) {
            throw new NullPointerException("Null pixels");
        }
        baub.t(parcel0, 5, new SerializableBitmap(v2, v3, bitmap$Config0, arr_b), v, false);
        baub.v(parcel0, 6, this.e, false);
        baub.c(parcel0, v1);
    }
}

