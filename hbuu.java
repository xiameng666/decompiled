import java.util.List;

public final class hbuu {
    public final Float a;
    public final List b;
    public final Float c;
    public final Integer d;
    public final Float e;

    public hbuu(Float float0, List list0, Float float1, Integer integer0, Float float2) {
        boolean z = false;
        batl.m(list0 == null || list0.size() == 4, "CornerPoints should be null or total size of cornerPoints should be 4");
        if(integer0 == null || float2 != null) {
            z = true;
        }
        batl.m(z, "rotation confidence should always be set when rotation is present ");
        this.a = float0;
        this.b = list0;
        this.c = float1;
        this.d = integer0;
        this.e = float2;
    }
}

