import java.io.IOException;

public final class fotz implements gfsi {
    public final foua a;

    public fotz(foua foua0) {
        this.a = foua0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s = (String)object0;
        try {
            return new ProcessBuilder(new String[]{"/system/bin/trigger_perfetto", s}).start();
        }
        catch(IOException unused_ex) {
            this.a.b = true;
            return null;
        }
    }
}

