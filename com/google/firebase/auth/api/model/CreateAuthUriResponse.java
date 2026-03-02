package com.google.firebase.auth.api.model;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbqr;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gdhh;
import goxb;
import goxq;
import java.util.ArrayList;
import java.util.List;

public class CreateAuthUriResponse extends AbstractSafeParcelable implements goxb {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public boolean b;
    public String c;
    public boolean d;
    public StringList e;
    public List f;

    static {
        CreateAuthUriResponse.CREATOR = new goxq();
    }

    public CreateAuthUriResponse() {
        this.e = new StringList(null);
    }

    public CreateAuthUriResponse(String s, boolean z, String s1, boolean z1, StringList stringList0, List list0) {
        this.a = s;
        this.b = z;
        this.c = s1;
        this.d = z1;
        this.e = stringList0 == null ? new StringList(null) : new StringList(stringList0.a);
        this.f = list0;
    }

    @Override  // goxb
    public final Parser a() {
        return (Parser)((ProtoLiteMessage)gdhh.a).jf(7, null);
    }

    @Override  // goxb
    public final void b(MessageLite hfvm0) {
        if(!(hfvm0 instanceof gdhh)) {
            throw new IllegalArgumentException("The passed proto must be an instance of CreateAuthUriResponse.");
        }
        this.a = bbqr.b(((gdhh)hfvm0).b);
        this.b = ((gdhh)hfvm0).d;
        this.c = bbqr.b(((gdhh)hfvm0).e);
        this.d = ((gdhh)hfvm0).f;
        this.e = ((gdhh)hfvm0).c.size() == 0 ? new StringList(null) : new StringList(new ArrayList(((gdhh)hfvm0).c), null);
        ArrayList arrayList0 = ((gdhh)hfvm0).g.size() == 0 ? new ArrayList(0) : ((gdhh)hfvm0).g;
        this.f = arrayList0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.e(parcel0, 3, this.b);
        baub.v(parcel0, 4, this.c, false);
        baub.e(parcel0, 5, this.d);
        baub.t(parcel0, 6, this.e, v, false);
        baub.x(parcel0, 7, this.f, false);
        baub.c(parcel0, v1);
    }
}

