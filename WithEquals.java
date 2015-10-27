public class WithEquals extends NoEquals {

    public WithEquals(int value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof NoEquals) {
            return this.getValue() == ((NoEquals) o).getValue();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getValue();
    }
}
