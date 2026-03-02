import java.io.EOFException;
import java.io.IOException;

public final class gqcc {
    public static gpzq a(gqff gqff0) {
        try {
            boolean z = true;
            gqff0.u();
            z = false;
            return ((gqcv)gqeq.T).c(gqff0);
        }
        catch(EOFException eOFException0) {
            if(z) {
                return gpzs.a;
            }
            throw new gpzy(eOFException0);
        }
        catch(gqfi gqfi0) {
            throw new gpzy(gqfi0);
        }
        catch(IOException iOException0) {
            throw new gpzr(iOException0);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new gpzy(numberFormatException0);
        }
    }

    public static void b(gpzq gpzq0, gqfh gqfh0) {
        gqeq.T.b(gqfh0, gpzq0);
    }
}

