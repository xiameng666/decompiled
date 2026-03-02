import java.util.List;

public final class ebvl implements dypn {
    final List a;

    public ebvl(List list0) {
        this.a = list0;
        super();
    }

    @Override  // dypn
    public final dylc a(dylc dylc0, dylc dylc1) {
        ibuq.f(dylc0, "existingData");
        ibuq.f(dylc1, "newData");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dylc0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)dylc0));
        dyle dyle0 = dyld.a(hftp0);
        dyng dyng0 = dyle0.b();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)dyng0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)dyng0));
        dyni dyni0 = dynh.a(hftp1);
        dyir dyir0 = dyni0.a();
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)dyir0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)dyir0));
        dyit dyit0 = dyis.a(hftp2);
        dyin dyin0 = dyit0.a();
        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)dyin0).jf(5, null);
        hftp3.X(((ProtoLiteMessage)dyin0));
        dyip dyip0 = dyio.a(hftp3);
        List list0 = this.a;
        if(list0.contains(dyht.b)) {
            dyng dyng1 = dylc0.h == null ? dyng.a : dylc0.h;
            dyir dyir1 = dyng1.b == 8 ? ((dyir)dyng1.c) : dyir.a;
            String s = (dyir1.h == null ? dyin.a : dyir1.h).e;
            dyng dyng2 = dylc1.h == null ? dyng.a : dylc1.h;
            dyir dyir2 = dyng2.b == 8 ? ((dyir)dyng2.c) : dyir.a;
            if(ibuq.m(s, (dyir2.h == null ? dyin.a : dyir2.h).e)) {
                dyng dyng3 = dylc1.h == null ? dyng.a : dylc1.h;
                dyir dyir3 = dyng3.b == 8 ? ((dyir)dyng3.c) : dyir.a;
                String s1 = (dyir3.h == null ? dyin.a : dyir3.h).h;
                ibuq.e(s1, "getStaticFifeUrl(...)");
                dyip0.f(s1);
            }
        }
        if(list0.contains(dyht.c)) {
            dyng dyng4 = dylc0.h == null ? dyng.a : dylc0.h;
            dyir dyir4 = dyng4.b == 8 ? ((dyir)dyng4.c) : dyir.a;
            String s2 = (dyir4.h == null ? dyin.a : dyir4.h).f;
            dyng dyng5 = dylc1.h == null ? dyng.a : dylc1.h;
            dyir dyir5 = dyng5.b == 8 ? ((dyir)dyng5.c) : dyir.a;
            if(ibuq.m(s2, (dyir5.h == null ? dyin.a : dyir5.h).f)) {
                dyng dyng6 = dylc1.h == null ? dyng.a : dylc1.h;
                dyir dyir6 = dyng6.b == 8 ? ((dyir)dyng6.c) : dyir.a;
                String s3 = (dyir6.h == null ? dyin.a : dyir6.h).i;
                ibuq.e(s3, "getThumbnailFifeUrl(...)");
                dyip0.h(s3);
            }
        }
        if(list0.contains(dyht.d)) {
            dyng dyng7 = dylc0.h == null ? dyng.a : dylc0.h;
            dyir dyir7 = dyng7.b == 8 ? ((dyir)dyng7.c) : dyir.a;
            String s4 = (dyir7.h == null ? dyin.a : dyir7.h).g;
            dyng dyng8 = dylc1.h == null ? dyng.a : dylc1.h;
            dyir dyir8 = dyng8.b == 8 ? ((dyir)dyng8.c) : dyir.a;
            if(ibuq.m(s4, (dyir8.h == null ? dyin.a : dyir8.h).g)) {
                dyng dyng9 = dylc1.h == null ? dyng.a : dylc1.h;
                dyir dyir9 = dyng9.b == 8 ? ((dyir)dyng9.c) : dyir.a;
                String s5 = (dyir9.h == null ? dyin.a : dyir9.h).j;
                ibuq.e(s5, "getAnimatedFifeUrl(...)");
                dyip0.b(s5);
            }
        }
        if(list0.isEmpty()) {
            dyng dyng10 = dylc0.h == null ? dyng.a : dylc0.h;
            dyir dyir10 = dyng10.b == 8 ? ((dyir)dyng10.c) : dyir.a;
            String s6 = (dyir10.h == null ? dyin.a : dyir10.h).b;
            dyng dyng11 = dylc1.h == null ? dyng.a : dylc1.h;
            dyir dyir11 = dyng11.b == 8 ? ((dyir)dyng11.c) : dyir.a;
            if(ibuq.m(s6, (dyir11.h == null ? dyin.a : dyir11.h).b)) {
                dyng dyng12 = dylc1.h == null ? dyng.a : dylc1.h;
                dyir dyir12 = dyng12.b == 8 ? ((dyir)dyng12.c) : dyir.a;
                String s7 = (dyir12.h == null ? dyin.a : dyir12.h).d;
                ibuq.e(s7, "getFifeUrl(...)");
                dyip0.e(s7);
            }
        }
        dyit0.c(dyip0.a());
        dyni0.c(dyit0.b());
        dyle0.f(dyni0.b());
        return dyle0.a();
    }
}

