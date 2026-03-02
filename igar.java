import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

public final class igar extends UploadDataProvider {
    private final UploadDataProvider a;

    public igar(UploadDataProvider uploadDataProvider0) {
        this.a = uploadDataProvider0;
    }

    @Override  // org.chromium.net.UploadDataProvider
    public final void close() {
        this.a.close();
    }

    @Override  // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.getLength();
    }

    @Override  // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink0, ByteBuffer byteBuffer0) {
        this.a.read(uploadDataSink0, byteBuffer0);
    }

    @Override  // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink0) {
        this.a.rewind(uploadDataSink0);
    }
}

