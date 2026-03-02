import java.io.IOException;

public class gpzq {
    public int a() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String d() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public boolean g() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public final gpzo h() {
        if((this instanceof gpzo)) {
            return (gpzo)this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this.toString());
    }

    public final gpzt i() {
        if((this instanceof gpzt)) {
            return (gpzt)this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this.toString());
    }

    public final gpzw j() {
        if((this instanceof gpzw)) {
            return (gpzw)this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this.toString());
    }

    @Override
    public final String toString() {
        try {
            StringBuilder stringBuilder0 = new StringBuilder();
            gqfh gqfh0 = new gqfh(new gqcb(stringBuilder0));
            gqfh0.c(gqaa.a);
            gqcc.b(this, gqfh0);
            return stringBuilder0.toString();
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }
}

