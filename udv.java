import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class udv extends Exception {
    private static final StackTraceElement[] a = null;
    private final List b;
    private uay c;
    private uag d;
    private Class e;
    private String f;
    private static final long serialVersionUID = 1L;

    static {
        udv.a = new StackTraceElement[0];
    }

    public udv(String s) {
        this(s, Collections.EMPTY_LIST);
    }

    public udv(String s, List list0) {
        this.f = s;
        this.setStackTrace(udv.a);
        this.b = list0;
    }

    public final List a() {
        List list0 = new ArrayList();
        this.c(this, list0);
        return list0;
    }

    final void b(uay uay0, uag uag0, Class class0) {
        this.c = uay0;
        this.d = uag0;
        this.e = class0;
    }

    private final void c(Throwable throwable0, List list0) {
        if((throwable0 instanceof udv)) {
            for(Object object0: ((udv)throwable0).b) {
                this.c(((Throwable)object0), list0);
            }
            return;
        }
        list0.add(throwable0);
    }

    private static void d(Throwable throwable0, Appendable appendable0) {
        try {
            appendable0.append(throwable0.getClass().toString()).append(": ").append(throwable0.getMessage()).append('\n');
        }
        catch(IOException unused_ex) {
            throw new RuntimeException(throwable0);
        }
    }

    private final void e(Appendable appendable0) {
        udv.d(this, appendable0);
        udu udu0 = new udu(appendable0);
        List list0 = this.b;
        try {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                udu0.append("Cause (");
                udu0.append(String.valueOf(v1 + 1));
                udu0.append(" of ");
                udu0.append(String.valueOf(v));
                udu0.append("): ");
                Throwable throwable0 = (Throwable)list0.get(v1);
                if((throwable0 instanceof udv)) {
                    ((udv)throwable0).e(udu0);
                }
                else {
                    udv.d(throwable0, udu0);
                }
            }
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    @Override
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override
    public final String getMessage() {
        StringBuilder stringBuilder0 = new StringBuilder(71);
        stringBuilder0.append(this.f);
        String s = "";
        stringBuilder0.append((this.e == null ? "" : ", " + this.e.toString()));
        stringBuilder0.append((this.d == null ? "" : ", " + this.d.toString()));
        uay uay0 = this.c;
        if(uay0 != null) {
            s = ", " + uay0.toString();
        }
        stringBuilder0.append(s);
        List list0 = this.a();
        if(list0.isEmpty()) {
            return stringBuilder0.toString();
        }
        if(list0.size() == 1) {
            stringBuilder0.append("\nThere was 1 root cause:");
        }
        else {
            stringBuilder0.append("\nThere were ");
            stringBuilder0.append(list0.size());
            stringBuilder0.append(" root causes:");
        }
        for(Object object0: list0) {
            stringBuilder0.append('\n');
            stringBuilder0.append(((Throwable)object0).getClass().getName());
            stringBuilder0.append('(');
            stringBuilder0.append(((Throwable)object0).getMessage());
            stringBuilder0.append(')');
        }
        stringBuilder0.append("\n call GlideException#logRootCauses(String) for more detail");
        return stringBuilder0.toString();
    }

    @Override
    public final void printStackTrace() {
        this.e(System.err);
    }

    @Override
    public final void printStackTrace(PrintStream printStream0) {
        this.e(printStream0);
    }

    @Override
    public final void printStackTrace(PrintWriter printWriter0) {
        this.e(printWriter0);
    }
}

