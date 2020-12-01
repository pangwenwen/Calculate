import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

//class LRUCache extends LinkedHashMap<Integer, Integer> {
//    private int capacity;
//
//    public LRUCache(int capacity) {
//        super(capacity, 0.75F, true);
//        this.capacity = capacity;
//    }
//
//    public int get(int key) {
//        return super.getOrDefault(key, -1);
//    }
//
//    public void put(int key, int value) {
//        super.put(key, value);
//    }
//
//    /**
//       插入后是否删除最后一个元素
//      */
//    @Override
//    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
//        return size() > capacity;
//    }
//}

class LRUCache {
    LinkedList<Integer> mLinkList;
    HashMap<Integer,Integer> mMap;
    int mMapacity;

    public LRUCache(int capacity) {
        mMapacity = capacity;
        mLinkList = new LinkedList();
        mMap = new HashMap();
    }

    public int get(int key) {
        if (mMap.containsKey(key)){
            mLinkList.remove((Integer)key);
            mLinkList.addFirst(key);
            return mMap.get(key);
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (mMap.containsKey(key)) {
            mLinkList.remove((Integer) key);
        }

        if (mLinkList.size()>=mMapacity){
            Integer rv = mLinkList.removeLast();
            mMap.remove(rv);
        }

        mLinkList.addFirst(key);
        mMap.put(key,value);
    }
}
