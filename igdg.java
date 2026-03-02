import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class igdg extends igfw {
    public igdh a;
    public igcp b;
    private static final long serialVersionUID = 0xC1CFD7268213A8C7L;

    public igdg(igdh igdh0, igcp igcp0) {
        this.a = igdh0;
        this.b = igcp0;
    }

    @Override  // igfw
    public final long a() {
        return this.a.a;
    }

    @Override  // igfw
    protected final igcm b() {
        return this.a.b;
    }

    @Override  // igfw
    public final igcp d() {
        return this.b;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        this.a = (igdh)objectInputStream0.readObject();
        this.b = ((igcr)objectInputStream0.readObject()).a(this.a.b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream0) {
        objectOutputStream0.writeObject(this.a);
        objectOutputStream0.writeObject(this.b.v());
    }
}

