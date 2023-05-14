public class myhashtable<K, V> {
    private class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " " + value + "}";
        }
    }

    private HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;

    public myhashtable() {
        this.chainArray = new HashNode[M];
        this.size = 0;
    }

    public myhashtable(int M) {
        this.M = M;
        this.chainArray = new HashNode[M];
        this.size = 0;
    }
}
