class RandomizedSet {

    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        else{
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        else{
            int idx = map.get(val);
            int lastEle = list.get(list.size() - 1);

            list.set(idx, lastEle);
            map.put(lastEle, idx);

            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */