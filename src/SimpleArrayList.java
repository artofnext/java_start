import java.util.ArrayList;

class SimpleArrayList<T> {

	private ArrayList<String> elements = new ArrayList<String>();

    private int size = 0;

    public boolean isEmpty() {
    	if (size == 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public void add(String elem) {

        if (size == this.elements.size()) {
//            elements = new ArrayList<String>((elements.size() + 10));
        }
        elements.add(elem);
        size += 1;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < elements.size(); i++) {
            result = result + ", " + elements.get(i);
        }
        return result;
    }

    public String get(int index) {

        return elements.get(index);
    }
    

//    fun contain(elem: Any?): Boolean {
//        return elements.contains(elem)
//    }
//
//    fun merge(list: SimpleArrayList<T>): SimpleArrayList<T> {
//        for (i in 0 until list.size) {
//            this.add(list.get(i))
//        }
//        return this
//    }
//
//    fun count(accept: (Any?) -> Boolean): Int {
//        var counter: Int = 0
//        for (i in 0 until this.size) {
//            if (accept(this.get(i))) counter++
//        }
//        return counter
//    }
}