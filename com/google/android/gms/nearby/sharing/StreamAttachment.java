package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import bata;
import baub;
import dbvl;
import dbvm;
import dcnh;
import dcni;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

public final class StreamAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final long b;
    public final Bundle c;
    public final Messenger d;
    public final String e;
    public final String f;
    private final ParcelFileDescriptor g;
    private final ParcelFileDescriptor h;

    static {
        StreamAttachment.CREATOR = new dcni();
    }

    public StreamAttachment(String s, long v, Bundle bundle0, ParcelFileDescriptor parcelFileDescriptor0, ParcelFileDescriptor parcelFileDescriptor1, Messenger messenger0, String s1, String s2) {
        this.a = s;
        this.b = v;
        this.c = bundle0;
        this.g = parcelFileDescriptor0;
        this.h = parcelFileDescriptor1;
        this.d = messenger0;
        this.e = s1;
        this.f = s2;
    }

    @Override  // com.google.android.gms.nearby.sharing.Attachment
    public final int a() {
        return 0;
    }

    @Override  // com.google.android.gms.nearby.sharing.Attachment
    public final long b() {
        return this.b;
    }

    @Override  // com.google.android.gms.nearby.sharing.Attachment
    public final long c() {
        return 0x100000L;
    }

    @Override  // com.google.android.gms.nearby.sharing.Attachment
    public final Bundle d() {
        return this.c;
    }

    public static ShareTarget e(ShareTarget shareTarget0) {
        if(shareTarget0.g().isEmpty()) {
            return shareTarget0;
        }
        StreamAttachment streamAttachment0 = (StreamAttachment)shareTarget0.g().get(0);
        ShareTarget shareTarget1 = shareTarget0.b().a();
        shareTarget1.p();
        dcnh dcnh0 = streamAttachment0.n();
        dcnh0.c = null;
        dcnh0.b = null;
        dcnh0.d = null;
        shareTarget1.m(dcnh0.a());
        return shareTarget1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof StreamAttachment) && bata.b(this.a, ((StreamAttachment)object0).a) && bata.b(this.e, ((StreamAttachment)object0).e) && bata.b(Long.valueOf(this.b), Long.valueOf(((StreamAttachment)object0).b));
    }

    @Override  // com.google.android.gms.nearby.sharing.Attachment
    public final dbvl f() {
        return this.n();
    }

    @Override  // com.google.android.gms.nearby.sharing.Attachment
    public final dbvm g() {
        return dbvm.f;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.e, ((long)this.b)});
    }

    public final dcnh n() {
        dcnh dcnh0 = new dcnh(this.a);
        dcnh0.b = this.g;
        dcnh0.c = this.h;
        dcnh0.d = this.d;
        dcnh0.e = this.e;
        dcnh0.f = this.f;
        dcnh0.a = this.b;
        return dcnh0;
    }

    public final void o() {
        StreamAttachment.q(this.h);
        StreamAttachment.p(this.d, 0);
        StreamAttachment.q(this.g);
        StreamAttachment.p(this.d, 2);
        StreamAttachment.p(this.d, 1);
        StreamAttachment.p(this.d, 3);
    }

    public static void p(Messenger messenger0, int v) {
        Message message0 = Message.obtain();
        try {
            message0.what = v;
            if(messenger0 != null) {
                messenger0.send(message0);
            }
        }
        catch(RemoteException unused_ex) {
        }
    }

    private static void q(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    private static final ParcelFileDescriptor r(ParcelFileDescriptor parcelFileDescriptor0) {
        return parcelFileDescriptor0 == null || !parcelFileDescriptor0.getFileDescriptor().valid() ? null : parcelFileDescriptor0;
    }

    @Override
    public final String toString() {
        Long long0 = (long)this.b;
        return this.d == null ? String.format(Locale.US, "StreamAttachment<description: %s, id: %s,extras: %s, localRead: %s, localWrite: %s, messengerBinder: %s, packageName: %s, attributedAppName: %s>", this.a, long0, this.c, this.g, this.h, null, this.e, this.f) : String.format(Locale.US, "StreamAttachment<description: %s, id: %s,extras: %s, localRead: %s, localWrite: %s, messengerBinder: %s, packageName: %s, attributedAppName: %s>", this.a, long0, this.c, this.g, this.h, this.d.getBinder(), this.e, this.f);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.q(parcel0, 2, this.b);
        baub.g(parcel0, 3, this.c, false);
        ParcelFileDescriptor parcelFileDescriptor0 = StreamAttachment.r(this.g);
        StreamAttachment.1 streamAttachment$10 = null;
        baub.t(parcel0, 4, (parcelFileDescriptor0 == null ? null : new StreamAttachment.2(this, parcelFileDescriptor0)), v, false);
        ParcelFileDescriptor parcelFileDescriptor1 = StreamAttachment.r(this.h);
        if(parcelFileDescriptor1 != null) {
            streamAttachment$10 = new StreamAttachment.1(this, parcelFileDescriptor1);
        }
        baub.t(parcel0, 5, streamAttachment$10, v, false);
        baub.t(parcel0, 6, this.d, v, false);
        baub.v(parcel0, 7, this.e, false);
        baub.v(parcel0, 8, this.f, false);
        baub.c(parcel0, v1);
    }
}

