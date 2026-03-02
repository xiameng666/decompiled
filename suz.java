import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class suz implements svi {
    private static final List a;
    private static final List b;
    private final byte[] c;

    static {
        suz.a = Arrays.asList(new Integer[]{((int)0xDF60), ((int)0xDF61), ((int)0xDF62), ((int)0xDF63), ((int)0xDF64), ((int)0xDF65), ((int)0xDF66), ((int)0xDF67)});
        suz.b = Collections.singletonList(Integer.valueOf(6));
    }

    public suz(byte[] arr_b) {
        this.c = arr_b;
    }

    @Override  // svi
    public final swj a(srb srb0) {
        ssw ssw0;
        byte[] arr_b = this.c;
        sxd sxd0 = sxj.a(arr_b, 0);
        if(!sxd0.d()) {
            throw sxf.h("Invalid PUT data");
        }
        sxg sxg0 = (sxg)sxd0.b();
        if(sxg0.e != arr_b.length) {
            throw sxf.b("Inconsistent length in PUT data");
        }
        ssy ssy0 = new ssy(sxg0.a);
        Integer integer0 = (int)ssy0.a;
        if(suz.b.contains(integer0) || suz.a.contains(integer0) && srb0.b().l(new ssy(ssy0.a)) == 2 || !stu.a(srb0, srb0.b(), ssy0, srs.b)) {
            throw sxf.f("Access not granted");
        }
        svt svt0 = srb0.b();
        swh swh0 = new swh();
        if(sxg0.c == 0) {
            if(!swh.e(svt0)) {
                srb0.c(swh0);
                return new swl();
            }
            swy swy0 = new swy(null, ssy0);
            swh.f(swh0.a, svt0, swy0);
            srb0.c(swh0);
            return new swl();
        }
        try {
            sxd sxd1 = srb0.c.a();
            sxd sxd2 = new sxd(srb0.b.d);
            try(ssv ssv0 = new ssv(arr_b, 0, arr_b.length, 2, sxd1, sxd2)) {
                ssw0 = ssv0.a();
                if(ssw0 == null) {
                    throw sxf.h("Invalid command data in PUT DATA");
                }
                if(ssv0.a.available() != 0) {
                    throw sxf.b("Inconsistent length tag in data");
                }
                if((ssw0 instanceof ssr) && ((ssr)ssw0).f != ssp.a) {
                    ssw0 = new stc(ssr.b(((ssr)ssw0)).n, ssw0.a(), null);
                }
            }
        }
        catch(IOException | stt | IllegalArgumentException exception0) {
            throw sxf.h(exception0.getMessage());
        }
        ssy ssy1 = srw.a;
        stb stb0 = (ssw0 instanceof stb) ? ((stb)ssw0) : new stc(ssy0, ssw0.a(), null);
        if(!svt0.q(new sxd(stb0))) {
            throw sxf.c();
        }
        if(ssy0.a != ssy1.a) {
            sxd sxd3 = svt0.i(ssy1);
            if(sxd3.d() && Arrays.equals(((stb)sxd3.b()).a(), new byte[]{0})) {
                swh0.a(svt0, new stc(ssy1, new byte[]{-1}, null));
            }
        }
        swh0.a(svt0, stb0);
        srb0.c(swh0);
        return new swl();
    }
}

