import java.io.IOException;
import java.io.InputStream;

public final class mca {
    public static void a(mby mby0) {
        try {
            mby mby1 = ((mcp)mby0).a;
            try {
                InputStream inputStream0 = ((mch)mby1).h;
                if(inputStream0 != null) {
                    try {
                        inputStream0.close();
                    }
                    catch(IOException iOException0) {
                        throw new mck(iOException0, 2000, 3);
                    }
                }
            }
            finally {
                ((mch)mby1).h = null;
                ((mch)mby1).e();
                if(((mch)mby1).i) {
                    ((mch)mby1).i = false;
                    ((mbw)mby1).c();
                }
                ((mch)mby1).g = null;
                ((mch)mby1).f = null;
            }
        }
        catch(IOException unused_ex) {
        }
    }
}

