import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

final class iaup {
    static final Logger a;
    public final Object b;
    public final iaml c;

    static {
        iaup.a = Logger.getLogger(iakt.class.getName());
    }

    public iaup(iaml iaml0, long v, String s) {
        this.b = new Object();
        gftb.z(iaml0, "logId");
        this.c = iaml0;
        iamd iamd0 = new iamd();
        iamd0.a = s + " created";
        iamd0.b = iame.b;
        iamd0.b(v);
        this.b(iamd0.a());
    }

    static void a(iaml iaml0, Level level0, String s) {
        Logger logger0 = iaup.a;
        if(logger0.isLoggable(level0)) {
            LogRecord logRecord0 = new LogRecord(level0, "[" + iaml0.toString() + "] " + s);
            logRecord0.setLoggerName(logger0.getName());
            logRecord0.setSourceClassName(logger0.getName());
            logRecord0.setSourceMethodName("log");
            logger0.log(logRecord0);
        }
    }

    final void b(iamf iamf0) {
        Level level0;
        switch(iamf0.b.ordinal()) {
            case 2: {
                level0 = Level.FINER;
                break;
            }
            case 3: {
                level0 = Level.FINE;
                break;
            }
            default: {
                level0 = Level.FINEST;
            }
        }
        iaup.a(this.c, level0, iamf0.a);
    }
}

