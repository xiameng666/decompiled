import java.util.Objects;
import java.util.concurrent.Executor;

public final class kth implements ibth {
    public final Exception a;
    public final Executor b;
    public final kjk c;

    public kth(Exception exception0, Executor executor0, kjk kjk0) {
        this.a = exception0;
        this.b = executor0;
        this.c = kjk0;
    }

    @Override  // ibth
    public final Object a() {
        klb klb0;
        Exception exception0 = this.a;
        if((exception0 instanceof aztb)) {
            int v = ((aztb)exception0).b();
            if(v == 16) {
                klb0 = new klb(exception0.getMessage());
            }
            else {
                switch(v) {
                    case 8: {
                        klb0 = new klg(exception0.getMessage());
                        break;
                    }
                    case 17: {
                        klb0 = new klj("API is not supported: " + exception0.getMessage());
                        break;
                    }
                    default: {
                        klb0 = kno.b.contains(Integer.valueOf(v)) ? new klf(exception0.getMessage()) : new kli("Conditional create failed, failure: " + exception0.getMessage());
                    }
                }
            }
        }
        else if((exception0 instanceof azuo)) {
            klb0 = new klj("API is unsupported");
        }
        else {
            Objects.toString(exception0);
            klb0 = new kli("Conditional create failed, failure: " + exception0.toString());
        }
        ktb ktb0 = new ktb(this.c, klb0);
        this.b.execute(ktb0);
        return ibom.a;
    }
}

