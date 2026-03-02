package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import dbvl;
import dbvm;
import dcnj;
import dcnk;
import java.util.Arrays;
import java.util.Locale;

public final class TextAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final long c;
    public final Bundle d;
    public final String e;
    public final long f;
    public final boolean g;

    static {
        TextAttachment.CREATOR = new dcnk();
    }

    public TextAttachment(String s, int v, long v1, Bundle bundle0, String s1, long v2, boolean z) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = bundle0;
        this.e = s1;
        this.f = v2;
        this.g = z;
    }

    @Override  // com.google.android.gms.nearby.sharing.Attachment
    public final int a() {
        return this.b;
    }

    @Override  // com.google.android.gms.nearby.sharing.Attachment
    public final long b() {
        return this.f;
    }

    @Override  // com.google.android.gms.nearby.sharing.Attachment
    public final long c() {
        return this.c;
    }

    @Override  // com.google.android.gms.nearby.sharing.Attachment
    public final Bundle d() {
        return this.d;
    }

    public final dcnj e() {
        dcnj dcnj0 = new dcnj(this.a);
        dcnj0.c = this.b;
        dcnj0.d = this.c;
        dcnj0.e = this.e;
        dcnj0.f = this.g;
        return dcnj0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof TextAttachment) && bata.b(this.a, ((TextAttachment)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((TextAttachment)object0).b)) && bata.b(Long.valueOf(this.c), Long.valueOf(((TextAttachment)object0).c)) && bata.b(this.e, ((TextAttachment)object0).e) && bata.b(Long.valueOf(this.f), Long.valueOf(((TextAttachment)object0).f)) && bata.b(Boolean.valueOf(this.g), Boolean.valueOf(((TextAttachment)object0).g));
    }

    @Override  // com.google.android.gms.nearby.sharing.Attachment
    public final dbvl f() {
        return this.e();
    }

    @Override  // com.google.android.gms.nearby.sharing.Attachment
    public final dbvm g() {
        return dbvm.c;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), ((long)this.c), this.e, ((long)this.f), Boolean.valueOf(this.g)});
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        Long long0 = (long)this.f;
        String s = this.a;
        int v = this.b;
        switch(v) {
            case 0: {
                return String.format(locale0, "TextAttachment<id: %s, textBody: %s, type: %s, size: %s, title: %s, isSensitiveText: %s>", long0, s, "TEXT", ((long)this.c), this.e, Boolean.valueOf(this.g));
            }
            case 1: {
                return String.format(locale0, "TextAttachment<id: %s, textBody: %s, type: %s, size: %s, title: %s, isSensitiveText: %s>", long0, s, "URL", ((long)this.c), this.e, Boolean.valueOf(this.g));
            }
            case 2: {
                return String.format(locale0, "TextAttachment<id: %s, textBody: %s, type: %s, size: %s, title: %s, isSensitiveText: %s>", long0, s, "ADDRESS", ((long)this.c), this.e, Boolean.valueOf(this.g));
            }
            case 3: {
                return String.format(locale0, "TextAttachment<id: %s, textBody: %s, type: %s, size: %s, title: %s, isSensitiveText: %s>", long0, s, "PHONE_NUMBER", ((long)this.c), this.e, Boolean.valueOf(this.g));
            }
            default: {
                return String.format(locale0, "TextAttachment<id: %s, textBody: %s, type: %s, size: %s, title: %s, isSensitiveText: %s>", long0, s, String.format(Locale.US, "[%d] UNKNOWN", v), ((long)this.c), this.e, Boolean.valueOf(this.g));
            }
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.q(parcel0, 3, this.c);
        baub.g(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.q(parcel0, 6, this.f);
        baub.e(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}

