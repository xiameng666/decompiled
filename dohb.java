import android.content.Context;

public final class dohb implements dohd {
    public final Context a;
    public final hjzq b;
    public final String c;
    public final gtxb d;
    public final boolean e;
    public final String f;
    private final gtxg g;

    public dohb(Context context0, gtxg gtxg0, hjzq hjzq0) {
        ibuq.f(context0, "context");
        ibuq.f(gtxg0, "mdocInfo");
        ibuq.f(hjzq0, "displayConfig");
        super();
        this.a = context0;
        this.g = gtxg0;
        this.b = hjzq0;
        String s = gtxg0.b;
        ibuq.e(s, "getProvisioningIdString(...)");
        this.c = s;
        gtxb gtxb0 = gtxb.b(dual.c(gtxg0.f.toByteArray()).c);
        if(gtxb0 == null) {
            gtxb0 = gtxb.n;
        }
        ibuq.e(gtxb0, "getStatus(...)");
        this.d = gtxb0;
        this.e = dual.c(gtxg0.f.toByteArray()).e;
        String s1 = duix.a(context0, gtxg0, hjzq0);
        ibuq.e(s1, "fromDisplayConfig(...)");
        this.f = s1;
        ibuq.e(gtxg0.g, "getIssuingAuthority(...)");
    }

    @Override  // edxb
    public final int a(edxb edxb0) {
        return dohc.a(edxb0);
    }

    @Override  // edxb
    public final int b() {
        return 21;
    }

    @Override  // edxb
    public final long c() {
        return 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // edxb
    public final String d() {
        return this.c;
    }

    @Override  // edxb
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dohb)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dohb)object0).a)) {
            return false;
        }
        return ibuq.m(this.g, ((dohb)object0).g) ? ibuq.m(this.b, ((dohb)object0).b) : false;
    }

    @Override  // edxb
    public final boolean g(edxb edxb0) {
        return edxa.a(this, edxb0);
    }

    @Override
    public final int hashCode() {
        int v1;
        int v = this.a.hashCode() * 0x1F;
        gtxg gtxg0 = this.g;
        if(((ProtoLiteMessage)gtxg0).isImmutable()) {
            v1 = ((ProtoLiteMessage)gtxg0).s();
        }
        else {
            int v2 = gtxg0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)gtxg0).s();
                gtxg0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        hjzq hjzq0 = this.b;
        if(((ProtoLiteMessage)hjzq0).isImmutable()) {
            return (v + v1) * 0x1F + ((ProtoLiteMessage)hjzq0).s();
        }
        int v3 = hjzq0.memoizedHashCode;
        if(v3 == 0) {
            v3 = ((ProtoLiteMessage)hjzq0).s();
            hjzq0.memoizedHashCode = v3;
        }
        return (v + v1) * 0x1F + v3;
    }

    public final String i() {
        gtxd gtxd0 = dual.c(this.g.f.toByteArray());
        if((gtxb.b(gtxd0.c) == null ? gtxb.n : gtxb.b(gtxd0.c)) == gtxb.f && gtwt.b((gtxd0.f == null ? gtwu.a : gtxd0.f).b) != 4) {
            String s = dtsx.a(gtxd0);
            ibuq.e(s, "fullName(...)");
            return s;
        }
        ibuq.e("Verification in process", "getString(...)");
        return "Verification in process";
    }

    @Override  // dohd
    public final long k() {
        return hfyn.b((this.g.e == null ? hfwn.a : this.g.e));
    }

    @Override  // dohd
    public final boolean l() {
        return false;
    }

    @Override
    public final String toString() {
        return "MobileDocumentItem(context=" + this.a + ", mdocInfo=" + this.g + ", displayConfig=" + this.b + ")";
    }
}

