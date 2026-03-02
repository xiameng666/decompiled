import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class bnpk implements gfsi {
    public final ggeo a;
    public final boolean b;
    public final String c;
    public final List d;

    public bnpk(ggeo ggeo0, boolean z, String s, List list0) {
        this.a = ggeo0;
        this.b = z;
        this.c = s;
        this.d = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx0;
        String s;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqyf)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqyf)object0))));
        if(!((fqyd)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqyd)hftp0))).ensureMutable();
        }
        hfvv hfvv0 = hfvv.a;
        ((fqyf)((fqyd)hftp0).b_message).b = hfvv0;
        HashSet hashSet0 = new HashSet();
        Iterator iterator0 = ((fqyf)object0).b.iterator();
        while(true) {
            s = this.c;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            fqxl fqxl0 = (fqxl)object1;
            fquw fquw0 = (fquw)this.a.get((fqxl0.c == null ? gsyz.a : fqxl0.c));
            if(fquw0 != null) {
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)fqxl0).jf(5, null);
                hftp2.X(((ProtoLiteMessage)fqxl0));
                fqxk fqxk1 = (fqxk)hftp2;
                if(gggq.u(DesugarCollections.unmodifiableList(((fqxl)fqxk1.b_message).l), new bnpx(s))) {
                    fqxk1.k(s);
                }
                gfsx gfsx1 = fquw0.c;
                if(gfsx1.i()) {
                    fqex fqex0 = (fqex)gfsx1.d();
                    int v = fqex0.a;
                    if(!fqxk1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk1).ensureMutable();
                    }
                    fqxl fqxl1 = (fqxl)fqxk1.b_message;
                    fqxl1.b |= 8;
                    fqxl1.f = v;
                    long v1 = fqex0.b;
                    if(!fqxk1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk1).ensureMutable();
                    }
                    fqxl fqxl2 = (fqxl)fqxk1.b_message;
                    fqxl2.b |= 16;
                    fqxl2.g = v1;
                    int v2 = fqex0.e;
                    if(!fqxk1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk1).ensureMutable();
                    }
                    fqxl fqxl3 = (fqxl)fqxk1.b_message;
                    fqxl3.h = gtac.a(v2);
                    fqxl3.b |= 0x20;
                    gfsx gfsx2 = fqex0.d;
                    if(gfsx2.i()) {
                        Object object2 = gfsx2.d();
                        if(!fqxk1.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)fqxk1).ensureMutable();
                        }
                        fqxl fqxl4 = (fqxl)fqxk1.b_message;
                        fqxl4.m = (gtai)object2;
                        fqxl4.b |= 0x200;
                    }
                }
                gfsx gfsx3 = fquw0.b;
                if(gfsx3.i()) {
                    fqzw fqzw0 = ((fqwq)gfsx3.d()).b();
                    if(!fqxk1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk1).ensureMutable();
                    }
                    fqxl fqxl5 = (fqxl)fqxk1.b_message;
                    fqzw0.getClass();
                    fqxl5.d = fqzw0;
                    fqxl5.b |= 2;
                }
                else {
                    if(!fqxk1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk1).ensureMutable();
                    }
                    ((fqxl)fqxk1.b_message).d = null;
                    ((fqxl)fqxk1.b_message).b &= -3;
                }
                gfsx gfsx4 = fquw0.d;
                if(gfsx4.i()) {
                    String s1 = (String)gfsx4.d();
                    if(!fqxk1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk1).ensureMutable();
                    }
                    fqxl fqxl6 = (fqxl)fqxk1.b_message;
                    fqxl6.b |= 0x400;
                    fqxl6.n = s1;
                }
                gfsx gfsx5 = fquw0.e;
                if(gfsx5.i()) {
                    Object object3 = gfsx5.d();
                    if(!fqxk1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk1).ensureMutable();
                    }
                    fqxl fqxl7 = (fqxl)fqxk1.b_message;
                    fqxl7.o = ((gszv)object3).a();
                    fqxl7.b |= 0x800;
                }
                gfsx gfsx6 = fquw0.f;
                if(gfsx6.i()) {
                    if(!fqxk1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk1).ensureMutable();
                    }
                    ((fqxl)fqxk1.b_message).p = hfvv0;
                    fqxk1.m(((Iterable)gfsx6.d()));
                }
                gfsx0 = gfsx.m(((fqxl)((ProtoLiteBuilder)fqxk1).N_build()));
            }
            else if(this.b) {
                gfsx0 = gfsx.m(fqxl0);
            }
            else {
                ArrayList arrayList0 = ggia.b(gggq.d(fqxl0.l, new bnpw(s)));
                if(arrayList0.isEmpty()) {
                    gfsx0 = gfqx.a;
                }
                else if(fqxl0.l.size() == arrayList0.size()) {
                    gfsx0 = gfsx.m(fqxl0);
                }
                else {
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)fqxl0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)fqxl0));
                    fqxk fqxk0 = (fqxk)hftp1;
                    if(!fqxk0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fqxk0).ensureMutable();
                    }
                    ((fqxl)fqxk0.b_message).l = hfvv0;
                    fqxk0.l(arrayList0);
                    gfsx0 = gfsx.m(((fqxl)((ProtoLiteBuilder)fqxk0).N_build()));
                }
            }
            if(gfsx0.i()) {
                ((fqyd)hftp0).l(((fqxl)gfsx0.d()));
                hashSet0.add((fqxl0.c == null ? gsyz.a : fqxl0.c));
            }
        }
        ((fqyd)hftp0).k(ggch.j(this.d).i(new bnpv(hashSet0)).l(new bnpz(s)));
        return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
    }
}

