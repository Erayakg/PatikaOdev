package hafta1;

public class MyList<T> {
    private T[] data;
    private int size = 0;

    public MyList() {
        data = (T[]) new Object[10];
    }

    public MyList(int capacity) {
        data = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public void add(T item) {
        if (size == data.length) {
            T[] newData = (T[]) new Object[size * 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
        data[size++] = item;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return data[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removed = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        return removed;
    }

    public T set(int index, T item) {
        if (index < 0 || index >= size) {
            return null;
        }
        T old = data[index];
        data[index] = item;
        return old;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T item) {
        for (int i = 0; i < size; i++) {
            if (item.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T item) {
        for (int i = size - 1; i >= 0; i--) {
            if (item.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        System.arraycopy(data, 0, array, 0, size);
        return array;
    }

    public void clear() {
        data = (T[]) new Object[10];
        size = 0;
    }

    public MyList<T> sublist(int start, int finish) {
        MyList<T> sublist = new MyList<>(finish - start);
        for (int i = start; i < finish; i++) {
            sublist.add(data[i]);
        }
        return sublist;
    }

    public boolean contains(T item) {
        return indexOf(item) != -1;
    }
}
