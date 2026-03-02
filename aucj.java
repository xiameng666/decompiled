import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class aucj {
    final Map a;
    int b;
    boolean c;
    gehk d;
    public aucc e;
    private final String f;
    private final int g;
    private final int h;
    private int i;
    private final List j;

    public aucj(gehk gehk0, String s, int v, int v1) {
        this.f(gehk0);
        this.f = s;
        this.g = v;
        this.h = v1;
        this.i = 0;
        this.j = new ArrayList();
        this.a = new HashMap();
    }

    public static int a(Object object0) {
        if((object0 instanceof String)) {
            return ((String)object0).length();
        }
        return (object0 instanceof byte[]) ? ((byte[])object0).length : 0;
    }

    public final auch b() {
        boolean z;
        List list0 = null;
        synchronized(this) {
            if(this.i()) {
                String s = null;
                do {
                    List list1 = this.j;
                    String s1 = (String)list1.get(this.i);
                    List list2 = (List)this.a.get(s1);
                    if(list2 != null && !list2.isEmpty()) {
                        s = s1;
                        list0 = list2;
                    }
                    z = true;
                    int v1 = this.i + 1;
                    this.i = v1;
                    if(v1 == list1.size()) {
                        this.i = 0;
                    }
                }
                while(list0 == null);
                auci auci0 = (auci)list0.get(0);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gehl.a).v_newBuilder();
                gftb.check(s);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gehl)hftv0).b |= 8;
                ((gehl)hftv0).f = s;
                boolean z1 = auci0.d;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gehl)hftv1).g = (z1 ? 2 : 1) - 1;
                ((gehl)hftv1).b |= 16;
                gehk gehk0 = this.d;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((gehl)hftv2).c = gehk0.f;
                ((gehl)hftv2).b |= 1;
                String s2 = this.f;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp0.b_message;
                s2.getClass();
                ((gehl)hftv3).b |= 2;
                ((gehl)hftv3).d = s2;
                String s3 = auci0.b;
                if(!hftv3.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp0.b_message;
                s3.getClass();
                ((gehl)hftv4).b |= 4;
                ((gehl)hftv4).e = s3;
                if(auci0.e) {
                    int v2 = auci0.a.size() - auci0.c;
                    int v3 = Math.min(this.g, v2);
                    int v4 = v2 - v3;
                    ByteString hfsf0 = auci0.a.j(auci0.c, auci0.c + v3);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp0.b_message;
                    hfsf0.getClass();
                    ((gehl)hftv5).b |= 0x40;
                    ((gehl)hftv5).i = hfsf0;
                    if(v4 == 0) {
                        z = false;
                    }
                    if(!hftv5.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp0.b_message;
                    ((gehl)hftv6).b |= 0x80;
                    ((gehl)hftv6).j = z;
                    if(!hftv6.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gehl gehl0 = (gehl)hftp0.b_message;
                    gehl0.b |= 0x100;
                    gehl0.k = v4;
                    auci0.c += v3;
                    if(v4 == 0) {
                        goto label_91;
                    }
                }
                else {
                    if(z1) {
                        ByteString hfsf1 = auci0.a;
                        if(!hftv4.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gehl gehl1 = (gehl)hftp0.b_message;
                        gehl1.b |= 0x40;
                        gehl1.i = hfsf1;
                    }
                    else {
                        String s4 = auci0.a.toStringUtf8();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gehl gehl2 = (gehl)hftp0.b_message;
                        gehl2.b |= 0x20;
                        gehl2.h = s4;
                    }
                label_91:
                    list0.remove(0);
                    --this.b;
                    if(list0.size() == this.h - 1) {
                        this.l(s);
                    }
                }
                gehl gehl3 = (gehl)hftp0.N_build();
                int v5 = auci0.a.size();
                return new auch(gehl3, auci0.f, v5);
            }
        }
        return null;
    }

    public final auch c(String s, Object object0, long v, String s1) {
        synchronized(this) {
            if(!TextUtils.isEmpty(s) && object0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gehl.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gehl)hftv0).g = 0;
                ((gehl)hftv0).b |= 16;
                gehk gehk0 = gehk.a;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gehl)hftv1).c = gehk0.f;
                ((gehl)hftv1).b |= 1;
                String s2 = this.f;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                s2.getClass();
                ((gehl)hftv2).b |= 2;
                ((gehl)hftv2).d = s2;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp0.b_message;
                s1.getClass();
                ((gehl)hftv3).b |= 4;
                ((gehl)hftv3).e = s1;
                if(!hftv3.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp0.b_message;
                s.getClass();
                ((gehl)hftv4).b |= 8;
                ((gehl)hftv4).f = s;
                if((object0 instanceof String)) {
                    if(!hftv4.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp0.b_message;
                    ((gehl)hftv5).b |= 0x20;
                    ((gehl)hftv5).h = (String)object0;
                    if(!hftv5.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gehl)hftp0.b_message).g = 0;
                    ((gehl)hftp0.b_message).b |= 16;
                    return new auch(((gehl)hftp0.N_build()), v, aucj.a(object0));
                }
                if((object0 instanceof byte[])) {
                    ByteString hfsf0 = ByteString.copyFrom(((byte[])object0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp0.b_message;
                    ((gehl)hftv6).b |= 0x40;
                    ((gehl)hftv6).i = hfsf0;
                    if(!hftv6.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gehl)hftp0.b_message).g = 1;
                    ((gehl)hftp0.b_message).b |= 16;
                    return new auch(((gehl)hftp0.N_build()), v, aucj.a(object0));
                }
            }
        }
        return null;
    }

    public final void d() {
        synchronized(this) {
            this.a.clear();
            this.j.clear();
            this.i = 0;
            this.b = 0;
        }
    }

    public final void e(String s, long v) {
        synchronized(this) {
            List list0 = (List)this.a.get(s);
            if(list0 != null && !list0.isEmpty() && ((auci)list0.get(0)).f == v) {
                list0.remove(0);
                --this.b;
                if(list0.size() == this.h - 1) {
                    this.l(s);
                }
            }
        }
    }

    public final void f(gehk gehk0) {
        this.d = gehk0;
        this.c = gehk0.f > 0;
    }

    public final boolean g(byte[] arr_b, String s, String s1, long v) {
        synchronized(this) {
            if(!this.j(s) && !TextUtils.isEmpty(s)) {
                this.k(new auci(ByteString.copyFrom(arr_b), true, s1, this.c, v), s);
                return true;
            }
        }
        return false;
    }

    public final boolean h(String s, String s1, String s2, long v) {
        synchronized(this) {
            if(!this.j(s1) && !TextUtils.isEmpty(s1)) {
                this.k(new auci(ByteString.A(s), false, s2, this.c, v), s1);
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        synchronized(this) {
        }
        return this.b > 0;
    }

    public final boolean j(String s) {
        List list0;
        synchronized(this) {
            list0 = (List)this.a.get(s);
        }
        return (list0 == null ? 0 : list0.size()) == this.h;
    }

    private final void k(auci auci0, String s) {
        Map map0 = this.a;
        List list0 = (List)map0.get(s);
        if(list0 == null) {
            list0 = new ArrayList();
            map0.put(s, list0);
            this.j.add(s);
        }
        list0.add(auci0);
        ++this.b;
        if(list0.size() == this.h) {
            this.l(s);
        }
    }

    private final void l(String s) {
        List list0;
        aucc aucc0 = this.e;
        if(aucc0 != null) {
            synchronized(aucc0.a.u) {
                list0 = ((gfxo)aucc0.a.u).g(s);
            }
            ArrayList arrayList0 = new ArrayList(list0);
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                auqv auqv0 = (auqv)arrayList0.get(v2);
            }
        }
    }
}

