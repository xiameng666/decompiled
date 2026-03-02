import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

public final class dmhi {
    public final String a;
    public final String b;
    public final String c;
    public final Context d;
    public final String e;
    public final Integer f;

    public dmhi(String s, String s1, String s2, Context context0) {
        this(s, s1, s2, context0, null, null);
    }

    public dmhi(String s, String s1, String s2, Context context0, String s3, Integer integer0) {
        batl.s(s);
        batl.s(s1);
        batl.s(s2);
        batl.s(context0);
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = context0;
        this.e = s3;
        this.f = integer0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof dmhi) && bata.b(this.a, ((dmhi)object0).a) && bata.b(this.b, ((dmhi)object0).b) && bata.b(this.c, ((dmhi)object0).c) && bata.b(this.d, ((dmhi)object0).d) && bata.b(this.e, ((dmhi)object0).e) && bata.b(this.f, ((dmhi)object0).f);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("accountId", this.a, arrayList0);
        basz.b("accountName", this.b, arrayList0);
        basz.b("environment", this.c, arrayList0);
        basz.b("context", this.d, arrayList0);
        basz.b("referer", this.e, arrayList0);
        basz.b("semanticEventId", this.f, arrayList0);
        return basz.a(arrayList0, this);
    }
}

