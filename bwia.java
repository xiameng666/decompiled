import android.os.SystemClock;

public final class bwia implements ibth {
    public final bwif a;
    public final String b;

    public bwia(bwif bwif0, String s) {
        this.a = bwif0;
        this.b = s;
    }

    @Override  // ibth
    public final Object a() {
        bwii bwii0 = this.a.e();
        ibuq.f(this.b, "moduleName");
        bbup bbup0 = bbuo.a(((ProtoLiteMessage)bbum.a).v_newBuilder());
        bbup0.b(bbul.aI);
        bbux bbux0 = bbuw.a(((ProtoLiteMessage)bbuv.a).v_newBuilder());
        bbux0.c(this.b);
        bbux0.e(bbuu.b);
        bbux0.b(SystemClock.elapsedRealtime());
        bbup0.c(bbux0.a());
        bwii0.a(bbup0.a());
        return ibom.a;
    }
}

