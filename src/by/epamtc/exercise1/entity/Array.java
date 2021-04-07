package by.epamtc.exercise1.entity;

public class Array {

    private int[] values;

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
                "values=");
        for (int i = 0; i < this.values.length; i++) {
            stringBuilder.append("values[");
            stringBuilder.append(i);
            stringBuilder.append("]=");
            stringBuilder.append(values[i]);
            stringBuilder.append(", ");
        }

        return stringBuilder.toString();
    }

}
