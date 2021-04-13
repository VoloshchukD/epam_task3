package by.epamtc.exercise1.entity;

public class Array {

    private int[] values;

    public Array() {
        values = new int[]{ };
    }

    public Array(int valuesLength) {
        values = new int[valuesLength];
    }

    public Array(int[] array) {
        values = array.clone();
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        if (this.values.length != array.values.length) return false;

        boolean result = true;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] != array.values[i]) {
                result = false;
                break;
            }
        }

        return result;
    }

    @Override
    public int hashCode() {
        int result = 0;
        for (int value : this.values) {
            result += value;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(getClass().getName() + "@" +
                "values={ ");
        final String ELEMENTS_SEPARATOR = ", ";
        for (int i = 0; i < values.length; i++) {
            stringBuilder.append(values[i]);
            stringBuilder.append(ELEMENTS_SEPARATOR);
        }
        if (values.length != 0) {
            stringBuilder.delete(stringBuilder.length() - ELEMENTS_SEPARATOR.length(),
                    stringBuilder.length());
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

}
