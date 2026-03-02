import j..util.Optional;

public final class cqje implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        if((((elhq)object0).b & 2) != 0) {
            elhs elhs0 = ((elhq)object0).c;
            if(elhs0 == null) {
                elhs0 = elhs.a;
            }
            elhs elhs1 = elhs.a;
            if(!((ProtoLiteMessage)elhs0).equals(elhs1)) {
                elhs elhs2 = ((elhq)object0).c;
                if(elhs2 != null) {
                    elhs1 = elhs2;
                }
                return Optional.of(elhs1);
            }
        }
        return Optional.empty();
    }
}

