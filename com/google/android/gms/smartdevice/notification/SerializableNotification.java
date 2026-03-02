package com.google.android.gms.smartdevice.notification;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import baun;
import equb;
import erqc;
import fqaw;
import juk;
import juo;
import org.json.JSONException;
import org.json.JSONObject;

public class SerializableNotification implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public long a;
    public long b;
    public long c;
    public CharSequence d;
    public Uri e;
    public CharSequence f;
    public CharSequence g;
    public boolean h;
    public int i;
    public CharSequence j;
    public boolean k;
    public boolean l;
    private static final baun m;

    static {
        SerializableNotification.CREATOR = new equb();
        SerializableNotification.m = new erqc(new String[]{"Notification", "SerializableNotification"});
    }

    public SerializableNotification() {
    }

    public SerializableNotification(Parcel parcel0) {
        this.a = parcel0.readLong();
        this.b = parcel0.readLong();
        this.c = parcel0.readLong();
        this.d = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel0);
        String s = parcel0.readString();
        this.e = s == null ? null : Uri.parse(s);
        this.f = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel0);
        this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel0);
        boolean z = true;
        this.h = parcel0.readInt() != 0;
        this.i = parcel0.readInt();
        this.j = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel0);
        this.k = parcel0.readInt() != 0;
        if(parcel0.readInt() == 0) {
            z = false;
        }
        this.l = z;
    }

    public final Notification a(Context context0) {
        juo juo0 = new juo(context0);
        CharSequence charSequence0 = this.d;
        if(charSequence0 != null) {
            juk juk0 = new juk();
            juk0.e(charSequence0);
            juo0.v(juk0);
        }
        Uri uri0 = this.e;
        if(uri0 != null) {
            Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
            intent0.setFlags(0x10000000);
            juo0.h = fqaw.c(context0, 0, intent0, 0xC000000);
        }
        juo0.k(this.f);
        juo0.D(this.g);
        juo0.K(this.h);
        juo0.s(this.i);
        juo0.S(this.j);
        juo0.h(this.k);
        juo0.y = this.l;
        return juo0.a();
    }

    public static SerializableNotification b(String s) {
        JSONObject jSONObject0;
        try {
            jSONObject0 = new JSONObject(s);
        }
        catch(JSONException jSONException0) {
            throw new IllegalArgumentException(jSONException0);
        }
        SerializableNotification serializableNotification0 = new SerializableNotification();
        serializableNotification0.a = jSONObject0.optLong("notify_time");
        serializableNotification0.b = jSONObject0.optLong("max_duration");
        serializableNotification0.c = jSONObject0.optLong("delay");
        serializableNotification0.d = jSONObject0.optString("big_text");
        serializableNotification0.e = Uri.parse(jSONObject0.optString("content_intent_view"));
        serializableNotification0.f = jSONObject0.optString("content_text");
        serializableNotification0.g = jSONObject0.optString("content_title");
        serializableNotification0.h = jSONObject0.optBoolean("key_ongoing");
        serializableNotification0.i = jSONObject0.optInt("small_icon");
        serializableNotification0.j = jSONObject0.optString("ticker");
        serializableNotification0.k = jSONObject0.optBoolean("auto_cancel");
        serializableNotification0.l = jSONObject0.optBoolean("local_only");
        return serializableNotification0;
    }

    public final String c() {
        JSONObject jSONObject0 = new JSONObject();
        SerializableNotification.d(jSONObject0, "notify_time", String.valueOf(this.a));
        SerializableNotification.d(jSONObject0, "max_duration", String.valueOf(this.b));
        SerializableNotification.d(jSONObject0, "delay", String.valueOf(this.c));
        String s = null;
        SerializableNotification.d(jSONObject0, "big_text", (this.d == null ? null : this.d.toString()));
        SerializableNotification.d(jSONObject0, "content_intent_view", (this.e == null ? null : this.e.toString()));
        SerializableNotification.d(jSONObject0, "content_text", (this.f == null ? null : this.f.toString()));
        SerializableNotification.d(jSONObject0, "content_title", (this.g == null ? null : this.g.toString()));
        SerializableNotification.d(jSONObject0, "key_ongoing", Boolean.valueOf(this.h));
        SerializableNotification.d(jSONObject0, "small_icon", Integer.valueOf(this.i));
        CharSequence charSequence0 = this.j;
        if(charSequence0 != null) {
            s = charSequence0.toString();
        }
        SerializableNotification.d(jSONObject0, "ticker", s);
        SerializableNotification.d(jSONObject0, "auto_cancel", Boolean.valueOf(this.k));
        SerializableNotification.d(jSONObject0, "local_only", Boolean.valueOf(this.l));
        return jSONObject0.toString();
    }

    private static void d(JSONObject jSONObject0, String s, Object object0) {
        try {
            jSONObject0.put(s, object0);
        }
        catch(JSONException jSONException0) {
            SerializableNotification.m.n("JSONException putting field into object!", jSONException0, new Object[0]);
        }
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.a);
        parcel0.writeLong(this.b);
        parcel0.writeLong(this.c);
        TextUtils.writeToParcel(this.d, parcel0, v);
        parcel0.writeString((this.e == null ? null : this.e.toString()));
        TextUtils.writeToParcel(this.f, parcel0, v);
        TextUtils.writeToParcel(this.g, parcel0, v);
        parcel0.writeInt(((int)this.h));
        parcel0.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel0, v);
        parcel0.writeInt(((int)this.k));
        parcel0.writeInt(((int)this.l));
    }
}

