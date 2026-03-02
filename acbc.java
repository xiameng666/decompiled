import android.text.TextUtils;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;
import java.util.List;

public final class acbc {
    public final String a;
    private final cdsd b;
    private static final int c;
    private static final int d;

    static {
        bboh.b("AppInviteLogger", bbcu.aK);
        acbc.c = 2;
        acbc.d = 3;
    }

    public acbc(String s) {
        this.b = cdsd.v();
        this.a = s;
    }

    public static void a(List list0, int[] arr_v) {
        if(list0 != null) {
            arr_v[0] += list0.size();
            for(int v = 0; v < list0.size(); ++v) {
                ContactPerson.ContactMethod contactPerson$ContactMethod0 = ((ContactPerson)list0.get(v)).a();
                if(contactPerson$ContactMethod0 != null) {
                    int v1 = contactPerson$ContactMethod0.a;
                    if(v1 == 0) {
                        ++arr_v[1];
                    }
                    else {
                        switch(v1) {
                            case 1: {
                                ++arr_v[2];
                                break;
                            }
                            case 2: {
                                ++arr_v[3];
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b(boolean z, List list0, List list1, List list2, List list3, List list4, String s, String s1, int v, String s2) {
        int[] arr_v = new int[4];
        acbc.a(list0, arr_v);
        acbc.a(list1, arr_v);
        int v1 = arr_v[1];
        int v2 = arr_v[2];
        int v3 = arr_v[3];
        int v4 = 0;
        int v5 = list2 == null ? 0 : list2.size();
        int v6 = list3 == null ? 0 : list3.size();
        if(list4 != null) {
            v4 = list4.size();
        }
        ArrayList arrayList0 = new ArrayList();
        acbc.g(arrayList0, v1, v2, v3);
        ArrayList arrayList1 = new ArrayList();
        acbc.g(arrayList1, v5, v6, v4);
        int v7 = z ? acbc.c : acbc.d;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gije.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gije)hftv0).b |= 16;
        ((gije)hftv0).e = v;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gije gije0 = (gije)hftp0.b_message;
            gije0.b |= 4;
            gije0.c = s;
        }
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gije gije1 = (gije)hftp0.b_message;
            gije1.b |= 8;
            gije1.d = s1;
        }
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gije gije2 = (gije)hftp0.b_message;
            gije2.b |= 0x20;
            gije2.f = s2;
        }
        if(!arrayList0.isEmpty()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gije gije3 = (gije)hftp0.b_message;
            hfuo hfuo0 = gije3.g;
            if(!hfuo0.c()) {
                gije3.g = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList0, gije3.g);
        }
        if(!arrayList1.isEmpty()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gije gije4 = (gije)hftp0.b_message;
            hfuo hfuo1 = gije4.h;
            if(!hfuo1.c()) {
                gije4.h = ProtoLiteMessage.E(hfuo1);
            }
            hfrj.E(arrayList1, gije4.h);
        }
        gije gije5 = (gije)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gijd.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        if(v7 == 0) {
            throw null;
        }
        ((gijd)hftv1).c = v7 - 1;
        ((gijd)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gijd gijd0 = (gijd)hftp1.b_message;
        gije5.getClass();
        gijd0.d = gije5;
        gijd0.b |= 2;
        this.f(((gijd)hftp1.N_build()), 2, this.a);
    }

    public static giis c(String s, String s1, String s2, int v, String s3) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giis.a).v_newBuilder();
        int v1 = 1;
        if(!TextUtils.isEmpty(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giis giis0 = (giis)hftp0.b_message;
            s.getClass();
            giis0.b |= 1;
            giis0.c = s;
        }
        if(!TextUtils.isEmpty(s1)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giis giis1 = (giis)hftp0.b_message;
            s1.getClass();
            giis1.b |= 0x40;
            giis1.g = s1;
        }
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giis giis2 = (giis)hftp0.b_message;
            giis2.b |= 2;
            giis2.d = s2;
        }
        if(v != 0) {
            if(v - 1 == 1) {
                v1 = 4;
            }
            else {
                switch(v - 1) {
                    case 2: {
                        v1 = 3;
                        break;
                    }
                    case 3: 
                    case 4: {
                        v1 = 2;
                    }
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giis)hftp0.b_message).e = v1 - 1;
            ((giis)hftp0.b_message).b |= 4;
        }
        if(!TextUtils.isEmpty(s3)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giis giis3 = (giis)hftp0.b_message;
            s3.getClass();
            giis3.b |= 16;
            giis3.f = s3;
        }
        return (giis)hftp0.N_build();
    }

    public static int d(boolean z, boolean z1) {
        if(z1) {
            return 3;
        }
        return z ? 4 : 2;
    }

    public static gijg e(int v, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gijg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gijg)hftv0).c = v - 1;
        ((gijg)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gijg gijg0 = (gijg)hftp0.b_message;
        gijg0.b |= 2;
        gijg0.d = v1;
        return (gijg)hftp0.N_build();
    }

    public final void f(Object object0, int v, String s) {
        if(object0 == null) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giik.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giik)hftv0).d = v - 1;
        ((giik)hftv0).b |= 2;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            giik giik0 = (giik)hftp0.b_message;
            giik0.b |= 1;
            giik0.c = s;
        }
        switch(v - 1) {
            case 1: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giik giik2 = (giik)hftp0.b_message;
                giik2.e = (gijd)object0;
                giik2.b |= 4;
                break;
            }
            case 2: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giik giik3 = (giik)hftp0.b_message;
                giik3.f = (gijh)object0;
                giik3.b |= 8;
                break;
            }
            case 3: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giik giik4 = (giik)hftp0.b_message;
                giik4.g = (giit)object0;
                giik4.b |= 16;
                break;
            }
            case 4: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giik giik5 = (giik)hftp0.b_message;
                giik5.h = (giiq)object0;
                giik5.b |= 0x20;
                break;
            }
            case 5: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giik giik6 = (giik)hftp0.b_message;
                giik6.i = (giiy)object0;
                giik6.b |= 0x40;
                break;
            }
            case 6: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giik giik7 = (giik)hftp0.b_message;
                giik7.j = (gija)object0;
                giik7.b |= 0x80;
                break;
            }
            case 7: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giik giik8 = (giik)hftp0.b_message;
                giik8.k = (gijb)object0;
                giik8.b |= 0x100;
                break;
            }
            case 8: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giik giik9 = (giik)hftp0.b_message;
                giik9.l = (giig)object0;
                giik9.b |= 0x200;
                break;
            }
            case 9: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giik giik10 = (giik)hftp0.b_message;
                giik10.m = (giif)object0;
                giik10.b |= 0x400;
                break;
            }
            case 10: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giik giik11 = (giik)hftp0.b_message;
                giik11.n = (giii)object0;
                giik11.b |= 0x800;
                break;
            }
            default: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giik giik1 = (giik)hftp0.b_message;
                giik1.o = (giin)object0;
                giik1.b |= 0x1000;
            }
        }
        giik giik12 = (giik)hftp0.N_build();
        cczb cczb0 = this.b.c(((ProtoLiteMessage)giik12));
        cczb0.c = (int)(v - 1);
        cczb0.a();
    }

    private static void g(List list0, int v, int v1, int v2) {
        giim giim0 = giim.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giim0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giim)hftp0.b_message).c = 1;
        ((giim)hftp0.b_message).b |= 1;
        giim giim1 = (giim)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giim0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((giim)hftp1.b_message).c = 2;
        ((giim)hftp1.b_message).b |= 1;
        giim giim2 = (giim)hftp1.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giim0).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((giim)hftp2.b_message).c = 3;
        ((giim)hftp2.b_message).b |= 1;
        giim giim3 = (giim)hftp2.N_build();
        for(int v4 = 0; v4 < v; ++v4) {
            list0.add(giim1);
        }
        for(int v5 = 0; v5 < v1; ++v5) {
            list0.add(giim2);
        }
        for(int v3 = 0; v3 < v2; ++v3) {
            list0.add(giim3);
        }
    }
}

