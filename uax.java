import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class uax {
    public static int a(List list0, uav uav0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = uav0.a(((uak)list0.get(v1)));
            if(v2 != -1) {
                return v2;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(List list0, ByteBuffer byteBuffer0) {
        return byteBuffer0 == null ? ImageHeaderParser.ImageType.UNKNOWN : uax.c(list0, new uam(byteBuffer0));
    }

    public static ImageHeaderParser.ImageType c(List list0, uaw uaw0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ImageHeaderParser.ImageType imageHeaderParser$ImageType0 = uaw0.a(((uak)list0.get(v1)));
            if(imageHeaderParser$ImageType0 != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageHeaderParser$ImageType0;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static boolean d(List list0, uau uau0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(uau0.a(((uak)list0.get(v1)))) {
                return true;
            }
        }
        return false;
    }

    public static int e(List list0, InputStream inputStream0, ues ues0) {
        if(inputStream0 == null) {
            return -1;
        }
        if(!inputStream0.markSupported()) {
            inputStream0 = new ulc(inputStream0, ues0);
        }
        inputStream0.mark(0x500000);
        return uax.a(list0, new uap(inputStream0, ues0));
    }

    public static ImageHeaderParser.ImageType f(List list0, InputStream inputStream0, ues ues0) {
        if(inputStream0 == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if(!inputStream0.markSupported()) {
            inputStream0 = new ulc(inputStream0, ues0);
        }
        inputStream0.mark(0x500000);
        return uax.c(list0, new ual(inputStream0));
    }
}

