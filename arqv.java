import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class arqv implements arrf {
    public final arqx a;
    public final asby b;

    public arqv(arqx arqx0, asby asby0) {
        this.a = arqx0;
        this.b = asby0;
    }

    @Override  // arrf
    public final InputStream a() {
        this.a.f();
        asby asby0 = this.b;
        if(this.a.a.contains(asby0.e)) {
            try {
                return new FileInputStream(arqx.g(asby0));
            }
            catch(FileNotFoundException unused_ex) {
                throw new arrg("File not found: " + asby0.e);
            }
        }
        throw new arrg("Item not advertised by the source: " + asby0.e);
    }
}

