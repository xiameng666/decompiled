public final class qnl {
    public static Object a(qnu qnu0, qkb qkb0, int v, boolean z, float f, qoj qoj0, float f1, qoe qoe0, ibrl ibrl0, int v1) {
        int v2 = (v1 & 2) == 0 ? 0 : qnu0.e();
        if((v1 & 4) != 0) {
            v = qnu0.f();
        }
        boolean z1 = (v1 & 8) == 0 ? z : qnu0.n();
        float f2 = (v1 & 16) == 0 ? f : qnu0.d();
        qoj qoj1 = (v1 & 0x20) == 0 ? qoj0 : qnu0.i();
        qns qns0 = new qns(qnu0, v2, v, z1, f2, qoj1, qkb0, ((v1 & 0x40) == 0 ? f1 : qnv.a(qkb0, qoj1, f2)), ((v1 & 0x100) == 0 ? qoe0 : qoe.a), null);
        Object object0 = cup.e(qnu0.f, qns0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

