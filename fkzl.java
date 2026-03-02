import java.io.IOException;

public final class fkzl {
    public final fkzo a;
    public final ggtl b;

    public fkzl(fkzo fkzo0, ggtl ggtl0) {
        this.a = fkzo0;
        this.b = ggtl0;
    }

    public final fkzk a() {
        try {
            return new fkzk(new fkzn(((flad)fkzo.a(this.a.a.c()))), this.b);
        }
        catch(IOException iOException0) {
            this.b.j().s(iOException0).ar(0x48BB).x("Failed to retrieve sync metadata at sync start!");
            return new fkzk(null, this.b);
        }
    }

    public final void b(Enum enum0) {
        try {
            fkzo.a(this.a.a.b(enum0));
        }
        catch(IOException iOException0) {
            this.b.j().s(iOException0).ar(0x48BA).x("Failed to register event occurrence!");
        }
    }
}

