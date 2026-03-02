import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class ffpy {
    public static sfy a(sfy sfy0, sfy sfy1) {
        if(sfy0.c != sfy1.c) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)sfy1).jf(5, null);
            hftp0.X(((ProtoLiteMessage)sfy1));
            ffpy.g(hftp0, null);
            return (sfy)hftp0.N_build();
        }
        ffqa ffqa0 = ffpy.b(ffqa.a(sfy0), ffqa.a(sfy1));
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)sfy1).jf(5, null);
        hftp1.X(((ProtoLiteMessage)sfy1));
        ffqa0.f(hftp1);
        ffqa0.g(hftp1);
        sfy sfy2 = (sfy)hftp1.b_message;
        if((sfy2.b & 4) != 0) {
            sfx sfx0 = sfy2.g == null ? sfx.a : sfy2.g;
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)sfx0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)sfx0));
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            ((sfx)hftv0).b &= -2;
            ((sfx)hftv0).c = 0;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            ((sfx)hftv1).b &= -3;
            ((sfx)hftv1).d = 0;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            ((sfx)hftv2).b &= -5;
            ((sfx)hftv2).e = 0;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp2.b_message;
            ((sfx)hftv3).b &= -9;
            ((sfx)hftv3).f = 0;
            int v = ffqa0.u;
            if(v != 0) {
                if(!hftv3.isImmutable()) {
                    hftp2.ensureMutable();
                }
                sfx sfx1 = (sfx)hftp2.b_message;
                sfx1.b |= 1;
                sfx1.c = v;
            }
            int v1 = ffqa0.v;
            if(v1 != 0) {
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                sfx sfx2 = (sfx)hftp2.b_message;
                sfx2.b |= 2;
                sfx2.d = v1;
            }
            int v2 = ffqa0.w;
            if(v2 != 0) {
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                sfx sfx3 = (sfx)hftp2.b_message;
                sfx3.b |= 4;
                sfx3.e = v2;
            }
            int v3 = ffqa0.x;
            if(v3 != 0) {
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                sfx sfx4 = (sfx)hftp2.b_message;
                sfx4.b |= 8;
                sfx4.f = v3;
            }
            sfx sfx5 = (sfx)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            sfy sfy3 = (sfy)hftp1.b_message;
            sfx5.getClass();
            sfy3.g = sfx5;
            sfy3.b |= 4;
        }
        ffqa0.d(hftp1);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: DesugarCollections.unmodifiableList(((sfy)hftp1.b_message).i)) {
            int v4 = ((sfp)object0).c;
            ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)(((sfp)object0))).jf(5, null);
            hftp3.X(((ProtoLiteMessage)(((sfp)object0))));
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp0 = (sfp)hftp3.b_message;
            sfp0.b &= -3;
            sfp0.d = 0L;
            Integer integer0 = v4;
            Long long0 = (Long)ffqa0.z.get(integer0);
            if(long0 != null && ((long)long0) != 0L) {
                long v5 = (long)long0;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp1 = (sfp)hftp3.b_message;
                sfp1.b |= 2;
                sfp1.d = v5;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp2 = (sfp)hftp3.b_message;
            sfp2.b &= -5;
            sfp2.e = 0L;
            Long long1 = (Long)ffqa0.A.get(integer0);
            if(long1 != null && ((long)long1) != 0L) {
                long v6 = (long)long1;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp3 = (sfp)hftp3.b_message;
                sfp3.b |= 4;
                sfp3.e = v6;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp4 = (sfp)hftp3.b_message;
            sfp4.b &= 0xFFFFFEFF;
            sfp4.f = 0L;
            Long long2 = (Long)ffqa0.B.get(integer0);
            if(long2 != null && ((long)long2) != 0L) {
                long v7 = (long)long2;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp5 = (sfp)hftp3.b_message;
                sfp5.b |= 0x100;
                sfp5.f = v7;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp6 = (sfp)hftp3.b_message;
            sfp6.b &= 0xFFFFFDFF;
            sfp6.g = 0L;
            Long long3 = (Long)ffqa0.C.get(integer0);
            if(long3 != null && ((long)long3) != 0L) {
                long v8 = (long)long3;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp7 = (sfp)hftp3.b_message;
                sfp7.b |= 0x200;
                sfp7.g = v8;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp8 = (sfp)hftp3.b_message;
            sfp8.b &= 0xFFFFFBFF;
            sfp8.h = 0L;
            Long long4 = (Long)ffqa0.D.get(integer0);
            if(long4 != null && ((long)long4) != 0L) {
                long v9 = (long)long4;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp9 = (sfp)hftp3.b_message;
                sfp9.b |= 0x400;
                sfp9.h = v9;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp10 = (sfp)hftp3.b_message;
            sfp10.b &= 0xFFFFF7FF;
            sfp10.i = 0L;
            Long long5 = (Long)ffqa0.E.get(integer0);
            if(long5 != null && ((long)long5) != 0L) {
                long v10 = (long)long5;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp11 = (sfp)hftp3.b_message;
                sfp11.b |= 0x800;
                sfp11.i = v10;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp12 = (sfp)hftp3.b_message;
            sfp12.b &= 0xFFFFEFFF;
            sfp12.j = 0L;
            Long long6 = (Long)ffqa0.F.get(integer0);
            if(long6 != null && ((long)long6) != 0L) {
                long v11 = (long)long6;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp13 = (sfp)hftp3.b_message;
                sfp13.b |= 0x1000;
                sfp13.j = v11;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp14 = (sfp)hftp3.b_message;
            sfp14.b &= 0xFFFFDFFF;
            sfp14.k = 0L;
            Long long7 = (Long)ffqa0.G.get(integer0);
            if(long7 != null && ((long)long7) != 0L) {
                long v12 = (long)long7;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp15 = (sfp)hftp3.b_message;
                sfp15.b |= 0x2000;
                sfp15.k = v12;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp16 = (sfp)hftp3.b_message;
            sfp16.b &= 0xFFFFBFFF;
            sfp16.l = 0L;
            Long long8 = (Long)ffqa0.H.get(integer0);
            if(long8 != null && ((long)long8) != 0L) {
                long v13 = (long)long8;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp17 = (sfp)hftp3.b_message;
                sfp17.b |= 0x4000;
                sfp17.l = v13;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp18 = (sfp)hftp3.b_message;
            sfp18.b &= 0xFFFF7FFF;
            sfp18.m = 0L;
            Long long9 = (Long)ffqa0.I.get(integer0);
            if(long9 != null && ((long)long9) != 0L) {
                long v14 = (long)long9;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp19 = (sfp)hftp3.b_message;
                sfp19.b |= 0x8000;
                sfp19.m = v14;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp20 = (sfp)hftp3.b_message;
            sfp20.b &= 0xFFFEFFFF;
            sfp20.n = 0L;
            Long long10 = (Long)ffqa0.J.get(integer0);
            if(long10 != null && ((long)long10) != 0L) {
                long v15 = (long)long10;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp21 = (sfp)hftp3.b_message;
                sfp21.b |= 0x10000;
                sfp21.n = v15;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp22 = (sfp)hftp3.b_message;
            sfp22.b &= 0xFFFDFFFF;
            sfp22.o = 0;
            Long long11 = (Long)ffqa0.K.get(integer0);
            if(long11 != null && ((long)long11) != 0L) {
                int v16 = long11.intValue();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp23 = (sfp)hftp3.b_message;
                sfp23.b |= 0x20000;
                sfp23.o = v16;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp24 = (sfp)hftp3.b_message;
            sfp24.b &= 0xFFFBFFFF;
            sfp24.p = 0L;
            Long long12 = (Long)ffqa0.L.get(integer0);
            if(long12 != null && ((long)long12) != 0L) {
                long v17 = (long)long12;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp25 = (sfp)hftp3.b_message;
                sfp25.b |= 0x40000;
                sfp25.p = v17;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp26 = (sfp)hftp3.b_message;
            sfp26.b &= 0xFFF7FFFF;
            sfp26.q = 0L;
            Long long13 = (Long)ffqa0.M.get(integer0);
            if(long13 != null && ((long)long13) != 0L) {
                long v18 = (long)long13;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp27 = (sfp)hftp3.b_message;
                sfp27.b |= 0x80000;
                sfp27.q = v18;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp28 = (sfp)hftp3.b_message;
            sfp28.b &= 0xFFEFFFFF;
            sfp28.r = 0L;
            Long long14 = (Long)ffqa0.N.get(integer0);
            if(long14 != null && ((long)long14) != 0L) {
                long v19 = (long)long14;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp29 = (sfp)hftp3.b_message;
                sfp29.b |= 0x100000;
                sfp29.r = v19;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            sfp sfp30 = (sfp)hftp3.b_message;
            sfp30.b &= 0xFFDFFFFF;
            sfp30.s = 0;
            Long long15 = (Long)ffqa0.O.get(integer0);
            if(long15 != null && ((long)long15) != 0L) {
                int v20 = long15.intValue();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                sfp sfp31 = (sfp)hftp3.b_message;
                sfp31.b |= 0x200000;
                sfp31.s = v20;
            }
            arrayList0.add(((sfp)hftp3.N_build()));
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hfvv hfvv0 = hfvv.a;
        ((sfy)hftp1.b_message).i = hfvv0;
        hftp1.ad(arrayList0);
        ffqa0.e(hftp1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((sfy)hftp1.b_message).l = hfty.a;
        ggfp ggfp0 = ffqa0.ab;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        sfy sfy4 = (sfy)hftp1.b_message;
        hfuf hfuf0 = sfy4.l;
        if(!hfuf0.c()) {
            sfy4.l = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(ggfp0, sfy4.l);
        ArrayList arrayList1 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        for(Object object1: DesugarCollections.unmodifiableList(((sfy)hftp1.b_message).m)) {
            sfm sfm0 = (sfm)object1;
            String s = ffqa.b(new long[]{((long)sfm0.f), ((long)sfm0.c), ((long)sfm0.e), ((long)sfm0.g), ((long)sfm0.h)});
            if(!hashSet0.contains(s)) {
                Long long16 = (Long)ffqa0.ac.get(s);
                ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)sfm0).jf(5, null);
                hftp4.X(((ProtoLiteMessage)sfm0));
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                sfm sfm1 = (sfm)hftp4.b_message;
                sfm1.b &= -3;
                sfm1.d = 0;
                if(long16 != null && ((long)long16) != 0L) {
                    int v21 = long16.intValue();
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    sfm sfm2 = (sfm)hftp4.b_message;
                    sfm2.b |= 2;
                    sfm2.d = v21;
                }
                arrayList1.add(((sfm)hftp4.N_build()));
                hashSet0.add(s);
            }
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((sfy)hftp1.b_message).m = hfvv0;
        hftp1.ac(arrayList1);
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet1 = new HashSet();
        sfu sfu0 = ((sfy)hftp1.b_message).r;
        if(sfu0 == null) {
            sfu0 = sfu.a;
        }
        for(Iterator iterator2 = sfu0.b.iterator(); iterator2.hasNext(); iterator2 = iterator2) {
            Object object2 = iterator2.next();
            sft sft0 = (sft)object2;
            ArrayList arrayList3 = new ArrayList();
            for(Iterator iterator3 = sft0.e.iterator(); iterator3.hasNext(); iterator3 = iterator3) {
                Object object3 = iterator3.next();
                sfs sfs0 = (sfs)object3;
                String s1 = ffqa.b(new long[]{((long)sft0.b), sft0.c, sft0.d, ((long)sfs0.c), ((long)sfs0.d)});
                if(!hashSet1.contains(s1)) {
                    Long long17 = (Long)ffqa0.ad.get(s1);
                    if(long17 != null && ((long)long17) != 0L) {
                        ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)sfs0).jf(5, null);
                        hftp5.X(((ProtoLiteMessage)sfs0));
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        sfs sfs1 = (sfs)hftp5.b_message;
                        sfs1.b &= -5;
                        sfs1.e = 0;
                        int v22 = long17.intValue();
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        sfs sfs2 = (sfs)hftp5.b_message;
                        sfs2.b |= 4;
                        sfs2.e = v22;
                        arrayList3.add(((sfs)hftp5.N_build()));
                    }
                    hashSet1.add(s1);
                }
                iterator2 = iterator2;
            }
            if(!arrayList3.isEmpty()) {
                ProtoLiteBuilder hftp6 = (ProtoLiteBuilder)((ProtoLiteMessage)sft0).jf(5, null);
                hftp6.X(((ProtoLiteMessage)sft0));
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp6.b_message;
                ((sft)hftv4).e = hfvv0;
                if(!hftv4.isImmutable()) {
                    hftp6.ensureMutable();
                }
                sft sft1 = (sft)hftp6.b_message;
                hfuo hfuo0 = sft1.e;
                if(!hfuo0.c()) {
                    sft1.e = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(arrayList3, sft1.e);
                arrayList2.add(((sft)hftp6.N_build()));
            }
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((sfy)hftp1.b_message).r = null;
        ((sfy)hftp1.b_message).b &= 0xFFFFFEFF;
        if(!arrayList2.isEmpty()) {
            ProtoLiteBuilder hftp7 = (ProtoLiteBuilder)((ProtoLiteMessage)sfu0).jf(5, null);
            hftp7.X(((ProtoLiteMessage)sfu0));
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp7.b_message;
            ((sfu)hftv5).b = hfvv0;
            if(!hftv5.isImmutable()) {
                hftp7.ensureMutable();
            }
            sfu sfu1 = (sfu)hftp7.b_message;
            hfuo hfuo1 = sfu1.b;
            if(!hfuo1.c()) {
                sfu1.b = ProtoLiteMessage.E(hfuo1);
            }
            hfrj.E(arrayList2, sfu1.b);
            sfu sfu2 = (sfu)hftp7.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            sfy sfy5 = (sfy)hftp1.b_message;
            sfu2.getClass();
            sfy5.r = sfu2;
            sfy5.b |= 0x100;
        }
        sfy sfy6 = (sfy)hftp1.b_message;
        if((sfy6.b & 0x20) != 0) {
            sfk sfk0 = sfy6.n == null ? sfk.a : sfy6.n;
            ProtoLiteBuilder hftp8 = (ProtoLiteBuilder)((ProtoLiteMessage)sfk0).jf(5, null);
            hftp8.X(((ProtoLiteMessage)sfk0));
            int v23 = ffqa0.ae;
            if(!hftp8.b_message.isImmutable()) {
                hftp8.ensureMutable();
            }
            sfk sfk1 = (sfk)hftp8.b_message;
            sfk1.b |= 1;
            sfk1.c = v23;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((sfy)hftp1.b_message).n = null;
            ((sfy)hftp1.b_message).b &= -33;
            sfk sfk2 = (sfk)hftp8.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            sfy sfy7 = (sfy)hftp1.b_message;
            sfk2.getClass();
            sfy7.n = sfk2;
            sfy7.b |= 0x20;
        }
        ffqa0.c(hftp1);
        ArrayList arrayList4 = new ArrayList();
        for(Iterator iterator4 = DesugarCollections.unmodifiableList(((sfy)hftp1.b_message).p).iterator(); iterator4.hasNext(); iterator4 = iterator4) {
            Object object4 = iterator4.next();
            sfq sfq0 = (sfq)object4;
            String s2 = ffqa.b(new long[]{((long)sfq0.b), sfq0.c, ((long)sfq0.d), sfq0.e});
            if(ffqa0.ag.contains(s2)) {
                arrayList4.add(sfq0);
            }
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp1.b_message;
        ((sfy)hftv6).p = hfvv0;
        if(!hftv6.isImmutable()) {
            hftp1.ensureMutable();
        }
        sfy sfy8 = (sfy)hftp1.b_message;
        hfuo hfuo2 = sfy8.p;
        if(!hfuo2.c()) {
            sfy8.p = ProtoLiteMessage.E(hfuo2);
        }
        hfrj.E(arrayList4, sfy8.p);
        sfy sfy9 = (sfy)hftp1.b_message;
        if((sfy9.b & 0x80) != 0) {
            sfw sfw0 = sfy9.q == null ? sfw.a : sfy9.q;
            ProtoLiteBuilder hftp9 = (ProtoLiteBuilder)((ProtoLiteMessage)sfw0).jf(5, null);
            hftp9.X(((ProtoLiteMessage)sfw0));
            if(!hftp9.b_message.isImmutable()) {
                hftp9.ensureMutable();
            }
            ((sfw)hftp9.b_message).c = hfvv0;
            sfw sfw1 = ((sfy)hftp1.b_message).q;
            if(sfw1 == null) {
                sfw1 = sfw.a;
            }
            for(Object object5: sfw1.c) {
                ProtoLiteBuilder hftp10 = (ProtoLiteBuilder)((ProtoLiteMessage)(((sfv)object5))).jf(5, null);
                hftp10.X(((ProtoLiteMessage)(((sfv)object5))));
                Long long18 = (Long)ffqa0.ah.get(Integer.valueOf(((sfv)object5).c));
                if(long18 != null) {
                    int v24 = long18.intValue();
                    if(!hftp10.b_message.isImmutable()) {
                        hftp10.ensureMutable();
                    }
                    sfv sfv0 = (sfv)hftp10.b_message;
                    sfv0.b |= 0x20;
                    sfv0.d = v24;
                }
                if(!hftp10.b_message.isImmutable()) {
                    hftp10.ensureMutable();
                }
                sfv sfv1 = (sfv)hftp10.b_message;
                sfv1.b &= -2;
                sfv1.c = 0;
                sfv sfv2 = (sfv)hftp10.N_build();
                if(!hftp9.b_message.isImmutable()) {
                    hftp9.ensureMutable();
                }
                sfw sfw2 = (sfw)hftp9.b_message;
                sfv2.getClass();
                hfuo hfuo3 = sfw2.c;
                if(!hfuo3.c()) {
                    sfw2.c = ProtoLiteMessage.E(hfuo3);
                }
                sfw2.c.add(sfv2);
            }
            if(!hftp9.b_message.isImmutable()) {
                hftp9.ensureMutable();
            }
            ProtoLiteMessage hftv7 = hftp9.b_message;
            ((sfw)hftv7).b &= -2;
            ((sfw)hftv7).d = 0;
            int v25 = ffqa0.ai;
            if(v25 != 0) {
                if(!hftv7.isImmutable()) {
                    hftp9.ensureMutable();
                }
                sfw sfw3 = (sfw)hftp9.b_message;
                sfw3.b |= 1;
                sfw3.d = v25;
            }
            sfw sfw4 = (sfw)hftp9.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            sfy sfy10 = (sfy)hftp1.b_message;
            sfw4.getClass();
            sfy10.q = sfw4;
            sfy10.b |= 0x80;
        }
        sfy sfy11 = (sfy)hftp1.b_message;
        if((sfy11.b & 0x800) != 0) {
            sfj sfj0 = sfy11.s == null ? sfj.a : sfy11.s;
            ProtoLiteBuilder hftp11 = (ProtoLiteBuilder)((ProtoLiteMessage)sfj0).jf(5, null);
            hftp11.X(((ProtoLiteMessage)sfj0));
            if(!hftp11.b_message.isImmutable()) {
                hftp11.ensureMutable();
            }
            ((sfj)hftp11.b_message).b = hfvv0;
            sfj sfj1 = ((sfy)hftp1.b_message).s;
            if(sfj1 == null) {
                sfj1 = sfj.a;
            }
            for(Object object6: sfj1.b) {
                sfi sfi0 = (sfi)object6;
                ProtoLiteBuilder hftp12 = (ProtoLiteBuilder)((ProtoLiteMessage)sfi0).jf(5, null);
                hftp12.X(((ProtoLiteMessage)sfi0));
                seu seu0 = seu.b(sfi0.c) == null ? seu.a : seu.b(sfi0.c);
                Long long19 = (Long)ffqa0.aj.get(seu0);
                if(long19 != null) {
                    seu seu1 = seu.b(sfi0.c) == null ? seu.a : seu.b(sfi0.c);
                    if(!hftp12.b_message.isImmutable()) {
                        hftp12.ensureMutable();
                    }
                    ((sfi)hftp12.b_message).c = seu1.c;
                    ((sfi)hftp12.b_message).b |= 1;
                    int v26 = long19.intValue();
                    if(!hftp12.b_message.isImmutable()) {
                        hftp12.ensureMutable();
                    }
                    sfi sfi1 = (sfi)hftp12.b_message;
                    sfi1.b |= 2;
                    sfi1.d = v26;
                }
                sfi sfi2 = (sfi)hftp12.N_build();
                if(!hftp11.b_message.isImmutable()) {
                    hftp11.ensureMutable();
                }
                sfj sfj2 = (sfj)hftp11.b_message;
                sfi2.getClass();
                hfuo hfuo4 = sfj2.b;
                if(!hfuo4.c()) {
                    sfj2.b = ProtoLiteMessage.E(hfuo4);
                }
                sfj2.b.add(sfi2);
            }
            sfj sfj3 = (sfj)hftp11.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            sfy sfy12 = (sfy)hftp1.b_message;
            sfj3.getClass();
            sfy12.s = sfj3;
            sfy12.b |= 0x800;
        }
        ffpy.g(hftp1, sfy0);
        return (sfy)hftp1.N_build();
    }

    private static ffqa b(ffqa ffqa0, ffqa ffqa1) {
        ffqa ffqa2 = new ffqa();
        ffqa2.a = ffpy.d(ffqa0.a, ffqa1.a);
        ffqa2.b = ffpy.d(ffqa0.b, ffqa1.b);
        ffqa2.c = ffpy.d(ffqa0.c, ffqa1.c);
        ffqa2.d = ffpy.d(ffqa0.d, ffqa1.d);
        ffqa2.e = ffpy.f(ffqa0.e, ffqa1.e);
        ffqa2.f = ffpy.c(ffqa0.f, ffqa1.f);
        ffqa2.g = ffpy.c(ffqa0.g, ffqa1.g);
        ffqa2.h = ffpy.c(ffqa0.h, ffqa1.h);
        ffqa2.i = ffpy.e(ffqa0.i, ffqa1.i);
        ffqa2.j = ffpy.e(ffqa0.j, ffqa1.j);
        ffqa2.k = ffpy.c(ffqa0.k, ffqa1.k);
        ffqa2.l = ffpy.c(ffqa0.l, ffqa1.l);
        ffqa2.m = ffpy.e(ffqa0.m, ffqa1.m);
        ffqa2.n = ffpy.e(ffqa0.n, ffqa1.n);
        ffqa2.o = ffpy.e(ffqa0.o, ffqa1.o);
        ggeo ggeo0 = ffqa0.p;
        ggeo ggeo1 = ffqa1.p;
        ggek ggek0 = new ggek();
        ggqj ggqj0 = ggeo1.v().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            ggeo ggeo2 = ggeo0.containsKey(map$Entry0.getKey()) ? ((ggeo)ggeo0.get(map$Entry0.getKey())) : ggnf.a;
            ggeo ggeo3 = (ggeo)map$Entry0.getValue();
            ggek0.i(map$Entry0.getKey(), ffpy.c(ggeo2, ggeo3));
        }
        ffqa2.p = ggek0.b();
        ffqa2.q = ffpy.e(ffqa0.q, ffqa1.q);
        ffqa2.r = ffpy.c(ffqa0.r, ffqa1.r);
        ffqa2.s = ffpy.c(ffqa0.s, ffqa1.s);
        ffqa2.t = ffpy.d(ffqa0.t, ffqa1.t);
        ffqa2.w = ffqa1.w - ffqa0.w;
        ffqa2.x = ffqa1.w - ffqa0.w;
        ffqa2.y = ffqa1.y - ffqa0.y;
        ffqa2.aa = ffqa1.aa - ffqa0.aa;
        ffqa2.z = ffpy.d(ffqa0.z, ffqa1.z);
        ffqa2.A = ffpy.d(ffqa0.A, ffqa1.A);
        ffqa2.B = ffpy.d(ffqa0.B, ffqa1.B);
        ffqa2.C = ffpy.d(ffqa0.C, ffqa1.C);
        ffqa2.D = ffpy.d(ffqa0.D, ffqa1.D);
        ffqa2.E = ffpy.d(ffqa0.E, ffqa1.E);
        ffqa2.F = ffpy.d(ffqa0.F, ffqa1.F);
        ffqa2.G = ffpy.d(ffqa0.G, ffqa1.G);
        ffqa2.H = ffpy.d(ffqa0.H, ffqa1.H);
        ffqa2.I = ffpy.d(ffqa0.I, ffqa1.I);
        ffqa2.J = ffpy.d(ffqa0.J, ffqa1.J);
        ffqa2.K = ffpy.d(ffqa0.K, ffqa1.K);
        ffqa2.L = ffpy.d(ffqa0.L, ffqa1.L);
        ffqa2.M = ffpy.d(ffqa0.M, ffqa1.M);
        ffqa2.N = ffpy.d(ffqa0.N, ffqa1.N);
        ffqa2.P = ffpy.d(ffqa0.P, ffqa1.P);
        ffqa2.Q = ffpy.d(ffqa0.Q, ffqa1.Q);
        ffqa2.R = ffpy.d(ffqa0.R, ffqa1.R);
        ffqa2.S = ffpy.d(ffqa0.S, ffqa1.S);
        ffqa2.T = ffpy.d(ffqa0.T, ffqa1.T);
        ffqa2.U = ffpy.d(ffqa0.U, ffqa1.U);
        ffqa2.V = ffpy.d(ffqa0.V, ffqa1.V);
        ffqa2.W = ffpy.d(ffqa0.W, ffqa1.W);
        ffqa2.X = ffpy.d(ffqa0.X, ffqa1.X);
        ffqa2.Y = ffpy.d(ffqa0.Y, ffqa1.Y);
        ffqa2.Z = ffpy.d(ffqa0.Z, ffqa1.Z);
        ffqa2.ab = ffpy.f(ffqa0.ab, ffqa1.ab);
        ffqa2.ac = ffpy.d(ffqa0.ac, ffqa1.ac);
        ffqa2.ad = ffpy.d(ffqa0.ad, ffqa1.ad);
        ffqa2.ae = ffqa1.ae - ffqa0.ae;
        ffqa2.af = ffpy.c(ffqa0.af, ffqa1.af);
        ffqa2.ag = ffpy.f(ffqa0.ag, ffqa1.ag);
        ffqa2.O = ffpy.d(ffqa0.O, ffqa1.O);
        ffqa2.ah = ffpy.d(ffqa0.ah, ffqa1.ah);
        ffqa2.ai = ffqa1.ai - ffqa0.ai;
        ffqa2.aj = ffpy.d(ffqa0.aj, ffqa1.aj);
        return ffqa2;
    }

    private static ggeo c(ggeo ggeo0, ggeo ggeo1) {
        ggek ggek0 = new ggek();
        ggqj ggqj0 = ggeo1.v().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            ggfp ggfp0 = ggeo0.containsKey(map$Entry0.getKey()) ? ((ggfp)ggeo0.get(map$Entry0.getKey())) : ggnj.a;
            ggfp ggfp1 = (ggfp)map$Entry0.getValue();
            ggek0.i(map$Entry0.getKey(), ffpy.f(ggfp0, ggfp1));
        }
        return ggek0.b();
    }

    private static ggeo d(ggeo ggeo0, ggeo ggeo1) {
        if(!ggeo0.isEmpty()) {
            ggek ggek0 = new ggek();
            ggqj ggqj0 = ggeo1.v().om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                long v = (long)(((Long)map$Entry0.getValue()));
                if(ggeo0.containsKey(map$Entry0.getKey())) {
                    v = ((long)(((Long)map$Entry0.getValue()))) - ((long)(((Long)ggeo0.get(map$Entry0.getKey()))));
                }
                ggek0.i(map$Entry0.getKey(), Long.valueOf(v));
            }
            return ggek0.b();
        }
        return ggeo1;
    }

    private static ggeo e(ggeo ggeo0, ggeo ggeo1) {
        ggek ggek0 = new ggek();
        ggqj ggqj0 = ggeo1.v().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            ggeo ggeo2 = ggeo0.containsKey(map$Entry0.getKey()) ? ((ggeo)ggeo0.get(map$Entry0.getKey())) : ggnf.a;
            ggek0.i(map$Entry0.getKey(), ffpy.d(ggeo2, ((ggeo)map$Entry0.getValue())));
        }
        return ggek0.b();
    }

    private static ggfp f(ggfp ggfp0, ggfp ggfp1) {
        if(!ggfp0.isEmpty()) {
            ggfn ggfn0 = new ggfn();
            ggqj ggqj0 = ggfp1.om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                if(!ggfp0.contains(object0)) {
                    ggfn0.i(object0);
                }
            }
            return ggfn0.h();
        }
        return ggfp1;
    }

    private static void g(ProtoLiteBuilder hftp0, sfy sfy0) {
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        sfy sfy1 = (sfy)hftp0.b_message;
        sfy1.b |= 0x4000;
        sfy1.t = true;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((sfy)hftv0).c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((sfy)hftv1).b |= 0x8000;
        ((sfy)hftv1).u = v;
        if(sfy0 != null) {
            int v1 = sfy0.d;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((sfy)hftv2).b |= 1;
            ((sfy)hftv2).c = v1;
            int v2 = sfy0.v + 1;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            sfy sfy2 = (sfy)hftp0.b_message;
            sfy2.b |= 0x10000;
            sfy2.v = v2;
            return;
        }
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        sfy sfy3 = (sfy)hftp0.b_message;
        sfy3.b |= 0x10000;
        sfy3.v = 1;
    }
}

