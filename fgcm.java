import java.util.concurrent.Callable;

public final class fgcm implements Callable {
    public final fgco a;
    public final fgcq b;
    public final fgct c;

    public fgcm(fgco fgco0, fgcq fgcq0, fgct fgct0) {
        this.a = fgco0;
        this.b = fgcq0;
        this.c = fgct0;
    }

    @Override
    public final Object call() {
        return this.a.b(this.b, this.c, this.a.e);
    }
}

