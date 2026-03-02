import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public final class ggvr extends LogRecord {
    public final ggus a;
    private static final Object[] b;
    private final ggtu c;

    static {
        new ggvq();
        ggvr.b = new Object[0];
    }

    protected ggvr(ggtu ggtu0, ggub ggub0) {
        super(ggtu0.g(), null);
        this.c = ggtu0;
        this.a = ggus.g(ggub0, ggtu0.c());
        ggso ggso0 = ggtu0.b();
        this.setSourceClassName(ggso0.b());
        this.setSourceMethodName(ggso0.d());
        this.setLoggerName(ggtu0.f());
        this.setMillis(TimeUnit.NANOSECONDS.toMillis(ggtu0.a()));
        super.setParameters(ggvr.b);
    }

    public ggvr(ggtu ggtu0, ggub ggub0, byte[] arr_b) {
        this(ggtu0, ggub0);
        this.setThrown(((Throwable)this.a.b(ggsj.a)));
    }

    public ggvr(RuntimeException runtimeException0, ggtu ggtu0, ggub ggub0) {
        this(ggtu0, ggub0);
        this.setLevel((ggtu0.g().intValue() >= Level.WARNING.intValue() ? ggtu0.g() : Level.WARNING));
        this.setThrown(runtimeException0);
        StringBuilder stringBuilder0 = new StringBuilder("LOGGING ERROR: ");
        stringBuilder0.append(runtimeException0.getMessage());
        stringBuilder0.append('\n');
        ggvr.a(ggtu0, stringBuilder0);
        this.setMessage(stringBuilder0.toString());
    }

    public static void a(ggtu ggtu0, StringBuilder stringBuilder0) {
        stringBuilder0.append("  original message: ");
        if(ggtu0.d() == null) {
            stringBuilder0.append(ggtz.b(ggtu0.e()));
        }
        else {
            stringBuilder0.append(ggtu0.d().b);
            stringBuilder0.append("\n  original arguments:");
            Object[] arr_object = ggtu0.i();
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                Object object0 = arr_object[v1];
                stringBuilder0.append("\n    ");
                stringBuilder0.append(ggtz.b(object0));
            }
        }
        ggub ggub0 = ggtu0.c();
        if(ggub0.b() > 0) {
            stringBuilder0.append("\n  metadata:");
            for(int v = 0; v < ggub0.b(); ++v) {
                stringBuilder0.append("\n    ");
                stringBuilder0.append(ggub0.c(v).a);
                stringBuilder0.append(": ");
                stringBuilder0.append(ggtz.b(ggub0.e(v)));
            }
        }
        stringBuilder0.append("\n  level: ");
        stringBuilder0.append(ggtz.b(ggtu0.g()));
        stringBuilder0.append("\n  timestamp (nanos): ");
        stringBuilder0.append(ggtu0.a());
        stringBuilder0.append("\n  class: ");
        stringBuilder0.append(ggtu0.b().b());
        stringBuilder0.append("\n  method: ");
        stringBuilder0.append(ggtu0.b().d());
        stringBuilder0.append("\n  line number: ");
        stringBuilder0.append(ggtu0.b().a());
    }

    @Override
    public final String getMessage() {
        String s = super.getMessage();
        if(s == null) {
            ggtu ggtu0 = this.c;
            ggus ggus0 = this.a;
            ggtv ggtv0 = gguw.a;
            if(gguw.b(ggtu0, ggus0, ggtv0.b)) {
                StringBuilder stringBuilder0 = new StringBuilder();
                ggwq.c(ggtu0, stringBuilder0);
                gguw.c(ggus0, ggtv0.a, stringBuilder0);
                s = stringBuilder0.toString();
            }
            else {
                s = gguw.a(ggtu0);
            }
            super.setMessage(s);
        }
        return s;
    }

    @Override
    public final void setMessage(String s) {
        if(s == null) {
            s = "";
        }
        super.setMessage(s);
    }

    @Override
    public final void setParameters(Object[] arr_object) {
        if(arr_object == null) {
            arr_object = ggvr.b;
        }
        super.setParameters(arr_object);
    }

    @Override
    public final void setResourceBundle(ResourceBundle resourceBundle0) {
    }

    @Override
    public final void setResourceBundleName(String s) {
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass().getSimpleName());
        stringBuilder0.append(" {\n  message: ");
        stringBuilder0.append(this.getMessage());
        stringBuilder0.append("\n  arguments: ");
        List list0 = this.getParameters() == null ? "<none>" : Arrays.asList(this.getParameters());
        stringBuilder0.append(list0);
        stringBuilder0.append('\n');
        ggvr.a(this.c, stringBuilder0);
        stringBuilder0.append("\n}");
        return stringBuilder0.toString();
    }
}

