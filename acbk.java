import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.model.SourcedContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class acbk {
    public final acbj a;
    public final Context b;
    private static acbk c;

    private acbk(Context context0) {
        Context context1 = context0.getApplicationContext();
        this.b = context1;
        String s = houq.f();
        String s1 = houq.e();
        houq.g();
        this.a = new acbj(context1, new acbf(new bbeo(context1, s, s1, houq.c(), houq.d())));
    }

    public static acbk a(Context context0) {
        synchronized(acbk.class) {
            if(acbk.c == null) {
                acbk.c = new acbk(context0);
            }
        }
        return acbk.c;
    }

    public final hijm b(baqr baqr0, String s, String s1, String s2, String s3, String s4, Map map0, String s5, String s6, List list0, String s7, String s8, String s9, String s10, byte[] arr_b, int v, int v1, String s11, String s12, int v2, String s13) {
        gdjx gdjx0;
        acbj acbj0 = this.a;
        hijg hijg0 = acbj0.a(baqr0.d);
        if(hijg0 == null) {
            ((ggtj)acbj.a.i()).x("Error creating ClientIdInfo");
            return null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hijl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hijl)hftp0.b_message).f = hijg0;
        ((hijl)hftp0.b_message).b |= 4;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hiki.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hiki)hftp1.b_message).c = 1;
        ((hiki)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hijl hijl0 = (hijl)hftp0.b_message;
        hiki hiki0 = (hiki)hftp1.N_build();
        hiki0.getClass();
        hijl0.c = hiki0;
        hijl0.b |= 1;
        hikv hikv0 = acbj0.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hijl hijl1 = (hijl)hftp0.b_message;
        hikv0.getClass();
        hijl1.n = hikv0;
        hijl1.b |= 0x200;
        ArrayList arrayList0 = new ArrayList();
        if(!TextUtils.isEmpty(s8)) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hijg.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            s8.getClass();
            ((hijg)hftv0).b |= 2;
            ((hijg)hftv0).d = s8;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hijg)hftp2.b_message).c = 2;
            ((hijg)hftp2.b_message).b |= 1;
            arrayList0.add(((hijg)hftp2.N_build()));
        }
        if(!TextUtils.isEmpty(s9)) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hijg.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp3.b_message;
            s9.getClass();
            ((hijg)hftv1).b |= 2;
            ((hijg)hftv1).d = s9;
            if(!hftv1.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((hijg)hftp3.b_message).c = 1;
            ((hijg)hftp3.b_message).b |= 1;
            arrayList0.add(((hijg)hftp3.N_build()));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hijl hijl2 = (hijl)hftp0.b_message;
        hfuo hfuo0 = hijl2.g;
        if(!hfuo0.c()) {
            hijl2.g = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(arrayList0, hijl2.g);
        ArrayList arrayList1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            ContactPerson contactPerson0 = ((SourcedContactPerson)object0).a;
            int v3 = hiks.a(((SourcedContactPerson)object0).b);
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hiko.a).v_newBuilder();
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hikq.a).v_newBuilder();
            if(contactPerson0.a().a == 0) {
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp5.b_message;
                ((hikq)hftv2).c = 1;
                ((hikq)hftv2).b |= 1;
                String s14 = contactPerson0.b;
                if(!hftv2.isImmutable()) {
                    hftp5.ensureMutable();
                }
                hikq hikq0 = (hikq)hftp5.b_message;
                s14.getClass();
                hikq0.b |= 2;
                hikq0.d = s14;
            }
            else {
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ((hikq)hftp5.b_message).c = 0;
                ((hikq)hftp5.b_message).b |= 1;
            }
            hikq hikq1 = (hikq)hftp5.N_build();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            hiko hiko0 = (hiko)hftp4.b_message;
            hikq1.getClass();
            hiko0.c = hikq1;
            hiko0.b |= 1;
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hijp.a).v_newBuilder();
            if(contactPerson0.a().a == 0) {
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp6.b_message;
                ((hijp)hftv3).c = 1;
                ((hijp)hftv3).b |= 1;
                String s15 = contactPerson0.b;
                if(!hftv3.isImmutable()) {
                    hftp6.ensureMutable();
                }
                hijp hijp0 = (hijp)hftp6.b_message;
                s15.getClass();
                hijp0.b |= 2;
                hijp0.d = s15;
            }
            else {
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ((hijp)hftp6.b_message).c = 0;
                ((hijp)hftp6.b_message).b |= 1;
            }
            hijp hijp1 = (hijp)hftp6.N_build();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            hiko hiko1 = (hiko)hftp4.b_message;
            hijp1.getClass();
            hiko1.d = hijp1;
            hiko1.b |= 2;
            ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hikt.a).v_newBuilder();
            if(v3 == 0) {
                v3 = 1;
            }
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            ((hikt)hftp7.b_message).c = v3 - 1;
            ((hikt)hftp7.b_message).b |= 1;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            hiko hiko2 = (hiko)hftp4.b_message;
            hikt hikt0 = (hikt)hftp7.N_build();
            hikt0.getClass();
            hiko2.e = hikt0;
            hiko2.b |= 8;
            arrayList1.add(((hiko)hftp4.N_build()));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hijl hijl3 = (hijl)hftp0.b_message;
        hfuo hfuo1 = hijl3.d;
        if(!hfuo1.c()) {
            hijl3.d = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(arrayList1, hijl3.d);
        if(v2 != 0) {
            ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)hikd.a).v_newBuilder();
            if(!hftp8.b_message.isImmutable()) {
                hftp8.ensureMutable();
            }
            hikd hikd0 = (hikd)hftp8.b_message;
            hikd0.b |= 1;
            hikd0.c = v2;
            hikd hikd1 = (hikd)hftp8.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hijl hijl4 = (hijl)hftp0.b_message;
            hikd1.getClass();
            hijl4.m = hikd1;
            hijl4.b |= 0x100;
        }
        ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)hikf.a).v_newBuilder();
        if(!TextUtils.isEmpty(s1)) {
            if(!hftp9.b_message.isImmutable()) {
                hftp9.ensureMutable();
            }
            hikf hikf0 = (hikf)hftp9.b_message;
            s1.getClass();
            hikf0.b |= 8;
            hikf0.e = s1;
        }
        if(!TextUtils.isEmpty(s2)) {
            if(!hftp9.b_message.isImmutable()) {
                hftp9.ensureMutable();
            }
            hikf hikf1 = (hikf)hftp9.b_message;
            s2.getClass();
            hikf1.b |= 1;
            hikf1.c = s2;
        }
        if(!TextUtils.isEmpty(s3)) {
            if(!hftp9.b_message.isImmutable()) {
                hftp9.ensureMutable();
            }
            hikf hikf2 = (hikf)hftp9.b_message;
            s3.getClass();
            hikf2.b |= 2;
            hikf2.d = s3;
        }
        ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)hikj.a).v_newBuilder();
        if(!hftp10.b_message.isImmutable()) {
            hftp10.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp10.b_message;
        s.getClass();
        ((hikj)hftv4).b |= 1;
        ((hikj)hftv4).c = s;
        if(!hftv4.isImmutable()) {
            hftp10.ensureMutable();
        }
        hikj hikj0 = (hikj)hftp10.b_message;
        hikf hikf3 = (hikf)hftp9.N_build();
        hikf3.getClass();
        hikj0.d = hikf3;
        hikj0.b |= 2;
        hikj hikj1 = (hikj)hftp10.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hijl hijl5 = (hijl)hftp0.b_message;
        hikj1.getClass();
        hijl5.e = hikj1;
        hijl5.b |= 2;
        if(!TextUtils.isEmpty(s6)) {
            ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)hikn.a).v_newBuilder();
            if(!hftp11.b_message.isImmutable()) {
                hftp11.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp11.b_message;
            s6.getClass();
            ((hikn)hftv5).b |= 1;
            ((hikn)hftv5).c = s6;
            if(s5 != null) {
                if(!hftv5.isImmutable()) {
                    hftp11.ensureMutable();
                }
                hikn hikn0 = (hikn)hftp11.b_message;
                hikn0.b |= 2;
                hikn0.d = s5;
            }
            hikn hikn1 = (hikn)hftp11.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hijl hijl6 = (hijl)hftp0.b_message;
            hikn1.getClass();
            hijl6.h = hikn1;
            hijl6.b |= 8;
        }
        if(!TextUtils.isEmpty(s4) || map0 != null) {
            ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)hikk.a).v_newBuilder();
            if(!TextUtils.isEmpty(s4)) {
                if(!hftp12.b_message.isImmutable()) {
                    hftp12.ensureMutable();
                }
                hikk hikk0 = (hikk)hftp12.b_message;
                s4.getClass();
                hikk0.b |= 1;
                hikk0.c = s4;
            }
            if(map0 != null) {
                for(Object object1: map0.entrySet()) {
                    ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)hiku.a).v_newBuilder();
                    String s16 = (String)((Map.Entry)object1).getKey();
                    if(!hftp13.b_message.isImmutable()) {
                        hftp13.ensureMutable();
                    }
                    hiku hiku0 = (hiku)hftp13.b_message;
                    s16.getClass();
                    hiku0.b |= 1;
                    hiku0.c = s16;
                    String s17 = (String)((Map.Entry)object1).getValue();
                    if(!hftp13.b_message.isImmutable()) {
                        hftp13.ensureMutable();
                    }
                    hiku hiku1 = (hiku)hftp13.b_message;
                    s17.getClass();
                    hiku1.b |= 2;
                    hiku1.d = s17;
                    hiku hiku2 = (hiku)hftp13.N_build();
                    if(!hftp12.b_message.isImmutable()) {
                        hftp12.ensureMutable();
                    }
                    hikk hikk1 = (hikk)hftp12.b_message;
                    hiku2.getClass();
                    hfuo hfuo2 = hikk1.d;
                    if(!hfuo2.c()) {
                        hikk1.d = ProtoLiteMessage.E(hfuo2);
                    }
                    hikk1.d.add(hiku2);
                }
            }
            hikk hikk2 = (hikk)hftp12.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hijl hijl7 = (hijl)hftp0.b_message;
            hikk2.getClass();
            hijl7.i = hikk2;
            hijl7.b |= 16;
        }
        if(!TextUtils.isEmpty(s7)) {
            ProtoLiteBuilder hftp14 = ((ProtoLiteMessage)hijt.a).v_newBuilder();
            ProtoLiteBuilder hftp15 = ((ProtoLiteMessage)hijx.a).v_newBuilder();
            if(!hftp15.b_message.isImmutable()) {
                hftp15.ensureMutable();
            }
            hijx hijx0 = (hijx)hftp15.b_message;
            s7.getClass();
            hijx0.b |= 1;
            hijx0.c = s7;
            hijx hijx1 = (hijx)hftp15.N_build();
            ProtoLiteBuilder hftp16 = ((ProtoLiteMessage)hikb.a).v_newBuilder();
            if(!hftp14.b_message.isImmutable()) {
                hftp14.ensureMutable();
            }
            hijt hijt0 = (hijt)hftp14.b_message;
            hijx1.getClass();
            hijt0.c = hijx1;
            hijt0.b |= 1;
            if(!hftp16.b_message.isImmutable()) {
                hftp16.ensureMutable();
            }
            hikb hikb0 = (hikb)hftp16.b_message;
            hijt hijt1 = (hijt)hftp14.N_build();
            hijt1.getClass();
            hikb0.c = hijt1;
            hikb0.b |= 1;
            hikb hikb1 = (hikb)hftp16.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hijl hijl8 = (hijl)hftp0.b_message;
            hikb1.getClass();
            hijl8.k = hikb1;
            hijl8.b |= 0x40;
        }
        if(!TextUtils.isEmpty(s10)) {
            ProtoLiteBuilder hftp17 = ((ProtoLiteMessage)hijz.a).v_newBuilder();
            if(!hftp17.b_message.isImmutable()) {
                hftp17.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp17.b_message;
            s10.getClass();
            ((hijz)hftv6).b |= 2;
            ((hijz)hftv6).d = s10;
            if(!hftv6.isImmutable()) {
                hftp17.ensureMutable();
            }
            ((hijz)hftp17.b_message).c = 1;
            ((hijz)hftp17.b_message).b |= 1;
            hijz hijz0 = (hijz)hftp17.N_build();
            ProtoLiteBuilder hftp18 = ((ProtoLiteMessage)hike.a).v_newBuilder();
            if(!hftp18.b_message.isImmutable()) {
                hftp18.ensureMutable();
            }
            hike hike0 = (hike)hftp18.b_message;
            hijz0.getClass();
            hike0.d = hijz0;
            hike0.b |= 2;
            hike hike1 = (hike)hftp18.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hijl hijl9 = (hijl)hftp0.b_message;
            hike1.getClass();
            hijl9.l = hike1;
            hijl9.b |= 0x80;
        }
        else if(arr_b != null) {
            ProtoLiteBuilder hftp19 = ((ProtoLiteMessage)hijz.a).v_newBuilder();
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp19.b_message.isImmutable()) {
                hftp19.ensureMutable();
            }
            ProtoLiteMessage hftv7 = hftp19.b_message;
            ((hijz)hftv7).b |= 4;
            ((hijz)hftv7).e = hfsf0;
            if(!hftv7.isImmutable()) {
                hftp19.ensureMutable();
            }
            ProtoLiteMessage hftv8 = hftp19.b_message;
            ((hijz)hftv8).b |= 16;
            ((hijz)hftv8).f = v;
            if(!hftv8.isImmutable()) {
                hftp19.ensureMutable();
            }
            ProtoLiteMessage hftv9 = hftp19.b_message;
            ((hijz)hftv9).b |= 0x20;
            ((hijz)hftv9).g = v1;
            if(!hftv9.isImmutable()) {
                hftp19.ensureMutable();
            }
            ((hijz)hftp19.b_message).c = 2;
            ((hijz)hftp19.b_message).b |= 1;
            hijz hijz1 = (hijz)hftp19.N_build();
            ProtoLiteBuilder hftp20 = ((ProtoLiteMessage)hike.a).v_newBuilder();
            if(!hftp20.b_message.isImmutable()) {
                hftp20.ensureMutable();
            }
            hike hike2 = (hike)hftp20.b_message;
            hijz1.getClass();
            hike2.d = hijz1;
            hike2.b |= 2;
            hike hike3 = (hike)hftp20.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hijl hijl10 = (hijl)hftp0.b_message;
            hike3.getClass();
            hijl10.l = hike3;
            hijl10.b |= 0x80;
        }
        if(!TextUtils.isEmpty(s11) || !TextUtils.isEmpty(s12)) {
            if((((hijl)hftp0.b_message).b & 0x80) == 0) {
                hike hike4 = hike.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hijl hijl11 = (hijl)hftp0.b_message;
                hike4.getClass();
                hijl11.l = hike4;
                hijl11.b |= 0x80;
            }
            if(!TextUtils.isEmpty(s11)) {
                hike hike5 = ((hijl)hftp0.b_message).l;
                if(hike5 == null) {
                    hike5 = hike.a;
                }
                ProtoLiteBuilder hftp21 = (ProtoLiteBuilder)((ProtoLiteMessage)hike5).jf(5, null);
                hftp21.X(((ProtoLiteMessage)hike5));
                if(!hftp21.b_message.isImmutable()) {
                    hftp21.ensureMutable();
                }
                hike hike6 = (hike)hftp21.b_message;
                s11.getClass();
                hike6.b |= 1;
                hike6.c = s11;
                hike hike7 = (hike)hftp21.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hijl hijl12 = (hijl)hftp0.b_message;
                hike7.getClass();
                hijl12.l = hike7;
                hijl12.b |= 0x80;
            }
            if(!TextUtils.isEmpty(s12)) {
                hike hike8 = ((hijl)hftp0.b_message).l;
                if(hike8 == null) {
                    hike8 = hike.a;
                }
                ProtoLiteBuilder hftp22 = (ProtoLiteBuilder)((ProtoLiteMessage)hike8).jf(5, null);
                hftp22.X(((ProtoLiteMessage)hike8));
                if(!hftp22.b_message.isImmutable()) {
                    hftp22.ensureMutable();
                }
                hike hike9 = (hike)hftp22.b_message;
                s12.getClass();
                hike9.b |= 4;
                hike9.e = s12;
                hike hike10 = (hike)hftp22.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hijl hijl13 = (hijl)hftp0.b_message;
                hike10.getClass();
                hijl13.l = hike10;
                hijl13.b |= 0x80;
            }
        }
        if(!TextUtils.isEmpty(s13)) {
            ProtoLiteBuilder hftp23 = ((ProtoLiteMessage)hikw.a).v_newBuilder();
            if(!hftp23.b_message.isImmutable()) {
                hftp23.ensureMutable();
            }
            hikw hikw0 = (hikw)hftp23.b_message;
            s13.getClass();
            hikw0.b |= 1;
            hikw0.c = s13;
            hikw hikw1 = (hikw)hftp23.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hijl hijl14 = (hijl)hftp0.b_message;
            hikw1.getClass();
            hijl14.j = hikw1;
            hijl14.b |= 0x20;
        }
        hijl hijl15 = (hijl)hftp0.N_build();
        acbi acbi0 = new acbi(acbj0.b, baqr0, hijl.o, ((MessageLite)hijl15));
        acbf acbf0 = acbi0.a;
        baqr baqr1 = acbi0.b;
        gdjy gdjy0 = acbi0.c;
        if(hour.e()) {
            throw new acbd(null);
        }
        try {
            byte[] arr_b1 = gdjy0.toBytesArray();
            gdjx0 = (gdjx)acbf0.a.h(baqr1, 1, "/mutateonekey?alt=proto", arr_b1, gdjx.a);
        }
        catch(acse | VolleyError exception0) {
            throw new acbd(exception0);
        }
        acbi0.d = gdjx0;
        hijm hijm0 = (hijm)acbi0.b(hijm.d);
        if(!acbi0.e()) {
            return hijm0;
        }
        ((ggtj)acbj.a.i()).H("Create invitations failed due to error code: %d\n%s", acbi0.a(), acbi0.c());
        throw new acax(acbi0.c(), acbi0.a());
    }

    public final ArrayList c(baqr baqr0) {
        MessageLite hfvm0;
        String s;
        hfuo hfuo1;
        int v2;
        gdjq gdjq0;
        acbj acbj0 = this.a;
        hijg hijg0 = acbj0.a(baqr0.d);
        if(hijg0 == null) {
            return null;
        }
        acbf acbf0 = acbj0.b;
        ArrayList arrayList0 = new ArrayList();
        hfta hfta0 = hijr.e;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hijr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hijr)hftp0.b_message).c = hijg0;
        ((hijr)hftp0.b_message).b |= 1;
        hikv hikv0 = acbj0.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hijr hijr0 = (hijr)hftp0.b_message;
        hikv0.getClass();
        hijr0.d = hikv0;
        hijr0.b |= 2;
        hijr hijr1 = (hijr)hftp0.N_build();
        int v = arrayList0.size();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gdjr.a).v_newBuilder();
        int v1 = hfta0.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gdjr)hftv0).b |= 1;
        ((gdjr)hftv0).c = v1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gdjr gdjr0 = (gdjr)hftp1.b_message;
        gdjr0.b |= 4;
        gdjr0.e = v;
        hftr hftr0 = (hftr)((ProtoLiteMessage)gdjs.a).v_newBuilder();
        hftr0.n(hfta0, hijr1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gdjr gdjr1 = (gdjr)hftp1.b_message;
        gdjs gdjs0 = (gdjs)((ProtoLiteBuilder)hftr0).N_build();
        gdjs0.getClass();
        gdjr1.d = gdjs0;
        gdjr1.b |= 2;
        arrayList0.add(((gdjr)hftp1.N_build()));
        try {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gdjp.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gdjp gdjp0 = (gdjp)hftp2.b_message;
            hfuo hfuo0 = gdjp0.b;
            if(!hfuo0.c()) {
                gdjp0.b = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList0, gdjp0.b);
            gdjp gdjp1 = (gdjp)hftp2.N_build();
            if(hour.e()) {
                throw new acbd(null);
            }
            try {
                byte[] arr_b = gdjp1.toBytesArray();
                gdjq0 = (gdjq)acbf0.a.h(baqr0, 1, "/fetch?alt=proto", arr_b, gdjq.a);
            }
            catch(acse | VolleyError exception0) {
                throw new acbd(exception0);
            }
            v2 = 0;
            hfuo1 = gdjq0.b;
        }
        catch(acbd acbd0) {
            acbd0.a();
            return null;
        }
        if(acbe.b(hfuo1)) {
            ggtj ggtj0 = (ggtj)acbj.a.i();
            int v3 = acbe.a(hfuo1);
            if(acbe.b(hfuo1)) {
                hebz hebz0 = ((gdju)hfuo1.get(v3)).d;
                if(hebz0 == null) {
                    hebz0 = hebz.a;
                }
                v2 = hebz0.c;
            }
            int v4 = acbe.a(hfuo1);
            if(acbe.b(hfuo1)) {
                hebz hebz1 = ((gdju)hfuo1.get(v4)).d;
                if(hebz1 == null) {
                    hebz1 = hebz.a;
                }
                s = hebz1.d;
            }
            else {
                s = "";
            }
            ggtj0.H("Get suggested invitees failed due to error code: %d\n%s", v2, s);
            return null;
        }
        hfta hfta1 = hijs.c;
        int v5 = acbe.a(hfuo1);
        if(v5 >= 0 && (((gdju)hfuo1.get(v5)).b & 1) != 0) {
            gdjt gdjt0 = ((gdju)hfuo1.get(v5)).c;
            if(gdjt0 == null) {
                gdjt0 = gdjt.a;
            }
            gdjt0.f(hfta1);
            Object object0 = gdjt0.s.k(hfta1.d);
            hfvm0 = (MessageLite)(object0 == null ? hfta1.b : hfta1.d(object0));
        }
        else {
            hfvm0 = null;
        }
        if(((hijs)hfvm0) == null) {
            return null;
        }
        hfuo hfuo2 = ((hijs)hfvm0).b;
        if(hfuo2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList1 = new ArrayList(hfuo2.size());
        for(Object object1: hfuo2) {
            hikx hikx0 = (hikx)object1;
            hfuo hfuo3 = hikx0.e;
            ArrayList arrayList2 = new ArrayList(hfuo3.size());
            for(Object object2: hfuo3) {
                arrayList2.add(((hijo.a(((hijp)object2).c) == 0 ? 1 : hijo.a(((hijp)object2).c)) - 1 == 1 ? new ContactPerson.ContactMethod(0, ((hijp)object2).d) : null));
            }
            AvatarReference avatarReference0 = hikx0.d.isEmpty() ? null : new AvatarReference(hikx0.d);
            arrayList1.add(new ContactPerson(hikx0.c, (hikx0.b == null ? hikq.a : hikx0.b).d, avatarReference0, arrayList2));
        }
        return arrayList1;
    }
}

