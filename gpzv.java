import java.io.IOException;
import java.io.StringReader;

public final class gpzv {
    public static gpzq a(gqff gqff0) {
        gpzq gpzq0;
        gqaa gqaa0 = gqff0.a;
        if(gqaa0 == gqaa.b) {
            gqff0.q(gqaa.a);
        }
        try {
            gpzq0 = gqcc.a(gqff0);
        }
        catch(StackOverflowError | OutOfMemoryError throwable0) {
            throw new gpzu(a.b(gqff0, "Failed parsing JSON source: ", " to Json"), throwable0);
        }
        finally {
            gqff0.q(gqaa0);
        }
        return gpzq0;
    }

    public static gpzq b(String s) {
        StringReader stringReader0 = new StringReader(s);
        try {
            gqff gqff0 = new gqff(stringReader0);
            gpzq gpzq0 = gpzv.a(gqff0);
            if(!(gpzq0 instanceof gpzs) && gqff0.u() != 10) {
                throw new gpzy("Did not consume the entire document.");
            }
            return gpzq0;
        }
        catch(gqfi | NumberFormatException exception0) {
            throw new gpzy(exception0);
        }
        catch(IOException iOException0) {
            throw new gpzr(iOException0);
        }
    }
}

