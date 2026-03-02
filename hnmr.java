import org.json.JSONObject;

public final class hnmr implements esrz {
    public JSONObject a;
    public JSONObject b;
    public hnmy c;
    public hnmt d;

    static {
    }

    @Override  // esrz
    public final byte[] a() {
        return this.c.b.f;
    }

    @Override  // esrz
    public final byte[] b(int v) {
        for(Object object0: this.c.d) {
            hnnh hnnh0 = hnna.b(((hnlg)object0).c, 0x5F28);
            if(hnnh0 != null) {
                return hnnh0.c();
            }
        }
        return new byte[0];
    }

    public final int c() {
        byte[] arr_b = this.c.b.a.l;
        if(arr_b == null) {
            return ((hnka)hnke.a(((hnkd)hnke.a(this.d(), 2)), 7)).e() ? 17 : 12;
        }
        return arr_b[0] & 0xFF;
    }

    public final hnkb d() {
        return new hnkb(this.h());
    }

    public final hnkb e() {
        return new hnkb(this.c.b.a.j);
    }

    public final boolean f() {
        return this.c.b.a.j != null;
    }

    public final byte[] g() {
        return (byte[])this.c.b.a.i.clone();
    }

    public final byte[] h() {
        return (byte[])this.c.b.a.h.clone();
    }

    public final byte[] i() {
        return (byte[])this.c.b.a.a.clone();
    }

    public final byte[] j() {
        return (byte[])this.c.b.a.b.clone();
    }

    public final byte[] k() {
        return (byte[])this.c.b.a.e.clone();
    }

    public final byte[] l() {
        byte[] arr_b = this.c.b.g;
        return arr_b == null ? null : ((byte[])arr_b.clone());
    }
}

