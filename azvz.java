import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j..util.Objects;

final class azvz implements aztz {
    final BasePendingResult a;
    final azwb b;

    public azvz(azwb azwb0, BasePendingResult basePendingResult0) {
        this.a = basePendingResult0;
        Objects.requireNonNull(azwb0);
        this.b = azwb0;
        super();
    }

    @Override  // aztz
    public final void a(Status status0) {
        this.b.a.remove(this.a);
    }
}

