public final class ggvw extends gguu {
    public static final gguu a;

    static {
        ggvw.a = new ggvw();
    }

    @Override  // gguu
    public final ggso a(Class class0, int v) {
        StackTraceElement stackTraceElement0 = ggwu.a(class0, v + 1);
        return stackTraceElement0 != null ? new ggth(stackTraceElement0) : ggso.a;
    }

    @Override  // gguu
    public final String b(Class class0) {
        StackTraceElement stackTraceElement0 = ggwu.a(class0, 1);
        if(stackTraceElement0 != null) {
            return stackTraceElement0.getClassName();
        }
        throw new IllegalStateException("no caller found on the stack for: " + class0.getName());
    }

    @Override
    public final String toString() {
        return "Default stack-based caller finder";
    }
}

