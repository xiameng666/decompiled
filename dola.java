import dagger.Module;

@Module
public final class dola {
    public final String a;
    public final String b;
    public final boolean c;

    public dola(String s, String s1) {
        this(s, s1, false);
    }

    public dola(String s, String s1, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = z;
    }
}

