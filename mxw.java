import java.lang.reflect.Constructor;

public final class mxw implements mxy {
    @Override  // mxy
    public final Constructor a() {
        Object object0 = Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null);
        return Boolean.TRUE.equals(object0) ? Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(mye.class).getConstructor(Integer.TYPE) : null;
    }
}

