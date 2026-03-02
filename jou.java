import java.util.List;

final class jou implements iau {
    final jqc a;
    final jlm b;

    public jou(jqc jqc0, jlm jlm0) {
        this.a = jqc0;
        this.b = jlm0;
        super();
    }

    @Override  // iau
    public final int a(hzg hzg0, List list0, int v) {
        return iat.a(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int b(hzg hzg0, List list0, int v) {
        return iat.b(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int c(hzg hzg0, List list0, int v) {
        return iat.c(this, hzg0, list0, v);
    }

    @Override  // iau
    public final int d(hzg hzg0, List list0, int v) {
        return iat.d(this, hzg0, list0, v);
    }

    @Override  // iau
    public final iav e(iax iax0, List list0, long v) {
        this.a.e = this.b;
        return iaw.b(iax0, 0, 0, jot.a);
    }
}

