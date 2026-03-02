public final class cqba implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            cqbd.a.h().ar(7084).x("Profile sync successfully scheduled.");
            return null;
        }
        cqbd.a.h().ar(7083).x("Profile sync disabled.");
        return null;
    }
}

