import java.io.IOException;
import java.nio.channels.ReadableByteChannel;

public final class ifzi implements Runnable {
    public final igac a;

    public ifzi(igac igac0) {
        this.a = igac0;
    }

    @Override
    public final void run() {
        igac igac0 = this.a;
        ReadableByteChannel readableByteChannel0 = igac0.n;
        if(readableByteChannel0 != null) {
            try {
                readableByteChannel0.close();
            }
            catch(IOException iOException0) {
                iOException0.printStackTrace();
            }
            igac0.n = null;
        }
    }
}

