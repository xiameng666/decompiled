import j..util.Optional;

public final class eoja implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        Object object1 = null;
        try(owg owg0 = ((oxi)object0).a("SELECT MIN(creation_time_seconds) FROM TransientDataEntity")) {
            if(owg0.k() && !owg0.j(0)) {
                object1 = owg0.b(0);
            }
            return Optional.ofNullable(object1);
        }
    }
}

