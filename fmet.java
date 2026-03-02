import java.util.Arrays;

public final class fmet implements gftc {
    public final fmev a;
    public final fmev b;

    public fmet(fmev fmev0, fmev fmev1) {
        this.a = fmev0;
        this.b = fmev1;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        String s = (String)object0;
        return Arrays.equals(((byte[])this.a.i.get(s)), ((byte[])this.b.i.get(s)));
    }
}

