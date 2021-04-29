package by.epamtc.exercise1.entity;

import by.epamtc.exercise1.exception.NullValuesException;

public class Array {

    private int[] values;

    public Array() {
        values = new int[]{};
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

    public int binarySearch(int value) throws NullValuesException {
        if (values == null) throw new NullValuesException("Array values are not initialized");
        int fromIndex = 0;
        int toIndex = values.length;
        int middleIndex = 0;

        while (values[middleIndex] != value) {
            middleIndex = (toIndex + fromIndex) / 2;
            if (values[middleIndex] > value) {
                toIndex = middleIndex;
            } else if (values[middleIndex] < value) {
                fromIndex = middleIndex;
            } else if (values[middleIndex] == value) {
                break;
            }
        }

        return middleIndex;
    }

    public int findMinValue() throws NullValuesException {
        if (values == null) throw new NullValuesException("Array values are not initialized");
        int minValue = values[0];
        int minValueIndex = 0;

        for (int i = 1; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
                minValueIndex = i;
            }
        }

        return minValueIndex;
    }

    public int findMaxValue() throws NullValuesException {
        if (values == null) throw new NullValuesException("Array values are not initialized");
        int maxValue = values[0];
        int maxValueIndex = 0;

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
                maxValueIndex = i;
            }
        }

        return maxValueIndex;
    }

    public void bubbleSort() throws NullValuesException {
        if (values == null) throw new NullValuesException("Array values are not initialized");
        int t;
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j] > values[j + 1]) {
                    t = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = t;
                }
            }
        }
    }

    public void selectSort() throws NullValuesException {
        if (values == null) throw new NullValuesException("Array values are not initialized");
        int minValue = 0;
        int minValueIndex = 0;
        for (int i = 0; i < values.length; i++) {
            minValue = values[i];
            minValueIndex = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < minValue) {
                    minValue = values[j];
                    minValueIndex = j;
                }
            }
            values[minValueIndex] = values[i];
            values[i] = minValue;
        }
    }

    public void insertSort() throws NullValuesException {
        if (values == null) throw new NullValuesException("Array values are not initialized");
        for (int i = 1; i < values.length; i++) {
            int j = i - 1;
            int currentValue = values[i];
            for (; j >= 0; j--) {
                if (currentValue < values[j]) {
                    values[j + 1] = values[j];
                } else {
                    break;
                }
            }
            values[j + 1] = currentValue;
        }
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
