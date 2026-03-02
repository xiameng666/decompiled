import j..nio.channels.DesugarChannels;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public final class idtc {
    public static int a(InputStream inputStream0) {
        if((inputStream0 instanceof idsz)) {
            return ((idsz)inputStream0).d;
        }
        if((inputStream0 instanceof idpv)) {
            return ((idpv)inputStream0).a;
        }
        if((inputStream0 instanceof ByteArrayInputStream)) {
            return ((ByteArrayInputStream)inputStream0).available();
        }
        if((inputStream0 instanceof FileInputStream)) {
            try {
                FileChannel fileChannel0 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream)inputStream0).getChannel());
                long v = fileChannel0 == null ? 0x7FFFFFFFL : fileChannel0.size();
                if(v < 0x7FFFFFFFL) {
                    return (int)v;
                }
            }
            catch(IOException unused_ex) {
            }
        }
        long v1 = Runtime.getRuntime().maxMemory();
        return v1 <= 0x7FFFFFFFL ? ((int)v1) : 0x7FFFFFFF;
    }
}

