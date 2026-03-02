import java.nio.charset.StandardCharsets;

public final class fdtg implements fdtv {
    @Override  // fdtv
    public final byte[] a(MessageLite hfvm0, hfwn hfwn0) {
        feki feki0 = new feki();
        feki0.f("PutDataItemsRequest");
        feki0.j(hfwn0);
        feki0.g(1, ((hlaz)hfvm0).d);
        feki0.h(2, ((hlaz)hfvm0).e);
        if(((hlaz)hfvm0).f.size() > 0) {
            feki0.e(3);
            feki0.e(((hlaz)hfvm0).f.size());
            for(Object object0: ((hlaz)hfvm0).f) {
                hlbi hlbi0 = (hlbi)object0;
                feki0.h(1, hlbi0.c);
                feki0.h(2, hlbi0.d);
                hlbg hlbg0 = hlbg.a;
                if(!((ProtoLiteMessage)(hlbi0.e == null ? hlbg.a : hlbi0.e)).equals(hlbg0)) {
                    feki0.e(3);
                    hlbg hlbg1 = hlbi0.e;
                    if(hlbg1 != null) {
                        hlbg0 = hlbg1;
                    }
                    fekj.a(feki0, hlbg0);
                }
                ByteString hfsf0 = hlbi0.f;
                if(!hfsf0.isEmpty()) {
                    feki0.e(5);
                    byte[] arr_b = hfsf0.toByteArray();
                    String s = ghjc.d.o(arr_b);
                    feki0.a.j(s.length());
                    feki0.a.m(s, StandardCharsets.UTF_8);
                }
                feki0.g(6, hlbi0.g);
                feki0.g(7, hlbi0.h);
                feki0.b(8, hlbi0.i);
                feki0.h(9, hlbi0.j);
                if(hlbi0.k.size() > 0) {
                    feki0.e(10);
                    feki0.e(hlbi0.k.size());
                    for(Object object1: hlbi0.k) {
                        feki0.h(2, ((hlbj)object1).c);
                        feki0.h(1, ((hlbj)object1).b);
                    }
                }
                feki0.b(11, hlbi0.l);
            }
        }
        feki0.d(4, ((hlaz)hfvm0).g);
        feki0.i(5, ((hlaz)hfvm0).h);
        feki0.b(6, ((hlaz)hfvm0).i);
        return feki0.a();
    }
}

