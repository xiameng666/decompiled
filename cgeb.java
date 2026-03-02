public final class cgeb implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        if(((gkqn)object0).c == 6) {
            Object object1 = cden_actvieState.b(((Integer)((gkqn)object0).d).intValue());
            return object1 == null ? cden_actvieState.ACTIVE_TIME_UNKNOWN : object1;
        }
        return cden_actvieState.ACTIVE_TIME_UNKNOWN;
    }
}

