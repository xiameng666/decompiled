import j..util.Objects;
import java.util.Locale;
import java.util.concurrent.Executor;

public abstract class ckcq {
    public abstract bbdz a();

    public abstract ckcr b();

    public final gmcd c(ckdh ckdh0, Executor executor0) {
        return gmbu.l(() -> ;, executor0);
    }

    // Detected as a lambda impl.
    public abstract void d(ckdh arg1);

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        return object0 == this ? true : (object0 instanceof ckcq) && this.b().equals(((ckcq)object0).b()) && this.a().equals(((ckcq)object0).a());
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.b(), this.a()});
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "[UseCaseId: %s, CollectionId: %d, InitiatorCategory: %s]", this.b().a.name(), ((int)this.b().b), this.a().name());
    }
}

