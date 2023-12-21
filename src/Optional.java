public class Optional <T> {
    private  final T object;

    public Optional(T t) {
        this.object = t;
    }

    public boolean isEmpty() {
        return  this.object == null;
    }

    public T get() {
        return  this.object;
    }

}
