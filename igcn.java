import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class igcn extends igfw {
    public igco a;
    public igcp b;
    private static final long serialVersionUID = 0x9F163FFE17ECDBFAL;

    public igcn(igco igco0, igcp igcp0) {
        this.a = igco0;
        this.b = igcp0;
    }

    @Override  // igfw
    public final long a() {
        return this.a.a;
    }

    @Override  // igfw
    public final igcm b() {
        return this.a.b;
    }

    public final igco c() {
        return this.a.d(this.b.k(this.a.a));
    }

    @Override  // igfw
    public final igcp d() {
        return this.b;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        this.a = (igco)objectInputStream0.readObject();
        this.b = ((igcr)objectInputStream0.readObject()).a(this.a.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.writeObject(this.a);
        objectOutputStream0.writeObject(this.b.v());
    }
}

