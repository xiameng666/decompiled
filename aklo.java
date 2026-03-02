import com.google.android.gms.auth.managed.services.UserRestrictionsService;
import j..util.function.Function.-CC;
import java.io.FileDescriptor;
import java.io.StringWriter;
import java.util.function.Function;

public final class aklo implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        StringWriter stringWriter0 = new StringWriter();
        bbpd bbpd0 = new bbpd(stringWriter0, " ");
        ((UserRestrictionsService)object0).dump(FileDescriptor.out, bbpd0, new String[0]);
        ((ggtj)UserRestrictionsService.a.h()).B("%s", stringWriter0);
        return (int)0;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

