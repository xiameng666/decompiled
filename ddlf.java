import java.util.Arrays;
import java.util.Locale;

final class ddlf {
    public int a;
    public int b;
    public ddlh c;
    public String d;
    cuur e;
    public cuuq f;
    public boolean g;
    public boolean h;

    public ddlf(int v, int v1, ddlh ddlh0, String s, cuur cuur0, cuuq cuuq0, boolean z, boolean z1) {
        this.a = v;
        this.b = v1;
        this.c = ddlh0;
        this.d = s;
        this.e = cuur0;
        this.f = cuuq0;
        this.g = z;
        this.h = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ddlf) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((ddlf)object0).a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((ddlf)object0).b)) && bata.b(this.c, ((ddlf)object0).c) && bata.b(this.e, ((ddlf)object0).e) && bata.b(this.f, ((ddlf)object0).f) && bata.b(Boolean.valueOf(this.g), Boolean.valueOf(((ddlf)object0).g)) && this.h == ((ddlf)object0).h;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), this.c, this.e, this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h)});
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.US;
        Integer integer0 = (int)this.a;
        String s = ddli.b(this.b);
        ddlh ddlh0 = this.c;
        cuuq cuuq0 = this.f;
        if(cuuq0 == null) {
            cuuq0 = "None";
        }
        return String.format(locale0, "SightedAdvertisement<version: %s, type: %s, state: %s, UWB address: %s, requireBTAdvertising: %s, receiverIsVisible: %s>", integer0, s, ddlh0, cuuq0, Boolean.valueOf(this.g), Boolean.valueOf(this.h));
    }
}

